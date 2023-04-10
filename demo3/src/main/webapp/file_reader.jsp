<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> 세션 생성 </title>
</head>
<body>
	Home > 세션 생성하기
	<hr>
	<%
		String u_id = request.getParameter("id");
		String u_pw = request.getParameter("passwd");
		boolean success = false;

		// id와 pw가 모두 입력되었을 때
		if(u_id != null && u_pw != null) {
			BufferedReader reader = null;
			try {
				String filePath = application.getRealPath("/WEB-INF/session_id_pw.txt");
				reader = new BufferedReader(new FileReader(filePath));
				String line;
				while ((line = reader.readLine()) != null) {
					String[] arr = line.split(" ");
					String id = arr[0].trim();
					String pw = arr[1].trim();
					
					if (u_id.equals(id) && u_pw.equals(pw)) {
						HttpSession sessions = request.getSession(); // session 객체 생성
						session.setAttribute("memberId", u_id);
						session.setAttribute("memberPw", u_pw);
						success = true;
						break;
					}
				}
			} catch (FileNotFoundException fnfe) {
				out.println("파일이 존재하지 않습니다.");
			} catch (IOException ioe) {
				out.println("파일을 읽을수 없습니다.");
			} finally {
				try {
					if (reader != null) {
						reader.close();
					}
				} catch (Exception e) {
					// ignore
				}
			}
		}
		
		if (success) {
			out.println("새로운 세션 생성 성공 ! <br>");
			out.println("[ " + u_id + " ]님이 입장하였습니다.");
		} else {
			out.println("세션 생성 실패 ! <br>");
			out.println("다시 시도해 보세요.");
		}
	%>
</body>
</html>
