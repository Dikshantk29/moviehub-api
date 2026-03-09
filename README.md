Here is a **clean professional `README.md`** you can use for your project **moviehub-api**.

# MovieHub API 🎬

A simple **Spring Boot REST API** for managing movies.
This project demonstrates basic **CRUD operations**, search functionality, and layered architecture using **Controller → Service → Repository**.

---

## 🚀 Features

* Get all movies
* Get movie by ID
* Search movies by name
* Search movies by year
* Add new movie
* Delete movie
* Dummy movie data loaded on startup

---

## 🛠 Tech Stack

* **Java 21**
* **Spring Boot**
* **Maven**
* **REST APIs**
* **Git & GitHub**

---

## 📂 Project Structure

```
moviehub-api
 ┣ controller
 ┃ ┗ MovieController.java
 ┣ service
 ┃ ┗ MovieService.java
 ┣ repository
 ┃ ┗ MovieRepo.java
 ┣ entity
 ┃ ┗ Movie.java
 ┗ MoviehubApiApplication.java
```

---

## 📌 API Endpoints

### Get All Movies

```
GET /movie
```

---

### Get Movie By ID

```
GET /movie/{id}
```

Example:

```
GET /movie/1
```

---

### Search Movie By Name

```
GET /movie/search?name=RRR
```

---

### Search Movie By Year

```
GET /movie/search?year=2022
```

---

### Add New Movie

```
POST /movie
```

Request Body:

```json
{
  "id": 51,
  "name": "Inception",
  "genre": "Sci-Fi",
  "rating": 9.0,
  "year": 2010,
  "language": "English"
}
```

---

### Delete Movie

```
DELETE /movie/{id}
```

Example:

```
DELETE /movie/5
```

---

## ⚙️ Running the Project

Clone the repository:

```
git clone https://github.com/Dikshantk29/moviehub-api.git
```

Navigate to the project folder:

```
cd moviehub-api
```

Run the application:

```
mvn spring-boot:run
```

Application will start on:

```
http://localhost:8080
```

---

## 👨‍💻 Author

**Dikshant Koriwar**

GitHub:
[https://github.com/Dikshantk29](https://github.com/Dikshantk29)

---

## ⭐ Future Improvements

* Add database support (MySQL / PostgreSQL)
* Add update movie API
* Add pagination
* Add Swagger API documentation
* Add validation and exception handling

---

