package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz06_get_practice")
public class GetMethodQuiz06Practice extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");
		
		Integer number1 = Integer.parseInt(request.getParameter("number1"));
		Integer number2 = Integer.valueOf(request.getParameter("number2"));
		
		PrintWriter out = response.getWriter();
		out.print("{" + "\"addition\": " + (number1 + number2) + ", \"subtraction\": " + (number1 - number2) 
				+ ", \"multiplication\": " + (number1 * number2) + ", \"division\": " + (number1 / number2) + "}");
	}
}
