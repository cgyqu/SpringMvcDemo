package com.my.service;

import com.my.pojo.TestModel;

import java.util.List;

/**
 * Created by cgy6094 on 2017/3/2.
 */

public interface ITestService {

    public List<TestModel> getTestList(int count);

}
