<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<h2>Employee Form</h2>

<form:form method="POST" modelAttribute="employee" action="${employee.id != null ? '/employees/edit/' + employee.id : '/employees'}">
    
    First Name: <form:input path="firstName"/><br/>
    Last Name: <form:input path="lastName"/><br/>
    Email: <form:input path="email"/><br/>

    Type: 
    <form:select path="employeeType">
        <form:option value="REGULAR" label="REGULAR"/>
        <form:option value="CONTRACT" label="CONTRACT"/>
    </form:select><br/>

    Department: 
    <form:select path="department.id">
        <form:options items="${departments}" itemValue="id" itemLabel="name"/>
    </form:select><br/>

    <!-- Address fields -->
    Address Line 1: <form:input path="address.line1"/><br/>
    Address Line 2: <form:input path="address.line2"/><br/>
    City: <form:input path="address.city"/><br/>
    State: <form:input path="address.state"/><br/>
    Country: <form:input path="address.country"/><br/>
    Postal Code: <form:input path="address.postalCode"/><br/>

    <input type="submit" value="Save"/>
</form:form>

<a href="/employees">Back to List</a>

</body>
</html>

