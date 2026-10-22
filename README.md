# TaskFlow API

A simple task management REST API built with Spring Boot for the Module 3 assignment. Tasks are stored in memory, so all data resets when the app restarts.

## Requirements

- Java 21
- Maven
- An OpenAI API key

## Setup

The app needs the `OPENAI_API_KEY` environment variable to start, so this line has been added to the `application.properties` file:

    spring.ai.openai.api-key=${OPENAI_API_KEY}

To set your key, add this line to `~/.bashrc`, then restart the terminal:

    export OPENAI_API_KEY=your-key-here

## Run

    mvn spring-boot:run

The API runs at `http://localhost:8080`.

## Endpoints

| Method | Path | Description |
| --- | --- | --- |
| GET | /api/tasks | Get all tasks |
| GET | /api/tasks/{id} | Get one task |
| POST | /api/tasks | Create a task (returns 201) |
| PUT | /api/tasks/{id} | Update a task |
| DELETE | /api/tasks/{id} | Delete a task |
| PUT | /api/tasks/{id}/complete | Mark a task as complete |
| GET | /api/tasks/summary | AI summary of pending and completed tasks |

Requests for a missing id return 404.

## Example request body

    {
      "title": "Buy groceries",
      "description": "Milk and eggs",
      "isCompleted": false
    }
