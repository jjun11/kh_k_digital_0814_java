package 전자레인지;

import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        //강사님풀이
        int t, a, b, c; // 요리시간을 초로 입력, a= 5분, b = 1분, c = 10초
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        if(t % 10 != 0) {System.out.print("-1");
        return;}
    a = t / 300; // 5분 버튼에 대한 몫
        b = t % 300 / 60; // 1분 버튼에 대한 몫
        c = t % 300 % 60 / 10;
        System.out.printf("%d %d %d\n", a,b,c);}
//        System.out.print(a +" "+ b +" "+  c);}
    //내풀이
//        Scanner sc = new Scanner(System.in);
//        Microwave range = new Microwave();
//        System.out.println("요리시간을 입력하시오 :");
//        int time = sc.nextInt();
//        if(1<= time && time <=10000 ){
//        if(time%300%60%10 > 0){
//            System.out.print("-1 ");
//        }else{
//        System.out.print(time/300+" ");
//        System.out.print(time%300/60+" ");
//        System.out.print(time%300%60/10+" ");
//        }}else{
//                System.out.print("입력 가능한 범위가 아닙니다.");
//            }}
}
//        System.out.println(time%300%60%10);
//    if (time % range.a )


