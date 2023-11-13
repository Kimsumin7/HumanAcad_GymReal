package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.human.dto.HistoryEmpDto;
import com.human.util.DBConn;
import com.human.dto.EmployeesDto;

public class HistoryEmpDao {
	public static ArrayList<HistoryEmpDto> selectAllHistoryEmp() {
//		ArrayList<HistoryEmpDto> resultDtos = new ArrayList<HistoryEmpDto>();

		String sql = String.format("select job_history.*, employees.* " + "from job_history \r\n"
				+ "inner join employees on job_history.employee_id = employees.employee_id");
		ResultSet rs = DBConn.statementQuery(sql);

		ArrayList<HistoryEmpDto> HistoryEmpDto = new ArrayList<HistoryEmpDto>();
		try {
			while (rs.next()) {
				HistoryEmpDto.add(
						new HistoryEmpDto(rs.getInt("job_history_id"), rs.getTimestamp("end_date").toLocalDateTime(),
								rs.getInt("employee_id"), rs.getTimestamp("hire_date").toLocalDateTime(),
								new EmployeesDto(rs.getInt("employee_id"), rs.getString("name"), rs.getString("email"),
										rs.getString("phone"), rs.getInt("salary"), rs.getInt("commission_pct"),
										rs.getInt("job_id"), rs.getInt("center_id"))));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(HistoryEmpDto.get(0));
		return HistoryEmpDto;
	}

	public static HistoryEmpDto selectId(int id) {
		HistoryEmpDto resultDtos = new HistoryEmpDto();
		ResultSet rs = DBConn.statementQuery(String.format("select job_history.*, employees.* \r\n"
				+ "from job_history\r\n"
				+ "inner join employees on job_history.employee_id = employees.employee_id and job_history_id = %d",
				id));
		if (rs != null) {
			try {
				rs.next();
				resultDtos = new HistoryEmpDto(rs.getInt("job_history_id"),
						rs.getTimestamp("end_date").toLocalDateTime(), rs.getInt("employee_id"),
						rs.getTimestamp("hire_date").toLocalDateTime(),
						new EmployeesDto(rs.getInt("employee_id"), rs.getString("name"), rs.getString("email"),
								rs.getString("phone"), rs.getInt("salary"), rs.getInt("commission_pct"),
								rs.getInt("job_id"), rs.getInt("center_id")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}

}