package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.JobsDao;
import com.human.dto.JobsDto;

public class JobsService {
	public static JobsDao JobDao = new JobsDao();

	public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<JobsDto> dtos = JobDao.selectAll();
		request.setAttribute("dtos", dtos);
	}
};