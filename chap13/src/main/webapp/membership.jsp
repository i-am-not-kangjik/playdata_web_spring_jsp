<%--
  Created by IntelliJ IDEA.
  User: kangjik
  Date: 2023/04/14
  Time: 10:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title> 회원 전용 공간 </title>
</head>
<body>
  Home > 회원 전용 공간
  <hr>
  반갑습니다.<br>
  여기는 회원 전용 공간입니다.<br>
  회원을 탈퇴하려면 버튼을 눌러주세요.<br><br>

  <table border="0">
    <tr>
      <td>
        <form action="main.jsp" method="post">
          <input type="submit" value=" 메인 화면 ">
        </form>
      </td>
      <td>
        <form action="withdraw.jsp" method="post">
          <input type="submit" value=" 회원 탈퇴하기 ">
        </form>
      </td>
    </tr>
  </table>
</body>
</html>
