# Knotes

Knotes is a simple and elegant to-do list application built with Kotlin, Vaadin, and PostgreSQL. It allows you to manage your tasks effectively with a clean and intuitive user interface.

## Features

- **Create, Read, Update, and Delete (CRUD) to-do items:** Easily manage your tasks.
- **Search:** Quickly find the tasks you are looking for.
- **Assign users to tasks:** Delegate tasks to team members.
- **Set due dates:** Keep track of your deadlines.

# Development Setup

Follow these steps to set up the development environment.

### 1. Install Frontend Dependencies

This project uses `bun` to manage frontend dependencies.

```bash
bun install
```

### 2. Build Vaadin Frontend

This command builds the Vaadin frontend.

```bash
./gradlew clean vaadinPrepareFrontend
```

### 3. Run PostgreSQL Database

The application requires a PostgreSQL database. A Docker Compose file is provided for convenience.

```bash
docker compose -f src/main/docker/docker-compose.yaml up -d
```

### 4. Create Database Schema

Execute the SQL script to create the necessary database schema.

`/src/main/db/schema_creation.sql`

### 5. (Optional) Insert Sample Data

To populate the application with some sample data, execute this SQL script.

`/src/main/db/data_generation.sql`

# Usage

Once the development setup is complete, you can run the application in one of the following ways:

### From the Command Line

```bash
./gradlew run
```

### From IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Navigate to `/src/main/kotlin/com/knotes/Main.kt`.
3. Run the `main()` function.

After starting the application, you can access it by navigating to `http://localhost:8080` in your web browser
