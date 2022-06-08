package com.registrationapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
public class ServletLifeCycle extends HttpServlet{
	public void init() {
		System.out.println("ServletLifeCycle.init()");
	}
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		System.out.println("ServletLifeCycle.service()");
		res.setContentType("text/html");
		LocalDateTime ldt = LocalDateTime.now();
		PrintWriter pw = res.getWriter();
		pw.println("Date and Time "+ldt);
	}
	public void destroy() {
		System.out.println("ServletLifeCycle.destroy()");
	}
}
