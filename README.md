# Task Manager API

REST API for task management with JWT authentication, built with Spring Boot 3.5, Java 21 and PostgreSQL.

## Tech Stack

- Java 21
- Spring Boot 3.5
- Spring Security + JWT (jjwt 0.12.3)
- Spring Data JPA + Hibernate
- PostgreSQL
- Lombok
- Maven

## Getting Started

### Prerequisites
- Java 21+
- Maven
- PostgreSQL 16

### Setup

1. Clone the repository
2. Create a PostgreSQL database named `taskmanager`
3. Copy `src/main/resources/application.properties.example` to `application.properties`
4. Fill in your database credentials and JWT secret
5. Run the application
```bash
mvn spring-boot:run
```

## API Endpoints

### Auth
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Login and get JWT token |

### Tasks (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/tasks` | Get all user tasks |
| POST | `/api/tasks` | Create a new task |
| PUT | `/api/tasks/{id}` | Update a task |
| DELETE | `/api/tasks/{id}` | Delete a task |

## Authentication

Include the JWT token in the Authorization header:
```
Authorization: Bearer <your_token>
```

## Task Status Values
- `TODO`
- `IN_PROGRESS`
- `DONE`