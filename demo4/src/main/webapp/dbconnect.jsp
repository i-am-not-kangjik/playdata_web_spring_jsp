<%--
  Created by IntelliJ IDEA.
  User: kangjik
  Date: 2023/04/11
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="EUC-KR">
  <title>JDBC Ŀ�ؼ� �׽�Ʈ</title>
</head>
<body>
<%
  // 1. ���� 4�� ����
  String driverName = "com.mysql.jdbc.Driver";
  String url = "jdbc:mysql://localhost:3306/odbo";
  String username = "root";
  String password = "qwer1234";
  Connection conn = null;

  try {
    //2. ����̹� �ε�
    Class.forName(driverName);
    //3. ����
    conn = DriverManager.getConnection(url, username, password);
    //4. ���
    out.println(">> ���� ����: " + conn);

  }
  catch(ClassNotFoundException e){
    out.println(">> ���� ����: ����̹� ���� �ʿ�!");
  }
  catch(SQLException e){
    out.println(">> ���� ���� : SQL ��ɹ� Ȯ�� �ʿ�")
    ;}
  finally {
    //5. �ݱ�
    try{
      if (conn != null)
        conn.close();

    }catch(SQLException e){
      ;
    }
  }
%>

</body>
</html>
