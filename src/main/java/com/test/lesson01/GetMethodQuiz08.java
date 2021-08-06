package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz08")
public class GetMethodQuiz08 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		String keyword = request.getParameter("keyword");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		PrintWriter out = response.getWriter();
		
		// 향상된 for 문
		for (String text : list) {
//			// 그냥 검색
//			if (text.contains(keyword)) {
//				out.print(text + "<br>");
//			}
			
			// 풀이1
//			int index = text.indexOf(keyword);
//			if (index > -1) {
//				// 강남역 최고 <b>맛집|</b> 소개 합니다.
//				StringBuffer sb = new StringBuffer();
//				sb.append(text);
//				sb.insert(index, "<b>");
//				// 맛집| 이 부분에 </b> 태그 추가. 키워드 단어 길이와 <b> 길이를 더한다.
//				sb.insert(index + 3 + keyword.length(), "</b>");		// String 의 length 메서드이기 때문에 .length() 를 했다.
//				out.print(sb + "<br>");
//			}
			
			// 풀이2
//			String[] words = text.split(keyword);
//			if (text.contains(keyword)) {
//				// "강남역 최고 맛집 소개 합니다."
//				out.print(words[0] + "<b>" + keyword + "</b>" + words[1] + "<br>");
//			}
			
			// 풀이3 - 선생님은 이 것이 가장 좋은 풀이라고 하셨다.
			if (text.contains(keyword)) {
				text = text.replace(keyword, "<b>" + keyword + "</b>");
				out.print(text + "<br>");
			}
			
		}
	}
}
