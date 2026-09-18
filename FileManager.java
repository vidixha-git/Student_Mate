```java
import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "students.txt";

    // Save students to file
    public static void saveStudents(ArrayList<Student> students) {

        try {
            FileWriter writer = new FileWriter(FILE_NAME);

            for (Student s : students) {
                writer.write(
                    s.getStudentId() + "," +
                    s.getName() + "," +
                    s.getCourse() + "," +
                    s.getMarks() + "," +
                    s.getAttendance() + "\n"
                );
            }

            writer.close();

            System.out.println("Student data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving student data.");
        }
    }

    // Load students from file
    public static ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return students;
        }

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(FILE_NAME)
            );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 5) {

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String course = data[2];
                    double marks = Double.parseDouble(data[3]);
                    double attendance = Double.parseDouble(data[4]);

                    Student student = new Student(
                            id,
                            name,
                            course,
                            marks,
                            attendance
                    );

                    students.add(student);
                }
            }

            reader.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error while loading student data.");
        }

        return students;
    }
}
```
