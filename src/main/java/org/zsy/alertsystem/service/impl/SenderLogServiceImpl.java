package org.zsy.alertsystem.service.impl;

import org.springframework.stereotype.Service;
import org.zsy.alertsystem.dao.SenderLogMapper;
import org.zsy.alertsystem.dao.SenderMapper;
import org.zsy.alertsystem.pojo.SenderLog;
import org.zsy.alertsystem.pojo.SenderLogExample;
import org.zsy.alertsystem.service.SenderLogService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 15:30
 */
@Service
public class SenderLogServiceImpl implements SenderLogService {

    @Resource
    SenderLogMapper senderLogMapper;

    @Override
    public void addSenderLog(SenderLog senderLog) {
        senderLogMapper.insertSelective(senderLog);
    }

    @Override
    public List<SenderLog> getAllSenderLog() {
        SenderLogExample example = new SenderLogExample();
        example.setOrderByClause("sendtime DESC");
        SenderLogExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<SenderLog> listSenderLog = senderLogMapper.selectByExample(example);
        return listSenderLog;
    }
}
