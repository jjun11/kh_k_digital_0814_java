package 인스턴스필드;

public class InstanceField {
    public static void main(String[] args) {
        int val = 30; // 지역변수
        FieldTest fieldTest1 = new FieldTest();
        fieldTest1.instanceVal = 200;
        FieldTest fieldTest2 = new FieldTest();
        fieldTest2.instanceVal = 300;

        FieldTest.classVal = 1000;
    }
}
