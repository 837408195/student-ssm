<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>编辑界面</h1>
	<form action="saveOrUpdate" method="post">
		<input type="hidden" name="id" value="${student.id}">
		学号：<input type="text" name="sno" value="${student.sno}"><br>
		姓名：<input type="text" name="sname" value="${student.sname}"><br>
		性别：<input type="text" name="sex" value="${student.sex}"><br>
		专业：<input type="text" name="major" value="${student.major}"><br>
		年级：<input type="text" name="grade" value="${student.grade}"><br>
		班级：<input type="text" name="cname" value="${student.cname}"><br>
		公寓：<input type="text" name="aname" value="${student.aname}"><br>
		宿舍：<input type="text" name="dorm" value="${student.dorm}"><br>
		<input type="submit" value="保存"><br>
	</form>
</body>
</html>