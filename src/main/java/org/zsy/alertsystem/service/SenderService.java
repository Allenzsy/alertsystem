package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.Sender;
import org.zsy.alertsystem.pojo.SenderLog;
import org.zsy.alertsystem.pojo.User;

import java.util.Date;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 10:42
 */
public interface SenderService {

    SenderLog sendExMessage(Integer senderId, User user, ExMessage exMessage);

    Sender getSender(Integer id);

}
