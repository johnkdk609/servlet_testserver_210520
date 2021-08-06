package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04_get_form_practice")
public class GetMethodEx04Practice extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		
		// 테이블로 출력
		out.println("<html><head><title>회원 정보</title></head><body>");
		out.println("<table border=1>");
		out.println("<tr><th>아이디</th><td>" + userId + "</td>");
		out.println("<tr><th>이름</th><td>" + name + "</td>");
		out.println("<tr><th>생년월일</th><td>" + birth + "</td>");
		out.println("<tr><th>이메일 주소</th><td>" + email + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body></html>");
	}
}
