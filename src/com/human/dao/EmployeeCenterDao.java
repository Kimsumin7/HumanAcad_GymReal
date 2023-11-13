package com.human.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import com.human.dto.CenterDto;

import com.human.dto.EmployeeCenterDto;

import com.human.util.DBConn;

public class EmployeeCenterDao {

	
	public ArrayList<EmployeeCenterDto> selectAllEmployeeCenter(){
//		ArrayList<EmployeeCenterDto> resultDtos = new ArrayList<EmployeeCenterDto>();
		
		String sql = String.format("select employees.*,center.* from employees,center "
				+ "where employees.center_id=center.center_id(+)"); 
		ResultSet rs = DBConn.statementQuery(sql);
		
		
		//public EmployeeCenterDto(Integer employee_id, String name, 
//		String email, String phone, Integer salary,
//		Integer commission_pct, Integer job_id, Integer center_id, 
//		ArrayList<CenterDto> centerDto) {
		ArrayList<EmployeeCenterDto> employeeCenterDto =new ArrayList<EmployeeCenterDto>();
		try {
			while(rs.next()) {
				employeeCenterDto.add(new EmployeeCenterDto(
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
								rs.getInt("si_id")
				)));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return employeeCenterDto;
	}	
	
	public EmployeeCenterDto selectOneEmployeeCenter(int employee_id, int center_id) {
		EmployeeCenterDto resultDto = null;
		String sql = "";
		sql = String.format("select employees.*, center.center_id from employee, center"
				+ "where employees.center_id=center.center_id(+) "
				+ "and employees.employee_id="+employee_id+"and center.center_id="+center_id);
		
		ResultSet rs = DBConn.statementQuery(sql);
		try {
//			while (rs.next()) {
//				resultDto = new EmployeeCenterDto(rs.getInt("employee_id"), rs.getString("name"), 
//						rs.getString("email"),rs.getString("phone"),rs.getInt("salary"),
//						rs.getInt("commission_pct"),rs.getInt("job_id"),
//						new CenterDto(rs.getInt("center_id"), rs.getString("street_adress"),
//								rs.getString("center_name"),rs.getInt("si_id")));
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDto;
	}
}
