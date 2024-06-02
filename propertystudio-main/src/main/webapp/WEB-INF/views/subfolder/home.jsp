<%@ page import="java.util.List" %>
<%@ page import="com.pennant.propertystudio.models.Apartments" %> <!-- Import your Apartment class -->

<!DOCTYPE html>
<html>
<head>
    <title>Apartment List</title>
    <!-- Add your CSS stylesheets or Bootstrap CDN links here -->
</head>
<body>
    <h1>Apartment List</h1>
    
    <div class="container">
        <div class="row">
            <% 
            List<Apartments> apartments = (List<Apartments>) request.getAttribute("Apartments"); // Retrieve apartments from the database
            for (Apartments apartment : apartments) {
            %>
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="<%= apartment.getBannerPhotoUrl() %>" class="card-img-top" alt="Apartment Image">
                    <div class="card-body">
                        <h5 class="card-title"><%= apartment.getTitle() %></h5>
                        <p class="card-text"><%= apartment.getDescription() %></p>
                        <p class="card-text">Location: <%= apartment.getLocation() %></p>
                        <div class="d-flex justify-content-between align-items-center">
                            <div class="btn-group">
                                <a href="#" class="btn btn-sm btn-outline-secondary">View Details</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <% } %>
        </div>
    </div>
    
    <!-- Add your JavaScript scripts or Bootstrap CDN links here -->
</body>
</html>
 