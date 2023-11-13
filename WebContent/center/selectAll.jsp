<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>센터</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="../css/test.css">
</head>
<body>
<!-- Links (sit on top) -->
	<div class="w3-top">
		<div class="w3-top fixed-header">
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
			<div class="w3-col s3" >
				<a href="/gymReal/main.jsp" class="w3-button w3-block">HOME</a>
			</div>
			<div class="w3-col s3">
				<a href="/gymReal/doSiCenter/selectAll.doSiCenter"
					class="w3-button w3-block">전체 조회</a>
			</div>
			<div class="w3-col s3">
				<a href="/gymReal/center/insert.center"
					class="w3-button w3-block">센터 등록</a>
			</div>
		</div>
	</div>
	<br>
	<div class="w3-content"
		style="max-width: 1000px; margin-top: 80px; margin-bottom: 20px">
		<h3><b>센터 관리</b></h3>
		<div class="search-container">
			<input type="text" class="search-input" id="searchInput"
				placeholder="검색할 지점을 입력하세요">
			<button class="search-button" onclick="searchTable()">검색</button>
		</div>
		<div class="search-container">
			<button class="event-button"
				onclick="sortTable('center', 1, 'asc')">오름차순</button>
			<button class="event-button"
				onclick="sortTable('center', 1, 'desc')">내림차순</button>
		</div>
	</div>

<!-- main-->
	<div style="text-align: center; max-width: 1000px; margin: 0 auto;">
   <table border="1" width="90%" id="center">
      <tr>
         <th>지점 No.</th>
         <th>지점명</th>
         <th>주소</th>
         <th>시 No.</th>
      </tr>
      <c:forEach items="${dtos}" var="centerDto">
         <tr>
            <td><a href='/gymReal/center/selectOne.center?center_id=${centerDto.center_id}'>
                  ${centerDto.center_id}</a></td>
             <td>${centerDto.center_name}</td>
            <td>${centerDto.street_address}</td>
            <td>${centerDto.si_id}</td>      
         </tr>
      </c:forEach>
   </table>
   </div>
	<br>
	<!-- Footer -->
	<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
		<a href="#" class="w3-button w3-black w3-margin"> <i
			class="fa fa-arrow-up w3-margin-right"></i>To the top
		</a>
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
  
  function searchTable() {
	    var input, filter, table, tr, td, i, txtValue;
	    input = document.getElementById("searchInput");
	    filter = input.value.toUpperCase();
	    table = document.getElementById("center");
	    tr = table.getElementsByTagName("tr");

	    for (i = 0; i < tr.length; i++) {
	        td = tr[i].getElementsByTagName("td")[1]; // 여기서 [3]은 '이름' 열을 가리킵니다.
	        if (td) {
	            txtValue = td.textContent || td.innerText;
	            if (txtValue.toUpperCase().indexOf(filter) > -1) {
	                tr[i].style.display = "";
	            } else {
	                tr[i].style.display = "none";
	            }
	        }
	    }
	}
  
  function sortTable(tableId, column, order) {
	     var table, rows, switching, i, x, y, shouldSwitch;
	     table = document.getElementById(tableId);
	     switching = true;

	     while (switching) {
	       switching = false;
	       rows = table.getElementsByTagName("tr");

	       for (i = 1; i < (rows.length - 1); i++) {
	         shouldSwitch = false;

	         x = rows[i].getElementsByTagName("td")[column];
	         y = rows[i + 1].getElementsByTagName("td")[column];

	         if (order === 'asc') {
	           if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
	             shouldSwitch = true;
	             break;
	           }
	         } else if (order === 'desc') {
	           if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
	             shouldSwitch = true;
	             break;
	           }
	         }
	       }

	       if (shouldSwitch) {
	         rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
	         switching = true;
	       }
	     }
	   }
  </script>
</body>
</html>