package com.my.controller;

import com.my.pojo.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cgy6094 on 2017/3/3.
 */

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        TestModel model = new TestModel();
        model.setId(1);
        model.setName("test");
        String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        view.addObject("time", time);
        view.addObject("test", "test");
        view.addObject("model",model);
        return view;
    }
}
