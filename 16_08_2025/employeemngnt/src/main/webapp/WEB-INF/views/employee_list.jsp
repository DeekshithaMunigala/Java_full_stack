<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  <!-- Missing JSTL taglib -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<h2>Employee List</h2>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

<table border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Email</th><th>Type</th><th>Department</th><th>Actions</th>
    </tr>
    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.firstName} ${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>${emp.employeeType}</td>
       <!-- <td>${emp.department.name}</td> -->
            <td>${emp.department != null ? emp.department.name : 'N/A'}</td>
            
            <td>
                <a href="/employees/delete/${emp.id}">Delete</a>
                <a href="/employees/new?id=${emp.id}">Edit</a> <!-- Pass ID for edit -->
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/employees/new">Add New Employee</a>

<form action="/employees/searchById" method="get">
    Search by ID: <input type="number" name="id"/>
    <input type="submit" value="Search"/>
</form>

</body>
</html>
