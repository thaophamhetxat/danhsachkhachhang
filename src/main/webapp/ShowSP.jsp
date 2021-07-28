<%@ page import="java.util.ArrayList" %>
<%@ page import="Demo.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Danh Sach Khach Hang</h2>
    <table class="table">
        <thead>
        <tr>
            <th>Firstname</th>
            <th>Date</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listSP}" var="sp">
            <tr>
                <td>${sp.name}</td>
                <td>${sp.date}</td>
                <td>${sp.address}</td>
                <td><img src="${sp.image}" width="200" height="200"></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<a href="/CreateIndex.jsp" class="btn btn-success">Create</a>
</body>
</html>
