package org.exercises.service;


import org.exercises.model.Student;



import java.util.*;

public class StudentService {
    public void addStudent(List<Student> allStudents, Student student) {
        allStudents.add(student);
        System.out.println("Added: " + student);
    }

    public void showStudentList(List<Student> allStudents) {
        if (allStudents.isEmpty()) {
            System.out.println("Student list is empty");
            return;
        }
        System.out.println("==Student List==");
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }

    public List<Student> findStudentByName(List<Student> allStudents, String name) {
        List<Student> foundStudent = new ArrayList<>();
        for (Student student : allStudents) {
            if (student.getName().equalsIgnoreCase(name)) {
                foundStudent.add(student);
            }
        }
        System.out.println(foundStudent.isEmpty() ? "Students not found" : ("Students named: " + name));
        showStudentList(foundStudent);
        return foundStudent;
    }

    public double calculateAvgGrade(List<Student> allStudents) {
        if (allStudents.isEmpty()){
            System.out.println("Student list empty");
            return 0.0;
        }
        double sumGrade = 0.0;
        for (Student student : allStudents) {
            sumGrade += student.getAverageGrade();
        }
        double avgGrade = sumGrade / allStudents.size();
        System.out.printf("Average grade: %.2f\n", avgGrade);
        return avgGrade;
    }
}
