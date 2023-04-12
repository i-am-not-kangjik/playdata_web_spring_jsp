<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="member" scope="request" class="kr.ac.green.MemberInfo" />
<%
	member.setId("hero");
	member.setName("Jeff");
%>
<jsp:forward page="useObject.jsp" />