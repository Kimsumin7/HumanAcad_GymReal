package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.human.dto.CategoryDto;
import com.human.dto.EmployeesDto;
import com.human.dto.JobHistoryJoinDto;
import com.human.dto.JobsDto;
import com.human.util.DBConn;

public class JobHistoryJoinDao {
	public ArrayList<JobHistoryJoinDto> selectAllJobHistoryJoin(){
		
		String sql = String.format("SELECT jh.*, e.*, j.*, c.*" + 
				" FROM job_history jh" + 
				" JOIN employees e ON jh.employee_id = e.employee_id" + 
				" JOIN jobs j ON jh.job_id = j.job_id" + 
				" JOIN category c ON jh.category_id = c.category_id" + 
				" ORDER BY jh.job_history_id");

		ResultSet rs = DBConn.statementQuery(sql);
		
		ArrayList<JobHistoryJoinDto> jobHistoryJoinDto =new ArrayList<JobHistoryJoinDto>();
		
		try {
			while(rs.next()) {
				jobHistoryJoinDto.add(new JobHistoryJoinDto(
						rs.getInt("job_history_id"), 
						rs.getInt("job_id"),
						rs.getTimestamp("end_date").toLocalDateTime(), 
						rs.getInt("employee_id"),
						rs.getInt("category_id"), 
						rs.getTimestamp("hire_date").toLocalDateTime(),
						
						new JobsDto(
								rs.getInt("job_id"), 
								rs.getString("job_title"), 
								rs.getInt("min_salary"),
								rs.getInt("max_salary")),
						new CategoryDto(
								rs.getInt("category_id"), 
								rs.getString("category_name"), 
								rs.getInt("center_id")),
						new EmployeesDto(
								rs.getInt("employee_id"), 
								rs.getString("name"), 
								rs.getString("email"),
								rs.getString("phone"),
								rs.getInt("salary"),
								rs.getInt("commission_pct"), 
								rs.getInt("center_id"),
								rs.getInt("job_id"))));
			}
			
		}
		catch (SQLException e) {
            e.printStackTrace();
        } 
		catch (Exception e) {
			e.printStackTrace();
		}
		return jobHistoryJoinDto;
	}	
	
	public JobHistoryJoinDto selectOne(int job_history_id) {
        JobHistoryJoinDto resultDto = null;

        String sql = "";
		sql = String.format("SELECT jh.*, e.*, j.*, c.*" + 
				" FROM job_history jh" + 
				" JOIN employees e ON jh.employee_id = e.employee_id" + 
				" JOIN jobs j ON jh.job_id = j.job_id" + 
				" JOIN category c ON jh.category_id = c.category_id" + 
				" WHERE jh.job_history_id = " + job_history_id);

		
		ResultSet rs = DBConn.statementQuery(sql);
        
        if (rs != null) {
            try {
                rs.next();
        
                resultDto = new JobHistoryJoinDto(
                        rs.getInt("job_history_id"),
                        rs.getInt("job_id"),
                        rs.getTimestamp("end_date").toLocalDateTime(),
                        rs.getInt("employee_id"),
                        rs.getInt("category_id"),
                        rs.getTimestamp("hire_date").toLocalDateTime(),
                        new JobsDto(
                                rs.getInt("job_id"),
                                rs.getString("job_title"),
                                rs.getInt("min_salary"),
                                rs.getInt("max_salary")),
                        new CategoryDto(
                        		rs.getInt("category_id"),
                        		rs.getString("category_name"),
                        		rs.getInt("center_id")),
                        new EmployeesDto(
                        		rs.getInt("employee_id"),
                        		rs.getString("name"),
                        		rs.getString("email"),
                        		rs.getString("phone"),
                        		rs.getInt("salary"),
                        		rs.getInt("commission_pct"),
                        		rs.getInt("center_id"),
                        		rs.getInt("job_id")));
            } 
            catch (SQLException e) {
                e.printStackTrace();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultDto;
    }
	
//	public void update(int job_history_id, LocalDateTime end_date) {
//		DBConn.statementUpdate(String.format("UPDATE job_history SET end_date = TO_DATE('%s', 'YYYY-MM-DD')"
//				+ "WHERE job_history_id = %d",
//				end_date.toLocalDate(), job_history_id));
//	}
//	public void update(int job_history_id, LocalDateTime end_date) {
//		DBConn.statementUpdate(String.format("UPDATE job_history" + 
//				" SET end_date = TO_DATE('%s', 'YYYY-MM-DD')" + 
//				" WHERE job_history_id = %d",
//				end_date.toLocalDate(), job_history_id));
//	}
	
	public void update(int job_history_id, LocalDateTime end_date) {
		 String formattedDate = end_date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH24:MM:SS"));
		DBConn.statementUpdate(String.format("UPDATE job_history SET end_date = TO_DATE('%s', 'YYYY-MM-DD HH24:MM:SS')"
		        + " WHERE job_history_id = %d", formattedDate, job_history_id));
	}
	
	
}
