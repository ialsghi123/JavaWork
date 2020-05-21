<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글쓰기</title>

</head>
<style>
.name {
	width:200px; height:20px;
}

.subject {
	width:200px; height:20px;
}

.content {
	width:300px; height:100px;
}
</style>
<script>
function chkSubmit() { // 폼 검증
	frm = document.forms["frm"];
	
	var name = frm["name"].value.trim();
	var subject = frm["subject"].value.trim();
	
	if(name == "") {
		alert("작성자 란은 반드시 입력해야 합니다");
		frm["name"].focus();
		return false;
	}
	
	if(subject == "") {
		alert("제목은 반드시 작성해야 합니다");
		frm["subject"].focus();
		return false;
	}
	
	return true;
}
	
</script>


<body>

<h2>글쓰기</h2>
<form name="frm" action="writeOk.jsp" method="post" onsubmit="return chkSubmit()">
작성자:
<input type="text" name="name" class="name"/><br><br>
제목:
<input type="text" name="subject" class="subject"/><br><br>
내용:<br>
<textarea name="content" class="content"></textarea>
<br><br>
<input type="submit" value="등록"/>
</form>
<br>
<button type="button" onclick="location.href='list.jsp'">목록으로</button>

</body>
</html>