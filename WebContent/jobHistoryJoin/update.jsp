<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.time.format.DateTimeFormatter" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action='/gymReal/jobHistoryJoin/update.jobHistoryJoin' method="get">
		<table border="1" width="90%" id="jobHistoryJoin">
			<tr>
				<th>입사정보 No.</th>
				<th>직급</th>
				<th>직원 ID</th>
				<th>이름</th>
				<th>전문분야</th>
				<th>입사일</th>
				<th>퇴사일</th>
			</tr>
			<tr>
			    <input type='hidden' name="job_history_id" value='${requestScope.dto.job_history_id }'>
				<td>${requestScope.dto.job_history_id }</td>
				<td>${requestScope.dto.jobsDto.job_title}</td>
				<td>${requestScope.dto.employeesDto.employee_id}</td>
				<td>${requestScope.dto.employeesDto.name}</td>
				<td>${requestScope.dto.categoryDto.category_name}</td>
				<td>${requestScope.dto.hire_date}</td>
				<td><input type='text' name="end_date" value='${requestScope.dto.end_date}'></td>
			</tr>
		</table>
		<a href="/gymReal/jobHistoryJoin/selectAll.jobHistoryJoin">목록가기</a> 
		<input type="submit" value='수정'>
	</form>
</body>
</html>