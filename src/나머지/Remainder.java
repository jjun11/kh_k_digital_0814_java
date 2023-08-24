package 나머지;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            //강사님풀이
//        int[] arr = new int[42];
//        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
//        int input; // 입력받은 값
//        System.out.print("10개의 수 입력 : ");
//        for(int i = 0; i < 10; i++) {
//            input = sc.nextInt();
//            arr[input % 42] = 1; // 입력받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
//        }
//        for(int val : arr) cnt += val;
//        System.out.println(cnt);

//          내풀이
//          42로 나눈 나머지를 저장할 배열
            int[] remain = new int[42];

            // 10개의 숫자를 입력받는다
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                remain[num % 42] = 1;
            }

            // 서로 다른 값의 개수를 구한다
            int count = 0;
            for (int i = 0; i < 42; i++) {
                if (remain[i] > 0) {
                    count++;
                }
            }

            // 결과를 출력한다
            System.out.println(count);
        }
    }


