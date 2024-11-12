# JPA Primary Key Generation Project

## Description
This project demonstrates the use of the `@GeneratedValue` annotation in JPA to define primary key generation strategies, showcasing different `GenerationType` options: `AUTO`, `IDENTITY`, `SEQUENCE`, and `TABLE`.

## Primary Key Generation Strategies
1. **GenerationType.AUTO**: Automatically selects the generation strategy based on the database. Oracle uses Sequence; MySQL uses Table.
2. **GenerationType.IDENTITY**: Relies on the database to generate unique identifiers, commonly used in MySQL with auto-increment.
3. **GenerationType.SEQUENCE**: Uses a sequence object in the database, mainly supported by Oracle.
4. **GenerationType.TABLE**: Creates a specific table to manage primary keys, suitable for databases without sequence support like MySQL.

## Technologies Used
- Java
- JPA (Java Persistence API)
- Hibernate ORM
- MySQL/Oracle

## Project Structure
- **Entity Classes**: Demonstrates primary key generation using `@GeneratedValue` and different `GenerationType` strategies.
- **DAO Layer**: Provides CRUD operations using these primary key generation techniques.

## Usage
Clone the repository:
```bash
git clone https://github.com/Shubham-Patil30/JPA-Hibernate-PrimaryKey-Generation.git
