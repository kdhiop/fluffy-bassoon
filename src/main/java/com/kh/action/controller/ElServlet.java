package com.kh.action.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.model.vo.Person;

/**
 * Servlet implementation class ElServlet
 */
@WebServlet("/action/el.do")
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 데이터를 저장할 수 있는 Servlet의 영역(scope)들
		 * 
		 * 1. ServletContext (application scope)
		 *  - 어플리케이션 당 1개만 존재하는 객체
		 *  - 이 영역에 데이터를 추가하면 어플리케이션 전역에서 공유하면서 사용 가능
		 *  - ServletContext는 서버가 멈추기 전까지 유지된다.
		 * 
		 * 2. HttpSession (session scope)
		 *  - 접속한 사용자 별로 데이터를 저장할 수 있는 객체
		 *  - 개발자가 HttpSession 지속시간을 설정할 수 있다.
		 *  - 이 영역에 데이터를 추가하면 모든 servlet에서 사용이 가능
		 *  - 값을 한번 담으면 session의 지속시간이 끝나거나, 브라우저가 닫히거나,
		 *    서버가 종료될 때 까지 데이터가 유지된다.
		 *    
		 * 3. HttpServletRequest (request scope)
		 *  - 클라이언트가 요청을 보낼 때 마다 새롭게 생성되는 객체
		 *  - 이 영역에 데이터를 담으면 현재 요청을 받은 서블릿과 포워딩 받는
		 *    서블릿/jsp에서 request에 담긴 데이터를 사용할 수 있다.
		 *  - 값이 한번 담기면 재요청이 이루어지는 순간, 이전 request가 소멸
		 * 
		 * 4. PageContext (page scope)
		 *  - JSP페이지 에서만 사용 가능한 영역으로, 하나의 JSP페이지 에서만 공유할 데이터를 선언하는 영역
		 */
		// request scope에 데이터 담기
		request.setAttribute("classRoom", "G강의장");
		request.setAttribute("student", new Person("서혜림",27,"여자"));
		
		// session scope에 데이터 담기
		HttpSession session = request.getSession();
		session.setAttribute("academy", "KH정보교육원");
		session.setAttribute("teacher", new Person("민경민",20,"남자"));
		
		// application scope
		ServletContext application = request.getServletContext();
		application.setAttribute("scope", "application");
		
		request.getRequestDispatcher("/action/1_EL/01_el.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
