package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.CategoryDto;
import com.human.util.DBConn;

public class CategoryDao {
	public static void insert(CategoryDto dto) {
		String sql = String.format("insert into category values(%d,'%s',%d", dto.getCategory_id(), dto.getCategory_name(),dto.getCenter_id());
		DBConn.statementUpdate(sql);
	}
	
	public ArrayList<CategoryDto> selectAll() {
		ArrayList<CategoryDto> resultDtos = new ArrayList<CategoryDto>(); 
		// resultDtos라는 새로운 ArrayList를 생성하여 검색된 고객 정보를 저장할 공간
		ResultSet rs = DBConn.statementQuery(String.format("select * from category"));// DB에 있는 모든 고객정보를 검색하기 위해 SQLinsert실행
		// DBConn.statementQuery는 DB에 쿼리를 보내고 반환하는 역할 --> 그 결과가 rs에 저장
		try {
			while (rs.next()) {
				resultDtos.add(new CategoryDto(rs.getInt("category_id"), rs.getString("category_name"), rs.getInt("center_id")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDtos;
	}
	
	
	public CategoryDto selectId(int category_id) {
		CategoryDto resultDtos = new CategoryDto();
		ResultSet rs = DBConn.statementQuery(String.format("select * from category where category_id=%d", category_id));
		if (rs != null) {
			try {
				rs.next();
				resultDtos = new CategoryDto(rs.getInt("category_id"), rs.getString("category_name"),rs.getInt("center_id"));
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}
	
	public static void update(int category_id, String category_name) {
		DBConn.statementUpdate(String.format("update category set category_name='%s' where category_id=%d", category_name, category_id));
	}

	// delete작업
	public void delete(int category_id) {
		DBConn.statementUpdate(String.format("delete category where category_id = %d", category_id));
	}
	
}
