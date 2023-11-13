package com.human.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.service.EmployeeJobService;


@WebServlet("*.employeeJob")
public class EmployeeJobController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    public EmployeeJobController() {
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

//      if (command.equals("/doSi/insert.doSi")) {
//         viewPage = "insert.jsp";
//         System.out.println("/doSi/insert.doSi");
//      } else if (command.equals("/doSi/insertDB.doSi")) {
//         viewPage = "selectAll.doSi";
//         DoSiService.insertDB(request, response);
//         System.out.println("/doSi/insertDB.doSi");
//      } else 
      if (command.equals("/employeeJob/selectAll.employeeJob")) {
         viewPage = "selectAll.jsp";
         EmployeeJobService.selectAll(request, response);
         System.out.println("/employeeJob/selectAll.employeeJob");
      }
//      } else if (command.equals("/doSi/selectOne.doSi")) {
//         viewPage = "selectOne.jsp";
//         DoSiService.selectOne(request, response);
//         System.out.println("/doSi/selectOne.doSi");
//      } 
//      else if (command.equals("/doSi/delete.doSi")) {
//         viewPage = "selectAll.doSi";
//         DoSiService.delete(request, response);
//         System.out.println("/doSi/delete.doSi");
//      } else if (command.equals("/doSi/update.doSi")) {
//         viewPage = "update.jsp";
//         doSiService.selectOne(request, response);
//         System.out.println("/doSi/update.doSi");
//      } else if (command.equals("/doSi/updateDB.doSi")) {
//         viewPage = "selectAll.doSi";
//         doSiService.update(request, response);
//         System.out.println("/doSi/updateDB.doSi");

      System.out.println(viewPage);
      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
      dispatcher.forward(request, response);
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}