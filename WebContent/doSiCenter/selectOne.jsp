<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<div class="w3-row w3-large w3-light-grey">
			<div class="w3-col s3">
				<a href="/gymReal/employees/selectAll.employees" class="w3-button w3-block">인사 관리</a>
			</div>
			<div class="w3-col s3">
				<a href="/gymReal/center/selectAll.center" class="w3-button w3-block">센터 관리</a>
			</div>
			<div class="w3-col s3">
				<a href="/gymReal/jobHistoryJoin/selectAll.jobHistoryJoin" class="w3-button w3-block">직책 관리</a>
			</div>
			<div class="w3-col s3">
				<a href="#contact" class="w3-button w3-block">기타</a>
			</div>
		</div>
		<div class="w3-col s3">
			<a href="/gymReal/main.jsp" class="w3-button w3-block">HOME</a>
		</div>
		<div class="w3-col s3">
			<a href="/gymReal/doSiCenter/selectAll.doSiCenter" class="w3-button w3-block">전체 조회</a>
		</div>
		<div class="w3-col s3">
			<a href="/gymReal/center/insert.center" class="w3-button w3-block">센터 등록</a>
		</div>
	</div>
	<br>
	<div class="w3-content" style="max-width: 1100px; margin-top: 80px; margin-bottom: 20px">
	<h3><b>지점 정보</b></h3>
	<!-- main-->
	<div style="text-align: center;">
		<table width="100%" id="doSiCenter" style="border-collapse: collapse; border: 1px solid #ccc;">
			<tr>
				<th>도 No.</th>
				<th>도</th>
				<th>시 No.</th>
				<th>시</th>
				<th>센터 No.</th>
				<th>주소</th>
				<th>센터명</th>
			</tr>
			<tr>
				<td>${dto.doDto.do_id}</td>
				<td>${dto.doDto.do_name}</td>
				<td>${dto.siDto.si_id}</td>
				<td>${dto.siDto.si_name}</td>
				<td>${dto.center_id}</td>
				<td>${dto.street_address}</td>
				<td>${dto.center_name}</td>
			</tr>
		</table>
		</div>
	<div class="search-container">
		<a href="/gymReal/center/delete.center?center_id=${requestScope.dto.center_id}">삭제하기</a>
	</div>
	</div>
	<br>
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