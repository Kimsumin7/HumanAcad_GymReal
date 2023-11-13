package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.CenterDao;
import com.human.dao.EmpCenJobDao;
import com.human.dao.EmployeeCenterDao;
import com.human.dao.EmployeesDao;
import com.human.dto.EmpCenJobDto;
import com.human.dto.EmployeesDto;


public class EmpCenJobService {
//	public static EmployeesDao employeesDao = new EmployeesDao();
//	public static CenterDao centerDao = new CenterDao();
//	public static EmployeeCenterDao employeeCenterDao = new EmployeeCenterDao();
	public static EmpCenJobDao empCenJobDao = new EmpCenJobDao();
//	public static EmployeesDao employeesDao = new EmployeesDao();
//	
//	public static void insertDB(HttpServletRequest request,
//			HttpServletResponse response) {
//		
//		EmployeesDto employeesDto = new EmployeesDto(
//				Integer.parseInt(request.getParameter("employee_id")), 
//				request.getParameter("name"),
//				request.getParameter("email"),
//				request.getParameter("phone"),
//				Integer.parseInt(request.getParameter("salary")), 
//				Integer.parseInt(request.getParameter("commission_pct")), 
//				Integer.parseInt(request.getParameter("job_id")),
//				Integer.parseInt(request.getParameter("center_id")));
//		
//		employeesDao.insert(employeesDto);
//		
//		
//		
//	}
	
	public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<EmpCenJobDto> dtos = new ArrayList<EmpCenJobDto>();
		dtos = empCenJobDao.selectAllEmpCenJobDto();
		request.setAttribute("dtos", dtos);
		System.out.println(dtos);
	}
	
public static void selectAllBest(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<EmpCenJobDto> dtos3 = new ArrayList<EmpCenJobDto>();
		dtos3 = empCenJobDao.selectAllBest();
		request.setAttribute("dtos3", dtos3);
		System.out.println(dtos3);
	}

	public static void selectOne(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(Integer.parseInt(request.getParameter("employee_id")));
		System.out.println(Integer.parseInt(request.getParameter("center_id")));
		System.out.println(Integer.parseInt(request.getParameter("job_id")));
		EmpCenJobDto dto = empCenJobDao.selectOneEmpCenJob(
				Integer.parseInt(request.getParameter("employee_id")), 
				Integer.parseInt(request.getParameter("center_id")),
				Integer.parseInt(request.getParameter("job_id")));
		
		System.out.println(dto);
		request.setAttribute("dto",dto);
	}
	
	public static void selectJobs(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println(Integer.parseInt(request.getParameter("employee_id")));
		System.out.println(Integer.parseInt(request.getParameter("center_id")));
		System.out.println(Integer.parseInt(request.getParameter("job_id")));
		EmpCenJobDto dto2 = empCenJobDao.selectJobs(
				Integer.parseInt(request.getParameter("job_id")),
				request.getParameter("job_title"),
				Integer.parseInt(request.getParameter("employee_id")),
				request.getParameter("name"),
				Integer.parseInt(request.getParameter("center_id")),
				request.getParameter("center_name"));
		
		System.out.println(dto2);
		request.setAttribute("dto2",dto2);
		System.out.println("employee_id: " + request.getParameter("employee_id"));
		System.out.println("center_id: " + request.getParameter("center_id"));
		System.out.println("job_id: " + request.getParameter("job_id"));

	}
//	
//	public static void deleteHobby(HttpServletRequest request,
//			HttpServletResponse response) {
//			hobbyDao.delete(Integer.parseInt(request.getParameter("id"))
//			, request.getParameter("hobby"));
//	}
//	
//	public static void deleteCustomer(HttpServletRequest request,
//			HttpServletResponse response) {
//			hobbyDao.deleteAll(Integer.parseInt(request.getParameter("id")));
//			customerDao.delete(Integer.parseInt(request.getParameter("id")));
//	}
//
//	public static void update(HttpServletRequest request, HttpServletResponse response) {
//		customerDao.update(Integer.parseInt(request.getParameter("id")),
//				Double.parseDouble(request.getParameter("newHeight")));
//		hobbyDao.update(Integer.parseInt(request.getParameter("id")),
//				request.getParameter("hobby"),
//				request.getParameter("newHobby"));
//	}
}
