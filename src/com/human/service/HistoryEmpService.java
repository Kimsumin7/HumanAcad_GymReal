package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.HistoryEmpDao;
import com.human.dto.HistoryEmpDto;

public class HistoryEmpService {
	public static void selectAllHistoryEmp(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<HistoryEmpDto> dtos = HistoryEmpDao.selectAllHistoryEmp();
		request.setAttribute("dtos", dtos);
	}

	public static void selectid(HttpServletRequest request, HttpServletResponse response) {
		HistoryEmpDto dto = HistoryEmpDao.selectId(Integer.parseInt(request.getParameter("job_history_id")));
		request.setAttribute("dto", dto);
	}
}
