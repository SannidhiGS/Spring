<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Batch List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">

<h2 class="text-center">All Batches</h2>

<table class="table table-bordered mt-4">
    <thead>
    <tr>
        <th>ID</th>
        <th>Batch Name</th>
        <th>Logo</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${batches}" var="batch">
        <tr>
            <td>${batch.id}</td>
            <td>${batch.batchName}</td>
            <td>
                <c:if test="${batch.logo != null}">
                    <img src="logo/${batch.logo}" width="50" height="50" alt="logo"/>
                </c:if>
            </td>
            <td>
                <a href="${batch.id}" class="btn btn-primary btn-sm">View Details</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="addBatch" class="btn btn-success">Add New Batch</a>

</body>
</html>
