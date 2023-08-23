package PC방알바;

import java.util.Scanner;

public class PcRoomEx {
    public static void main(String[] args) {
        //강사님답안
        int[] pcRoom = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 인원수 입력
        for(int i = 0; i < num; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum - 1] == 1)rejectCnt++;
            else pcRoom[seatNum-1] = 1;
        }
        System.out.println(rejectCnt);
        //노션답안     int[] seat = new int[100];
//        int[] pcRoom = new int[100];
//        int cnt = 0, seatNum;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i++) {
//            seatNum = sc.nextInt();
//            if(pcRoom[seatNum-1] == 1) cnt++;
//            else pcRoom[seatNum-1] = 1;
//        }
//        System.out.print("거절당한 손님 수 : ");
//        System.out.println(cnt);
    }
}