package 객체타입확인;

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(parent instanceof Child);
    }
}
class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {
    Child(String name) {
        super( "부모");
        this.name = name;
    }
}