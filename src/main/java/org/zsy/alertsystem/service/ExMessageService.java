package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;

import java.util.Date;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 10:04
 */
public interface ExMessageService {

    void addExMessage(Integer systemId,
                      String systemName,
                      Integer exId,
                      String exDescription,
                      Date exTime);

    // 通过联合主键获取ExMessage对象
    ExMessage getExMessageByUniteId(Integer systemId, Integer exId);

    // 在规定间隔后再次产生的预警信息，需要更新异常时间
    void updateExMessage(Integer systemId, Integer exId, Date newExTime);

    void deleteExMessage(Integer systemId, Integer exId);

}
