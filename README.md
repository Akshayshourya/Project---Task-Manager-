# ✅ Task Manager - Full Stack Application

A RESTful **Task Manager backend application** built using **Java and Spring Boot**, featuring **JWT-based authentication**, clean layered architecture, and **MySQL database integration**.

Ideally designed for decoupled frontends, this project demonstrates real-world backend development practices including secure API design, stateless authentication, and scalable project structuring. _(Note: A React frontend is currently in the early stages of development and will be part of a future full-stack update)._

---

## 🚀 Features

### Frontend (React + Vite)

- User login interface
- Fetch and display tasks dynamically over REST API
- Mark tasks as completed
- Token storage in LocalStorage
  (More In development)

### Backend (Java Spring Boot)

- User registration and login
- Secure stateless authentication using **JWT (JSON Web Tokens)**
- 🔐 **Role-based Authorization** (e.g., ADMIN vs USER) built into controllers
- Robust API security with **Spring Security**
- Password hashing using **BCrypt**
- Global exception handling with meaningful HTTP status codes
- Clean separation of concerns (Controller, Service, Repository)
- Task Management API:
  - Create tasks
  - Fetch user-specific tasks
  - Mark tasks as completed
  - 📄 **Pagination Support** implementation
- Task Management API endpoint protection

---

## 🛠 Tech Stack

| Category   | Technology                  |
| ---------- | --------------------------- |
| Frontend   | React 19, Vite              |
| Backend    | Java 21, Spring Boot 3.5.x  |
| Security   | Spring Security, JWT        |
| Database   | MySQL                       |
| ORM        | JPA / Hibernate             |
| Build Tool | Maven                       |
| API Docs   | Springdoc OpenAPI (Swagger) |

---

## 🔐 Authentication Flow (JWT)

1. User logs in using email and password.
2. The backend validates the credentials.
3. A **JWT token** is generated and returned to the client.
4. The client securely stores the JWT.
5. For every protected backend request, the client sends the token in the `Authorization` header:
   ```text
   Authorization: Bearer <JWT_TOKEN>
   ```
6. A custom JWT filter validates the token and the request is processed.
7. Unauthenticated requests are rejected with a `401 Unauthorized`.

---

## 🧱 Project Structure

```text
Project--Task-Manager/
├── frontend/             → React SPA application
│   ├── src/              → Component and logic
│   ├── index.html        → Entry point
│   ├── package.json      → Dependency configuration
│   └── vite.config.js    → Vite builder config
└── backendWork/          → Spring Boot Application
    ├── src/main/java...  → REST controllers, Logic, Config
    └── pom.xml           → Maven configuration
```

---

## ⚙️ Setup & Run Locally

### 1️⃣ Clone the repository

```bash
git clone https://github.com/Akshayshourya/Project--Task-Manager.git
cd Project--Task-Manager
```

### 2️⃣ Configure & Run Backend

1. Create a MySQL database named `task_manager`.
2. Update `backendWork/src/main/resources/application.properties` with your MySQL credentials, as well as `jwt.secret`.
3. Start the Spring Boot server:

```bash
cd backendWork
./mvnw spring-boot:run
```

_The backend server will start at: `http://localhost:8080`_

---

## 🧪 API Testing & Documentation

You can explore and test the backend APIs via:

- **Swagger UI**: Visit `http://localhost:8080/swagger-ui.html` while the server is running.
- API clients like **Postman**, **Insomnia**, or **cURL**.

Remember to include the JWT token in your `Authorization` header when targeting protected endpoints!

---

## 🎯 Project Purpose

This project is built to:

- Strengthen backend fundamentals using Spring Boot.
- Deepen understanding of modern authentication using JSON Web Tokens.
- Practice scalable, clean architecture principles.
- Simulate end-to-end real-world backend workflows.

## 🔐 Authentication Flow

1. User submits email and password on the React frontend.
2. The backend validates credentials and returns a **JWT token**.
3. Frontend securely stores the JWT in `localStorage`.
4. Subsequent API calls to get/update tasks send the token in the `Authorization` header (`Bearer <JWT_TOKEN>`).

---

## 📌 Future Improvements

### Frontend

- [ ] 🎨 **Implement a UI library** like Tailwind CSS or Material-UI for a modern, responsive design.
- [ ] 🛣️ **Add React Router** to structure the app into separate pages (Login, Dashboard, Profile).
- [ ] 📦 **State Management**: Introduce Redux or Zustand for complex global state if the app grows.
- [ ] ♻️ **Componentization**: Refactor `App.jsx` into modular, reusable components.

### Backend

- [ ] 🔁 **Refresh token implementation** for seamless sessions
- [ ] 🐳 **Dockerization** (Docker Compose for Database + Backend + Frontend)
- [ ] 🧪 Comprehensive **Unit & Integration Testing**

---

## 👤 Author

**Akshay Shourya Jain**

- **GitHub**: [Akshayshourya](https://github.com/Akshayshourya)
- **LinkedIn**: [Akshay Shourya Jain](https://www.linkedin.com/in/akshay-shourya-jain-3b158236a/)
