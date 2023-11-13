package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.dao.CenterDao;
import com.human.dto.CenterDto;

public class CenterService {
public static CenterDao centerDao=new CenterDao();
	
	public static void insertDB(HttpServletRequest request,	HttpServletResponse response) {
		CenterDto dto=new CenterDto(
				Integer.parseInt(request.getParameter("center_id")),
				request.getParameter("street_address"),
				request.getParameter("center_name"),
				Integer.parseInt(request.getParameter("si_id"))
				);
		System.out.println(dto);
		centerDao.insert(dto);
	}
	
	public static void selectAll(HttpServletRequest request,HttpServletResponse response) {
		ArrayList<CenterDto> dtos =centerDao.selectAll();
		request.setAttribute("dtos",dtos);
	}
	
	public static void selectOne(HttpServletRequest request,HttpServletResponse response) {
		CenterDto dto =centerDao.selectId(Integer.parseInt(request.getParameter("center_id")));
		request.setAttribute("dto", dto);
	}
	
	public static void delete(HttpServletRequest request, HttpServletResponse response) {
		centerDao.delete(Integer.parseInt(request.getParameter("center_id")));
	}
}
