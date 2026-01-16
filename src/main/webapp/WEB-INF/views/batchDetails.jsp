<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Batch List</title>
</head>
<body>

<h2>All Batches</h2>

<c:forEach var="batch" items="${batches}">
    <div>
        <b>${batch.batchName}</b><br>
        <c:if test="${not empty batch.logo}">
            <img src="${pageContext.request.contextPath}/batch/logo/${batch.logo}"
                 width="100"/>
        </c:if>
    </div>
    <hr>
</c:forEach>

</body>
</html>
