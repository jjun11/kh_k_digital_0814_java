package 실험용;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // 키보드로 입력을 받기 위해서
//        System.out.print(" ~ "); // 키보드로 입력받을 값을 설명하기 위해서
//        int age = sc.nextInt(); // int(자료형-숫자-정수형) age(변수) 에 키보드로 입력한 값을 대입한다
        //sc.nextLine(); // 버퍼 비우기 - 입력칸이 중복될때 사용

        //String 변수 = Integer.toString(num, 2) - 문자형 변수에 num(숫자)를 2진수로 변환한다

        int a = 8;
        if (a > 10) {
            System.out.println("양수 입니다.");
        } else {
            System.out.println("음수 입니다.");


        }
    }
}