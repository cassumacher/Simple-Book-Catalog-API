# Simple-Book-Catalog-API
This is a RESTful API for a simple book catalog built using Java and Spring Boot.
The project focuses on foundational back-end development skills, database management, and project management.
Simple Book Catalog API

This is a RESTful API for a simple book catalog built using Java and Spring Boot. The project focuses on foundational back-end development skills, database management, and project management.

# Installation

To run this project locally, follow these steps:
Clone the repository to your local machine:
git clone https://github.com/cassumacher/simple-book-catalog-api.git
Navigate to the project directory:
cd simple-book-catalog-api

# Database Configuration

Ensure you have PostgreSQL installed and running on your local machine.
Update the `application.properties` file with your PostgreSQL database configuration:

    properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
    spring.datasource.username=postgres
    spring.datasource.password=nikos123
    
# Build the project using Maven:

mvn clean install

# Run the application:
java -jar target/simple-book-catalog-api.jar

# Usage (kind of documentation)

Once the application is running, you can access the following endpoints:
        /admin: This endpoint is protected and requires authentication. You can log in using the following credentials:
            - Username: `nikka`
            - Password: `nikka123` (which is encrypted)
        /books: Retrieve a list of all books.
        /books/{id}: Retrieve details of a specific book by its ID.
        /books/add: Add a new book to the catalog.
        /books/update/{id}: Update an existing book.
        /books/delete/{id}: Delete a book from the catalog.

# Swagger Documentation

You can also explore the API documentation using Swagger. Follow these steps:

1. Open your web browser and navigate to the following URL:    
    http://localhost:8080/swagger-ui.html
2. You will see the Swagger UI interface, which provides a user-friendly way to interact with the API endpoints.
 Here, you can view the available endpoints, their parameters, and make test requests.

# What is not done..

Search and sorting features: Add the capability to search for books by title or author 
and sort the list of books, making the API more dynamic and user-friendly.

# Future Improvements

Performance of the queris
Search feature
Sorting feature
Error handling

