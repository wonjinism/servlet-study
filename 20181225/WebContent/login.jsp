<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String username = (String)session.getAttribute("username");
%>
	<center><h1><%=username%>�� ȸ�� ������ ȯ���մϴ�!</h1></center>
	<center><h1>${sessionScope.username}�� �α����� �غ��ô�.</h1></center>
	<form action="memberJoin" method="post">
		<input type="hidden" name="action" value="loginMember" />
		���� : <input type="text" name="username" id="username" /><br />
		��� : <input type="password" name="password" id="password" /><br />
		<input type="submit" value="�α���" /> 
	</form>
</body>
</html>