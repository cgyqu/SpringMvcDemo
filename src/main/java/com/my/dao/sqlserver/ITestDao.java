package com.my.dao.sqlserver;

import com.my.pojo.TestModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cgy6094 on 2017/2/22.
 */
@Repository("testDao")
public interface ITestDao {
    public List<TestModel> getTestList(int count);
}
