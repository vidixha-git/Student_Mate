```java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = FileManager.loadStudents();
    }

    // Add Student
    public void addStudent(Scanner sc) {

        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            // Check duplicate ID
            for (Student s : students) {
                if (s.getStudentId() == id) {
                    System.out.println("Student ID already exists.");
                    return;
                }
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            if (name.trim().isEmpty()) {
                throw new ValidationException("Name cannot be empty.");
            }

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            if (course.trim().isEmpty()) {
                throw new ValidationException("Course cannot be empty.");
            }

            System.out.print("Enter Marks: ");
            double marks = Double.parseDouble(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new ValidationException(
                        "Marks must be between 0 and 100."
                );
            }

            System.out.print("Enter Attendance (%): ");
            double attendance = Double.parseDouble(sc.nextLine());

            if (attendance < 0 || attendance > 100) {
                throw new ValidationException(
                        "Attendance must be between 0 and 100."
                );
            }

            Student student = new Student(
                    id,
                    name,
                    course,
                    marks,
                    attendance
            );

            students.add(student);

            FileManager.saveStudents(students);

            System.out.println("Student added successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (ValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }

    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n========== ALL STUDENTS ==========");

        for (Student s : students) {
            s.displayStudent();
        }
    }

    // Search Student
    public void searchStudent(Scanner sc) {

        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            for (Student s : students) {

                if (s.getStudentId() == id) {
                    System.out.println("\nStudent Found:");
                    s.displayStudent();
                    return;
                }
            }

            System.out.println("Student not found.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid Student ID.");
        }
    }

    // Update Student
    public void updateStudent(Scanner sc) {

        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            for (Student s : students) {

                if (s.getStudentId() == id) {

                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();

                    if (name.trim().isEmpty()) {
                        throw new ValidationException(
                                "Name cannot be empty."
                        );
                    }

                    System.out.print("Enter New Course: ");
                    String course = sc.nextLine();

                    if (course.trim().isEmpty()) {
                        throw new ValidationException(
                                "Course cannot be empty."
                        );
                    }

                    System.out.print("Enter New Marks: ");
                    double marks = Double.parseDouble(sc.nextLine());

                    if (marks < 0 || marks > 100) {
                        throw new ValidationException(
                                "Marks must be between 0 and 100."
                        );
                    }

                    System.out.print("Enter New Attendance (%): ");
                    double attendance =
                            Double.parseDouble(sc.nextLine());

                    if (attendance < 0 || attendance > 100) {
                        throw new ValidationException(
                                "Attendance must be between 0 and 100."
                        );
                    }

                    s.setName(name);
                    s.setCourse(course);
                    s.setMarks(marks);
                    s.setAttendance(attendance);

                    FileManager.saveStudents(students);

                    System.out.println(
                            "Student updated successfully."
                    );

                    return;
                }
            }

            System.out.println("Student not found.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (ValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }

    // Delete Student
    public void deleteStudent(Scanner sc) {

        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            for (Student s : students) {

                if (s.getStudentId() == id) {

                    students.remove(s);

                    FileManager.saveStudents(students);

                    System.out.println(
                            "Student deleted successfully."
                    );

                    return;
                }
            }

            System.out.println("Student not found.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid Student ID.");
        }
    }
}
```
