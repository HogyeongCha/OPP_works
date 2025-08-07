package week15.LA3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StudentManager {
    private ArrayList<Student> studentList = new ArrayList<>();
    private HashMap<String, Student> studentMap = new HashMap<>();
    private HashMap<Student, HashSet<String>> enrollmentMap = new HashMap<>();

    public void registerStudent(String studentId, String name) {
        if (!studentMap.containsKey(studentId)) {
            Student newStudent = new Student(studentId, name);
            studentList.add(newStudent);
            studentMap.put(studentId, newStudent);
            enrollmentMap.put(newStudent, new HashSet<>()); // 수강 과목 리스트 초기화
            System.out.println("[Student Registered] " + newStudent);
        } else {
            System.out.println("[Already Registered] Student with ID " + studentId + " already exists.");
        }
    }

    public void enrollCourse(String studentId, String courseName) {
        Student student = studentMap.get(studentId);

        if (student != null) {
            HashSet<String> courses = enrollmentMap.get(student);
            if (courses.add(courseName)) {
                System.out.println("[Enrollment Successful] " + student.getName() + " -> " + courseName);
            } else {
                System.out.println("[Already Enrolled] " + student.getName() + " -> " + courseName);
            }
        } else {
            System.out.println("[Error] Student with ID " + studentId + " not found.");
        }
    }

    public void printAllEnrollmentInfo() {
        System.out.println("\n===== All Enrollment Information =====");
        for (Student student : studentList) {
            HashSet<String> courses = enrollmentMap.get(student);
            System.out.println(student + ": " + courses);
        }
    }
}