<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>센터</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="../css/test2.css">
</head>
<body>
	<!-- Links (sit on top) -->
	<div class="w3-top">
		<div class="w3-row w3-large w3-light-grey">
			<div class="w3-col s3">
				<a href="/gymReal/employees/selectAll.employees"
					class="w3-button w3-block">인사 관리</a>
			</div>
			<div class="w3-col s3">
				<a href="/gymReal/center/selectAll.center"
					class="w3-button w3-block">센터 관리</a>
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
			<a href="/gymReal/doSiCenter/selectAll.doSiCenter"
				class="w3-button w3-block">전체 조회</a>
		</div>
		
	</div>
	<br>


	<div class="w3-content"
		style="max-width: 1100px; margin-top: 80px; margin-bottom: 80px"></div>
	<!-- main-->
	<div class="w3-container" style="text-align: center;">
		<img src="../wel.jpg" alt="센터 이미지"
			style="width: 100%; max-width: 500px;"> <br>
			<h3><b>센터 등록</b></h3>
		<form action="/gymReal/center/insertDB.center" method="get">
			<table style="margin: 0 auto; width: 300px;" border="0">
				<tr>
					<td>센터 ID :</td>
					<td><input type=text name=center_id></td>
				</tr>
				<tr>
					<td>지점명 :</td>
					<td><input type=text name=center_name></td>
				</tr>
				<tr>
					<td>상세주소 :</td>
					<td><input type=text name=street_address></td>
				</tr>
				<tr>
					<td>시 ID :</td>
					<td><input type=text name=si_id></td>
				</tr>
			</table>
			<br>
			<input type="submit" value=전송 class="search-button">
		</form>
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
