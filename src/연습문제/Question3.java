package 연습문제;
//행사 안내 메일 발송하기
//1. 사용자로부터 이름, 제목, 일시, 시간 정보를 입력받습니다.
//2. 입력된 일시의 월을 추출하여 해당하는 계절을 판단합니다. (20230314)
//3. 계절에 따라 적절한 인사말과 입력된 일정 정보를 출력합니다.

import java.util.Scanner;

//프로그램은 다음과 같은 방식으로 동작해야 합니다.
//
//- 1월부터 12월까지의 월 정보를 입력 받습니다.
//- 입력된 월에 따라 다음과 같은 계절 정보를 출력합니다.
//    - 12월, 1월, 2월 → "한파의 연속인 1월 입니다."
//    - 3월 → "봄의 기운이 느껴지는 3월 입니다."
//    - 4월 → "새싹이 피어나는 4월 입니다."
//    - 5월 → "계절의 여왕 5월 입니다."
//    - 6월 → "활동하기 좋은 6월 입니다."
//    - 7월 → "휴가가 기다려지는 7월 입니다."
//    - 8월 → "무더운 8월 입니다."
//    - 9월 → "선선한 9월 입니다."
//    - 10월 → "천고마비의 계절 10월 입니다."
//    - 11월 → "쓸쓸한 늦가을 11월 입니다."
//- 입력된 이름, 제목, 일시, 시간 정보와 계절 정보를 이용하여 다음과 같은 형식으로 일정 정보를 출력합니다.[이름]님.
//[계절 정보]
//아래와 일정으로 [제목]를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.
//
//===== 행사 안내 =====
//행사 안내 : [제목]
//일시 : [년]년 [월]월 [일]일
//시간 : [시간]시
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("날짜 : ");
        String date = sc.nextLine();
        System.out.print("시간 : ");
        String time = sc.nextLine();

        String month = date.substring(4,6);
        String greeting="";
        switch (month) {
            case "01" : greeting = "한파의 연속인 1월 입니다."; break;
            case "02" : greeting = "한파의 연속인 2월 입니다."; break;
            case "03" : greeting = "봄의 기운이 느껴지는 3월 입니다."; break;
            case "04" : greeting = "새싹이 피어나는 4월 입니다."; break;
            case "05" : greeting = "계절의 여왕 5월 입니다."; break;
            case "06" : greeting = "활동하기 좋은 6월 입니다."; break;
            case "07" : greeting = "휴가가 기다려지는 7월 입니다."; break;
            case "08" : greeting = "무더운 8월 입니다."; break;
            case "09" : greeting = "선선한 9월 입니다."; break;
            case "10" : greeting = "천고마비의 계절 10월 입니다."; break;
            case "11" : greeting = "쓸쓸한 늦가을 11월 입니다."; break;
            case "12" : greeting = "한파의 연속인 12월 입니다."; break;
            default: System.out.println("알 수 없는 월입니다.");
        }
        System.out.println(name + "님");
        System.out.println(greeting);
        System.out.println("아래와 같은 일정으로 [" + title + "] 를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
        System.out.println("=".repeat(5) + "행사 안내" + "=".repeat(5));
        System.out.println("날짜 : " + date.substring(0, 4) + "년" + month + "월" + date.substring(6, 8) + "일");
        System.out.println("시간 : " + time + "시");
        //까지 정답
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름 : ");
//        String name = sc.next();
//        System.out.print("제목 : ");
//        String title = sc.next();
//        System.out.print("날짜(yyyymmdd) : ");
//        String date = sc.next();
//        System.out.print("시간 : ");
//        String time = sc.next();
//        //String month = date.substring(4,6);
//        String month = date.substring(4,6);
////        //if( month < 10 || month = 1)
////
////        System.out.println("["+name+"] 님,");
////        System.out.println("["+season+"] 님,");

    }
}
