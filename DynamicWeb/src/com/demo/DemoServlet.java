package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DemoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append(request.getParameter("name1"));
		response.getWriter().append("\n");
		response.getWriter().append(request.getParameter("name2"));
		response.getWriter().append("\n");
		
		
		response.getWriter().append(request.getContentType());
		response.getWriter().append("\n");
		response.getWriter().append(String.valueOf(request.getContentLength()));
		response.getWriter().append("\n");
		response.getWriter().append(request.getContextPath());
		response.getWriter().append("\n");

		Reader reader = new InputStreamReader(request.getInputStream());
		BufferedReader br = new BufferedReader(reader);
		while (br.ready()) {
			response.getWriter().append(br.readLine());
			
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
