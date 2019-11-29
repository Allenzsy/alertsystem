package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;

import java.util.Date;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 10:42
 */
public interface SenderService {

    /**
     * 根据一定时间间隔检查是否需要发送邮件给负责人
     * @param newExTime
     * @param exMessage
     * @return
     */

    boolean checkNeedToSend(Date newExTime, ExMessage exMessage);

    void sendExMessage(ExMessage exMessage);

}
