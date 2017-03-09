package com.my.service.impl;

import com.my.dao.mysql.ITest1Dao;
import com.my.pojo.Test1Model;
import com.my.service.ITest1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cgy6094 on 2017/3/2.
 */
@Service("test1Service")
public class Test1Service implements ITest1Service {
    @Resource
    private ITest1Dao test1Dao;

    @Override
    public List<Test1Model> getTestList(int count) {
        return test1Dao.getTestList(count);
    }
}
