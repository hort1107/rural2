<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>배추 작물생육 리스트</title>
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
<script>
$(function(){
	   $("thead .order").click(function(){
		   const queryString = new URLSearchParams(location.search);
	                         
	         queryString.set("order", $(this).data("order")); //data-order
	         
	         let orderMode = 0;
	         
	         if(queryString.has("orderMode"))
	        	 orderMode = queryString.get("orderMode");
		     	        	 
		         orderMode = (Number(orderMode) + 1) % 3; 
		         
		         queryString.set("orderMode", orderMode); //0 default, 1 asc, 2 desc
		       
		         location.href = location.origin + location.pathname + "?" + queryString.toString();
	   });
	   
$("thead .form-check-input").click(function(){
if($(this).is(":checked")){
$("tbody .form-check-input").prop("checked", true);
console.log("checked");
}else{
$("tbody .form-check-input").prop("checked", false);
console.log("unchecked");
}
}); 

$("#remove").click(function(){
$("form[action='remove']").submit();
});
});
	$(function() {
		$(".toggle").click(function() {
			let id = $(this).parent().attr("data-item");

			$("tr[data-img='" + id + "']").toggleClass("hide");
		});
	});
</script>
<style>
.hide {
	display: none;
}
</style>
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
		<div class="mb-2">
			<form>
				<div class="row">
					<div class="col-2"></div>
					<div class="col-2">
				<select name="search" class="form-control form-control-sm">
					<option value="0">전체 검색</option>
					<option value="1" ${pager.search == 1 ? 'selected' : ''}>품종</option>
					<option value="2" ${pager.search == 2 ? 'selected' : ''}>조사시기</option>
					<option value="3" ${pager.search == 3 ? 'selected' : ''}>표본구역</option>
					<option value="4" ${pager.search == 4 ? 'selected' : ''}>정상포기수</option>
					<option value="5" ${pager.search == 5 ? 'selected' : ''}>미결구포기수</option>
					<option value="6" ${pager.search == 6 ? 'selected' : ''}>생중량</option>
					<option value="7" ${pager.search == 7 ? 'selected' : ''}>지상부건물중</option>
					<option value="8" ${pager.search == 8 ? 'selected' : ''}>구중</option>	
					<option value="9" ${pager.search == 9 ? 'selected' : ''}>초장</option>	
					<option value="10" ${pager.search == 10 ? 'selected' : ''}>엽수</option>		
					<option value="11" ${pager.search == 11 ? 'selected' : ''}>회사부서</option>				
				</select>
				</div>
				<div class="col-5">
				<input type="text" name="keyword" class="form-control  form-control-sm" value = "${pager.keyword}">
				</div>
				<div class="col-2">
					<input type="submit" value="검색" class="btn btn-secondary btn-sm">
				</div>
				</div>
				</form>
		</div>
	<div class="container">
	<table class="table table-striped">
		<thead class="table bg-secondary text-white">
			<tr>
				<th><input type="checkbox" class="form-check-input"></th>
				<th class="order" data-order="cul">품종<c:if test="${pager.order == 'cul'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="dat">조사시기<c:if test="${pager.order == 'dat'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="area">표본구역<c:if test="${pager.order == 'area'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th> 
				<th class="order" data-order="nor">정상포기수<c:if test="${pager.order == 'nor'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="non">미결구포기수<c:if test="${pager.order == 'non'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="fre">생중량<c:if test="${pager.order == 'fre'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="adry">지상부건물중<c:if test="${pager.order == 'adry'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="hea">구중<c:if test="${pager.order == 'hea'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="pla">초장<c:if test="${pager.order == 'pla'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="lea">엽수<c:if test="${pager.order == 'lea'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="dep">회사부서<c:if test="${pager.order == 'dep'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th class="order" data-order="image">사진<c:if test="${pager.order == 'image'}"><i class="bi ${pager.orderMode == 1 ? 'bi-caret-up' : pager.orderMode == 2 ? 'bi-caret-down' : ''}"></i></c:if></th>
				<th>관리</th>
			</tr> 
		</thead>
		<form method="post" action="remove">
		<tbody>
		<c:if test="${list.size() < 1}">
						<tr>
							<td colspan="5">등록 된 작물이 없습니다</td>
						</tr>
					</c:if>
					<c:forEach var="item" items="${list}">
					<c:if test="${sessionScope.member.dep == item.dep || sessionScope.member.id == 'admin'}">
						<tr>
							<tr data-item="${item.cul}">
							<th><input name="items" value="${item.seq5}" type="checkbox" class="form-check-input"> </th>
							<td>${item.cul}</td>
							<td>${item.dat}</td>
							<td>${item.area}</td>
							<td>${item.nor}</td>
							<td>${item.non}</td>
							<td>${item.fre}</td>
							<td>${item.adry}</td>
							<td>${item.hea}</td>
							<td>${item.pla}</td>
							<td>${item.lea}</td>
							<td>${item.dep}</td>
							<td class="toggle">${item.cul}</td>
							<td><a href="delete?seq5=${item.seq5}"
								class="btn btn-outline-danger btn-sm">삭제</a> <a
								href="update?seq5=${item.seq5}"
								class="btn btn-outline-info btn-sm">변경</a></td>
						</tr>
						<tr data-img="${item.cul}" class="hide">
						<td><img src="../upload/files/${item.image}"></td>
						</c:if>
					</c:forEach>
				</tbody>
				</form>
				<tfoot>
					<tr>
						 <td colspan="16">
                     <div class="pagination justify-content-center">
                        <div class="page-item"><a href="?page=1&${pager.query}" class="page-link">처음</a></div>
                        <div class="page-item"><a href="?page=${pager.prev}&${pager.query}" class="page-link">이전</a></div>
                           <c:forEach var="page" items="${pager.list}">
                              <div class="page-item ${pager.page == page ? 'active' : ''}"><a href="?page=${page}&${pager.query}" class="page-link">${page}</a></div>
                           </c:forEach>
                        <div class="page-item"><a href="?page=${pager.next}&${pager.query}" class="page-link">다음</a></div>
                        <div class="page-item"><a href="?page=${pager.last}&${pager.query}" class="page-link">마지막</a></div>

								</div>
						</td>
					</tr>
					
				</tfoot>
			</table>
		</div>
		<div class="pagination justify-content-center">
			<div>
				<a href="add" class="btn btn-secondary btn-sm mb-2">등록</a>
				<a href=".." class="btn btn-secondary btn-sm mb-2">처음으로</a>
				<button  id="remove" class="btn btn-sm btn-outline-danger"><i class="bi bi-cart"></i>선택삭제</button>
	</div>
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










