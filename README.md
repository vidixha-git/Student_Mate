# STUDENT-MATE

### Student Management System

STUDENT-MATE is a Java-based command-line application designed to manage student records efficiently. The project allows users to add, view, search, update, and delete student information through a simple menu-driven interface.

The project demonstrates important Java programming concepts such as Object-Oriented Programming, encapsulation, ArrayList, exception handling, constructors, methods, and file handling.

The application is designed to run completely through the command line without requiring a graphical user interface.

---

## 1. Project Objectives

The main objectives of STUDENT-MATE are:

* Add and manage student records.
* Store student details such as ID, name, course, marks, and attendance.
* Display all registered students.
* Search for a student using Student ID.
* Update existing student information.
* Delete student records.
* Calculate student grades based on marks.
* Demonstrate Object-Oriented Programming concepts.
* Handle invalid inputs and runtime errors.
* Demonstrate Java file handling for storing student data.

---

## 2. Functional Modules

### Module 1 — Student Registration

This module allows users to add new student records.

Main operations include:

* Enter Student ID
* Enter student name
* Enter course
* Enter marks
* Enter attendance
* Create and store student objects

---

### Module 2 — Student Record Management

This module manages existing student records.

Main operations include:

* View all students
* Search student by ID
* Update student details
* Delete student records

---

### Module 3 — Marks and Grade Management

This module processes student academic information.

Main operations include:

* Store student marks
* Calculate grades
* Display marks and grades
* Store attendance percentage

Grade calculation is performed according to the following criteria:

| Marks    | Grade |
| -------- | ----- |
| 90–100   | A+    |
| 80–89    | A     |
| 70–79    | B     |
| 60–69    | C     |
| 50–59    | D     |
| Below 50 | F     |

---

### Module 4 — File Handling and Validation

This module demonstrates data storage and error handling.

Main operations include:

* Save student data to a file
* Load student data from a file
* Handle invalid input
* Handle file-related errors
* Use custom exception handling

---

## 3. Java Concepts Demonstrated

The project demonstrates the following Java concepts:

* Classes and Objects
* Object-Oriented Programming
* Encapsulation
* Constructors
* Methods
* `this` keyword
* Getters and Setters
* ArrayList
* Packages
* Exception Handling
* Custom Exception Handling
* File Handling
* FileReader and FileWriter
* BufferedReader
* Command-Line Input/Output
* Conditional Statements
* Loops
* Switch Statements
* Data Validation

---

## 4. Project Structure

```text
STUDENT-MATE/
│
├── Main.java
├── Student.java
├── StudentManager.java
├── FileManager.java
├── ValidationException.java
├── students.txt
├── README.md
├── statement.md
└── .gitignore
```

All Java source files are kept in the same directory to make compilation and execution simple.

---

## 5. Prerequisites

Before running the project, make sure the following are installed:

* Java Development Kit (JDK) 8 or higher
* Git
* Command Prompt / Terminal

### Check Java Installation

Open a terminal and run:

```bash
java -version
```

and:

```bash
javac -version
```

If both commands display the installed Java version, the Java environment is ready.

---

## 6. Clone the Repository

Clone the project using:

```bash
git clone https://github.com/YOUR-USERNAME/STUDENT-MATE.git
```

Move into the project directory:

```bash
cd STUDENT-MATE
```

Replace `YOUR-USERNAME` with your GitHub username.

---

## 7. Compile the Project

Compile all Java files using:

```bash
javac Main.java Student.java StudentManager.java FileManager.java ValidationException.java
```

If there are no compilation errors, the project has been compiled successfully.

---

## 8. Run the Project

After successful compilation, run:

```bash
java Main
```

The application will start in the terminal and display the main menu.

The user can select different options according to the required operation.

---

## 9. Example Execution

A typical execution follows this general flow:

```text
Start Application
       ↓
Display Main Menu
       ↓
Select Operation
       ↓
Enter Student Details
       ↓
Add / Search / Update / Delete
       ↓
Calculate Grade
       ↓
Display Results
       ↓
Save Student Data
       ↓
Exit Application
```

### Example Menu

```text
======================================
        STUDENT-MATE
   Student Management System
======================================

----------- MAIN MENU -----------
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
---------------------------------
Enter your choice:
```

---

## 10. Error Handling and Validation

The application handles invalid inputs and runtime conditions.

Examples include:

* Invalid Student ID
* Invalid marks
* Invalid attendance
* Empty student information
* Student ID not found
* Invalid menu choice
* Invalid numeric input
* File reading errors
* File writing errors
* Runtime exceptions

The project also contains a custom exception class named:

```text
ValidationException
```

This class can be used to report invalid student information.

---

## 11. Testing

The following test cases can be used to verify the application.

| Test Case | Input / Condition                | Expected Result                          |
| --------- | -------------------------------- | ---------------------------------------- |
| TC01      | Valid student details            | Student is added successfully            |
| TC02      | View students                    | All available students are displayed     |
| TC03      | Existing Student ID              | Correct student information is displayed |
| TC04      | Non-existing Student ID          | Student not found message is displayed   |
| TC05      | Valid updated details            | Student information is updated           |
| TC06      | Existing Student ID for deletion | Student is deleted successfully          |
| TC07      | Invalid menu choice              | Appropriate error message is displayed   |
| TC08      | Invalid numeric input            | Input error is displayed                 |
| TC09      | Valid marks                      | Appropriate grade is calculated          |
| TC10      | Normal project execution         | Application runs successfully            |

---

## 12. Output and Data Storage

The project can store student information using a text file named:

```text
students.txt
```

The file contains student information in a simple comma-separated format.

Example:

```text
101,Riya Sharma,Java,85.0,92.0
102,Aman Verma,CSE,76.0,88.0
103,Neha Singh,Java,91.0,95.0
```

Java File I/O classes such as `FileWriter`, `FileReader`, and `BufferedReader` are used for file operations.

---

## 13. Command-Line Execution

STUDENT-MATE is designed to be executed entirely through the command line.

The complete execution process is:

```bash
git clone https://github.com/YOUR-USERNAME/STUDENT-MATE.git
cd STUDENT-MATE
javac Main.java Student.java StudentManager.java FileManager.java ValidationException.java
java Main
```

No graphical user interface is required to execute the basic application.

---

## 14. Non-Functional Requirements

### Performance

The application should perform student record operations efficiently for normal classroom-sized datasets.

### Reliability

The application should provide consistent results for valid student records and handle invalid inputs appropriately.

### Usability

The application provides simple menu options and clear command-line messages so that users can easily operate the system.

### Maintainability

The project uses separate Java classes for different responsibilities, making the code easier to understand and modify.

### Error Handling

The application handles invalid inputs, missing records, and file-related errors using Java exception handling.

### Portability

The project uses standard Java commands and can run on systems with a compatible Java Development Kit.

---

## 15. Technologies Used

**Programming Language:** Java

**Execution:** Command Line / Terminal

**Version Control:** Git and GitHub

**Data Storage:** Text File

**File Handling:** Java File I/O

**Core Concepts:** OOP, Encapsulation, Arra
