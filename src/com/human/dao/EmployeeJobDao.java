package com.human.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.human.dto.EmployeeJobDto;
import com.human.dto.JobsDto;
import com.human.util.DBConn;

public class EmployeeJobDao {
   public ArrayList<EmployeeJobDto> selectAllEmployeeJob() {
      ArrayList<EmployeeJobDto> resultDtos = new ArrayList<EmployeeJobDto>();
      ResultSet rs = DBConn.statementQuery(
            String.format("select employees.*,jobs.* from employees,jobs "
                  + "where employees.job_id=jobs.job_id(+)"));
      try {
         while (rs.next()) {
            resultDtos.add(new EmployeeJobDto(
                  rs.getInt("employee_id"),
                  rs.getString("name"),
                  rs.getString("email"),
                  rs.getString("phone"),
                  rs.getInt("salary"),
                  rs.getInt("commission_pct"),
                  rs.getInt("center_id"),
                  rs.getInt("job_id"),
                  new JobsDto(
                        rs.getInt("job_id"), 
                        rs.getString("job_title"),
                        rs.getInt("min_salary"),
                        rs.getInt("max_salary"))));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      return resultDtos;
   }

//   public DoSiDto selectOneSiAndDo(int si_id, String do_name) {
//      DoSiDto resultDto = null;
//      ResultSet rs = DBConn.statementQuery(String.format("select si.si_id,do.do_name from si, do where si.si_id=do.do_id(+)"));
//      try {
//         while (rs.next()) {
//            resultDto=new DoSiDto(
//                  rs.getInt("si_id"),
//                  rs.getString("si_name"),
//                  new DoDto(rs.getInt("do_id"),rs.getString("do_name"))
//                  );
//         }
//      }catch(Exception e)   {
//         e.printStackTrace();
//      }
//      return resultDto;
//   }
}