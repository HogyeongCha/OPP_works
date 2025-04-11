package sandbox;

class Parent {
    Parent(String name) {
        System.out.println("Parent Constructor: " + name);
    }
}

class Child extends Parent {
    Child(String name) {
        super(name); // 부모 클래스의 생성자 호출
        System.out.println("Child Constructor: " + name);
    }
}

public class box9 {
    public static void main(String[] args) {
        Child child = new Child("John");
    }
}
