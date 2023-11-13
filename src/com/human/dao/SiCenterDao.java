package com.human.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.human.dto.SiCenterDto;
import com.human.dto.SiDto;
import com.human.util.DBConn;

public class SiCenterDao {
	
	public ArrayList<SiCenterDto> selecAllCenterAndSi() {
		ArrayList<SiCenterDto> resultDtos = new ArrayList<SiCenterDto>();
		ResultSet rs = DBConn.statementQuery(
				String.format("select center.*,si.* from center, si where center.si_id=si.si_id(+)"));
		try {
			while (rs.next()) {
				resultDtos.add(new SiCenterDto(
						rs.getInt("center_id"), 
						rs.getString("street_address"),
						rs.getString("center_name"),
						rs.getInt("si_id"),
						new SiDto(rs.getInt("si_id"), rs.getString("si_name"),rs.getInt("do_id"))));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultDtos;
	}

//	public SiCenterDto selectOneCenterAndSi(int center_id, String si_name) {
//		SiCenterDto resultDto = null;
//		ResultSet rs = DBConn.statementQuery(String.format(
//				"select center.center_id,si.si_name from center, si where center.si_id=si.si_id(+)"));
//		try {
//			while (rs.next()) {
//				resultDto=new SiCenterDto(
//						rs.getInt("center_id"), 
//						rs.getString("street_address"),
//						rs.getString("center_name"),
//						rs.getInt("si_id"),
//						new SiDto(rs.getInt("si_id"), rs.getString("si_name"),rs.getInt("do_id"))
//						);
//			}
//		}catch(Exception e)	{
//			e.printStackTrace();
//		}
//		return resultDto;
//	}
}
