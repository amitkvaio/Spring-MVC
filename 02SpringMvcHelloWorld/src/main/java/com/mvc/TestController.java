package com.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {
	public TestController() {
		System.out.println("testController");
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("from handleRequest(---,--)");
		String st = "Hi, I am from testController!!!!!!!!!!";

		ModelAndView mav = new ModelAndView("testCnt");

		mav.addObject("message", st);

		return mav;
	}
}