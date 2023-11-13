package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.HistoryEmpService;

/**
 * Servlet implementation class HistoryEmpController
 */
@WebServlet("*.historyEmp")
public class HistoryEmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistoryEmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("URI : "+uri);
		
		String conPath = request.getContextPath();
		System.out.println("conPath : "+conPath);
		
		String command = uri.substring(conPath.length());
		System.out.println("command : "+command);
		
		String viewPage = "HistoryEmpSelect.jsp";
		
		if(command.equals("/historyEmp/HistoryEmpSelect.historyEmp")) {
			viewPage ="HistoryEmpSelectDB.historyEmp";
		}else if(command.equals("/historyEmp/HistoryEmpSelectDB.historyEmp")) {
			HistoryEmpService.selectAllHistoryEmp(request,response);
			viewPage ="HistoryEmpSelect.jsp";
		}else if(command.equals("/historyEmp/HistoryEmpSelectOne.historyEmp")) {
			HistoryEmpService.selectid(request,response);
			viewPage ="HistoryEmpSelectOne.jsp";
		}
//		else if(command.equals("/employeeCenter/deleteCustomer.employeeCenter")) {
//		viewPage ="selectAll.customerHobby";
//		EmployeeCenterService.deleteCustomer(request,response);
//		System.out.println("/employeeCenter/deleteCustomer.employeeCenter");
//		}
//	else if(command.equals("/employeeCenter/deleteHobby.employeeCenter")) {
//		viewPage ="selectAll.employeeCenter";
//		EmployeeCenterService.deleteHobby(request,response);
//		System.out.println("/employeeCenter/deleteHobby.employeeCenter");
//		}
//	else if(command.equals("/employeeCenter/update.employeeCenter")) {
//		viewPage ="selectAll.employeeCenter";
//		EmployeeCenterService.update(request,response);
//		System.out.println("/employeeCenter/update.employeeCenter");
//		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
