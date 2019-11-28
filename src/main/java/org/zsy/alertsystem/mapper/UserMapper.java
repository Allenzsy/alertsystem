package org.zsy.alertsystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.zsy.alertsystem.pojo.User;

import java.util.List;

/**
 * @author allenzsy
 * @date 2019/11/28
 * @time 20:55
 */
@Component
public interface UserMapper {

    User findById(Long id);
    List<User> findAll();

}
