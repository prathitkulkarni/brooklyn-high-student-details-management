# Brooklyn High Student Detail Management App

## Description
This is a simple REST API application built using Spring Boot. It uses `CrudRepository` for basic CRUD operations and connects to a MySQL database to manage and store student details for Brooklyn High School.

## Features
- Add new students
- Update existing student details
- Retrieve student details by ID
- Retrieve all students
- Delete students

## Technologies
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Setup and Installation

### Prerequisites
- Java 17 or later
- MySQL database
- Maven

### Steps to Set Up

1. **Clone the Repository**
    ```bash
    git clone https: https://github.com/prathitkulkarni/brooklyn-high-student-details-management.git
    ```

2. **Navigate to the Project Directory**
    ```bash
    cd brooklyn-high-student-api
    ```

3. **Configure MySQL Database**
    - Create a new database in MySQL.
    - Update the `application.properties` file in `src/main/resources` with your database details:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
      spring.datasource.username=your_database_username
      spring.datasource.password=your_database_password
      spring.jpa.hibernate.ddl-auto=update
      ```

4. **Build the Project**
    ```bash
    mvn clean install
    ```

5. **Run the Application**
    ```bash
    mvn spring-boot:run
    ```

6. **Access the API**
    - **Add Student**: `POST /student`
    - **Update Student**: `PUT /student/{id}`
    - **Find Student by ID**: `GET /student/{id}`
    - **Find All Students**: `GET /students`
    - **Delete Student**: `DELETE /student/{id}`

## Example JSON Data

### Add or Update Student
```json
{
    "name": "John Doe",
    "standard": 10,
    "marksOne": 85,
    "marksTwo": 90,
    "marksThree": 78,
    "marksFour": 88,
    "marksFive": 92,
    "marksSix": 80
}
