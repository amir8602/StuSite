<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 12/10/2021
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>

</head>
<body>

    <table border="1px solid black">
        <tr>
            <td>No.</td>
            <td>ID</td>
            <td>Name</td>
            <td>Family</td>
            <td>College</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${allSts}" var="st" varStatus="i" >
            <tr>
                <td>${i.index+1}</td>
                <td>${st.id}</td>
                <td>${st.name}</td>
                <td>${st.family}</td>
                <td>${st.college}</td>
                <td><a href="<c:url value="/edit.do?id=${st.id}"/>">Click</a></td>
                <td><a href="<c:url value="/delete.do?id=${st.id}" />">Click</a></td>
            </tr>
        </c:forEach>


    </table>

</body>
</html>
