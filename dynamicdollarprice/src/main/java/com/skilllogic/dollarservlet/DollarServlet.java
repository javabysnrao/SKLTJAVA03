package com.skilllogic.dollarservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DollarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* ServletConfig cfg = getServletConfig(); */
		     ServletContext ctx = getServletContext();
            String price = ctx.getInitParameter("price");
            double dollarprice = Double.parseDouble(price);
            String noofDollars = request.getParameter("count");
            double dollorsCnt = Double.parseDouble(noofDollars);
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            double totalPrice = dollarprice*dollorsCnt;
            pw.println("Dollar Price  "+dollarprice+"</br>");
            pw.println("Entered no of Dollars "+noofDollars+"</br>");
            pw.println("Total Price in Indain Rupees : "+totalPrice+"</br>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
