package week15.LA3;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.registerStudent("2023001", "Kim Cheolsu");
        manager.registerStudent("2023002", "Lee Younghee");

        manager.enrollCourse("2023001", "Data Structures");
        manager.enrollCourse("2023001", "Operating Systems");
        manager.enrollCourse("2023001", "Data Structures"); // duplicate enrollment
        manager.enrollCourse("2023002", "Data Structures");

        manager.printAllEnrollmentInfo();
    }
}
