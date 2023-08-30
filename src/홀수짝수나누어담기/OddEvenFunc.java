package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFunc {

    //배열 3개 만들기
//    int[] input = new int[7]; // 7칸 입력받을 수 배열 생성
//    int[] even = new int[7]; // 짝수 7 칸짜리 배열 생성
//    int[] odd = new int[7]; // 홀수 7칸짜리 배열 생성
//    int eIdx = 0; // 짝수에 대한 배열 인덱스
//    int oIdx = 0; // 홀수에 대한 배열 인덱스
    List<Integer> input = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    // 7개의 정수를 입력받아서 배열에 넣기
    public void inputFunc() {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 7 ; i ++) {
            input.add(sc.nextInt());
        }
    }
    public void oddEvenCalc() {
    for(Integer e : input) {
        if(e % 2 == 0) even.add(e);
        else odd.add(e);
        }
    }
    public void oddEvenOutput() {
        System.out.print("홀수 : ");
        for(Integer e : odd)System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even)System.out.print(e + " ");


    }
}
//    public void inputFunc() {
//        System.out.print("입력 : ");
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0 ; i < 7 ; i ++) {
//            input [i] = sc.nextInt();
//        }
//    }
//    public void oddEvenCalc() {
//        for (int i = 0; i < 7; i++) {
//            if (input[i] % 2 == 0) even[eIdx++] = input[i];
//            else odd[oIdx++] = input[i];
//        }
//    }
//    public void oddEvenOutput() {
//        System.out.print("홀수 : ");
//        for(int i = 0; i < 7; i++) System.out.printf("%2d", odd[i]);
//        System.out.println();
//        System.out.print("짝수 : ");
//        for(int i = 0; i < 7; i++) System.out.printf("%2d", even[i]);
//
//
//    }
//}
