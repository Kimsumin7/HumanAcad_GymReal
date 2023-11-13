package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.SiDto;
import com.human.util.DBConn;

public class SiDao {
	
	public void insert(SiDto dto) {
		String sql = String.format("insert into si values(%d,'%s',%d)", dto.getSi_id(), dto.getSi_name(),dto.getDo_id());
		DBConn.statementUpdate(sql);
	}

	public ArrayList<SiDto> selectAll() {
		ArrayList<SiDto> resultDtos = new ArrayList<SiDto>(); 
		ResultSet rs = DBConn.statementQuery(String.format("select * from si"));

		try {
			while (rs.next()) {
				resultDtos.add(new SiDto(rs.getInt("si_id"), rs.getString("si_name"),rs.getInt("do_id")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDtos;
	}

	public SiDto selectId(int si_id) {
		SiDto resultDtos = new SiDto();
		ResultSet rs = DBConn.statementQuery(String.format("select * from si where si_id=%d", si_id));
		if (rs != null) {
			try {
				rs.next();
				resultDtos = new SiDto(rs.getInt("si_id"), rs.getString("si_name"),rs.getInt("do_id"));
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}

	public void delete(int si_id) {
		DBConn.statementUpdate(String.format("delete si where si_id = %d", si_id));
	}
}
