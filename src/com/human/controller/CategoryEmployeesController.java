package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.service.CategoryEmployeesService;

/**
 * Servlet implementation class CategoryEmployeesController
 */
@WebServlet("*.categoryEmployees")
public class CategoryEmployeesController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryEmployeesController() {
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
      
      String viewPage = "selectAll.jsp";
      
      if(command.equals("/categoryEmployees/selectAll.categoryEmployees")) {
         CategoryEmployeesService.selectAllCategoryEmployees(request, response);
         viewPage ="selectAll.jsp";
         }

//      } else if (command.equals("/categoryEmployees/insert.categoryEmployees")) {
//         viewPage = "insert.jsp";
//         CategoryEmployeesService.insert(request, response);
//         System.out.println("/categoryEmployees/insert.categoryEmployees");
//      } else if (command.equals("/categoryEmployees/selectAll.categoryEmployees")) {
//         viewPage = "selectAll.jsp";
//         CategoryEmployeesService.selectAllCategoryEmployees(request, response);
//         System.out.println("/categoryEmployees/selectAll.categoryEmployees");}
      
//      }else if(command.equals("/customer/selectOne.customer")) {
//         viewPage = "selectOne.jsp";
//         CategoryEmployeesService.selectOne(request, response);
//         System.out.println("/customer/selectOne.customer");
//      }else if(command.equals("/customer/delete.customer")) {
//         viewPage ="selectAll.customer";
//         CategoryEmployeesService.delete(request,response);
//         System.out.println("/customer/delete.customer");
//      }else if(command.equals("/customer/update.customer")) {
//         viewPage = "update.jsp";
//         CategoryEmployeesService.selectOne(request, response);
//         System.out.println("/customer/update.customer");
//      }else if(command.equals("/customer/updateDB.customer")) {
//         viewPage ="selectAll.customer";
//         CategoryEmployeesService.update(request, response);
//         System.out.println("/customer/updateDB.customer");
//      }
      
      
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