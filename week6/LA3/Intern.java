package week6.LA3;

public class Intern implements Employee{
    //declare field
    String id;
    String name;
    String email;
    int m;

    //create constructor
    public Intern(String id, String name, String email, int m) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.m = m;
    }

    //create override method with @Override
    //create method
    @Override
    public void work() {
        System.out.println(name + " is working as an intern for " + m + " months.");
    }

    @Override
    public void manageTeam() {

    }

    @Override
    public void writeCode() {

    }

    @Override
    public void extendInternship(int m_ext) {
        int ext =  m_ext + this.m;
        System.out.println(name + "'s internship has been extended to " + ext + " months.");
    }
}
