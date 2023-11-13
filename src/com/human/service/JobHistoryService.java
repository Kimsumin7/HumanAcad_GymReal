package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.JobHistoryDao;

import com.human.dto.JobHistoryDto;


public class JobHistoryService {
	public static JobHistoryDao jhDao = new JobHistoryDao();
	
	
	
	public static void selectEmployee(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<JobHistoryDto> dtos = JobHistoryDao.selectEmployee();
		request.setAttribute("dtos", dtos);
	}
	
	
	
//	public static void selectCategory(HttpServletRequest request, HttpServletResponse response) {
//		JobHistoryDto dto = JobHistoryDao.selectEmployee(Integer.parseInt(request.getParameter("catId")));
//		request.setAttribute("dto", dto);
//	}
	
//	public static void update(HttpServletRequest request, HttpServletResponse response) {
//		JobHistoryDao.update(Integer.parseInt(request.getParameter("empId")), LocalDateTime.parse(request.getParameter("enddate")));
//	}
//
//	public static void updateEmployeeEndDate(int employeeId, LocalDateTime parsedEndDate) {
//	    JobHistoryDao.update(employeeId, parsedEndDate);
//	}
}