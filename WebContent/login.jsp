<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="jquery-3.4.1.js"></script>
<script>
	if(<%=request.getParameter("isMain")%>==false){
		alert('USER ID 혹은 PASSWORD가 잘못 입력되었습니다.');
	}else if(<%=request.getParameter("isLogin")%>==false){
		alert('로그인해야 이용할 수 있는 페이지입니다. 로그인페이지로 이동합니다.');
	}
</script>
<style>
	*{
		text-align: center;
	}
	body{
		 display: flex;
    	flex-direction: column;
    	align-items: center;
    	justify-content: center;
    	height: 100vh;
    	margin: 0;
    	padding: 0;
	}
	input{
		width: 400px;
		height: 50px;
		text-align: left;
	}
	button{
		width: 150px;
		height: 40px;
		background-color: #52ACC7;
		color: white;
		border: none;
	}
    .event-box{
        text-align: center;
        width: 300px;
		height: 40px;
        background-color: light-grey;
		border: none;
        border-radius: 15px;
    }
    .event-div{
    	width:600px;
    	height:300px;
    	border: 1px solid #ccc;
    	text-align: center;
    	border-radius: 20px;
    	display: flex; /* Flex 컨테이너로 설정합니다. */
    	flex-direction: column; /* 내용을 세로(열)로 배치합니다. */
    	justify-content: center; /* 수직 중앙 정렬 */
    	align-items: center;
    }
	.input-with-icon {
	    padding-left: 40px; /* 아이콘 이미지의 너비 + 원하는 간격 크기로 설정 */
	    background: url('person.png') no-repeat 5px center; /* 이미지 경로와 위치 설정 */
	    background-size: 30px 30px; /* 아이콘 이미지의 크기 설정 */
	}
	.input-with-icon2 {
	    padding-left: 40px; /* 아이콘 이미지의 너비 + 원하는 간격 크기로 설정 */
	    background: url('password.png') no-repeat 5px center; /* 이미지 경로와 위치 설정 */
	    background-size: 30px 30px; /* 아이콘 이미지의 크기 설정 */
	}
</style>
</head>
<body>
	<div>
    	<img src="wel.jpg" width="500px">
        <form action=loginDB.servlet method=post><br>
	        <div class="event-div">
	            <input type="text" id="user_id" name="user_id" placeholder="관리자ID" autocomplete="off" required class="input-with-icon">
	            <input type="password" id="user_pw" name="user_pw" placeholder="관리자PW" autocomplete="off" required class="input-with-icon2"><br><br>
	            <input type="submit" id="btn" value="로그인" class="event-box">
	       	</div><br><br>
	       	<img src="광고.JPG" width="600px">
        </form><br>
        <footer>
        2023 WelcomeToGym. All rights reserved.
    	</footer>
	</div>
</body>
</html>