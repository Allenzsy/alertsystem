package org.zsy.alertsystem.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.zsy.alertsystem.dao.SenderMapper;
import org.zsy.alertsystem.dao.SystemMapper;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.Sender;
import org.zsy.alertsystem.pojo.SenderLog;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.SenderService;
import org.zsy.alertsystem.util.SendMessageUtil;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 14:45
 */
@Service
public class SenderServiceImpl implements SenderService {

    @Resource
    SenderMapper senderMapper;

    @Resource
    SystemMapper systemMapper;

    @Override
    public SenderLog sendExMessage(Integer senderId, User user, ExMessage exMessage) {

        Sender sender = getSender(senderId);

        String rank = senderMapper.selectRankByRankId(exMessage.getRankId());

        org.zsy.alertsystem.pojo.System system = systemMapper.selectByPrimaryKey(exMessage.getSystemId());

        JSONObject mailConfig = JSONObject.parseObject(sender.getConfig());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
        String sendContent = String.format("尊敬的负责人%s:\n" +
                                           "    您所负责的%s, 在%s, 发生了 %s 预警, 详细异常信息如下:\n" +
                                           "    %s",
                                    user.getUserName(),
                                    system.getSystemName(),
                                    sdf.format(exMessage.getExOccurtime()),
                                    rank,
                                    exMessage.getExDescription());
        SenderLog senderLog = new SenderLog();
        senderLog.setSendContent(sendContent);
        senderLog.setSystemId(exMessage.getSystemId());
        senderLog.setUserId(user.getId());

        // 发通知
        try {
            SendMessageUtil.sendMessage(mailConfig, user, sendContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return senderLog;
    }

    @Override
    public Sender getSender(Integer id) {
        return senderMapper.selectByPrimaryKey(id);
    }

}
