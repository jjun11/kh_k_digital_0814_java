package 자동차만들기;

public class Vehicle {
    int speed; // 스피드값 저장
    int fuel; // 연비값 저장
    int oiltank; // 연료탱크값 저장
    int seat; // 좌석값 저장
    String carName; // 차량이름 저장
    boolean addON; // 부가기능 저장


    Vehicle(String name) {
        this.carName = name;


    }

    public void addON(boolean onOff) {
    }
}

