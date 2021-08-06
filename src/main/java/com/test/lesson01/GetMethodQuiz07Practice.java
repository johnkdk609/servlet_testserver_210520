package com.test.lesson01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz07_get_form_practice")
public class GetMethodQuiz07Practice extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
			
	}
}
