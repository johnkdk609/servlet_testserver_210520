package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz09_post_practice")
public class PostMethodQuiz09Practice extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String introduction = request.getParameter("introduction");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>입사 지원</title></head><body>");
		out.println("<b>" + name + "</b>님 지원이 완료 되었습니다.<br>");
		out.println("<h3>지원 내용</h3>");
		out.println(introduction);
		out.println("</body></html>");
	}
}
