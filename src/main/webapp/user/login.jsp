<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>로그인</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/register.css">
</head>
<body>

<form method="post" action="/user/UserLoginServlet">
    <h2>로그인</h2>
    ID(이메일): <input type="text" name="id_user" required><br/>
    비밀번호: <input type="password" name="nm_paswd" required><br/>
    <button type="submit">로그인</button>
</form>
</body>
</html>
