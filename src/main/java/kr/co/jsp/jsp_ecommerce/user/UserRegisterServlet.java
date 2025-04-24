package kr.co.jsp.jsp_ecommerce.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.jsp.jsp_ecommerce.util.DBUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/user/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id_user");
        String name = request.getParameter("nm_user");
        String pwd = request.getParameter("nm_paswd");
        String mobile = request.getParameter("no_mobile");

        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO TB_USER (ID_USER, NM_USER, NM_PASWD, NO_MOBILE, NM_EMAIL, ST_STATUS, CD_USER_TYPE, DA_FIRST_DATE) " +
                    "VALUES (?, ?, ?, ?, ?, 'ST00', '10', SYSDATE)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, pwd);
            pstmt.setString(4, mobile);
            pstmt.setString(5, id);

            int result = pstmt.executeUpdate();

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            if (result > 0) {
                out.println("<h3>회원가입이 완료되었습니다!</h3>");
            } else {
                out.println("<h3>회원가입 실패</h3>");
            }
        } catch (Exception e) {
            throw new ServletException("회원가입 중 오류", e);
        }
    }
}

