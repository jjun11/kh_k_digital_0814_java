package 열거타입2;

public class EnumType2 {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이사육사", DevType.MOBILE, Career.SENIOR, Gender.MALE);
        developer.devInfo();
    }
}
