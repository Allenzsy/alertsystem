package org.zsy.alertsystem.service.impl;

import org.springframework.stereotype.Service;
import org.zsy.alertsystem.dao.ExMessageMapper;
import org.zsy.alertsystem.dao.RuleMapper;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.ExMessageExample;
import org.zsy.alertsystem.pojo.Rule;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.RuleService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 10:40
 */
@Service
public class RuleServiceImpl implements RuleService {

    @Resource
    RuleMapper ruleMapper;

    @Resource
    ExMessageMapper exMessageMapper;

    @Override
    public List<Boolean> checkNeedToSend(List<Rule> ruleList, ExMessage exMessage) {

        ExMessageExample example = new ExMessageExample();
        ExMessageExample.Criteria criteria = example.createCriteria();
        criteria.andSystemIdEqualTo(exMessage.getSystemId());
        Long count = exMessageMapper.countByExample(example);

        // 判断每一个 frequency 是不是都符合
        List<Boolean> needSendList = new LinkedList<>();
        for(Rule rule : ruleList) {
            Long remainder = Long.remainderUnsigned(count, rule.getFrequency().longValue());
            if(remainder == 0L) {
                needSendList.add(Boolean.TRUE);
            } else {
                needSendList.add(Boolean.FALSE);
            }
        }

        return needSendList;
    }

    @Override
    public List<Rule> getRule(Long systemId, Integer userId, Integer rankId) {

        Map<String, Object> map = new HashMap<>();
        map.put("systemId", systemId);
        map.put("userId", userId);
        map.put("rankId", rankId);
        List<Rule> ruleList = ruleMapper.selectBySURId(map);

        return ruleList;
    }

    @Override
    public List<Rule> getAllByUser(Integer userId) {
        return null;
    }

    @Override
    public void editRule(Integer id) {

    }
}
