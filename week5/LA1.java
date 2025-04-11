package week5;

public class LA1 extends Student {
    public static void main(String[] args) {
        String[] studentNames = {"Mike", "Tom", "Owen", "Kate", "Jane"};
        int[] studentAges = {15, 16, 17, 10, 16};
        int[] studentGrades = {90, 80, 100, 80, 50};

        Student[] students = new Student[studentNames.length];

        for (int i = 0; i < studentNames.length; i++) {
            students[i] = new Student();
            students[i].name = studentNames[i];
            students[i].age = studentAges[i];
            students[i].grade = studentGrades[i];
        }

        for (Student student : students) {
            System.out.println("Name:" + student.name + " Age:" + student.age + " Score:" + student.grade);
        }
    }
}
