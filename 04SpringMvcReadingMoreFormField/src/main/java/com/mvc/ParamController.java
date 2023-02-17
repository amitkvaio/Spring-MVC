package com.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ParamController implements Controller {
	public ParamController() {
		System.out.println("ParamController()");
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("form handleRequest");

		String st1 = request.getParameter("param1");
		String st2 = request.getParameter("param2");
		String st3 = request.getParameter("param3");

		StringBuffer bf1 = new StringBuffer(st1).reverse();
		StringBuffer bf2 = new StringBuffer(st2).reverse();
		StringBuffer bf3 = new StringBuffer(st3).reverse();

		ModelAndView mav = new ModelAndView("paramResult");

		System.out.println("st1=" + st1);
		System.out.println("st2=" + st2);
		System.out.println("st3=" + st3);

		System.out.println("Rerver=" + bf1);
		System.out.println("Rerver=" + bf2);
		System.out.println("Rerver=" + bf3);

		mav.addObject("msg1", st1);
		mav.addObject("msg2", st2);
		mav.addObject("msg3", st3);

		mav.addObject("rev1", bf1);
		mav.addObject("rev2", bf2);
		mav.addObject("rev3", bf3);

		return mav;
	}
}
