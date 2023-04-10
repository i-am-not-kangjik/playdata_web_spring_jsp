<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--  게시판 글쓰기 기능의 입력 화면을 구현하는  html 문서 -->
<html>
<head>
<meta charset="UTF-8">
<title>게시판- 입력화면</title>
</head>
<body>
<h2>글쓰기</h2>
<form action = Post.jsp METHOD =POST>
이름 : <INPUT TYPE =TEXT NAME=NAME><BR>
제목 : <INPUT TYPE =TEXT NAME=TITLE><BR>
<TEXTAREA COLS=30 ROWS=5 NAME=CONTENT></TEXTAREA><BR>
<INPUT TYPE = SUBMIT VALUE ='저장'>
</form>
</body>
</html>