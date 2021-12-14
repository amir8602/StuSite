<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 12/10/2021
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body style="background-color: rgba(7,60,108,0.63) ; color: #021f80 ; font-weight: bolder">
<br/>
    This is registration page . <br/> <br/>
    <form method="post" action="<c:url value="/save-student.do" />" >
        <label>Name : </label> <input style="background-color: #7275f6" type="text" name="name" /> <br/><br/>
        <label>Family : </label> <input style="background-color: #7275f6" type="text" name="family" /> <br/><br/>
        <label>College : </label> <input style="background-color: #7275f6" type="text" name="college" /> <br/><br/>
        <input style="font-weight: bolder ; background-color: aquamarine" type="submit" value="Save" /> <br/><br/>
    </form>

</body>
</html>
