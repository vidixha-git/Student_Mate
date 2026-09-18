```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice = 0;

        System.out.println("======================================");
        System.out.println("          STUDENT-MATE");
        System.out.println("     Student Management System");
        System.out.println("======================================");

        do {

            System.out.println("\n----------- MAIN MENU -----------");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice: ");

            try {

                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        manager.addStudent(sc);
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        manager.searchStudent(sc);
                        break;

                    case 4:
                        manager.updateStudent(sc);
                        break;

                    case 5:
                        manager.deleteStudent(sc);
                        break;

                    case 6:
                        System.out.println(
                                "\nThank you for using STUDENT-MATE!"
                        );
                        break;

                    default:
                        System.out.println(
                                "Invalid choice. Please select 1 to 6."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );
            }

        } while (choice != 6);

        sc.close();
    }
}
```
