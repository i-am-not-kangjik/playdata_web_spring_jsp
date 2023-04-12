<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="processJoining.jsp" method="post">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td>아이디</td>	
				<td colspan="3"><input type="text" name="id" size="10"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" size="10"></td>
				<td>이메일</td>
				<td><input type="text" name="email" size="10"></td>
			</tr>
			<tr>
				<td colspan="4" align="center">
				<input type="submit" value="회원가입">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>