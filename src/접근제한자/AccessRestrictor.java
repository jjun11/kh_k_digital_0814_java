package 접근제한자;

public class AccessRestrictor {
    public static void main(String[] args) {
//        Restrictor restrictor = new Restrictor();
//        restrictor.daegu(); // default 메소드에 대한 접근, 같은 패키지 내에서만 접근 가능
//        restrictor.busan(); // protected 메소드에 대한 접근, 같은 패키지이거나 상속관계가 있으면 접근 가능
//        restrictor.seoul();// public 메소드에 대한 접근
//        restrictor.incheon(); // private 메소드에 대한 접근 ( 같은 클래스 내부에 아니기 때문에 접근 허용이 안됨)}

        Child child = new Child("엔지니어");
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());

    }
}
class Child extends Parent {
    String jobs;
    public Child(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
}
    public String getAddr() {
        return addr;
    }
}
