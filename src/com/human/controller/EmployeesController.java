package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.EmployeesService;

/**
 * Servlet implementation class employeesController
 */
@WebServlet("*.employees")
public class EmployeesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		System.out.println("URI:" + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath:" + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command:" + command);
		String viewPage = "selectAll.jsp";
		
		
		if (command.equals("/employees/insert.employees")) {
			viewPage = "insert.jsp";
			System.out.println("/employees/insert.employees");
		} 
		else if (command.equals("/employees/insertDB.employees")) {
			viewPage = "selectAll.employees";
			EmployeesService.insertDB(request, response);
			System.out.println("/employees/insertDB.employees");
		} 
//		else if (command.equals("/employees/insertDB.employees")) {
//			viewPage = "selectAll.empCenJob";
//			EmployeesService.insertDB(request, response);
//			System.out.println("/empCenJob/insertDB.empCenJob");
//		} 
		else if (command.equals("/employees/selectAll.employees")) {
			viewPage = "selectAll.jsp";
			EmployeesService.selectAll(request, response);
			System.out.println("/employees/selectAll.employees");
		} 
		else if (command.equals("/employees/selectOne.employees")) {
			viewPage = "selectOne.jsp";
			EmployeesService.selectOne(request, response);
			System.out.println("/employees/selectOne.employees");
		} 	
		else if (command.equals("/employees/delete.employees")) {
			viewPage = "selectAll.employees";
			EmployeesService.delete(request, response);
			System.out.println("/employees/delete.employees");
		} 
		else if (command.equals("/employees/update.employees")) {
			viewPage = "update.jsp";
			EmployeesService.selectOne(request, response);
			System.out.println("/employees/update.employees");
		} 
		else if (command.equals("/employees/updateDB.employees")) {
			viewPage = "selectAll.employees";
			EmployeesService.update(request, response);
			System.out.println("/employees/updateDB.employees");
		}
		
		
		System.out.println(viewPage);
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
