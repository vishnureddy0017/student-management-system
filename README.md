# student-management-system — Spring Boot + MySQL

A complete Student Management backend application built using Java, Spring Boot, Spring Data JPA, and MySQL.
It provides REST APIs to manage student data with proper validation, mapping, exception handling, and SQL database integration.

🚀 Features

Create, update, delete, and fetch student records

MySQL database integration

Validation using Jakarta Validation

REST APIs using Spring Boot

DTO → Entity mapping

Global exception handling

Docker support (App + MySQL)

Swagger UI documentation

Production-ready folder structure

🛠️ Tech Stack

Backend: Java 17, Spring Boot 3
Database: MySQL
ORM: Spring Data JPA
Build Tool: Maven
Containerization: Docker & Docker Compose
Documentation: OpenAPI/Swagger

📂 Project Structure
src/main/java/com/vishnureddy/student/
 ├── controller/      # REST API layer
 ├── service/         # Business logic
 ├── repository/      # JPA repository
 ├── model/           # Entity classes
 ├── dto/             # Data transfer objects
 ├── mapper/          # Entity <-> DTO converters
 ├── exception/       # Global exception handler
 └── StudentManagementApplication.java

⚙️ How to Run the Project
1. Clone the repository
git clone https://github.com/yourusername/student-management-system.git
cd student-management-system

2. Configure MySQL

Create database in MySQL:

CREATE DATABASE studentdb;


Update username & password in:

src/main/resources/application.yml

3. Run using Maven
mvn spring-boot:run

🐳 Run with Docker (Optional)

Start MySQL + App using Docker Compose:

docker compose up --build

📘 API Documentation (Swagger)

Once the application is running, open:

👉 http://localhost:8080/swagger-ui/index.html

You will see all Student API endpoints.

📡 API Endpoints
POST /api/students

Create new student

GET /api/students

Get all students

GET /api/students/{id}

Get student by ID

PUT /api/students/{id}

Update student

DELETE /api/students/{id}

Delete student

📦 Sample JSON
{
  "firstName": "Vishnu",
  "lastName": "Reddy",
  "email": "vishnu.example@gmail.com",
  "dob": "2002-05-12",
  "enrollmentNumber": "ENR2025001",
  "course": "CSE",
  "yearOfStudy": 4
}

🧪 Running Tests
mvn test
