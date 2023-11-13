package com.human.service;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.dao.DoDao;
import com.human.dao.DoSiDao;
import com.human.dao.SiDao;
import com.human.dto.DoSiDto;

public class DoSiService {
	public static SiDao siDao = new SiDao();
	public static DoDao doDao = new DoDao();
	public static DoSiDao doSiDao = new DoSiDao();
	
	public static void selectAll(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<DoSiDto> dtos = new ArrayList<DoSiDto>();
		dtos =doSiDao.selecAllSiAndDo();
		System.out.println(dtos);
		request.setAttribute("dtos", dtos);
	}
}
