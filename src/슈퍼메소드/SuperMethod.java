package 슈퍼메소드;
// super : 부모의 필드나 메소드를   접근할 때 사용
// super() : 부모의  생성자를 호출
public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

class Parent {
    int a;
    //Parent() {a = 10;}
    Parent(int n) { a = n;}
    }

class Child extends Parent {
    int b;
    Child() {
        super(100);
        b = 20;
    }
    void display() {
        System.out.println(a); // 자식 필드 접근
        System.out.println(b); // 원래 this 숨어있었음
    }
}