package 자동차만들기2;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("");
        Car car = new Car("승용차");
        Bus bus = new Bus("버스");
        SportsCar sportsCar = new SportsCar("스포츠카");

        int distance = 0; // 거리
        int fuelPrice = 2000; // 기름값

        Scanner sc = new Scanner(System.in);
        System.out.print("이동지역을 선택하세요. [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int area = sc.nextInt();
        switch (area) {
            case 1 : distance = 400; break;
            case 2 : distance = 200; break;
            case 3 : distance = 150; break;
            case 4 : distance = 300; break;
        }

        while(true) {
            System.out.print("승객 수를 입력하세요. : ");
            int personCnt = sc.nextInt();
            if (personCnt > 0 && personCnt < 101) break;
        }

        System.out.print("이동할 차량을 선택하세요. [1]스포츠카 [2]승용차 [3]버스 : " );
        int selectCar = sc.nextInt();
        switch(selectCar) {
            case 1 : vehicle = new SportsCar("스포츠카"); break;
            case 2 : vehicle = new Car("승용차"); break;
            case 3 : vehicle = new Bus("버스"); break;
        }

        System.out.print("부가 기능 [1] ON [2] OFF : ");
        int addFunc = sc.nextInt();
        if(addFunc == 1) {
            sportsCar.addON(true);
            bus.getOiltank(true);
            car.setChangeSeat(true);
        } else {
            sportsCar.addON(false);
            bus.getOiltank(false);
            car.setChangeSeat(false);
        }
        car.getInfo();

    }
}
