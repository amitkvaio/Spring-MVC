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

		String st = request.getParameter("param");

		StringBuffer bf = new StringBuffer(st).reverse();

		ModelAndView mav = new ModelAndView("paramResult");

		System.out.println("st=" + st);
		System.out.println("Rerver=" + bf);

		mav.addObject("msg1", st);
		mav.addObject("msg2", bf);

		return mav;
	}
}
