package 형변환;
// 형변환이란 : 하나의 데이터타입을 다른 타입으로 변환하는것
// 명시적 형변환 : 개발자가 의도를 가지고 형변환을 하는것
// 묵시적 형변환 : 컴파일러가 자동으로 해주는 것 (유리한 방향으로 변경)
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 9, num2 = 4;
        double result1 = num1 / num2; // 형변환이 안일어남
        double result2 = (double) num1 / num2; // 명시적, 묵시적 형변환이 일어남

        System.out.println(result1); // 2.0 = 2.25 값이지만 num1,2 가 int(정수형)이라 소수점부분이 생략됨
        System.out.println(result2); // 2.25 형변환이 일어남

        String jpn = "90";
        int intjpn = Integer.parseInt(jpn); // 문자열을 숫자로 변환하는 메소드
        int kor = 90;
        int mat = 88;
        int eng = 55;
        int total = kor + mat + eng; // 총점
        double avg1 = total / 3; // 평균값
        double avg2 = (double) total / 3; // 평균값 -> 실수로형변환
        int total2 = intjpn + kor + mat + eng; // jpn이 문자열이어서 intjpn 으로 숫자로 변환
        int total3 = Integer.parseInt(jpn) + kor + mat + eng; // 바로 변환식을 가져와서 더해도 가능
        System.out.println(avg1); // 77.0
        System.out.println(avg2); // 77.66666666666667
        System.out.println(total); // 233
        System.out.println(total2); // 323
        System.out.println(total3); // 323

            //형변환 주석이 반영되는지 확인
    }
}
