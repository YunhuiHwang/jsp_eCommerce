<%@ page import="kr.co.jsp.jsp_ecommerce.util.DBUtil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>YuniBook</title>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/nav.css">

</head>
<body>

<div class="navbar">
    <div class="nav-left">
        <a href="#">국내도서</a>
        <a href="#">외국도서</a>
    </div>
    <div class="nav-center">
        <form action="search.jsp" method="get">
            <input type="text" name="q" placeholder="검색어 입력">
            <button type="submit">🔍</button>
        </form>
    </div>
    <div class="nav-right">
        <a href="user/register.jsp">회원가입</a>
        <a href="user/login.jsp">로그인</a>
        <a href="#">마이페이지</a>
        <a href="#">주문배송</a>
    </div>
</div>

</body>
</html>