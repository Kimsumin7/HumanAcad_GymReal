package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.EmpCenJobService;


/**
 * Servlet implementation class empCenJobController
 */
@WebServlet("*.empCenJob")
public class EmpCenJobController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpCenJobController() {
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
		
		if (command.equals("/empCenJob/insert.empCenJob")) {
			viewPage = "insert.jsp";
			System.out.println("/empCenJob/insert.empCenJob");
			} 
//		else if (command.equals("/empCenJob/insertDB.empCenJob")) {
//			viewPage = "selectAll.empCenJob";
//			EmpCenJobService.insertDB(request, response);
//			System.out.println("/empCenJob/insertDB.empCenJob");
//			} 
		else if (command.equals("/empCenJob/selectAll.empCenJob")) {
			viewPage = "selectAll.jsp";
			EmpCenJobService.selectAll(request, response);
			System.out.println("/empCenJob/selectAll.empCenJob");
			}
		else if(command.equals("/empCenJob/selectOne.empCenJob")) {
			viewPage = "selectOne.jsp";
			EmpCenJobService.selectOne(request, response);
			System.out.println("/empCenJob/selectOne.empCenJob");
			}
//		else if(command.equals("/empCenJob/deleteCustomer.empCenJob")) {
//			viewPage ="selectAll.customerHobby";
//			empCenJobService.deleteCustomer(request,response);
//			System.out.println("/empCenJob/deleteCustomer.empCenJob");
//			}
//		else if(command.equals("/empCenJob/deleteHobby.empCenJob")) {
//			viewPage ="selectAll.empCenJob";
//			empCenJobService.deleteHobby(request,response);
//			System.out.println("/empCenJob/deleteHobby.empCenJob");
//			}
//		else if(command.equals("/empCenJob/update.empCenJob")) {
//			viewPage ="selectAll.empCenJob";
//			empCenJobService.update(request,response);
//			System.out.println("/empCenJob/update.empCenJob");
//			}
		else if(command.equals("/empCenJob/selectJobs.empCenJob")) {
			viewPage = "selectJobs.jsp";
			EmpCenJobService.selectAll(request, response);
			System.out.println("/empCenJob/selectJobs.empCenJob");
			}
		else if(command.equals("/empCenJob/selectSalary.empCenJob")) {
			viewPage = "selectSalary.jsp";
			EmpCenJobService.selectAll(request, response);
			System.out.println("/empCenJob/selectSalary.empCenJob");
			}
		else if(command.equals("/empCenJob/bestEmp.empCenJob")) {
			viewPage = "bestEmp.jsp";
			EmpCenJobService.selectAllBest(request, response);
			System.out.println("/empCenJob/bestEmp.empCenJob");
			}
		
	
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
