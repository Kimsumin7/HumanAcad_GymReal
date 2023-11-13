package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.EmployeeCenterService;

/**
 * Servlet implementation class EmployeeCenterController
 */
@WebServlet("*.employeeCenter")
public class EmployeeCenterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeCenterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String uri = request.getRequestURI();
		System.out.println("URI : "+uri);
		
		String conPath = request.getContextPath();
		System.out.println("conPath : "+conPath);
		
		String command = uri.substring(conPath.length());
		System.out.println("command : "+command);
		
		String viewPage = "selectAll.jsp";
		
		if (command.equals("/employeeCenter/insert.employeeCenter")) {
			viewPage = "insert.jsp";
			System.out.println("/employeeCenter/insert.employeeCenter");
			} 
		else if (command.equals("/employeeCenter/insertDB.employeeCenter")) {
			viewPage = "selectAll.employeeCenter";
			EmployeeCenterService.insertDB(request, response);
			System.out.println("/employeeCenter/insertDB.employeeCenter");
			} 
		else if (command.equals("/employeeCenter/selectAll.employeeCenter")) {
			viewPage = "selectAll.jsp";
			System.out.println("1");
			EmployeeCenterService.selectAll(request, response);
			System.out.println("/employeeCenter/selectAll.employeeCenter");
			}
		else if(command.equals("/employeeCenter/selectOne.employeeCenter")) {
			viewPage = "selectOne.jsp";
			EmployeeCenterService.selectOne(request, response);
			System.out.println("/employeeCenter/selectOne.employeeCenter");
			}
//		else if(command.equals("/employeeCenter/deleteCustomer.employeeCenter")) {
//			viewPage ="selectAll.customerHobby";
//			EmployeeCenterService.deleteCustomer(request,response);
//			System.out.println("/employeeCenter/deleteCustomer.employeeCenter");
//			}
//		else if(command.equals("/employeeCenter/deleteHobby.employeeCenter")) {
//			viewPage ="selectAll.employeeCenter";
//			EmployeeCenterService.deleteHobby(request,response);
//			System.out.println("/employeeCenter/deleteHobby.employeeCenter");
//			}
//		else if(command.equals("/employeeCenter/update.employeeCenter")) {
//			viewPage ="selectAll.employeeCenter";
//			EmployeeCenterService.update(request,response);
//			System.out.println("/employeeCenter/update.employeeCenter");
//			}
	
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
