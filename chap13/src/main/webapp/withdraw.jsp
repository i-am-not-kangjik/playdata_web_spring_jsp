<%--
  Created by IntelliJ IDEA.
  User: kangjik
  Date: 2023/04/14
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<!DOCTYPE html>
<head>
    <title>회원 탈퇴</title>
</head>
<body>
  Home > 회원 탈퇴하기
  <hr>
  <form action="drawCheck.jsp" name="user_info" method="post">
    <fieldset style="width: 200px;">
      <legend> 회원 탈퇴 </legend><p>

        아이디 : <br>
        <input type="text" name="userID"><br>

        <div align="center">
          <input type="submit" value=" 회원 탈퇴 "> &nbsp;&nbsp;
        </div><br>
    </fieldset>
  </form>
</body>
</html>
