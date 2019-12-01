package org.zsy.alertsystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.alertsystem.pojo.SenderLog;
import org.zsy.alertsystem.pojo.SenderLogExample;

public interface SenderLogMapper {
    long countByExample(SenderLogExample example);

    int deleteByExample(SenderLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SenderLog record);

    int insertSelective(SenderLog record);

    List<SenderLog> selectByExample(SenderLogExample example);

    SenderLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SenderLog record, @Param("example") SenderLogExample example);

    int updateByExample(@Param("record") SenderLog record, @Param("example") SenderLogExample example);

    int updateByPrimaryKeySelective(SenderLog record);

    int updateByPrimaryKey(SenderLog record);
}