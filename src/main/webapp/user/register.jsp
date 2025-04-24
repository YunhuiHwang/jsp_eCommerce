<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head><title>회원가입</title></head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/register.css">

<body>
<form method="post" action="/user/UserRegisterServlet">
    ID(이메일): <input type="text" name="id_user" required><br/>
    비밀번호: <input type="password" name="nm_paswd" required><br/>
    이름: <input type="text" name="nm_user" required><br/>
    휴대전화: <input type="text" name="no_mobile" required><br/>
    <button type="submit">가입</button>
</form>
</body>
</html>
