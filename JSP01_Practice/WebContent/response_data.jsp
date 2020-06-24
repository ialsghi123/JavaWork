<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>데이터 입력받는곳</title>
</head>
<body>
<%!
	int age;
%>

<%
	String kname = request.getParameter("age");
	age=Integer.parseInt(kname);

	if(age>19) {
		response.sendRedirect("daetul.jsp?age="+age);
	} else {
		response.sendRedirect("luckyzzang.jsp?age="+age);
	}
	
%>


</body>
</html>