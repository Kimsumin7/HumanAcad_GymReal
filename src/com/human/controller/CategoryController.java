package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.CategoryService;

/**
 * Servlet implementation class categoryController
 */
@WebServlet("*.category")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryController() {
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
		
		
		if (command.equals("/category/insert.category")) {
			viewPage = "insert.jsp";
			System.out.println("/category/insert.category");
		} 
		else if (command.equals("/category/insertDB.category")) {
			viewPage = "selectAll.category";
			CategoryService.insertDB(request, response);
			System.out.println("/category/insertDB.category");
		} 
		else if (command.equals("/category/selectAll.category")) {
			viewPage = "selectAll.jsp";
			CategoryService.selectAll(request, response);
			System.out.println("/category/selectAll.category");
		} 
		else if (command.equals("/category/selectOne.category")) {
			viewPage = "selectOne.jsp";
			CategoryService.selectOne(request, response);
			System.out.println("/category/selectOne.category");
		} 	
		else if (command.equals("/category/delete.category")) {
			viewPage = "selectAll.category";
			CategoryService.delete(request, response);
			System.out.println("/category/delete.category");
		} 
		else if (command.equals("/category/update.category")) {
			viewPage = "update.jsp";
			CategoryService.selectOne(request, response);
			System.out.println("/category/update.category");
		} 
		else if (command.equals("/category/updateDB.category")) {
			viewPage = "selectAll.category";
			CategoryService.update(request, response);
			System.out.println("/category/updateDB.category");
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
