package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.System;
import org.zsy.alertsystem.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 2:36
 */
public interface SystemService {

    boolean checkSystem(ExMessage exMessage);

    Map<String, System> getAllSystem();

}
