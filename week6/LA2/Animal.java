package week6.LA2;

public abstract class Animal {
    private String name;
    private Boolean isBig;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
    public void setIsBig(Boolean isBig){
        this.isBig = isBig;
    }

    public Boolean getIsBig(){
        return this.isBig;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println(name + " is Moving...");
    }
}

