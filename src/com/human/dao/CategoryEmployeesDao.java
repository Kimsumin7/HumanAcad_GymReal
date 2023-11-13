package com.human.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.human.dto.CategoryEmployeesDto;
import com.human.dto.EmployeesDto;
import com.human.util.DBConn;

public class CategoryEmployeesDao {

   public static ArrayList<CategoryEmployeesDto> selectAllCategoryEmployees() {
      String sql = "SELECT c.category_id, c.category_name, e.employee_id, e.name, e.email, "
            + "e.phone, e.salary, e.commission_pct, e.center_id, e.job_id "
            + "FROM category c LEFT JOIN employees e ON c.center_id = e.center_id order by c.category_name";
      ResultSet rs = DBConn.statementQuery(sql);

      ArrayList<CategoryEmployeesDto> categoryEmployeesDto = new ArrayList<CategoryEmployeesDto>();
      try {
         while(rs.next()) {
            categoryEmployeesDto.add(new CategoryEmployeesDto(
                  rs.getInt("category_id"),
                  rs.getString("category_name"),
                  new EmployeesDto(
                        rs.getInt("employee_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getInt("salary"),
                        rs.getInt("commission_pct"),
                        rs.getInt("center_id"),
                        rs.getInt("job_id")
                        )));
         }
      }catch(Exception e) {
         e.printStackTrace();
      }return categoryEmployeesDto;
   }


}