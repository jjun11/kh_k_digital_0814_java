package 스퀘어출력;

import java.util.Scanner;

// input : 3
// Output
// 1 2 3
// 4 5 6
// 7 8 9
// input : 4
// Output
//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16
public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * 3; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
        }

    }



}
