<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="${path}/resources/css/up.css" rel="stylesheet" />
<script>
	let check_id = false;

	function checkId_Async() {
		const form = document.signupForm;

		const xhr = new XMLHttpRequest();

		xhr.open("GET", "checkId?id=" + form.id.value, true);

		xhr.onreadystatechange = function() {
			if (xhr.readyState == XMLHttpRequest.DONE) {
				if (xhr.status == 200) {
					if (xhr.responseText == "OK") {
						check_id = true;
						if (form.id.value == '') {
							alert('아이디를 입력 해 주세요');
							form.id.focus();
							return;
						}
						alert("사용가능한 회원번호 입니다.");
					}else
						alert("이미 등록 된 회원번호 입니다.");
				}
			}
		};

		xhr.send();

	}

	function checkId() {
		const form = document.signupForm;

		const xhr = new XMLHttpRequest();

		xhr.open("GET", "checkId?id=" + form.id.value, false);

		xhr.send();

		console.log(xhr.responseText);

	}
	function signup() {
		const form = document.signupForm;

		if (form.id.value == '') {
			alert('아이디를 입력 해 주세요');
			form.id.focus();
			return;
		}

		if (!check_id) {
			alert('아이디 중복 검사를 해 주세요');
			return;
		}

		if (form.passwd.value == '') {
			alert('비밀번호를 입력 해 주세요');
			form.passwd.focus();
			return;
		}
		if (form.passwd_check.value == '') {
			alert('비밀번호 확인을 입력 해 주세요');
			form.passwd.focus();
			return;
		}
		if (form.passwd.value !== form.passwd_check.value) {
			alert('비밀번호와 비밀번호 확인이 일치하지 않습니다.');
			form.passwd_check.focus();
			return;
		}
		if (form.name.value == '') {
			alert('성명을 입력 해 주세요');
			form.name.focus();
			return;
		}
		if (form.tel.value == '') {
			alert('전화번호를 입력 해 주세요');
			form.tel.focus();
			return;
		}
		if (form.job.value == '') {
			alert('직책을 입력 해 주세요');
			form.address.focus();
			return;
		}
		if (form.dep.value == '') {
			alert('회사부서를 입력 해 주세요');
			form.address.focus();
			return;
		}
		form.submit();
	}
	function changeId() {
		check_id = false;
	}
	function goBack() {
		//history.back();
		location.href = ".";
	}
</script>
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
			<form name="signupForm" method="post">

				<div>
					<h3 class="join_title">
						<label>아이디:</label>
					</h3>
					<label class="box int_id"> <input type="text" name="id"
						onchange="changeId()" class="int" maxlength="20"></label>
				</div>
				<div onclick="checkId_Async()">중복확인</div>

				<div>
					<h3 class="join_title">
						<label>비밀번호:</label>
					</h3>
					<label class="box int_pass"> <input type="password"
						name="passwd" class="int" maxlength="20"> <img
						src="/resources/images/m_icon_pass.png" id="pswd1_img1"
						class="pswdImg">
					</label>
				</div>
				<div>
					<h3 class="join_title">
						<label>비밀번호 확인:</label>
					</h3>
					<label class="box int_pass_check"> <input type="password"
						name="passwd_check" class="int" maxlength="20"><img
						src="/resources/images/m_icon_check_disable.png" id="pswd2_img1"
						class="pswdImg">
					</label>
				</div>
				<div>
					<h3 class="join_title">
						<label>성명:</label>
					</h3>
					<label class="box int_name"> <input type="text" name="name"
						class="int" maxlength="20">
					</label>
				</div>
				<div>
					<h3 class="join_title">
						<label>전화번호:</label>
					</h3>
					<label class="box int_mobile"> <input type="text"
						name="tel" class="int" maxlength="16" placeholder="전화번호 입력">
					</label>
				</div>
				<div>
					<h3 class="join_title">
						<label>직책:</label>
					</h3>
					<label class="box int_mobile"> <input type="text"
						name="job" class="int" maxlength="16">
					</label>
				</div>
				<div>
					<h3 class="join_title">
						<label>회사부서:</label>
					</h3>
					<label class="box int_mobile"> <input type="text"
						name="dep" class="int" maxlength="16">
					</label>
				</div>
			</form>

			<div class="btn_area">
				<button onclick="signup()" id="btnJoin">회원가입</button>
			</div>
		</div>
	</div>
</body>
</html>