package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 2:36
 */
public interface SystemService {

    boolean checkSystem(ExMessage exMessage);

}
