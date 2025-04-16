# MotelManagementSpringboot

# 🏨 Motel Room Management System - Spring Boot Project

A robust and scalable backend application for managing motel room data. This system provides RESTful APIs to perform CRUD operations and custom search functionalities using Spring Boot, Spring Data JPA, and integrated database support. Designed with scalability, reliability, and clean code practices in mind — making it easy to plug into any frontend or use as a microservice.

---

## 🚀 Features

- **Full CRUD Operations**: Create, Read, Update, and Delete motel room records.
- **Partial Update Support**: Update any single attribute via PUT request with a minimal request body.
- **Custom Query Methods**:
  - `fetchRoomDetailsByNumber`: Retrieve room(s) by particular roomNumber.
  - `fetchRoomDetailsByRoomType`: Get room details using the motel room Type (Deluxe/ Executive / Suite ).
- **Database Agnostic**: Supports both H2 (in-memory) and MySQL databases.
- **Validation & Error Handling**: 
  - Integrated bean validation for request payloads.
  - Custom exception handling for precise HTTP status and messages.
- **Logging**: Added logger integration for better debugging and request tracking.
- **Lombok Integration**: Cleaner and concise code with reduced boilerplate.

---

## 🧱 Tech Stack

| Category         | Tools & Frameworks                            |
|------------------|-----------------------------------------------|
| 🧠 Backend       | Java 17, Spring Boot                          |
| 📦 ORM & DB      | Spring Data JPA, H2, MySQL                    |
| 🔒 Validation    | Jakarta Bean Validation (javax.validation)    |
| 📑 API Style     | RESTful HTTP methods                          |
| 🛠 Dev Tools     | Lombok, Logback Logger                        |
| 🌐 API Client    | Postman or any REST client                    |

---

## 📚 Technology Overview & Their Impact

- **Spring Boot**: Streamlined setup and development by reducing boilerplate configuration. It allowed for the creation of production-ready REST APIs with embedded servers and easy dependency management.

- **Spring Data JPA**: Simplified interaction with the database by abstracting away complex SQL queries. Enabled the use of repository interfaces with custom methods like `findByRoomNumber()` and `findByName()` without writing native queries.

- **H2 & MySQL Databases**: 
  - **H2** for fast in-memory development and testing.
  - **MySQL** for persistent, real-world database usage.
  The dual support enhanced flexibility and demonstrated real-world adaptability.

- **Lombok**: Drastically reduced boilerplate code for getters, setters, constructors, and logging, leading to cleaner and more maintainable code.

- **Validation API (Jakarta/Javax)**: Ensured incoming data is always validated, improving robustness and reducing potential runtime issues.

- **Logger (SLF4J / Logback)**: Provided valuable insight into application behavior for debugging and tracing HTTP operations.

---

## 📁 Endpoints Overview

| Method | Endpoint                  | Description                            |
|--------|---------------------------|----------------------------------------|
| POST   | `/api/rooms`              | Add a new motel room                   |
| GET    | `/api/rooms`              | Fetch all rooms                        |
| GET    | `/api/rooms/{id}`         | Fetch a room by ID                     |
| DELETE | `/api/rooms/{id}`         | Delete a room by ID                    |
| PUT    | `/api/rooms/{id}`         | Update a room (partial/full)           |
| GET    | `/api/rooms/name/{roomnumber}`| Fetch rooms by name              |
| GET    | `/api/rooms/{roomType}`   | Fetch a room by category      |

---

## 🛠 Setup Instructions

### Prerequisites
- Java 17+
- Maven
- MySQL (optional; H2 is supported by default)
- IDE like IntelliJ or Eclipse

### Running Locally

```bash
# Clone the repository
git clone git@github.com:TaranaGit/MotelManagementSpringboot.git
cd hotel-room-management

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

### System 
