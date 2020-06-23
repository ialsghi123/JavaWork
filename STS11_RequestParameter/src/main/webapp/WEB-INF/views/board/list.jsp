<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.lec.beans.*" %>



<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글 목록</title>
<style>
table {width: 100%;}
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>

		<hr>
		<h2>리스트</h2>
		<table>
			<tr>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
			
			</tr>
			
		
			<tr>
				<td>${writeDTO.name }</td>
				<td>${writeDTO.subject }</td>
				<td>${writeDTO.content }</td>

				
			</tr>


		</table>
		<br>
		<button onclick="location.href='write.jsp'">신규등록</button>



<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>















