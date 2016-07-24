package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.google.gson.Gson;
import com.my.pojo.Test;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping("/index")
	public Test index() {
		Test test = new Test();
		test.setId(1);
		test.setName("test");
		test.setName("this is test");
		return test;
	}

	@ResponseBody
	@RequestMapping("/json")
	public String json() {
		Test test = new Test();
		test.setId(1);
		test.setName("test");
		test.setName("this is test");
		return new Gson().toJson(test);
	}
}
