<%--
  Created by IntelliJ IDEA.
  User: kangjik
  Date: 2023/04/14
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@include file="dbConn.jsp"%>
<%
  String u_id = request.getParameter("userID");
  String u_pw = request.getParameter("userPW");
  String u_mail = request.getParameter("userMAIL");

  String sql = "INSERT INTO members(id, passwd, email) VALUES (?, ?, ?)";
  PreparedStatement pstmt = conn.prepareStatement(sql);
  pstmt.setString(1, u_id);
  pstmt.setString(2, u_pw);
  pstmt.setString(3, u_mail);

  int count = pstmt.executeUpdate();
  if (count == 1) {
    response.sendRedirect("signupSuccess.jsp");
  } else {
    out.println("회원가입 실패!");
    response.sendRedirect("signup.jsp");
  }

  pstmt.close();
  conn.close();

  %>
