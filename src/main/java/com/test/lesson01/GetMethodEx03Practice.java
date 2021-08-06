package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03practice")
public class GetMethodEx03Practice extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");
		
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		Integer age = Integer.valueOf(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
		// JSON(JavaScript Object Notation)으로 response 구성하기
		// {"user_id":"marobiana", "name":"신보람", "age":25}
		
		out.print("{\"user_id\":\"" + userId + "\", \"name\":\"" + name + "\", \"age\":" + age + "}");
	}
}
