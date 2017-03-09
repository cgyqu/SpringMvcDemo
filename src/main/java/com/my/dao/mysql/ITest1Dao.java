package com.my.dao.mysql;

import com.my.pojo.Test1Model;

import java.util.List;

/**
 * Created by cgy6094 on 2017/3/3.
 */
public interface ITest1Dao {
    public List<Test1Model> getTestList(int count);

}
