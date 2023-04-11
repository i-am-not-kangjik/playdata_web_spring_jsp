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
  <title>JDBC 커넥션 테스트</title>
</head>
<body>
<%
  // 1. 변수 4개 선언
  String driverName = "com.mysql.jdbc.Driver";
  String url = "jdbc:mysql://localhost:3306/odbo";
  String username = "root";
  String password = "qwer1234";
  Connection conn = null;

  try {
    //2. 드라이버 로딩
    Class.forName(driverName);
    //3. 연동
    conn = DriverManager.getConnection(url, username, password);
    //4. 사용
    out.println(">> 연결 성공: " + conn);

  }
  catch(ClassNotFoundException e){
    out.println(">> 연결 실패: 드라이버 복사 필요!");
  }
  catch(SQLException e){
    out.println(">> 연결 실패 : SQL 명령문 확인 필요")
    ;}
  finally {
    //5. 닫기
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
