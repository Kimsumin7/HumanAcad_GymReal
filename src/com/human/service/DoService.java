package com.human.service;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.dao.DoDao;
import com.human.dto.DoDto;

public class DoService {
	public static DoDao doDao=new DoDao();
	
	public static void insertDB(HttpServletRequest request,	HttpServletResponse response) {
		DoDto dto=new DoDto(Integer.parseInt(request.getParameter("do_id")), request.getParameter("do_name"));
		System.out.println(dto);
		doDao.insert(dto);
	}
	
	public static void selectAll(HttpServletRequest request,HttpServletResponse response) {
		ArrayList<DoDto> dtos =doDao.selectAll();
		request.setAttribute("dtos",dtos);
	}
	
	public static void selectOne(HttpServletRequest request,HttpServletResponse response) {
		DoDto dto =doDao.selectId(Integer.parseInt(request.getParameter("do_id")));
		request.setAttribute("dto", dto);
	}
	
	public static void delete(HttpServletRequest request, HttpServletResponse response) {
		doDao.delete(Integer.parseInt(request.getParameter("do_id")));
	}
	
	public static void update(HttpServletRequest request, HttpServletResponse response) {
		doDao.update(Integer.parseInt(request.getParameter("do_id")), request.getParameter("do_name"));
	}
}
