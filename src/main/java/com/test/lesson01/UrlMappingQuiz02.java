package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		
		Date currentTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("현재 시간은 kk시 mm분 ss초 입니다.");
		
		PrintWriter out = response.getWriter();
		out.println(sdf.format(currentTime));
	}
}
