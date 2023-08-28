package 자동차만들기2;

public class Vehicle {
    int speed;
    int fuel;
    int oiltank;
    int seat;
    String carName;
    boolean isON = false;
    int money; // 총 비용
    int fuelNum; // 총 주유 횟수
    int time; // 총 이동 시간
    int movePeople; // 이동할 승객수
    int moveNum; // 이동 횟수



    int distance; // 이동 거리

    Vehicle(String carName) {
        this.carName = carName;
    }

    public void isON(boolean isON) { // 부가기능 On/Off
        this.isON = isON;
    }

    void moveNum(int movepeople) { // 이동 횟수
        moveNum = movepeople / seat; // 인원수 / 좌석
        if ((movepeople % seat) != 0) moveNum += 1; // 나머지 0 아니면 +1
    }

    void totalfuelNum(int distance) { // 총 주유 횟수
        fuelNum = (moveNum * distance) / (fuel * oiltank);
    }

    void totaltime(int distance) { // 총 이동 시간
        time = ((moveNum * distance) / speed) + 1; //정수값으로 반올림
    }

    void totalmoney() { // 총 비용
        money = (fuelNum * oiltank) * 2000;
    }

}

class SportsCar extends Vehicle {
    SportsCar(String name) {
        super(name);
        speed = 250;
        fuel = 8;
        oiltank = 30;
        seat = 2;

    }

    public void addON(boolean isON) {
        if (isON) speed = (int) (speed * 1.2);
    }
}

class Bus extends Vehicle {
    boolean addolitank;

    Bus(String name) {
        super(name);
        speed = 150;
        fuel = 5;
        oiltank = 100;
        seat = 20;
        addolitank = false;
    }

    int getOiltank(boolean isON) { // 부가 기능
        if (isON) oiltank += 30;
        return oiltank;
    }

}

class Car extends Vehicle {
    boolean isChangeSeat; // 트렁크 좌석으로 변경 (켜먼 +1)

    Car(String carName) { // 생성자 호출해서 기본 정보 입력
        super(carName); // 부모의 생성자 호출해서 값 대입
        speed = 200;
        fuel = 12;
        oiltank = 45;
        seat = 4;
    }

    void setChangeSeat(boolean isON) { // isON이 true면 호출, 부가기능
        if (isON) seat += 1; // 트렁크가 좌석으로 1개 변경
    }

    void getInfo() {
        System.out.println("=".repeat(6) + carName + "=".repeat(6));
        System.out.println("총 비용 : " + money + "원");
        System.out.println("총 주유 횟수 : " + fuelNum + "회");
        System.out.println("총 이동 시간 : " + time + "시간");

        System.out.println(isON);
        System.out.println(seat);
        System.out.println(fuel);
        System.out.println(speed);
        System.out.println(oiltank);
        System.out.println(money);

    }
}
