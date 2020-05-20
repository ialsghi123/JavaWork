<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="cnt" class="com.lec.beans.CountBean" scope="request"/>

<h3>request2<b>cnt의 getCount 호출</b><br></h3>

<jsp:getProperty name="cnt" property="count"/><br>
<%--cnt.getCount()--%>

<a href="scope2_request1.jsp">request1로...</a>