package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.SiDao;
import com.human.dto.SiDto;

public class SiService {
public static SiDao siDao=new SiDao();
	
	public static void insertDB(HttpServletRequest request,	HttpServletResponse response) {
		SiDto dto=new SiDto(Integer.parseInt(
				request.getParameter("si_id")), 
				request.getParameter("si_name"),
				Integer.parseInt(request.getParameter("do_id")));
		System.out.println(dto);
		siDao.insert(dto);
	}
	
	public static void selectAll(HttpServletRequest request,HttpServletResponse response) {
		ArrayList<SiDto> dtos =siDao.selectAll();
		request.setAttribute("dtos",dtos);
	}
	
	public static void selectOne(HttpServletRequest request,HttpServletResponse response) {
		SiDto dto =siDao.selectId(Integer.parseInt(request.getParameter("si_id")));
		request.setAttribute("dto", dto);
	}
	
	public static void delete(HttpServletRequest request, HttpServletResponse response) {
		siDao.delete(Integer.parseInt(request.getParameter("si_id")));
	}
}
