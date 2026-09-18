```java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Scanner sc) {

        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = Double.parseDouble(sc.nextLine());

            System.out.print("Enter Attendance (%): ");
            double attendance = Double.parseDouble(sc.nextLine());

            Student s = new Student(id, name, course, marks, attendance);
            students.add(s);

            System.out.println("Student added successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    // View Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.displayStudent();
        }
    }

    // Search Student
    public void searchStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        boolean found = false;

        for (Student s : students) {

            if (s.getStudentId() == id) {
                s.displayStudent();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Update Student
    public void updateStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student s : students) {

            if (s.getStudentId() == id) {

                System.out.print("Enter New Name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter New Course: ");
                s.setCourse(sc.nextLine());

                System.out.print("Enter New Marks: ");
                s.setMarks(Double.parseDouble(sc.nextLine()));

                System.out.print("Enter New Attendance: ");
                s.setAttendance(Double.parseDouble(sc.nextLine()));

                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student s : students) {

            if (s.getStudentId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
```
