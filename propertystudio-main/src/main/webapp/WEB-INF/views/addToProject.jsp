<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Apartment to Project</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS for additional styling -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            padding-top: 50px;
        }
        .container {
            max-width: 700px;
            margin: 0 auto;
        }
        .form-group {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="mb-4">Add Apartment to Project</h1>
        <form:form modelAttribute="apartment" action="${pageContext.request.contextPath}/apartments/add" method="post">
            <input type="hidden" name="project.projId" value="${projId}" />
            <div class="form-group">
                <label for="aprtTitle">Title:</label>
                <input type="text" class="form-control" id="aprtTitle" name="aprtTitle" required>
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <textarea class="form-control" id="description" name="description" required></textarea>
            </div>
            <div class="form-group">
                <label for="location">Location:</label>
                <input type="text" class="form-control" id="location" name="location" required>
            </div>
            <div class="form-group">
                <label for="aprtRefNo">Reference No:</label>
                <input type="text" class="form-control" id="aprtRefNo" name="aprtRefNo" required>
            </div>
            <div class="form-group">
                <label for="aprtStatus">Status:</label>
                <input type="text" class="form-control" id="aprtStatus" name="aprtStatus" required>
            </div>
            <!-- Other apartment fields here -->
            <button type="submit" class="btn btn-primary">Add Apartment</button>
        </form:form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
