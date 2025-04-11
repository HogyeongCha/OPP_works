package sandbox;

class Parent1 {
    void display() {
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent1 {
    @Override
    void display() {
        super.display(); // 부모 클래스의 display() 호출
        System.out.println("Child Method");
    }
}

public class box10 {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.display();
    }
}
