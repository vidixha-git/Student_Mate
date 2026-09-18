```java
package com.studentmate;

public class Student {

    private int studentId;
    private String name;
    private String course;
    private double marks;
    private double attendance;

    // Constructor
    public Student(int studentId, String name, String course,
                   double marks, double attendance) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.attendance = attendance;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public double getAttendance() {
        return attendance;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    // Calculate Grade
    public String getGrade() {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Display student details
    public void displayStudent() {

        System.out.println("--------------------------------------");
        System.out.println("Student ID  : " + studentId);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + getGrade());
        System.out.println("Attendance  : " + attendance + "%");
        System.out.println("--------------------------------------");
    }
}
```
