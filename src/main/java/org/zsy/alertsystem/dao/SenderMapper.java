package org.zsy.alertsystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.alertsystem.pojo.Sender;
import org.zsy.alertsystem.pojo.SenderExample;

public interface SenderMapper {
    long countByExample(SenderExample example);

    int deleteByExample(SenderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sender record);

    int insertSelective(Sender record);

    List<Sender> selectByExample(SenderExample example);

    Sender selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sender record, @Param("example") SenderExample example);

    int updateByExample(@Param("record") Sender record, @Param("example") SenderExample example);

    int updateByPrimaryKeySelective(Sender record);

    int updateByPrimaryKey(Sender record);

    String selectRankByRankId(Integer rankId);
}