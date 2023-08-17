package 비트연산자;
// 비트 연산자는 비트 단위의 연산을 수행합니다.
// AND : & 비교하는 두 개의 비트가 모두 1이어야 1이 됨
// OR : | 비교하는 두 개의 비트중 하나라도 1이면 1이 됨
// XOR : ^ 비교하는 두 비트가 서로 다른 경우만 1이 됨
// NOT : ~ 현재의 비트의 값을 반전시킴
// 왼쪽 쉬프트 : << 비트를 왼쪽으로 이동시킴, 빈 자리는 0이 됨
// 오른쪽 쉬프트 : >> 비트를 오른쪽으로 이동시킴, 빈 자리는 0이 됨
public class BitOperate {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(num1 << 1);
        System.out.println(num1 >> 1);
        int num0 = -;
        String num0Trans2 = Integer.toString(num0, 2);
        System.out.println(num0Trans2);
    }
}
