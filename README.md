# pos

# POS System (Angular 19 + Spring Boot 3 + PostgreSQL + Docker)

A modular Point of Sale (POS) system using the latest tech stack.

## 🧩 Tech Stack

- **Frontend:** Angular 19
- **Backend:** Spring Boot 3 (Modular Gradle project)
- **Database:** PostgreSQL
- **Security:** JWT-based Authentication
- **DevOps:** Docker, Docker Compose

## 📁 Project Structure

pos/
├── backend/
│ ├── api/ # API gateway (exposes REST endpoints)
│ ├── application/ # Business logic orchestrators
│ ├── service/ # Core services
│ ├── domain/ # Entities, Repositories
│ └── common/ # Shared code
├── frontend/ # Angular 19 app
├── docker/ # Dockerfile & docker-compose.yml


## 🔐 Authentication

- Register/Login with JWT
- Roles: `Admin`, `Cashier`, `Manager`

## 🐳 Docker Setup

### Prerequisites

- Docker & Docker Compose installed

### Run

```bash
cd docker
docker-compose up --build


Spring Boot runs on http://localhost:8080

Angular (to be added) runs on http://localhost:4200

PostgreSQL on port 5432

pgAdmin on http://localhost:5050 (user: admin@pos.com / pass: admin)