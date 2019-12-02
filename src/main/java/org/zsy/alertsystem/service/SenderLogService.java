package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.SenderLog;

import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 15:30
 */
public interface SenderLogService {

    void addSenderLog(SenderLog senderLog);

    List<SenderLog> getAllSenderLog();

}
