package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.Rule;
import org.zsy.alertsystem.pojo.User;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 10:39
 */
public interface RuleService {

    boolean checkNeedToSend(User user, Long systemId, ExMessage exMessage);

    List getRuleIdByUserId(User user);

}
