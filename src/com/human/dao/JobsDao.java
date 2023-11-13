package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.human.dto.JobsDto;
import com.human.util.DBConn;

public class JobsDao {

	public ArrayList<JobsDto> selectAll() {
		ArrayList<JobsDto> resultDtos = new ArrayList<JobsDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from jobs"));
		try {
			while (rs.next()) {
				resultDtos.add(new JobsDto(rs.getInt("job_id"), rs.getString("job_title"), rs.getInt("min_salary"),
						rs.getInt("max_salary")));
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDtos;
	}
	
	
	
}
