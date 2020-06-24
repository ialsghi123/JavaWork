<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>대털</title>
</head>
<body>
<%! int age; %>
<%
	String str = request.getParameter("age");
	age = Integer.parseInt(str);
	
%>

인생이 그렇게 무서운거야 상수야
<%=age %>살에  <br>
<a href = "input_type.jsp">처음으로</a>

</body>
</html>