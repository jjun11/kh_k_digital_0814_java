package KMP;
// Knuth-Morris-Pratt => KMP
// Mirko-Slavko => MS

import java.util.Scanner;

// split("")를 이용해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 0번째 선택, "-" 다음의 첫번째 문자를 선택하는 방법
// 대문자만 골라냄(chatrAt(인덱스), toCharArray())
//
public class KMPEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char[] chName = name.toCharArray(); // 문자열을 문자 배열로 전환
        for (char ch : chName) {
            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }
    }
}
