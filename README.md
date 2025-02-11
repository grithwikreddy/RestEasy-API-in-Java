# RestEasy CRUD Operations in Spring

## Overview
This project implements CRUD (Create, Read, Update, Delete) operations using RestEasy in Spring. RestEasy is a JAX-RS implementation that provides RESTful web services support for Java applications. The API is designed to manage a collection of laptops.

## Features
- Implementation of CRUD operations using RestEasy
- Uses JAX-RS annotations for REST API development
- Supports HTTP methods: GET, POST, PUT, DELETE
- Lightweight and efficient RESTful services

## Technologies Used
- Java (Spring)
- RestEasy (JAX-RS)
- Maven (Build Tool)
- Tomcat (or any servlet container)

## Installation
### Prerequisites
Ensure you have the following installed:
- Java 17+
- Maven
- Tomcat (or any compatible servlet container)

### Steps to Run the Application
1. Clone the repository:
   ```sh
   git clone https://github.com/grithwikreddy/RestEasy-API-in-Java.git
   cd resteasy-crud
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```
3. Deploy the application to Tomcat:
   - Copy the generated WAR file (`resteasy-crud.war`) to the `webapps` folder of Tomcat.
   - Start Tomcat and access the application.

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/laptop` | Retrieve all laptops |
| GET    | `/laptop/{id}` | Retrieve a laptop by ID |
| POST   | `/laptop` | Create a new laptop |
| PUT    | `/laptop/{id}` | Update an existing laptop |
| DELETE | `/laptop/{id}` | Delete a laptop by ID |

## Example Requests
### Create a Laptop (POST)
```json
{
  "id": 1,
  "brand": "Dell",
  "model": "XPS 15",
  "price": 1500
}
```

### Update a Laptop (PUT)
```json
{
  "id": 1,
  "brand": "Apple",
  "model": "MacBook Pro",
  "price": 2000
}
```


