<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style>
            table {
                margin: 0 auto;
            }
            .center {
                text-align: center;
            }
        </style>
</head>

<body style="background-color: lightblue;">
<h1 class="center">Change the data you want to update</h1>
<h4 class="center">Please note that if you enter a blank value, the field will not be updated</h4>
<form action="update" method="post">
    <table>
        <tr><td>Name:</td><td><input type="text" name="userName" value = "${person.userName}"/></td></tr>
        <tr><td>Password:</td><td><input type="password" name="userPass" value = "${person.userPass}"/></td></tr>
        <tr><td>Email:</td><td><input type="email" name="userEmail" value = "${person.userEmail}"/></td></tr>
        <tr><td>Country:</td><td>
            <select name="userCountry" style="width:150px">
                value = "${person.userCountry}"
                <option>India</option>
                <option>USA</option>
                <option>UK</option>
                <option>Germany</option>
                <option>Russia</option>
                <option>Other</option>
            </select>
        </td></tr>
        <tr><td colspan="2"><input type="submit" value="update"/></td></tr>
    </table>
</form>

</body>
</html>