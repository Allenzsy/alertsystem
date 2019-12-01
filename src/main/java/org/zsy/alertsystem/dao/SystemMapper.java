package org.zsy.alertsystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.alertsystem.pojo.System;
import org.zsy.alertsystem.pojo.SystemExample;

public interface SystemMapper {
    long countByExample(SystemExample example);

    int deleteByExample(SystemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(System record);

    int insertSelective(System record);

    List<System> selectByExample(SystemExample example);

    System selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") System record, @Param("example") SystemExample example);

    int updateByExample(@Param("record") System record, @Param("example") SystemExample example);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);
}