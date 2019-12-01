package org.zsy.alertsystem.service.impl;

import org.zsy.alertsystem.dao.ExMessageMapper;
import org.zsy.alertsystem.dao.RuleMapper;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.ExMessageExample;
import org.zsy.alertsystem.pojo.Rule;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.RuleService;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 10:40
 */
public class RuleServiceImpl implements RuleService {

    RuleMapper ruleMapper;
    ExMessageMapper exMessageMapper;

    @Override
    public boolean checkNeedToSend(User user, Long systemId,ExMessage exMessage) {

        Integer ruleId = ruleMapper.selectRuleIdByUserId(user.getId());
        Rule rule = ruleMapper.selectByPrimaryKey(ruleId);

        ExMessageExample example = new ExMessageExample();
        ExMessageExample.Criteria criteria = example.createCriteria();
        criteria.andSystemIdEqualTo(systemId);
        Long count = exMessageMapper.countByExample(example);

        Long remainder = Long.remainderUnsigned(count, rule.getFrequency().longValue());

        return remainder == 0L;
    }
}
