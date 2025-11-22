# Student Management System – Java Spring Boot + MySQL

A complete backend application built using **Java**, **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This project provides REST APIs for performing CRUD operations on student records, along with validation, DTO mapping, global exception handling, and SQL database integration.

---

## 🚀 Features
- Add, update, delete, and fetch student records  
- MySQL database integration with JPA  
- REST API using Spring Web  
- DTO and Entity mapping  
- Validation using Jakarta Validation  
- Global Exception Handling  
- Swagger API Documentation  
- Docker & Docker Compose support  
- Clean production-ready code structure  

---

## 🛠 Tech Stack
**Language:** Java 17  
**Framework:** Spring Boot 3  
**Database:** MySQL  
**ORM:** Spring Data JPA  
**Build Tool:** Maven  
**Documentation:** Swagger (OpenAPI)  
**Containerization:** Docker / Docker Compose  

---

## 📁 Project Structure
```
src/main/java/com/vishnureddy/student/
 ├── controller/      # API endpoints
 ├── service/         # Business logic
 ├── repository/      # JPA repository
 ├── model/           # Entity class (Student)
 ├── dto/             # Data Transfer Objects
 ├── mapper/          # Entity ↔ DTO mapper
 ├── exception/       # Global exception handler
 └── StudentManagementApplication.java
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the Repository
```
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

### 2️⃣ Create MySQL Database
Open MySQL and run:
```sql
CREATE DATABASE studentdb;
```

### 3️⃣ Configure Database
Update your credentials in:

```
src/main/resources/application.yml
```

Example:
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/studentdb
    username: root
    password: yourpassword
```

### 4️⃣ Run the Application
```
mvn spring-boot:run
```

---

## 🐳 Run with Docker (Optional)
Start both MySQL + Spring Boot app using Docker Compose:
```
docker compose up --build
```

---

## 📌 API Endpoints

### ➤ Create Student  
`POST /api/students`

### ➤ Get All Students  
`GET /api/students`

### ➤ Get Student by ID  
`GET /api/students/{id}`

### ➤ Update Student  
`PUT /api/students/{id}`

### ➤ Delete Student  
`DELETE /api/students/{id}`

---

## 📝 Sample Request Body
```json
{
  "firstName": "Vishnu",
  "lastName": "Reddy",
  "email": "vishnu@example.com",
  "dob": "2002-06-15",
  "enrollmentNumber": "ENR2025001",
  "course": "CSE",
  "yearOfStudy": 4
}
```

---

## 📘 Swagger API Documentation
Once the app is running, visit:

👉 http://localhost:8080/swagger-ui/index.html

---

## 🧪 Running Tests
```
mvn test
```




