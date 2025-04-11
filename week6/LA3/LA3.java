package week6.LA3;

import java.util.Scanner;

public class LA3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String id = s.nextLine();
        String email = s.nextLine();
// 엘리스가 매니저, 밥이 개발자, 찰리가 인턴
        Manager manager = new Manager("001", name, email);
        manager.work();
        manager.manageTeam();

        name = s.nextLine();
        id = s.nextLine();
        email = s.nextLine();

        Developer developer = new Developer(id, name, email, "Java");
        developer.work();
        developer.writeCode();
        
        name = s.nextLine();
        id = s.nextLine();
        email = s.nextLine();

        Intern intern = new Intern(id, name, email, 6);
        intern.work();
        intern.extendInternship(3);
    }
}