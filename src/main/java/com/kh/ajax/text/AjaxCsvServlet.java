package com.kh.ajax.text;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.model.vo.Person;

/**
 * Servlet implementation class AjaxCsvServlet
 */
@WebServlet("/ajax/csv")
public class AjaxCsvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxCsvServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// db 에서 얻어온 배열 데이터
		List<Person> list = new ArrayList<>();
		list.add(new Person("황제성", 5, "남자"));
		list.add(new Person("쥴리아 로버츠", 15, "여자"));
		list.add(new Person("김고은", 25, "여자"));
		list.add(new Person("다프트펑크", 33, "남자"));
		
		// 응답 처리
		response.setContentType("text/csv; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		for(Person p : list) {
			out.println(p.getName()+", "+p.getAge()+", "+p.getGender());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
