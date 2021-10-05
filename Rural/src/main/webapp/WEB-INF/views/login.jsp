<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link href="${path}/resources/css/up.css" rel="stylesheet" />
</head>
<body>

	<form action>
		<a href="..">
			<div id="header">
				<img src="/resources/images/hort.png">
			</div>
		</a>
	</form>
	<div id="wrapper">
		<div id="content">
			<form method="post">

				<div>
					<h3 class="join_title">
						<label>아이디</label>
					</h3> 
						<label class="box int_id"> <input type="text" name="id"
						 class="int" maxlength="20" placeholder="Username"></label>
				</div>
				
				
				<div>
					<h3 class="join_title">
						<label>비밀번호</label> 
					</h3>	
					<label class="box int_pass"> <input type="password"
						name="passwd" class="int" placeholder="Password" maxlength="20"> <img src="/resources/images/m_icon_check_disable.png" id="pswd2_img1"
						class="pswdImg">
					</label>	
				</div>
				<div class="btn_area">
					<button  id="btnJoin" type="submit" value="sign in">로그인</button>
				</div>
				<div class="btn_area">
					<button type="button"  id="btnJoin2" onclick="location.href='signup' ">회원가입</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>