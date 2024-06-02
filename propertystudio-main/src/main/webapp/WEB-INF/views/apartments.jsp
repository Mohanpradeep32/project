<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pennant.propertystudio.models.Project" %>
<%@ page import="com.pennant.propertystudio.models.Apartments" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Projects and Apartments</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .add-button {
            margin-bottom: 20px;
        }
        .card {
            margin-bottom: 20px;
        }
        .project-card {
            margin-bottom: 30px;
        }
        .apartment-card {
            margin-bottom: 10px;
        }
        .card-header {
            background-color: #007bff;
            color: white;
        }
        .table {
            margin-bottom: 0;
        }
        .table th, .table td {
            padding: 5px;
        }
        .project-img {
            max-height: 200px;
            object-fit: cover;
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Projects and Apartments</h1>
        <button class="btn btn-primary add-button" onclick="window.location.href='apartments/add'">Add New Project</button>
        
        <div class="row">
            <% 
                List<Project> projects = (List<Project>) request.getAttribute("projects");
                if (projects != null) {
                    for (Project project : projects) {
            %>
                <div class="col-md-6">
                    <div class="card project-card">
                        <img src="<%= project.getProjBanner() %>" alt="<%= project.getProjTitle() %>" class="card-img-top project-img">
                        <div class="card-header">
                            <h3><%= project.getProjTitle() %></h3>
                            <p><%= project.getProjLocation() %></p>
                        </div>
                        <div class="card-body">
                            <h5>Apartments:</h5>
                            <div class="row">
                                <% 
                                    // Convert Set to List
                                    List<Apartments> apartments = new ArrayList<>(project.getApartments());
                                    if (apartments != null && !apartments.isEmpty()) {
                                        for (Apartments apartment : apartments) {
                                %>
                                    <div class="col-md-6 apartment-card">
                                        <div class="card">
                                            <div class="card-body">
                                                <h5 class="card-title"><%= apartment.getAprtTitle() %></h5>
                                                <p class="card-text"><strong>Ref No:</strong> <%= apartment.getAprtRefNo() %></p>
                                                <p class="card-text"><strong>Status:</strong> <%= apartment.getAprtStatus() %></p>
                                            </div>
                                        </div>
                                    </div>
                                <% 
                                        }
                                    } else {
                                %>
                                    <p class="col-12">No apartments found for this project.</p>
                                <% 
                                    }
                                %>
                            </div>
                        </div>
                        <div class="card-footer">
                            <form action="${pageContext.request.contextPath}/apartments/addToProject" method="post">
                                <input type="hidden" name="projId" value="<%= project.getProjId() %>">
                                <button type="submit" class="btn btn-primary">Add Apartment</button>
                            </form>
                        </div>
                    </div>
                </div>
            <% 
                    }
                } else {
            %>
                <p>No projects found.</p>
            <% 
                }
            %>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
