<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="input">新增</a>
	<table width="80%" cellpadding="0" cellspacing="0" border="1">
		<tr>

			<th>学号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>专业</th>
			<th>年级</th>
			<th>班级</th>
			<th>公寓</th>
			<th>宿舍</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${students}" var="s">
		<tr>

			<td>${s.sno}</td>
			<td>${s.sname}</td>
			<td>${s.sex}</td>
			<td>${s.major}</td>
			<td>${s.grade}</td>
			<td>${s.cname}</td>
			<td>${s.aname}</td>
			<td>${s.dorm}</td>
			<td><a href="delete?id=${s.id}">删除</a></td>
			<td><a href="input?id=${s.id}">编辑</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>