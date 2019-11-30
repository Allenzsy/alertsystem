package org.zsy.alertsystem.dao;

import org.zsy.alertsystem.pojo.Notice;

/**
 * @author allenzsy
 * @date 2019/11/30
 * @time 16:44
 */
public interface NoticeMapper {

    Notice findBySystemId(Integer SystemId);

}
