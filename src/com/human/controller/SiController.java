package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.service.SiService;


@WebServlet("*.si")
public class SiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SiController() {
        super();
        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("URI:" + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath:" + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command:" + command);
		String viewPage = "selectAll.jsp";
		if (command.equals("/si/insert.si")) {
			viewPage = "insert.jsp";
			System.out.println("/si/insert.si");
		} else if (command.equals("/si/insertDB.si")) {
			viewPage = "selectAll.si";
			SiService.insertDB(request, response);
			System.out.println("/si/insertDB.si");
		} else if (command.equals("/si/selectAll.si")) {
			viewPage = "selectAll.jsp";
			SiService.selectAll(request, response);
			System.out.println("/si/selectAll.si");
		} else if (command.equals("/si/selectOne.si")) {
			viewPage = "selectOne.jsp";
			SiService.selectOne(request, response);
			System.out.println("/si/selectOne.si");
		} else if (command.equals("/si/delete.si")) {
			viewPage = "selectAll.si";
			SiService.delete(request, response);
			System.out.println("/si/delete.si");
		} else if (command.equals("/si/update.si")) {
			viewPage = "update.jsp";
			SiService.selectOne(request, response);
			System.out.println("/si/update.si");
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TOsi Auto-generated method stub
		doGet(request, response);
	}

}
