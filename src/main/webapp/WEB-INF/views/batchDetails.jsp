<h2 class="text-center">Batch: ${batch.batchName}</h2>

<table class="table table-bordered mt-4">
    <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>DOB</th>
            <th>Passout</th>
            <th>10th %</th>
            <th>12th %</th>
            <th>Degree</th>
            <th>Degree %</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach items="${batch.students}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.dob}</td>
                <td>${s.yearOfPassout}</td>
                <td>${s.tenthPercentage}</td>
                <td>${s.twelfthPercentage}</td>
                <td>${s.degreeType}</td>
                <td>${s.degreePercentage}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
