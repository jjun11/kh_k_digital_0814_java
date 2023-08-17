package 연습문제;

import java.util.Scanner;

//세자리의 정수를 입력받아 가장 큰 수 출력
public class Question2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫번째 숫자 입력 : ");
//        int numA = sc.nextInt();
//        System.out.print("두번째 숫자 입력 : ");
//        int numB = sc.nextInt();
//        System.out.print("세번째 숫자 입력 : ");
//        int numC = sc.nextInt();
//        if (numA > numB && numA > numC) {
//            System.out.println("세 숫자 중 가장 큰 수는 " + numA + " 입니다.");
//        } else if (numB > numC) {
//            System.out.println("세 숫자 중 가장 큰 수는 " + numB + " 입니다.");
//        } else {
//            System.out.println("세 숫자 중 가장 큰 수는 " + numC + " 입니다.");
//        }까지 내 풀이
        int num; // 100의자리 정수 입력을 받기위한 변수
        int a, b, c; // 100, 10, 1의자리값을 담기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("100의자리 정수 입력 : ");
        num = sc.nextInt();
        a = num / 100; // 100으로 나눈 몫을 담음
        b = (num % 100) / 10; // 100으로 나눈 나머지를 다시 10으로 나누어서 담음
        c = num % 10; // 10으로 나눈 나머지를 담음
        if(a > b) {
            if (a > c) System.out.println(a);
            else System.out.println(c);
        } else {
            if (b > c) System.out.println(Math.max(a, c));
            else System.out.println(c);
        }
    }
}