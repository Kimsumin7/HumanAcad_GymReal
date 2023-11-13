package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("*.servlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri=request.getRequestURI(); // 클라이언트가 요청한 서블릿 경로
		System.out.println("URI: "+uri); 
		String conPath=request.getContextPath();
		System.out.println("conPath: "+conPath); //컨텍스트 경로
		String command=uri.substring(conPath.length());
		System.out.println("command: "+command); //클라이언트가 요청한 명령을 나타내는 변수
		String viewPage="login.jsp"; //기본적인 페이지
		if(command.equals("/login.servlet")) { //요청이 /login.servlet일 경우 로그인 페이지를 보여주기 위해 login.jsp로 설정
			viewPage="login.jsp";
		}else if(command.equals("/loginDB.servlet")) { //로그인 처리하는 부분
			System.out.println("login.servletDB");
			viewPage="main.jsp"; //성공할 경우 success.jsp페이지로 리다이렉트
			String user_id=request.getParameter("user_id");
			String user_pw=request.getParameter("user_pw");//id와 pw를 읽어옴
			if(user_id.trim().equals("java")&&user_pw.trim().equals("1234")) { //id가 java고 pw가 1234일 때 +)trim()은 문자열 앞뒤로 공백 제거
				HttpSession session=request.getSession(); //session을 저장할 객체 선언
				session.setAttribute("user_id", user_id); //session에 사용자 입력 user_id 속성(value) 저장
				session.setMaxInactiveInterval(600);  //session만료까지의 시간 10분
			}else {
				viewPage="login.jsp";//id와 pw틀릴경우 login페이지로 유지
			}
		}else if(command.equals("/logout.servlet")) { //로그아웃 처리 부분
			viewPage="login.jsp"; //기본 페이지 login페이지
			HttpSession session=request.getSession(); //session 읽어와
			session.invalidate();//session 전부 삭제
			System.out.println("logout.setvlet");
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);//login.jsp를 매개변수에 저장
		dispatcher.forward(request, response);//불러옴
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
