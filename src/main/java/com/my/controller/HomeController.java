package com.my.controller;

import com.alibaba.fastjson.JSON;
import com.my.pojo.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/index")
    public TestModel index() {
        TestModel test = new TestModel();
        test.setId(1);
        test.setName("test");
        test.setName("this is test");
        return test;
    }

    @ResponseBody
    @RequestMapping("/json")
    public String json(TestModel test) {
        // Test test = new Test();
        // //test.setId(1);
        // test.setName("test");
        // test.setName("this is test");
        // test.setId(id);
        return JSON.toJSONString(test);
    }

    @ResponseBody
    @RequestMapping("/proptest")
    public String proptest() throws IOException {
        HashMap<String, String> map = new HashMap<>();
        InputStream stream = getClass().getClassLoader().getResourceAsStream("test.properties");
        Properties prop = new Properties();
        prop.load(stream);
        map.put("id", prop.getProperty("id"));
        map.put("name", prop.getProperty("name"));
        return JSON.toJSONString(map);
    }

}
