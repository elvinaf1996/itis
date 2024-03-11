<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
       table {
        width: 300px;
        border: 1px solid black;
        margin: 0 auto;
       }
       td, th {
        padding: 3px;
        border: 1px solid black;
       }
       .center {
          text-align: center;
       }

      </style>
</head>

<body style="background-color: lightblue;">
<h1 class="center">Persons list</h1>
<form action="view" method="get">
    <table>
        <c:forEach var="element" items="${persons}">
            <tr>
                <td><c:out value="${element.userName}"/></td>
                <td><c:out value="${element.userEmail}"/></td>
                <td><c:out value="${element.userCountry}"/></td>
                <th><a href = "delete?id=${element.id}">delete</a></th>
                <th><a href = "update?id=${element.id}">update</a></th>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>