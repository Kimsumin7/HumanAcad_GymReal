package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.EmployeesDto;
import com.human.util.DBConn;

public class EmployeesDao {

	
	public void insert(EmployeesDto dto) {
		String sql = String.format("insert into employees values(%d,'%s','%s','%s',%d,%d,%d,%d)",
				dto.getEmployee_id(), dto.getName(), dto.getEmail(),dto.getPhone(),
				dto.getSalary(),dto.getCommission_pct(),dto.getCenter_id(),dto.getJob_id());
		
		DBConn.statementUpdate(sql);
	}
	
	public static ArrayList<EmployeesDto> selectAll(){
		ArrayList<EmployeesDto> resultDtos = new ArrayList<EmployeesDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from employees"));
		try {
			while (rs.next()) {
				resultDtos.add(new EmployeesDto(rs.getInt("employee_id"), rs.getString("name"), 
						rs.getString("email"),rs.getString("phone"),rs.getInt("salary"),
						rs.getInt("commission_pct"), rs.getInt("center_id"),rs.getInt("job_id")));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return resultDtos;
	}
	
	
	public EmployeesDto selectId(int employee_id) {
		EmployeesDto resultDtos = new EmployeesDto();
		ResultSet rs = DBConn.statementQuery(String.format("select * from employees where employee_id=%d", employee_id));
		if (rs != null) {
			try {
				rs.next();
				resultDtos = new EmployeesDto(rs.getInt("employee_id"), rs.getString("name"), 
						rs.getString("email"),rs.getString("phone"),rs.getInt("salary"),
						rs.getInt("commission_pct"), rs.getInt("center_id"),rs.getInt("job_id"));
			} catch (SQLException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}
	
	public static void update_emp(int employee_id, String email, String phone, int salary, int commission_pct, int center_id, int job_id) {
		DBConn.statementUpdate(String.format("update employees set email='%s', phone='%s', salary=%d, commission_pct=%d, center_id=%d, job_id=%d where employee_id=%d",
				email, phone, salary, commission_pct, center_id, job_id, employee_id));
	}
	
	public static void delete(int employee_id) {
		DBConn.statementUpdate(String.format("delete employees where employee_id = %d", employee_id));
	}
	
	public ArrayList<Integer> getIds() {
		ArrayList<Integer> ids = new ArrayList<Integer>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from employees"));
		try {
			while (rs.next()) {
				ids.add(rs.getInt("employee_id"));
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ids;
	}

//CustomerHobby 작업으로 생긴 부분
	public int getMaxId() {
		int maxIdValue = -1;
		ResultSet rs = DBConn.statementQuery(String.format("select max(id) as maxId from employees"));
		if (rs != null) {
			try {
				rs.next();
				maxIdValue = rs.getInt("maxId");
			} catch (SQLException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return maxIdValue;
	}
}
