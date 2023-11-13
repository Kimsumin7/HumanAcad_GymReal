package com.human.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.human.dto.DoDto;
import com.human.dto.DoSiCenterDto;
import com.human.dto.SiDto;
import com.human.util.DBConn;

public class DoSiCenterDao {
	public ArrayList<DoSiCenterDto> selecAllDoSiCenterDto() {
		ArrayList<DoSiCenterDto> resultDtos = new ArrayList<DoSiCenterDto>();
		ResultSet rs = DBConn.statementQuery(
				String.format("select center.*,si.*,do.* from center, si, do where center.si_id=si.si_id and si.do_id=do.do_id"));
		try {
			while (rs.next()) {
				resultDtos.add(new DoSiCenterDto(
						rs.getInt("center_id"), 
						rs.getString("street_address"),
						rs.getString("center_name"),
						rs.getInt("si_id"),
						new SiDto(rs.getInt("si_id"), rs.getString("si_name"),rs.getInt("do_id")),
						new DoDto(rs.getInt("do_id"),rs.getString("do_name"))));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultDtos;
	}
	
	public DoSiCenterDto selectOneDoSiCenter(int center_id, int si_id, int do_id) {
		DoSiCenterDto resultDto = null;
		String sql = "";
		sql = String.format("SELECT center.*, si.*, do.* FROM center, si, do WHERE center.si_id = si.si_id " + 
					" AND si.do_id = do.do_id AND center.center_id = %d", center_id);
		ResultSet rs = DBConn.statementQuery(sql);
		try {
			while (rs.next()) {
				resultDto = new DoSiCenterDto(
						rs.getInt("center_id"), 
						rs.getString("street_address"),
						rs.getString("center_name"),
						rs.getInt("si_id"),
						new SiDto(rs.getInt("si_id"), rs.getString("si_name"),rs.getInt("do_id")),
						new DoDto(rs.getInt("do_id"),rs.getString("do_name")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultDto;
	}
}
