<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <% 
 	String result_str = (String)session.getAttribute("sessionID");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>�α��� ����!! ID: <%=result_str%></h3>
</body>
</html>