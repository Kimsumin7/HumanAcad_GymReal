package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.DoDto;
import com.human.util.DBConn;

public class DoDao {
	public void insert(DoDto dto) {
		String sql = String.format("insert into do values(%d,'%s')", dto.getDo_id(), dto.getDo_name());
		DBConn.statementUpdate(sql);
	}

	public ArrayList<DoDto> selectAll() {
		ArrayList<DoDto> resultDtos = new ArrayList<DoDto>(); 
		ResultSet rs = DBConn.statementQuery(String.format("select * from do"));
		try {
			while (rs.next()) {
				resultDtos.add(new DoDto(rs.getInt("do_id"), rs.getString("do_name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDtos;
	}

	public DoDto selectId(int do_id) {
		DoDto resultDtos = new DoDto();
		ResultSet rs = DBConn.statementQuery(String.format("select * from do where do_id=%d", do_id));
		if (rs != null) {
			try {
				rs.next();
				resultDtos = new DoDto(rs.getInt("do_id"), rs.getString("do_name"));
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}
	
	public void update(int do_id, String do_name) {
		DBConn.statementUpdate(String.format("update do set do_name='%s' where do_id=%d", do_name, do_id));
	}

	public void delete(int do_id) {
		DBConn.statementUpdate(String.format("delete do where do_id = %d", do_id));
	}
}
