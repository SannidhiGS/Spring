<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
    rel="stylesheet">

  <title>Restaurant Registration</title>
</head>

<body class="bg-light">

  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">

        <div class="card shadow-sm">
          <div class="card-body">

            <h4 class="text-center mb-4">Restaurant Registration</h4>
            <form action="register" method="post">

              <div class="mb-3">
                <label class="form-label">Restaurant Name</label>
                <input type="text" class="form-control" name="name">
              </div>
              <div class="mb-3">
                <label class="form-label">Owner Name</label>
                <input type="text" class="form-control" name="owner">
              </div>
              <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="text" class="form-control" name="phone">
              </div>
              <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" class="form-control" name="email">
              </div>
              <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" class="form-control" name="location">
              </div>
                <div class="mb-3">
                <label class="form-label">Pincode</label>
                <input type="text" class="form-control" name="pincode">
              </div>
              <div class="mb-3">
                <label class="form-label">FSSAI Licensed?</label>
                <select class="form-select" name="fssai">
                  <option selected disabled>Select</option>
                  <option value="yes">Yes</option>
                  <option value="no">No</option>
                </select>
              </div>
              <div class="mb-3">
                <label class="form-label">FSSAI Licence Code</label>
                <input type="text" class="form-control" name="code">
              </div>
              <div class="mb-3">
                <label class="form-label">Signature</label>
                <input type="text" class="form-control" name="sign">
              </div>
              <div class="mb-4">
                <label class="form-label">Cuisine</label>
                <select class="form-select" name="cusine">
                  <option selected disabled>Select Cuisine</option>
                  <option value="Veg">Veg</option>
                  <option value="Nonveg">Non-Veg</option>
                  <option value="Both">Both</option>
                </select>
              </div>
              <div class="d-grid">
                <button type="submit" class="btn btn-primary">
                  Submit
                </button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
