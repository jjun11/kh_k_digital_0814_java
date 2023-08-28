package 자동차만들기;

import 시스템출력.SystemOut;

import javax.sql.rowset.serial.SerialDatalink;
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle = null;
        int[] location = {0, 400, 200, 150, 300};

        Scanner sc = new Scanner(System.in);
        System.out.print("이동지역을 선택하세요. [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int area = sc.nextInt();
        System.out.print("승객 수를 입력하세요. : ");
        int personCnt = sc.nextInt();
        System.out.print("이동할 차량을 선택하세요. [1]스포츠카 [2]승용차 [3]버스 : " );
        int selectCar = sc.nextInt();
        switch (selectCar){
            case 1 : vehicle = new SportsCar("스포츠카");break;
            case 2 : vehicle = new Car("승용차");break;
            case 3 : vehicle = new Bus("버스");break;
            default:
        }
System.out.print("부가기능을 사용하시겠습니까? [1]ON [2]OFF : ");
        int selectON = sc.nextInt();
        if(selectON == 1) {
            vehicle.addON(true);
        }else if(selectON == 2){
            vehicle.addON(false);
        }
        //vehicle.result(location[area],personCnt);
    }
}
