package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz04practice")
public class UrlMappingQuiz04Practice extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>리스트 출력</title></head><body><ul>");
		for (int i = 0; i < 30; i++) {
			out.print("<li>" + (i + 1) + "번째 리스트</li>");
		}
		out.print("</body></html>");
	}
}
