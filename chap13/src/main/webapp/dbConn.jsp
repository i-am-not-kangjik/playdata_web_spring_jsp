<%--
  Created by IntelliJ IDEA.
  User: kangjik
  Date: 2023/04/14
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import = "java.sql.*" %>
<%
    Connection conn = null;

    String url = "jdbc:mysql://localhost:3306/odbo";
    String user = "root";
    String passwd = "qwer1234";

    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection(url, user, passwd);
%>
