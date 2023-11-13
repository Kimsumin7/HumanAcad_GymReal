package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.human.dto.JobHistoryDto;
import com.human.dto.JobHistoryDto;
import com.human.util.DBConn;

public class JobHistoryDao {
	
	public static ArrayList<JobHistoryDto> selectEmployee() {
		
		ArrayList<JobHistoryDto> resultDtos = new ArrayList<JobHistoryDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from job_history"));
		try {
			while (rs.next()) {
				resultDtos.add(new JobHistoryDto(rs.getInt("job_history_id"), rs.getInt("job_id"),
						rs.getTimestamp("end_date").toLocalDateTime(), rs.getInt("employee_id"),
						rs.getInt("category_id"), rs.getTimestamp("hire_date").toLocalDateTime()));
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDtos;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void update(int empId, LocalDateTime endDate) {
//		// update 이름을 이용해서 나이를 변경하는 형태
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		String formattedEndDate = endDate.format(formatter);
//		DBConn.statementUpdate(
//				String.format("update job_history set end_date='%s' where id=%d", formattedEndDate, empId));
//	}
}