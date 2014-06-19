package com.jevoncode.springmvcexample.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
@RequestMapping("/helloword/")
public class HelloWorldController extends MultiActionController {
	@RequestMapping("hello.htm")
	public ModelAndView hello(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("msg", "hello()");
		return model;
	}
	
	@RequestMapping("goodBye.htm")
	public ModelAndView goodBye(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("msg", "goodBye()");
		return model;
	}

}