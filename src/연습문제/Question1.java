package 연습문제;
// 시험 성적을 입력받아 90~100점은 A, 80~89점은 B, 70~79점은 C, 60~69점은D, 나머지는 F를 출력하는 프로그램
// 0~100 사이가 아니면 성적이 잘못 입력되었다고 출력
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("점수를 입력하세요.");
//        int score = sc.nextInt();
//        if(score > 100 || score < 0) {
//            System.out.println("점수를 잘못 입력하셨습니다.");
//        } else if(score >= 90) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else if (score >= 60) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        } // 까지 내 풀이
        System.out.print("성적을 입력하세요.");
        int score = sc.nextInt();
        if(score >= 0 && score <= 100) {
            if(score >= 90) System.out.println("A");
            else if(score >= 80) System.out.println("B");
            else if(score >= 70) System.out.println("C");
            else if(score >= 60) System.out.println("D");
            else System.out.println("F");
        } else {
            System.out.println("성적을 잘 못 입력하셨습니다.");
            //정답
        }
    }
}
