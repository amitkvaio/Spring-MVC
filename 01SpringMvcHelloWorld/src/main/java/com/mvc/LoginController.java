package com.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {
	public LoginController() {
		System.out.println("LoginControler()");
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("handleRequest(----,---)");
		String st = "you are again most welcome!";

		System.out.println("this is form handleRequest");
		ModelAndView modelAndView = new ModelAndView("logsuccess");
		modelAndView.addObject("message", st);

		return modelAndView;
	}

}
