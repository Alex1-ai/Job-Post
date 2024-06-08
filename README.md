
![Screenshot (143)](https://github.com/Alex1-ai/Job-Post/assets/78540958/ecfa509b-27e6-4903-93b8-83c2d45d2683)

# Job Post API

A simple MVC REST job post API built with Java Spring, Spring Boot, and MongoDB. This project utilizes MongoDB Atlas Search for full-text search capabilities and aggregation for data analysis.

## Features

- CRUD operations for job posts.
- Full-text search on job posts using MongoDB Atlas Search.
- Aggregation pipelines for data analysis.

## Prerequisites

- Java 17
- Maven 3.6+
- MongoDB Atlas instance
- MongoDB Atlas Search configured
- MongoDB Atlas Aggregation configured

## Getting Started

### Clone the repository

```bash
git clone https://github.com/your-username/job-post-api.git
cd job-post-api
```

### Configure MongoDB Atlas

1. Set up a MongoDB Atlas cluster.
2. Enable Atlas Search and configure an index for the job posts collection.
3. Set up Aggregation pipelines for data analysis if needed.

### Configure Application Properties

Set your MongoDB Atlas connection string in the `application.properties` file located in `src/main/resources`.

```properties
# MongoDB Atlas configuration
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/<database>?retryWrites=true&w=majority
```

### Install Dependencies

Run the following command to install all dependencies:

```bash
mvn clean install
```

### Run the Application

Use the following command to run the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will start and be accessible at `http://localhost:8080`.

## API Endpoints

### Get All Job Posts

```http
GET /api/jobs
```

### Get a Job Post by ID

```http
GET /api/jobs/{id}
```

### Create a New Job Post

```http
POST /api/jobs
Content-Type: application/json

{
  "title": "Software Engineer",
  "description": "We are looking for a Software Engineer...",
  "location": "San Francisco, CA"
}
```

### Update a Job Post

```http
PUT /api/jobs/{id}
Content-Type: application/json

{
  "title": "Updated Title",
  "description": "Updated description...",
  "location": "Updated location"
}
```

### Delete a Job Post

```http
DELETE /api/jobs/{id}
```

### Search Job Posts

```http
GET /api/jobs/search?query=software
```

## Technologies Used

- Java 17
- Spring Boot
- MongoDB Atlas
- MongoDB Atlas Search
- MongoDB Atlas Aggregation
- Maven

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com
│   │       └── chidi
│   │           └── joblisting
│   │               ├── controller
│   │               ├── model
│   │               ├── repository
│   │               ├── service
│   │               └── JoblistingApplication.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com
            └── chidi
                └── joblisting
```

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

