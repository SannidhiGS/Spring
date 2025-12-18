
<!Doctype html>
<html>
<head>
<title></title>
</head>
<body>
<div class="container mt-5 p-4 border rounded shadow">
    <h3 class="text-center mb-4">Search By Phone</h3>
    <form action="medi" method="get">
        <div class="mb-3">
            <label class="form-label">Enter Medicine Name:</label>
            <input type="text" class="form-control" name="name" placeholder="Enter medicine name">
        </div>
        <button type="submit"  value="search" class="btn btn-primary">Search</button>
        <button type="submit"  value="clear" class="btn btn-secondary">Clear</button>
    </form>
    <div class="mt-4"> <h5>Search Result:</h5> <p>${searchedData}</p> </div>
</body>
</html>