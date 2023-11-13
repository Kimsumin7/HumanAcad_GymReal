package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.SiCenterService;

@WebServlet("*.siCenter")
public class SiCenterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SiCenterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		System.out.println("URI:" + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath:" + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command:" + command);
		String viewPage = "selectAll.jsp";

		if (command.equals("/siCenter/selectAll.siCenter")) {
			viewPage = "selectAll.jsp";
			SiCenterService.selectAll(request, response);
			System.out.println("/siCenter/selectAll.siCenter");
		} 
//		else if (command.equals("/SiCenter/selectOne.siCenter")) {
//			viewPage = "selectOne.jsp";
//			SiCenterService.selectOne(request, response);
//			System.out.println("/siCenter/selectOne.siCenter");
//		} 


		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
