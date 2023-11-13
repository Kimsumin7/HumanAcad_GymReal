package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.CategoryDao;
import com.human.dto.CategoryDto;

public class CategoryService {
	public static CategoryDao categoryDao = new CategoryDao();
	
	 public static void insertDB(HttpServletRequest request, HttpServletResponse response) {
	      CategoryDto dto = new CategoryDto(Integer.parseInt(request.getParameter("category_id")),
	            request.getParameter("category_name"),
	            Integer.parseInt(request.getParameter("center_id")));
	      System.out.println(dto);
	      CategoryDao.insert(dto);
	   }

	   public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
	      ArrayList<CategoryDto> dtos = categoryDao.selectAll();
	      request.setAttribute("dtos", dtos);
	   }
	   
	   public static void selectOne(HttpServletRequest request, HttpServletResponse response) {
	      CategoryDto dto = categoryDao.selectId(Integer.parseInt(request.getParameter("employee_id")));
	      request.setAttribute("dto", dto);
	   }

	   public static void delete(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	      categoryDao.delete(Integer.parseInt(request.getParameter("employee_id")));
	   }

	   public static void update(HttpServletRequest request, HttpServletResponse response) {
	      CategoryDao.update(Integer.parseInt(request.getParameter("category_id")),request.getParameter("category_name"));
	   }

}
