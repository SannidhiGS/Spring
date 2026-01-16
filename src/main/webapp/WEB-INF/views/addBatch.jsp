<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Batch</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">

<h2 class="text-center">Add New Batch</h2>

<form:form method="post"
           action="${pageContext.request.contextPath}/saveBatch"
           modelAttribute="batch">

    <div class="mb-3">
        <label>Batch Name</label>
        <form:input path="batchName" class="form-control" required="true"/>
    </div>

    <button class="btn btn-success">Save Batch</button>
</form:form>

</body>
</html>
