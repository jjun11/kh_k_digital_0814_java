package 대소문자변환;

import java.util.Scanner;

// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램 작성.
// charAt(index) : 문자열에 해당 인덱스 문자를 추출
// toCharArray() : 문자열을 문자 배열로 전환
public class AlphaChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String alpha = sc.next();
        for(int i = 0; i < alpha.length(); i++) {
            char ch = alpha.charAt(i);
            if(ch > 'a') System.out.print((char) (ch + ('a' - 'A')));
            else System.out.print((char) (ch - ('a' - 'A')));
        }
    }
}
