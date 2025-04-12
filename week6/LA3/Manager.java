package week6.LA3;

public class Manager implements Employee {
    //declare field
    String id;
    String name;
    String email;

    //create constructor
    public Manager(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //create override method with @Override
    //create method
    @Override
    public void work() {
        System.out.println(name + " is managing.");
    }

    public void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}
