# User Management REST API (Spring Boot)

A simple **User Management system** built using **Spring Boot** that exposes RESTful APIs to perform CRUD operations on users. This project follows standard layered architecture and can be used as a starter template for enterprise applications.

---

## 🚀 Features

* Create a new user
* Get all users
* Get user by ID
* Update user details
* Delete user
* RESTful API design
* Exception handling
* Validation
* Uses Spring Data JPA

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Web (REST)
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok
* Postman (for testing)

---

## 📁 Project Structure

```
com.example.usermanagement
│
├── controller
│   └── UserController.java
│
├── service
│   ├── UserService.java
│   └── impl/UserServiceImpl.java
│
├── repository
│   └── UserRepository.java
│
├── entity
│   └── User.java
│
├── exception
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
│
├── dto (optional)
│   └── UserDTO.java
│
└── UserManagementApplication.java
```

---

## ⚙️ Configuration

### `application.properties`

```properties
spring.application.name=springboot-rest-webservice

spring.datasource.url=jdbc:mysql://localhost:3306/user_management
spring.datasource.username=root
spring.datasource.password=admin

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update


server.port=8088
```

---

## 🧩 User Entity Example

```java
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="user")
public class User {
	
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	@Column(name = "first_name" , nullable = false)
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	

}

```

---

## 🌐 API Endpoints

### Create User

```
POST /api/users
```

**Request Body**

```json
{
    "Id": 3,
    "firstName": "siya",
    "lastName": "kumari",
    "email": "siya675@gmail.com"
}
```

---

### Get All Users

```
GET /api/users
```

---

### Get User By ID

```
GET /api/users/{id}
```

---

### Update User

```
PUT /api/users/{id}
```

**Request Body**

```json
{
    "Id": 3,
    "firstName": "siya",
    "lastName": "kumari",
    "email": "siya675@gmail.com"
}
```

---

### Delete User

```
DELETE /api/users/{id}
```

---

## ❗ Exception Handling

* Returns `404 NOT FOUND` if user does not exist
* Returns `400 BAD REQUEST` for validation errors
* Global exception handling using `@ControllerAdvice`

---

## ▶️ Running the Application

```bash
mvn clean install
mvn spring-boot:run
```

Access the API at:

```
http://localhost:8088/api/users
```

---

## 🧪 Testing

* Use **Postman** or **Swagger UI**
* Add Swagger dependency for API documentation (optional)

---

## 📌 Future Enhancements

* JWT Authentication & Authorization
* Pagination & Sorting
* Swagger OpenAPI documentation
* Role-based access control
* Docker support

---

