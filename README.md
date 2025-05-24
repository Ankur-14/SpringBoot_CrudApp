# SpringBoot_CrudApp
Creating a Spring Boot CRUD (Create, Read, Update, Delete) application typically involves the following components:

Spring Boot Application Class (@SpringBootApplication)

Model (Entity Class) – mapped to a database table

Repository Interface – extending JpaRepository

Service Layer – business logic (optional)

Controller Layer – REST endpoints

Application Configuration – typically application.properties

Project Structure-

springboot-crud/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── crud/
│       │               ├── CrudApplication.java     # Main Spring Boot app
│       │
│       │               ├── controller/
│       │               │   └── UserController.java  # REST endpoints
│       │
│       │               ├── service/
│       │               │   └── UserService.java     # Business logic
│       │
│       │               ├── repository/
│       │               │   └── UserRepository.java  # JPA Repository
│       │
│       │               └── model/
│       │                   └── User.java            # JPA Entity
│       │
│       └── resources/
│           ├── application.properties               # App config
│           └── data.sql                            # Optional: preload data
│
├── pom.xml                                           # Maven dependencies
└── README.md                                         # Project documentation

