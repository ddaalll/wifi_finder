<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>와이파이 정보 구하기</title>
	<link href="/res/css/main.css" rel="stylesheet"/>
</head>
<body>
	<h1>와이파이 정보 구하기</h1>
	<%
		String memberType = request.getParameter("memberType");
		String userId = request.getParameter("userId");
	
		//MemberService memberService = new MemberService();
        //Member member = memberService.detail(memberType, userId);
	%>
	
	<jsp:include page="inc_menu.jsp"/>
</body>
</html>