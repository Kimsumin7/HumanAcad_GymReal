package com.human.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.CategoryEmployeesDao;
import com.human.dto.CategoryEmployeesDto;

public class CategoryEmployeesService {

   public static void selectAllCategoryEmployees(HttpServletRequest request, HttpServletResponse response) {
      ArrayList<CategoryEmployeesDto> dtos = CategoryEmployeesDao.selectAllCategoryEmployees();
      request.setAttribute("dtos", dtos);
   }
}