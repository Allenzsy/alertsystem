package org.zsy.alertsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zsy.alertsystem.dao.ExMessageMapper;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.ExMessageExample;
import org.zsy.alertsystem.pojo.ExMessageExample.Criteria;
import org.zsy.alertsystem.service.ExMessageService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 1:58
 */
@Service
public class ExMessageServiceImpl implements ExMessageService {

    @Resource
    private ExMessageMapper exMessageMapper;

    @Override
    public void addExMessage(ExMessage exMessage) {
        exMessageMapper.insertSelective(exMessage);
    }

    @Override
    public Long getExMessageCount(Long systemId) {

        ExMessageExample example = new ExMessageExample();
        Criteria criteria = example.createCriteria();
        criteria.andSystemIdEqualTo(systemId);
        Long count = exMessageMapper.countByExample(example);
        return count;

    }

    @Override
    public ExMessage getExMessageById(Integer id) {
        return null;
    }

    @Override
    public void deleteExMessage(Integer systemId, Integer exId) {

    }

    @Override
    public List<ExMessage> getAllExMessage() {
        ExMessageExample example = new ExMessageExample();
        example.setOrderByClause("ex_createtime DESC");
        ExMessageExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
//        PageHelper.startPage(0, 10);
        List<ExMessage> listExMessage = exMessageMapper.selectByExample(example);
        return listExMessage;
    }
}
