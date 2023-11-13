package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.EmployeeCenterService;
import com.human.service.JobHistoryJoinService;

@WebServlet("*.jobHistoryJoin")
public class JobHistoryJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JobHistoryJoinController() {
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
		 
		if (command.equals("/jobHistoryJoin/selectAll.jobHistoryJoin")) {
			viewPage = "selectAll.jsp";
			JobHistoryJoinService.selectAll(request, response);
			System.out.println("/jobHistoryJoin/selectAll.jobHistoryJoin");
		}
		else if(command.equals("/jobHistoryJoin/selectOne.jobHistoryJoin")) {
			viewPage = "selectOne.jsp";
			JobHistoryJoinService.selectOne(request, response);
			System.out.println("/jobHistoryJoin/selectOne.jobHistoryJoin");
		}
		else if (command.equals("/jobHistoryJoin/selectMSalary.jobHistoryJoin")) {
			viewPage = "selectMSalary.jsp";
			JobHistoryJoinService.selectAll(request, response);
			System.out.println("/jobHistoryJoin/selectMSalary.jobHistoryJoin");
		}
		else if (command.equals("/jobHistoryJoin/update.jobHistoryJoin")) {
			viewPage = "update.jsp";	
			JobHistoryJoinService.update(request, response);
			System.out.println("/jobHistoryJoin/update.jobHistoryJoin");
		}
		else if (command.equals("/jobHistoryJoin/selectEnd.jobHistoryJoin")) {
			viewPage = "selectEnd.jsp";
			JobHistoryJoinService.selectAll(request, response);
			System.out.println("/jobHistoryJoin/selectEnd.jobHistoryJoin");
		}
		
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
