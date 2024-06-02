<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add New Project</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
<style>
    body {
        font-family: Arial, sans-serif;
        padding: 20px;
    }
    .form-group {
        margin-bottom: 20px;
    }
    .btn-submit {
        background-color: #007bff;
        color: #fff;
        border: none;
    }
    .btn-submit:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <h1 class="mb-4">Add New Project</h1>
        <form action="addProject" method="post">
            <div class="form-group">
                <label for="projTitle">Title:</label>
                <input type="text" class="form-control" id="projTitle" name="projTitle" required>
            </div>
            <div class="form-group">
                <label for="projLocation">Location:</label>
                <input type="text" class="form-control" id="projLocation" name="projLocation" required>
            </div>
            <div class="form-group">
                <label for="projDesc">Description:</label>
                <input type="text" class="form-control" id="projDesc" name="projDesc" required>
            </div>
            <div class="form-group">
                <label for="projBanner">Banner (URL):</label>
                <input type="text" class="form-control" id="projBanner" name="projBanner" required>
            </div>
            <div class="form-group">
                <label for="projCoordinates">Coordinates (Lat, Long):</label>
                <input type="text" class="form-control" id="projCoordinates" name="projCoordinates" required>
            </div>
            <div class="form-group">
                <label for="projConstructionStatus">Construction Status:</label>
                <input type="text" class="form-control" id="projConstructionStatus" name="projConstructionStatus" required>
            </div>
            <div class="form-group">
                <label for="projStatus">Status:</label>
                <input type="text" class="form-control" id="projStatus" name="projStatus" required>
            </div>
            <!-- Hidden field for proj_prty_id with value 1 -->
            <input type="hidden" id="projPrtyId" name="projPrtyId" value="1">
            <button type="submit" class="btn btn-submit">Add Project</button>
        </form>
    </div>
    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
