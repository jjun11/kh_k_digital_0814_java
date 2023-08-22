package 더하기싸이클;

import java.util.Scanner;

//입력 받은 수를 더하기 싸이클 조건을 수행했을 때 몇 회만에 원래 입력한 수와 같아지는지 확인하는문제
//ex 입력 26 > 2+6=8, 각 식에서 맨 오른쪽 수로 두자릿수 생성 > 68 (1Cycle)> 6+8 =14 > 84 (2Cycle)> 8+4=12 >(3Cycle) 42 > 4+2=6 >(4Cycle) 26
public class SumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt(); // 최초 숫자를 입력받음
        int totalCnt = 0; // 총 싸이클 누적 횟수
        int calcNum = input; // 최초 입력값이 변경되지 않도록 하기 위해서...
        int divSum = 0; // 수를 10의 자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0;
        while (true) {
            totalCnt++;
            divSum = (calcNum / 10) + (calcNum % 10); // 10의 자리와 1의 자리를 분리해서 더함
            newNum = (calcNum % 10) * 10 + (divSum % 10); // 앞의 1의자리의 +
            if (newNum == input) break;
            calcNum = newNum;
        }
        System.out.println(totalCnt);
    }
}