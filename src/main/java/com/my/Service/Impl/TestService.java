package com.my.service.impl;

import com.my.dao.sqlserver.ITestDao;
import com.my.pojo.TestModel;
import com.my.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cgy6094 on 2017/3/2.
 */
@Service("testService")
public class TestService implements ITestService {
    @Resource
    private ITestDao testDao;
    @Override
    public List<TestModel> getTestList(int count) {
        return testDao.getTestList(count);
    }
}
