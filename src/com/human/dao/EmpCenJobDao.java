package com.human.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.human.dto.CenterDto;
import com.human.dto.EmpCenJobDto;
import com.human.dto.EmployeeCenterDto;
import com.human.dto.JobsDto;
import com.human.util.DBConn;

public class EmpCenJobDao {
	public ArrayList<EmpCenJobDto> selectAllEmpCenJobDto(){
//		ArrayList<EmployeeCenterDto> resultDtos = new ArrayList<EmployeeCenterDto>();
		
		String sql = String.format("SELECT employees.*, center.*, jobs.* " + 
	             "FROM employees, center, jobs " + 
	             "WHERE center.center_id = employees.center_id AND employees.job_id = jobs.job_id");

		ResultSet rs = DBConn.statementQuery(sql);
		
		
		//public EmployeeCenterDto(Integer employee_id, String name, 
//		String email, String phone, Integer salary,
//		Integer commission_pct, Integer job_id, Integer center_id, 
//		ArrayList<CenterDto> centerDto) {
		ArrayList<EmpCenJobDto> empCenJobDto =new ArrayList<EmpCenJobDto>();
		
//		empCenJobDto.clear();
		try {
			while(rs.next()) {
				empCenJobDto.add(new EmpCenJobDto(
						rs.getInt("employee_id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getInt("salary"),
						rs.getInt("commission_pct"),
						rs.getInt("job_id"),
						rs.getInt("center_id"),
						new CenterDto(
								rs.getInt("center_id"),
								rs.getString("street_address"),		
								rs.getString("center_name"),
								rs.getInt("si_id")),
						new JobsDto(
								rs.getInt("job_id"),
								rs.getString("job_title"),
								rs.getInt("min_salary"),
								rs.getInt("max_salary"))
				));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empCenJobDto;
	}	
	
	public ArrayList<EmpCenJobDto> selectAllBest(){
//		ArrayList<EmployeeCenterDto> resultDtos = new ArrayList<EmployeeCenterDto>();
		
		String sql = String.format("SELECT e.employee_id, e.name, e.commission_pct, j.job_title, c.center_name " + 
				"FROM employees e, center c, jobs j" + 
				"WHERE c.center_id = e.center_id AND e.job_id = j.job_id" + 
				"ORDER BY e.commission_pct DESC");

		ResultSet rs = DBConn.statementQuery(sql);
		
		
		//public EmployeeCenterDto(Integer employee_id, String name, 
//		String email, String phone, Integer salary,
//		Integer commission_pct, Integer job_id, Integer center_id, 
//		ArrayList<CenterDto> centerDto) {
		ArrayList<EmpCenJobDto> empCenJobDto =new ArrayList<EmpCenJobDto>();
		
//		empCenJobDto.clear();
		try {
			while(rs.next()) {
				empCenJobDto.add(new EmpCenJobDto(
						rs.getInt("employee_id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getInt("salary"),
						rs.getInt("commission_pct"),
						rs.getInt("job_id"),
						rs.getInt("center_id"),
						new CenterDto(
								rs.getInt("center_id"),
								rs.getString("street_address"),		
								rs.getString("center_name"),
								rs.getInt("si_id")),
						new JobsDto(
								rs.getInt("job_id"),
								rs.getString("job_title"),
								rs.getInt("min_salary"),
								rs.getInt("max_salary"))
				));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empCenJobDto;
	}	
	
	
	
	public EmpCenJobDto selectOneEmpCenJob(int employee_id, int center_id, int job_id) {
		EmpCenJobDto resultDto = null;
		String sql = "";
		sql = String.format("SELECT employees.*, center.*, jobs.* " +
                "FROM employees, center, jobs " +
                "WHERE center.center_id = employees.center_id " +
                "AND employees.job_id = jobs.job_id " +
                "AND employees.employee_id = " + employee_id +
                " AND center.center_id = " + center_id +
                " AND jobs.job_id = " + job_id);

		
		ResultSet rs = DBConn.statementQuery(sql);
		try {
			while (rs.next()) {
				resultDto = new EmpCenJobDto(
						rs.getInt("employee_id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getInt("salary"),
						rs.getInt("commission_pct"),
						rs.getInt("job_id"),
						rs.getInt("center_id"),
						new CenterDto(
								rs.getInt("center_id"),
								rs.getString("street_address"),		
								rs.getString("center_name"),
								rs.getInt("si_id")),
						new JobsDto(
								rs.getInt("job_id"),
								rs.getString("job_title"),
								rs.getInt("min_salary"),
								rs.getInt("max_salary")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDto;
	}
	
	public EmpCenJobDto selectJobs(int job_id, String job_title, int employee_id, String name, 
			int center_id, String center_name) {
		EmpCenJobDto resultDto = null;
		String sql = "";
		sql = String.format("SELECT j.job_id, j.job_title, e.employee_id, e.name, c.center_id, c.center_name"
				+ "FROM employees e"
				+ "JOIN jobs j ON e.job_id = j.job_id"
				+ "JOIN center c ON e.center_id = c.center_id"
				+ "ORDER BY j.job_title DESC");

		
		ResultSet rs = DBConn.statementQuery(sql);
		try {
			while (rs.next()) {
				resultDto = new EmpCenJobDto(
						rs.getInt("employee_id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getInt("salary"),
						rs.getInt("commission_pct"),
						rs.getInt("job_id"),
						rs.getInt("center_id"),
						new CenterDto(
								rs.getInt("center_id"),
								rs.getString("street_address"),		
								rs.getString("center_name"),
								rs.getInt("si_id")),
						new JobsDto(
								rs.getInt("job_id"),
								rs.getString("job_title"),
								rs.getInt("min_salary"),
								rs.getInt("max_salary")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDto;
	}
}