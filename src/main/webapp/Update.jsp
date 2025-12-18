<html>
<%@ page isELIgnored="false" %>
<body>
<a href="Search.jsp">Search</a>
<a href="UpdateResult.jsp">Update</a>
<h2>Hello World!</h2>
<form action="<%= request.getContextPath() %>/updateMedicine" method="post">
Name: <input type="text" name="name" value="${medicineDTO.name}" />
MG: <input type="text" name="mg" value="${medicineDTO.mg}" />
Expiry: <input type="text" name="expiry" value="${medicineDTO.expiry}" />
Composition: <input type="text" name="composition" value="${medicineDTO.composition}" />
<input type="hidden" name="id" value="${medicineDTO.id}" />
<input type="submit">
</form>
${successMessage}
</body>
</html>