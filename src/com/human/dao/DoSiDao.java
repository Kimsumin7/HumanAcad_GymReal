package com.human.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.human.dto.DoSiDto;
import com.human.dto.DoDto;
import com.human.util.DBConn;

public class DoSiDao {
	public ArrayList<DoSiDto> selecAllSiAndDo() {
		ArrayList<DoSiDto> resultDtos = new ArrayList<DoSiDto>();
		ResultSet rs = DBConn.statementQuery(
				String.format("select si.*,do.do_name from si, do where si.do_id=do.do_id(+)"));
		try {
			while (rs.next()) {
				resultDtos.add(new DoSiDto(rs.getInt("si_id"), rs.getString("si_name"),rs.getInt("do_id"),
						new DoDto(rs.getInt("do_id"), rs.getString("do_name"))));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultDtos;
	}

//	public DoSiDto selectOneSiAndDo(int si_id, String do_name) {
//		DoSiDto resultDto = null;
//		ResultSet rs = DBConn.statementQuery(String.format("select si.si_id,do.do_name from si, do where si.si_id=do.do_id(+)"));
//		try {
//			while (rs.next()) {
//				resultDto=new DoSiDto(
//						rs.getInt("si_id"),
//						rs.getString("si_name"),
//						new DoDto(rs.getInt("do_id"),rs.getString("do_name"))
//						);
//			}
//		}catch(Exception e)	{
//			e.printStackTrace();
//		}
//		return resultDto;
//	}
}
