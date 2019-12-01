package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.Rule;
import org.zsy.alertsystem.pojo.User;

import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 10:39
 */
public interface RuleService {

    List<Boolean> checkNeedToSend(List<Rule> ruleList, ExMessage exMessage);

    List<Rule> getRule(Long systemId, Integer userId, Integer rankId);

    List<Rule> getAllByUser(Integer userId);

    void editRule(Integer id);

}
