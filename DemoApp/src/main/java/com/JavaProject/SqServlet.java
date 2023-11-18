package com.JavaProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//int k=(int) req.getAttribute("k");
	HttpSession HttpSession = req.getSession();
	ServletRequest session = null;
	int k =(int) session.getAttribute("k");
		PrintWriter out = res.getWriter();
		out.println("Result is" + k);
	}
	

}
