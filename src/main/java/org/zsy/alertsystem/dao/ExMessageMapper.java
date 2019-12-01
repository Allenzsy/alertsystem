package org.zsy.alertsystem.dao;

import java.util.List;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.ExMessageExample;

public interface ExMessageMapper {
    long countByExample(ExMessageExample example);

    int deleteByExample(ExMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExMessage record);

    int insertSelective(ExMessage record);

    List<ExMessage> selectByExample(ExMessageExample example);

    ExMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExMessage record);

    int updateByPrimaryKey(ExMessage record);
}