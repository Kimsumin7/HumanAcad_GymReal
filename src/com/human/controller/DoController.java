package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.DoService;

@WebServlet("*.do")
public class DoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DoController() {
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
		if (command.equals("/do/insert.do")) {
			viewPage = "insert.jsp";
			System.out.println("/do/insert.do");
		} else if (command.equals("/do/insertDB.do")) {
			viewPage = "selectAll.do";
			DoService.insertDB(request, response);
			System.out.println("/do/insertDB.do");
		} else if (command.equals("/do/selectAll.do")) {
			viewPage = "selectAll.jsp";
			DoService.selectAll(request, response);
			System.out.println("/do/selectAll.do");
		} else if (command.equals("/do/selectOne.do")) {
			viewPage = "selectOne.jsp";
			DoService.selectOne(request, response);
			System.out.println("/do/selectOne.do");
		} else if (command.equals("/do/delete.do")) {
			viewPage = "selectAll.do";
			DoService.delete(request, response);
			System.out.println("/do/delete.do");
		} else if (command.equals("/do/update.do")) {
			viewPage = "update.jsp";
			DoService.selectOne(request, response);
			System.out.println("/do/update.do");
		} else if (command.equals("/do/updateDB.do")) {
			viewPage = "selectAll.do";
			DoService.update(request, response);
			System.out.println("/do/updateDB.do");
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
