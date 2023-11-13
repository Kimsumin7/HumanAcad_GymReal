package com.human.service;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.EmployeesDao;
import com.human.dto.EmployeesDto;


public class EmployeesService {
   public static EmployeesDao employeesDao = new EmployeesDao();


   
   public static void insertDB(HttpServletRequest request, HttpServletResponse response) {
     
//	   EmployeesDto dto = new EmployeesDto(Integer.parseInt(request.getParameter("employee_id")),
//            request.getParameter("name"),request.getParameter("email"),
//            request.getParameter("phone"),
//            Integer.parseInt(request.getParameter("salary")),
//            Integer.parseInt(request.getParameter("commission_pct")),
//            Integer.parseInt(request.getParameter("job_id")),
//            Integer.parseInt(request.getParameter("center_id")));
//      System.out.println(dto);
//      employeesDao.insert(dto);
	   
	   for(String centerId:request.getParameterValues("center_id")) {
		   EmployeesDto dto = new EmployeesDto(Integer.parseInt(request.getParameter("employee_id")),
		            request.getParameter("name"),request.getParameter("email"),
		            request.getParameter("phone"),
		            Integer.parseInt(request.getParameter("salary")),
		            Integer.parseInt(request.getParameter("commission_pct")),
		            Integer.parseInt(request.getParameter("job_id")),
		            Integer.parseInt(centerId));
		      System.out.println(dto);
		      employeesDao.insert(dto);
	   }

   }

   public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
      ArrayList<EmployeesDto> dtos = EmployeesDao.selectAll();
      request.setAttribute("dtos", dtos);
   }
   
   public static void selectOne(HttpServletRequest request, HttpServletResponse response) {
      EmployeesDto dto = employeesDao.selectId(Integer.parseInt(request.getParameter("employee_id")));
      request.setAttribute("dto", dto);
   }

   public static void delete(HttpServletRequest request, HttpServletResponse response) {
// TODO Auto-generated method stub
      EmployeesDao.delete(Integer.parseInt(request.getParameter("employee_id")));
   }

   public static void update(HttpServletRequest request, HttpServletResponse response) {
      EmployeesDao.update_emp(Integer.parseInt(request.getParameter("employee_id")),
    		  request.getParameter("email"),request.getParameter("phone"),
    		  Integer.parseInt(request.getParameter("salary")),Integer.parseInt(request.getParameter("commission_pct")),
    		  Integer.parseInt(request.getParameter("center_id")),Integer.parseInt(request.getParameter("job_id")));
   }
}