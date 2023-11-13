package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.service.CenterService;

@WebServlet("*.center")
public class CenterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CenterController() {
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
		if (command.equals("/center/insert.center")) {
			viewPage = "insert.jsp";
			System.out.println("/center/insert.center");
		} else if (command.equals("/center/insertDB.center")) {
			viewPage = "selectAll.center";
			CenterService.insertDB(request, response);
			System.out.println("/center/insertDB.center");
		} else if (command.equals("/center/selectAll.center")) {
			viewPage = "selectAll.jsp";
			CenterService.selectAll(request, response);
			System.out.println("/center/selectAll.center");
		} else if (command.equals("/center/selectOne.center")) {
			viewPage = "selectOne.jsp";
			CenterService.selectOne(request, response);
			System.out.println("/center/selectOne.center");
		} else if (command.equals("/center/delete.center")) {
			viewPage = "selectAll.center";
			CenterService.delete(request, response);
			System.out.println("/center/delete.center");
		}
//		} else if (command.equals("/center/update.center")) {
//			viewPage = "update.jsp";
//			CenterService.selectOne(request, response);
//			System.out.println("/center/update.center");
//		} else if (command.equals("/center/updateDB.center")) {
//			viewPage = "selectAll.center";
//			CenterService.update(request, response);
//			System.out.println("/center/updateDB.center");
//		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
