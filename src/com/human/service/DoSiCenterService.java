package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.dao.DoSiCenterDao;
import com.human.dto.DoSiCenterDto;

public class DoSiCenterService {
	public static DoSiCenterDao doSiCenterDao=new DoSiCenterDao();
	public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<DoSiCenterDto> dtos = new ArrayList<DoSiCenterDto>();
		dtos = doSiCenterDao.selecAllDoSiCenterDto();
		request.setAttribute("dtos", dtos);
	}

	public static void selectOne(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(Integer.parseInt(request.getParameter("center_id")));
		System.out.println(Integer.parseInt(request.getParameter("si_id")));
		System.out.println(Integer.parseInt(request.getParameter("do_id")));
		DoSiCenterDto dto = doSiCenterDao.selectOneDoSiCenter(
				Integer.parseInt(request.getParameter("center_id")), 
				Integer.parseInt(request.getParameter("si_id")),
				Integer.parseInt(request.getParameter("do_id")));
		
		System.out.println(dto);
		request.setAttribute("dto",dto);
	}
}
