# University-Management-System

This project is a University Management System implemented in Java. It allows users to manage student admissions, migrations, and display student details. The system also includes information about hostels and departments.

## Features

- **Admit New Student**: Add a new student by entering all required details.
- **Migrate a Student**: Modify the hostel details of an existing student based on their registration number.
- **Display Student Details**: Search for a student by registration number and display their details.

## Classes and Interfaces

### `Student`
- Inherits from `Hostel` and implements `Department`.
- Stores student details such as name, registration number, elective subject, and average marks.
- Methods:
  - `getStudentDetails()`: Returns a string with all student details.
  - `printDepartmentDetails()`: Prints department details.

### `Hostel`
- Stores hostel details such as name, location, and number of rooms.
- Methods:
  - `setHostelDetails(String name, String location, int rooms)`: Sets the hostel details.
  - `printHostelDetails()`: Returns a string with hostel details.

### `Department`
- Interface with department details.
- Methods:
  - `printDepartmentDetails()`: Prints department details.

### `UniversityDriverMenu`
- Manages the menu options for admitting, migrating, and displaying student details.
- Methods:
  - `admitNewStudent()`: Admits a new student.
  - `migrateStudent()`: Migrates a student to a new hostel.
  - `displayStudentDetails()`: Displays details of a student.

### `Main`
- Entry point of the application.
- Runs the menu to interact with the user.

## How to Run

1. Compile the Java files:
   ```sh
   javac src/*.java
## License
   This `README.md` provides an overview of the project, its features, classes, and instructions on how to run it. Adjust the content as needed to fit your specific project details.
