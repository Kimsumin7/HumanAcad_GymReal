package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.service.DoSiCenterService;

@WebServlet("*.doSiCenter")
public class DoSiCenterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public DoSiCenterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("URI : "+uri);
		String conPath = request.getContextPath();
		System.out.println("conPath : "+conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command : "+command);
		String viewPage = "selectAll.jsp";
		if (command.equals("/doSiCenter/insert.doSiCenter")) {
			viewPage = "insert.jsp";
			System.out.println("/doSiCenter/insert.doSiCenter");
			}  
		else if (command.equals("/doSiCenter/selectAll.doSiCenter")) {
			viewPage = "selectAll.jsp";
			DoSiCenterService.selectAll(request, response);
			System.out.println("/doSiCenter/selectAll.doSiCenter");
			}
		else if(command.equals("/doSiCenter/selectOne.doSiCenter")) {
			viewPage = "selectOne.jsp";
			DoSiCenterService.selectOne(request, response);
			System.out.println("/doSiCenter/selectOne.doSiCenter");
			}
	
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
