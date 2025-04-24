package kr.co.jsp.jsp_ecommerce.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String id = request.getParameter("id_user");
        String pwd = request.getParameter("nm_paswd");

        if ("test@example.com".equals(id) && "1234".equals(pwd)) {
            HttpSession session = request.getSession();
            session.setAttribute("loginId", id);
            response.sendRedirect("main.jsp");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<script>alert('로그인 실패'); history.back();</script>");
        }
    }
}
