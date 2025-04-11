package week6.LA3;

public class Developer implements Employee {
    //declare field
    String id;
    String name;
    String email;
    String language;

    //create constructor
    public Developer(String id, String name, String email, String language) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.language = language;
    }

    //create override method with @Override
    //create method
    @Override
    public void work() {
        System.out.println(name + " is coding in " + language);
    }

    @Override
    public void manageTeam() {

    }

    @Override
    public void writeCode() {
        System.out.println(name + " is writing code.");
    }

    @Override
    public void extendInternship(int i) {

    }
}
