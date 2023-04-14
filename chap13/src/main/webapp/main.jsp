<%--
  Created by IntelliJ IDEA.
  User: kangjik
  Date: 2023/04/14
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인 화면</title>
</head>
<body>
    <center>
        <img src="bgimg.jpg" width="400" height="300">
       <p>
        <table border="0">
        <tr>
            <td>
                <form action="login.jsp" method="post">
                    <input type="submit" value=" 관리자 접속하기 " >
                </form>
            </td>
            <td>
                <form action="signup.jsp" method="post" >
                    <input type="submit" value=" 사용자 접속하기 " >
                </form>
            </td>
        </tr>
    </table>
    </center>
</body>
</html>
