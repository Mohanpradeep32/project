<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.pennant.propertystudio.models.Project" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Apartment</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Add New Apartment</h1>
        <form action="${pageContext.request.contextPath}/apartments/add" method="post" class="needs-validation" novalidate>
            <div class="form-group">
                <label for="aprtTitle">Title:</label>
                <input type="text" class="form-control" id="aprtTitle" name="aprtTitle" required>
                <div class="invalid-feedback">Please enter a title.</div>
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <input type="text" class="form-control" id="description" name="description" required>
                <div class="invalid-feedback">Please enter a description.</div>
            </div>
            <div class="form-group">
                <label for="location">Location:</label>
                <input type="text" class="form-control" id="location" name="location" required>
                <div class="invalid-feedback">Please enter a location.</div>
            </div>
            <div class="form-group">
                <label for="aprtRefNo">Reference No:</label>
                <input type="text" class="form-control" id="aprtRefNo" name="aprtRefNo" required>
                <div class="invalid-feedback">Please enter a reference number.</div>
            </div>
            <div class="form-group">
                <label for="aprtStatus">Status:</label>
                <input type="text" class="form-control" id="aprtStatus" name="aprtStatus" required>
                <div class="invalid-feedback">Please enter a status.</div>
            </div>
            <div class="form-group">
                <label for="project">Project:</label>
                <select class="form-control" id="project" name="project.projId" required>
                    <option value="" disabled selected>Select a project</option>
                    <% 
                        List<Project> projects = (List<Project>) request.getAttribute("projects");
                        for (Project project : projects) {
                    %>
                        <option value="<%= project.getProjId() %>"><%= project.getProjTitle() %></option>
                    <%
                        }
                    %>
                </select>
                <div class="invalid-feedback">Please select a project.</div>
            </div>
            <button type="submit" class="btn btn-primary">Add Apartment</button>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        // JavaScript for disabling form submissions if there are invalid fields
        (function() {
            'use strict';
            window.addEventListener('load', function() {
                var forms = document.getElementsByClassName('needs-validation');
                var validation = Array.prototype.filter.call(forms, function(form) {
                    form.addEventListener('submit', function(event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            }, false);
        })();
    </script>
</body>
</html>
