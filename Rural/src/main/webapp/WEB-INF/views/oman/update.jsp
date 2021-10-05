<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>양파 재배관리 변경</title>
<script src="/js/jquery-3.6.0.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"
	integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT"
	crossorigin="anonymous"></script>
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">

<link rel="stylesheet" href="${path}/resources/css/cbasiclist.css" />
</head>
<body>
<div class="container">
		<header>
			<form action>
				<a href="..">
					<div class="header-logo">
						<img src="/resources/images/logo-header.png" alt="header-logo">
					</div>
				</a>
			</form>
			<div class="navi">
				<div class="menu">
					<ul>
						<li><a href="#">배추</a>
							<ul>
								<li><a href="../cbasic/list">기초정보</a></li>
								<li><a href="../ccrop/list">작물생육</a></li>
								<li><a href="../cdam/list">데미지</a></li>
								<li><a href="../cman/list">재배관리</a></li>
							</ul></li>
						<li><a href="#">양파</a>
							<ul>
								<li><a href="../obasic/list">기초정보</a></li>
								<li><a href="../ocrop/list">작물생육</a></li>
								<li><a href="../odam/list">데미지</a></li>
								<li><a href="../oman/list">재배관리</a></li>
							</ul></li>
						<li><a href="#">고추</a>
							<ul>
								<li><a href="../pbasic/list">기초정보</a></li>
								<li><a href="../pcrop/list">작물생육</a></li>
								<li><a href="../pdam/list">데미지</a></li>
								<li><a href="../pman/list">재배관리</a></li>
							</ul></li>
						<li><a href="#">무</a>
							<ul>
								<li><a href="../rbasic/list">기초정보</a></li>
								<li><a href="../rcrop/list">작물생육</a></li>
								<li><a href="../rdam/list">데미지</a></li>
								<li><a href="../rman/list">재배관리</a></li>
							</ul></li>
							<li><a href="../noti/list">공지사항</a></li>
						<li><a href="../us/list">사용자가이드</a></li>
					</ul>
				</div>
			</div>

			<div class="menu1">
				<c:if test="${sessionScope.member == null }">
					<a class="active" href="login">로그인</a>
					<a href="signup">회원가입</a>
				</c:if>
				<c:if test="${sessionScope.member != null }">
							${sessionScope.member.name}님 환영합니다. <a href="/logout"> 로그아웃</a>
				</c:if>
				
				</div>
		</header>
		</div>
	<div class="container" role="main">
		<form method="post"  enctype="multipart/form-data">
			<div class="mb-3">
				<label>품종:</label> <input name="cul" type="text" value="${item.cul}" readonly class="form-control">
			</div>
			<div>
				<label>총시비량:</label> <input name="total" type="text" value="${item.total}" class="form-control">
			</div>
			<div>
				<label>기비량:</label> <input name="basal" type="text" value="${item.basal}" class="form-control">
			</div>
			<div>
				<label>기비시기:</label> <input name="fer" type="text" value="${item.fer}" class="form-control">
			</div>
			<div>
				<label>추비횟수:</label> <input name="dress" type="text" value="${item.dress}" class="form-control">
			</div>
			<div>
				<label>관개유무:</label> <input name="irri" type="text" value="${item.irri}" class="form-control">
			</div>
			<div>
				<label>사진:</label> <input name="uploadFile" type="file" value="${item.image}" class="form-control">
			</div>
			<div>
				<label>회사부서:</label> <input name="dep" type="text" value="${item.dep}" class="form-control" readonly>
			</div>
			<div>
				<button type="submit" value="변경" class="btn btn-primary btn-sm mb-2">변경</button>
				<a href="..">처음으로</a>
			</div>
		</form>
	</div>
	<div class="footer-inner">
		<footer>
			<div class="copyright">
				<div>
					<a href="#none">법적고지</a> <a href="#none">개인정보취급방침</a> <a
						href="#none">개인정보처리방침</a>
				</div>
				<div>
					상호명 : 농촌진흥청 대표자 : 장민수 개인정보관리책임자 : 장민수 대표<br> 사업장주소 : 대전광역시 동구
					우암로
				</div>
			</div>
		</footer>
	</div>
</body>
</html>