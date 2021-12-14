<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 12/11/2021
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Page</title>
</head>
<body style="background-color: rgba(7,60,108,0.63) ; color: #021f80 ; font-weight: bolder">
<br/>
This is edit page . <br/> <br/>
<form method="post" action="<c:url value="/edit-student.do?id=${sts.id}" />" >
    <label>Name : </label> <input style="background-color: #7275f6" type="text" name="name" value="${sts.name}" /> <br/><br/>
    <label>Family : </label> <input style="background-color: #7275f6" type="text" name="family" value="${sts.family}" /> <br/><br/>
    <label>College : </label> <input style="background-color: #7275f6" type="text" name="college" value="${sts.college}" /> <br/><br/>

    <input style="font-weight: bolder ; background-color: aquamarine" type="submit" value="Edit" /> <br/><br/>
</form>
</body>
</html>
