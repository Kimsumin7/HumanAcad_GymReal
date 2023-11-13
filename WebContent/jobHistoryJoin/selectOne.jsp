<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="../css/test.css">
</head>
<body>
	<!-- Links (sit on top) -->
	<div class="w3-top">
		<div class="w3-top fixed-header">
			<div class="w3-row w3-large w3-light-grey">
				<div class="w3-col s3">
					<a href="/gymReal/employees/selectAll.employees"
						class="w3-button w3-block">인사관리</a>
				</div>
				<div class="w3-col s3">
					<a href="/gymReal/center/selectAll.center"
						class="w3-button w3-block">센터관리</a>
				</div>
				<div class="w3-col s3">
					<a href="/gymReal/jobHistoryJoin/selectAll.jobHistoryJoin" class="w3-button w3-block">직급 관리</a>
				</div>
				<div class="w3-col s3">
					<a href="#contact" class="w3-button w3-block">기타</a>
				</div>
			</div>
			<div class="w3-col s3">
				<a href="/gymReal/main.jsp" class="w3-button w3-block">HOME</a>
			</div>
			
			<div class="w3-col s3">
				<a href="/gymReal/jobHistoryJoin/selectMSalary.jobHistoryJoin"
					class="w3-button w3-block">월급별 조회</a>
			</div>
			<div class="w3-col s3">
				<a href="/gymReal/jobHistoryJoin/selectEnd.jobHistoryJoin"
					class="w3-button w3-block">퇴사일 조회</a>
			</div>

		</div>
	</div>
	<br>

	<div class="w3-content"
		style="max-width: 1100px; margin-top: 80px; margin-bottom: 80px">
		<h3>
			<b>퇴사일 수정</b>
		</h3>
		<!-- main-->
		<div style="text-align: center;">
			<table width="100%" id="jobHistoryJoin"
				style="border-collapse: collapse; border: 1px solid #ccc;">
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
					<input type='hidden' name="job_history_id"
						value='${requestScope.dto.job_history_id }'>
					<td>${requestScope.dto.job_history_id}</td>

					<td>${requestScope.dto.jobsDto.job_title}</td>
					<td>${requestScope.dto.employeesDto.employee_id}</td>
					<td>${requestScope.dto.employeesDto.name}</td>

					<td>${requestScope.dto.categoryDto.category_name}</td>
					<td>${requestScope.dto.hire_date}</td>
					<td>${requestScope.dto.end_date}</td>
				</tr>
			</table>
		</div>

		<div class="search-container">
			<a
				href="/gymReal/jobHistoryJoin/update.jobHistoryJoin?employee_id=${requestScope.dto.employee_id}">수정하기</a>
		</div>
		<div class="search-container">
			<a
				href="/gymReal/employees/delete.employees?employee_id=${requestScope.dto.employee_id}">삭제하기</a>
		</div>
	</div>

	<!-- Footer -->
	<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
		<a href="#" class="w3-button w3-black w3-margin"><i
			class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
		<div class="w3-xlarge w3-section">
			<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
				class="fa fa-instagram w3-hover-opacity"></i> <i
				class="fa fa-snapchat w3-hover-opacity"></i> <i
				class="fa fa-pinterest-p w3-hover-opacity"></i> <i
				class="fa fa-twitter w3-hover-opacity"></i> <i
				class="fa fa-linkedin w3-hover-opacity"></i>
		</div>
		<p>2023 WelcomeToGym. All rights reserved.</p>
	</footer>

	<script>
		// Slideshow
		var slideIndex = 1;
		showDivs(slideIndex);

		function plusDivs(n) {
			showDivs(slideIndex += n);
		}

		function currentDiv(n) {
			showDivs(slideIndex = n);
		}

	</script>
</body>
</html>