<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WelcomeToGym</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style>
html,body,h1,h2,h3,h4 {font-family:"Lato", sans-serif}
.mySlides {display:none}
.w3-tag, .fa {cursor:pointer}
.w3-tag {height:15px;width:15px;padding:0;margin-top:6px}
.logout-box{ border:0px;text-align:left;background-color:white;}
   a {
            color: black;
            text-decoration: none;
        }
    li{
        float: left;
        list-style: none;
        width: 290px;
    }
    li a{
        display: block;
        padding: 15px 0px;
        width: 290px;
        text-align: center;
        text-decoration: none;
        background-color: #333;
        color: white;
    }
    li>div>div{
        display: none;
    }
    ul{
        display: inline-block;
    }
</style>
</head>
<body>
<%
	if(session.getAttribute("user_id")==null){ //session에 user_id가 없는 경우
		response.sendRedirect("login.servlet?isLogin=false"); //로그인 실패~
	}
%>
<!-- Links (sit on top) -->

	<div>
        <div style="position:relative; width:1200px; z-index:1; height:80px;text-align: center;">
            <ul>
                <li>
                    <div>
                        <a  href="/gymReal/employees/selectAll.employees"  >인사 관리</a>
                        <div>                 
                            <a href="/gymReal/empCenJob/selectAll.empCenJob" data-bg="rgb(216,40,27)">전체 조회</a>
                            <a href="/gymReal/empCenJob/selectJobs.empCenJob" data-bg="rgb(216,40,27)">직책별 조회</a>
                            <a href="/gymReal/categoryEmployees/selectAll.categoryEmployees" data-bg="rgb(216,40,27)">분야별 조회</a>
                            <a href="/gymReal/empCenJob/selectSalary.empCenJob" data-bg="rgb(216,40,27)">급여 조회</a>
                            <a href="/gymReal/employees/insert.employees" data-bg="rgb(216,40,27)">인사 등록</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <a href="/gymReal/center/selectAll.center">센터관리</a>
                        <div>
                            <a href="/gymReal/doSiCenter/selectAll.doSiCenter" data-bg="rgb(216,40,27)">전체 조회</a>
                            <a href="/gymReal/center/insert.center" data-bg="rgb(216,40,27)">센터 등록</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <a href="/gymReal/jobHistoryJoin/selectAll.jobHistoryJoin">직급 관리</a>
                        <div>
                            <a href="/gymReal/jobHistoryJoin/selectMSalary.jobHistoryJoin" data-bg="rgb(216,40,27)">월급별 조회</a>
                        	<a href="/gymReal/jobHistoryJoin/selectEnd.jobHistoryJoin" data-bg="rgb(216,40,27)">퇴사일 조회</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <a href="/gymReal/empCenJob/bestEmp.empCenJob">기타</a>
                        <div>
                            <a href="#" data-bg="rgb(216,40,27)">분야별 입사조회</a>
                            <a href="#" data-bg="rgb(216,40,27)">직원별 입사조회</a>
                            <a href="#" data-bg="rgb(216,40,27)">직원 퇴사 관리</a>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>

<!-- Content -->
<div class="w3-content" style="max-width:1100px;margin-top:80px;margin-bottom:80px">
  <div class="w3-panel">
    <h1><b>WelcomeToGym</b></h1>
    <form action="logout.servlet" method=get>
		<input type="submit" class="logout-box" value="Logout" style="cursor:pointer;">
	</form>
  </div>

  <!-- Slideshow -->
  <div class="w3-container">
    <div class="w3-display-container mySlides">
      <img src="welmain2.jpg" style="width:100%">
      <div class="w3-display-topleft w3-container w3-padding-32">
        <span class="w3-white w3-padding-large w3-animate-bottom">2층</span>
      </div>
    </div>
    <div class="w3-display-container mySlides">
      <img src="welmain5.jpg" style="width:100%">
      <div class="w3-display-topleft w3-container w3-padding-32">
        <span class="w3-white w3-padding-large w3-animate-bottom">2층</span>
      </div>
    </div>
    <div class="w3-display-container mySlides">
      <img src="welmain3.jpg" style="width:100%">
      <div class="w3-display-topleft w3-container w3-padding-32">
        <span class="w3-white w3-padding-large w3-animate-bottom">3층</span>
      </div>
    </div>
    <div class="w3-display-container mySlides">
        <img src="welmain4.jpg" style="width:100%">
        <div class="w3-display-topleft w3-container w3-padding-32">
          <span class="w3-white w3-padding-large w3-animate-bottom">2층</span>
        </div>
      </div>

    <!-- Slideshow next/previous buttons -->
    <div class="w3-container w3-dark-grey w3-padding w3-xlarge">
      <div class="w3-left" onclick="plusDivs(-1)"><i class="fa fa-arrow-circle-left w3-hover-text-teal"></i></div>
      <div class="w3-right" onclick="plusDivs(1)"><i class="fa fa-arrow-circle-right w3-hover-text-teal"></i></div>
    
      <div class="w3-center">
        <span class="w3-tag demodots w3-border w3-transparent w3-hover-white" onclick="currentDiv(1)"></span>
        <span class="w3-tag demodots w3-border w3-transparent w3-hover-white" onclick="currentDiv(2)"></span>
        <span class="w3-tag demodots w3-border w3-transparent w3-hover-white" onclick="currentDiv(3)"></span>
        <span class="w3-tag demodots w3-border w3-transparent w3-hover-white" onclick="currentDiv(4)"></span>
      </div>
    </div>
  </div>
  
  <!-- Grid -->
  <div class="w3-row w3-container">
    <div class="w3-center w3-padding-64">
      <span class="w3-xlarge w3-bottombar w3-border-dark-grey w3-padding-16">What We Offer</span>
    </div>
    <div class="w3-col l3 m6 w3-light-grey w3-container w3-padding-16">
      <h3>Health</h3>
      <p>우리의 전문 트레이너와 현대식 헬스 시설과 함께, 건강과 피트니스의 새로운 경지를 경험하세요. 당신의 최고 버전을 찾아보세요.</p>
    </div>

    <div class="w3-col l3 m6 w3-grey w3-container w3-padding-16">
      <h3>Pilates</h3>
      <p>체형 개선과 근력 향상을 위한 필라테스로 더 강하고 건강한 삶을 시작하세요. 몸과 마음을 한꺼번에 단련하는 필라테스 수업으로 변화를 경험해보세요.</p>
    </div>

    <div class="w3-col l3 m6 w3-dark-grey w3-container w3-padding-16">
      <h3>Yoga</h3>
      <p>요가는 몸과 마음을 조화롭게 가꾸는 자연 요법입니다. 스트레스 해소, 유연성 향상, 내면 평화를 찾으며 삶의 활력을 불어넣는 요가 수업으로 여러분의 내적 자아를 발견해보세요.</p>
    </div>

    <div class="w3-col l3 m6 w3-black w3-container w3-padding-16">
      <h3>Premium</h3>
      <p>최고의 결과를 이루어내려면 최고의 개별 지도와 끊임없는 동기부여가 필요합니다. PT 1:1 트레이닝을 통해 전문 트레이너와 함께 목표를 달성하세요. 개개인에 맞춤형 피트니스 계획으로 건강과 웰빙을 찾아보세요.</p>
    </div>
  </div>
<br><br>
<!-- Footer -->

<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  <div class="w3-xlarge w3-section">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
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

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demodots");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length} ;
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" w3-white", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-white";
}
$(function(){
    $("li").hover(
        function(){
            $(this).find("div>div").stop().slideDown();
        },
        function(){
            $(this).find("div>div").stop().slideUp();
        }
    );
    $("li a").hover(
        function(){
            var overColor=$(this).attr("data-bg");
            $(this).stop().css("background-color",overColor);
        },
        function(){
            $(this).stop().css("background-color"," #333");
        }
    )
})
</script>
</body>
</html>