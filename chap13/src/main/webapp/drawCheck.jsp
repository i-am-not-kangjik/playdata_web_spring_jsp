<%--
  Created by IntelliJ IDEA.
  User: kangjik
  Date: 2023/04/14
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ include file = "dbConn.jsp" %>
<%
  String u_id = request.getParameter("userID");
  String sql = "DELETE FROM members WHERE id = ?";

  PreparedStatement sm = conn.prepareStatement(sql);
  sm.setString(1, u_id);
  int count = sm.executeUpdate();

  if(count == 1) {
    response.sendRedirect("drawSuccess.jsp");
  }else{
    response.sendRedirect("drawErr.jsp");
  }
  sm.close();
  conn.close();
%>