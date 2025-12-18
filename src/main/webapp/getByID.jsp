<%@ page isELIgnored="false" %>
<!Doctype html>
<html>
<head>
<title></title>
</head>
<body>
<div class="container mt-5 p-4 border rounded shadow">
    <h3 class="text-center mb-4">Search By Medicine ID</h3>
    <form action="getMedicine" method="get">
        <div class="mb-3">
            <label class="form-label">Enter Medicine Name:</label>
            <input type="text" class="form-control" name="medicineId" placeholder="Enter medicine id">
        </div>
        <button type="submit"  value="search" class="btn btn-primary">Search</button>
        <button type="submit"  value="clear" class="btn btn-secondary">Clear</button>
    </form>
    <div class="mt-4"> <h5>Search Result:</h5> <p>${medicine}</p> </div>
    <a href="getMedicineInfo/${medicine.id}">Update</a>
</body>
</html>