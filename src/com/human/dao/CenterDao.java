package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.human.dto.CenterDto;
import com.human.util.DBConn;

public class CenterDao {
	public void insert(CenterDto dto) {
		String sql = String.format("insert into center values(%d,'%s','%s',%d)", dto.getCenter_id(), dto.getStreet_address(),
				dto.getCenter_name(),dto.getSi_id());
		DBConn.statementUpdate(sql);
	}

	// select 작업
	public ArrayList<CenterDto> selectAll() {
		ArrayList<CenterDto> resultDtos = new ArrayList<CenterDto>(); 
		// resultDtos라는 새로운 ArrayList를 생성하여 검색된 고객 정보를 저장할 공간
		ResultSet rs = DBConn.statementQuery(String.format("select * from center"));// DB에 있는 모든 고객정보를 검색하기 위해 SQLinsert실행
		// DBConn.statementQuery는 DB에 쿼리를 보내고 반환하는 역할 --> 그 결과가 rs에 저장
		try {
			while (rs.next()) {
				resultDtos.add(new CenterDto(
						rs.getInt("center_id"), 
						rs.getString("street_address"),
						rs.getString("center_name"),
						rs.getInt("si_id")
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDtos;
	}

	// select 작업
	public CenterDto selectId(int center_id) {
		CenterDto resultDtos = new CenterDto();
		ResultSet rs = DBConn.statementQuery(String.format("select * from center where center_id=%d", center_id));
		if (rs != null) {
			try {
				rs.next();
				resultDtos = new CenterDto(
						rs.getInt("center_id"), 
						rs.getString("street_address"),
						rs.getString("center_name"),
						rs.getInt("si_id")
						);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}
	
	// delete작업
	public void delete(int center_id) {
		DBConn.statementUpdate(String.format("delete center where center_id = %d", center_id));
	}
}
