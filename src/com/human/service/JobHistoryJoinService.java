package com.human.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.EmployeesDao;
import com.human.dao.JobHistoryJoinDao;
import com.human.dto.JobHistoryJoinDto;

public class JobHistoryJoinService {
	public static JobHistoryJoinDao jobHistoryJoinDao = new JobHistoryJoinDao();

	public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<JobHistoryJoinDto> dtos = new ArrayList<JobHistoryJoinDto>();
		dtos = jobHistoryJoinDao.selectAllJobHistoryJoin();
		request.setAttribute("dtos", dtos);
	}

//	public static void update(HttpServletRequest request, HttpServletResponse response) {
//		JobHistoryJoinDao dao = new JobHistoryJoinDao();
//		System.out.println(LocalDateTime.parse(request.getParameter("end_date")));
//		dao.update(Integer.parseInt(request.getParameter("job_history_id")),
//				LocalDateTime.parse(request.getParameter("end_date")));
//	}

	public static void update(HttpServletRequest request, HttpServletResponse response) {
		jobHistoryJoinDao.update(Integer.parseInt(request.getParameter("job_history_id")), 
				LocalDateTime.parse(request.getParameter("end_date"),  DateTimeFormatter.ofPattern("yyyy-MM-dd HH24:MM:SS")));
	}

	public static void selectOne(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(Integer.parseInt(request.getParameter("job_history_id")));
		JobHistoryJoinDto dto = jobHistoryJoinDao.selectOne(Integer.parseInt(request.getParameter("job_history_id")));
		System.out.println(dto);
		request.setAttribute("dto", dto);
	}
}
