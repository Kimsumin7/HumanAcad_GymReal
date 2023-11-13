package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.EmployeeJobDao;
import com.human.dao.EmployeesDao;
import com.human.dao.JobsDao;
import com.human.dto.EmployeeJobDto;



public class EmployeeJobService {
   public static EmployeesDao employeesDao = new EmployeesDao();
   public static JobsDao jobsDao = new JobsDao();
   public static EmployeeJobDao employeeJobDao = new EmployeeJobDao();
   
//   public static void insertDB(HttpServletRequest request,
//         HttpServletResponse response) {
//      
//      EmployeesDto employeesDto = new EmployeesDto(
//            Integer.parseInt(request.getParameter("employee_id")), 
//            request.getParameter("name"),
//            request.getParameter("email"),
//            request.getParameter("phone"),
//            Integer.parseInt(request.getParameter("salary")), 
//            Integer.parseInt(request.getParameter("commission_pct")), 
//            Integer.parseInt(request.getParameter("center_id")),
//            Integer.parseInt(request.getParameter("job_id")));
//      
//      employeesDao.insert(employeesDto);
//      
//
//   }
//   
   public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
      
      ArrayList<EmployeeJobDto> dtos = new ArrayList<EmployeeJobDto>();
      dtos = employeeJobDao.selectAllEmployeeJob();
      System.out.println(dtos);
      request.setAttribute("dtos", dtos);
   }
   
//   public static void selectOne(HttpServletRequest request, HttpServletResponse response) {
//      EmployeeCenterDto dto = employeeCenterDao.selectOneEmployeeCenter(
//            Integer.parseInt(request.getParameter("employee_id")), 
//            Integer.parseInt(request.getParameter("center_id")));
//      
//      System.out.println(dto);
//      request.setAttribute("dto",dto);
//   }
//   
//   public static void deleteHobby(HttpServletRequest request,
//         HttpServletResponse response) {
//         hobbyDao.delete(Integer.parseInt(request.getParameter("id"))
//         , request.getParameter("hobby"));
//   }
//   
//   public static void deleteCustomer(HttpServletRequest request,
//         HttpServletResponse response) {
//         hobbyDao.deleteAll(Integer.parseInt(request.getParameter("id")));
//         customerDao.delete(Integer.parseInt(request.getParameter("id")));
//   }
//
//   public static void update(HttpServletRequest request, HttpServletResponse response) {
//      customerDao.update(Integer.parseInt(request.getParameter("id")),
//            Double.parseDouble(request.getParameter("newHeight")));
//      hobbyDao.update(Integer.parseInt(request.getParameter("id")),
//            request.getParameter("hobby"),
//            request.getParameter("newHobby"));
//   }
}