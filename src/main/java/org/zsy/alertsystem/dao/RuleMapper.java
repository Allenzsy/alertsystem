package org.zsy.alertsystem.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.zsy.alertsystem.pojo.Rule;
import org.zsy.alertsystem.pojo.RuleExample;

public interface RuleMapper {
    long countByExample(RuleExample example);

    int deleteByExample(RuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rule record);

    int insertSelective(Rule record);

    List<Rule> selectByExample(RuleExample example);

    Rule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rule record, @Param("example") RuleExample example);

    int updateByExample(@Param("record") Rule record, @Param("example") RuleExample example);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKey(Rule record);

    // 添加用systemId，userId，rankId的查询
    List<Rule> selectBySURId(Map<String, Object> map);
}