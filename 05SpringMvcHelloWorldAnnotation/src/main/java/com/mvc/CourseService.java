package com.mvc;

import java.util.ArrayList;

public class CourseService {
	public CourseService() {
		System.out.println("--------CourseService()------");
	}

	public ArrayList<String> getCourse() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("JAVA");
		al.add("SERVLET");
		al.add("JSP");
		al.add("HIBERNATE");
		al.add("SPRING");
		al.add("STRUTS");
		al.add("SQL");
		return al;
	}
}
