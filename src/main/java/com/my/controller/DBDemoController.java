package com.my.controller;

import com.alibaba.fastjson.JSON;
import com.my.common.PropertyHelper;
import com.my.pojo.AllocationModel;
import com.my.pojo.Test1Model;
import com.my.pojo.TestModel;
import com.my.service.IAllocationService;
import com.my.service.ITest1Service;
import com.my.service.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by cgy6094 on 2017/2/21.
 */
@Controller
@RequestMapping("/db")
public class DBDemoController {

    @Resource
    private ITestService testService;

    @Resource
    private ITest1Service test1Service;
    @Resource
    private IAllocationService allocationService;

    @ResponseBody
    @RequestMapping("/select")
    public String testSelect(int count) {
        if (count <= 0) {
            count = 10;
        }
        List<TestModel> result = testService.getTestList(count);
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping("/select1")
    public String mysqltest(int count) {
        if (count <= 0) {
            count = 10;
        }
        List<Test1Model> result = test1Service.getTestList(count);
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping("/allo")
    public String allo(int count) {
        if (count <= 0) {
            count = 10;
        }
        List<AllocationModel> result = allocationService.getAllocationList(count);
        return JSON.toJSONString(result);
    }


    @ResponseBody
    @RequestMapping("/commom")
    public String commom() throws IOException {
        Map<Object, Object> map = new HashMap<>();
        Properties prop = new Properties();
        prop.load(getClass().getClassLoader().getResourceAsStream("jdbc.properties"));
        String JDBC_DRIVER = PropertyHelper.getPropValue("jdbc", "mysqltest_driver");
        String DB_URL = prop.getProperty("mysqltest_url");
        String user = prop.getProperty("mysqltest_user");
        String password = prop.getProperty("mysqltest_password");
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, user, password);
            stmt = conn.createStatement();
            String sql = "  SELECT " +
                    " id," +
                    " city," +
                    " country," +
                    " remark" +
                    " FROM test.test1" +
                    " limit 1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                map.put("id", rs.getLong("id"));
                map.put("city", rs.getString("city"));
                map.put("country", rs.getString("country"));
                map.put("remark", rs.getString("remark"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            map.put("error", ex);
        }
        return JSON.toJSONString(map);
    }


}
