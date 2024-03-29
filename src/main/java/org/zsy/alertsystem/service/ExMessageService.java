package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;

import java.util.Date;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 10:04
 */
public interface ExMessageService {

    void addExMessage(ExMessage exMessage);

    Long getExMessageCount(Long systemId);

    ExMessage getExMessageById(Integer id);

    void deleteExMessage(Integer systemId, Integer exId);

    List<ExMessage> getAllExMessage();

}
