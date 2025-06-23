package com.kh.basicServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestPersonServlet1
 */
@WebServlet("/testPerson1.do")
public class TestPersonServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestPersonServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 사용자의 요청 방식이 Get방식인 경우 실행되는 메서드
		 * 1. HttpServletRequest
		 *  - 클라이언트가 요청 시 전달한 데이터가 담겨있는 객체
		 *  - 사용자가 입력한 값, 요청 시 전송방식, ip주소, 기타 등등...
		 *  
ㄴ		 * 2. HttpServletReponse
		 *  - 응답 정보를 담아줄 객체
		 *  - 응답 정보로 동적 html페이지를 생성하여 반환한다.
		 */
		
		// 1. 사용자가 입력한 값 가져오기
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String animal = request.getParameter("animal");
		String foods[] = request.getParameterValues("food");
		
		System.out.println("name = "+name);
		System.out.println("color = "+color);
		System.out.println("animal = "+animal);
		System.out.println("foods[] = "+Arrays.toString(foods));
		
		// 2. 응답 메세지 작성
		// html
		response.setContentType("text/html; charset=utf-8"); // 응답 데이터의 형식
		PrintWriter out = response.getWriter(); // outputStream
		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<head>");
				out.println("<title>개취 검사 결과</title>");
			out.println("</head>");
			out.println("<body>");
				out.println("<h1>개인 취향 조사 결과</h1>");
				out.println("<p>"+name+"님의 개인 취향 검사 결과 =</p>");
				out.println("<p>"+color+"색을 좋아합니다.</p>");
				out.println("<p>좋아하는 동물은 "+animal+"입니다.</p>");
				out.println("<p>좋아하는 음식은 "+Arrays.toString(foods)+"입니다.</p>");
			out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * POST 방식의 요청 시 데이터는 HTTP BODY영역에 "인코딩"되어 넘어온다.
		 * POST 방식의 기본 인코딩 설정은 ISO-8859-1로, utf-8이 아님.
		 * 따라서 Request의 인코딩 타입을 utf-8로 변경해줘야 한다.
		 */
		request.setCharacterEncoding("UTF-8");
		
		// 1. 사용자가 입력한 값 가져오기
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String animal = request.getParameter("animal");
		String foods[] = request.getParameterValues("food");
				
		System.out.println("name = "+name);
		System.out.println("color = "+color);
		System.out.println("animal = "+animal);
		System.out.println("foods[] = "+Arrays.toString(foods));
	}

}
