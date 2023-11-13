package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.dao.CenterDao;
import com.human.dao.SiCenterDao;
import com.human.dao.SiDao;
import com.human.dto.SiCenterDto;

public class SiCenterService {
	public static CenterDao centerDao = new CenterDao();
	public static SiDao siDao = new SiDao();
	public static SiCenterDao siCenterDao = new SiCenterDao();
	
	public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<SiCenterDto> dtos = new ArrayList<SiCenterDto>();
		dtos =siCenterDao.selecAllCenterAndSi();
		System.out.println(dtos);
		request.setAttribute("dtos", dtos);
	}

//	public static void selectOne(HttpServletRequest request, HttpServletResponse response) {
//		SiCenterDto dto = siCenterDao.selectOneCenterAndSi(Integer.parseInt(request.getParameter("center_id")),
//				request.getParameter("si_name"));
//		System.out.println(dto);
//		request.setAttribute("dto", dto);
//	}
}
