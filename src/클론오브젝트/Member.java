package 클론오브젝트;

public class Member implements Cloneable{
    String id;
    String name;
    String password;
    int age;
    boolean adult;
    void viewInfo() {
        System.out.println("ID " + id);
        System.out.println("이름" + name);
        System.out.println("비밀번호" + password);
        System.out.println("나이" + age);
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메소드는 Object 클래스 타입이므로 형변환
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cloned;
    }
}
