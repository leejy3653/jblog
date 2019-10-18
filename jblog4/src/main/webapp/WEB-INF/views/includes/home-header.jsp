<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<ul class="menu">
	<c:choose>
		<c:when test="${empty authUser }">
			<li><a
				href="${pageContext.servletContext.contextPath}/user/login">로그인</a></li>
			<li><a
				href="${pageContext.servletContext.contextPath}/user/join">회원가입</a></li>
		</c:when>
		<c:otherwise>
			<li><a
				href="${pageContext.servletContext.contextPath}/user/logout">로그아웃</a></li>
			<li><a
				href="${pageContext.servletContext.contextPath}/blog/${authUser.id}">내블로그</a></li>
			<li>${authUser.id }님안녕하세요</li>
		</c:otherwise>
	</c:choose>
</ul>