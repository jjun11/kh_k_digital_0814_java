package 실험용;

import 상속기본.Animal;

public class Test2 {
    public static void main(String[] args) {
        int dan;
        int num;
        for (dan = 1; dan <= 9; dan++) {
            for (dan = 1; dan < ++dan; dan++) {
                System.out.println(dan + "단 시작");
                {

                    for (num = 1; num <= 9; num++) {

                        System.out.println(dan + "x" + num + "=" + dan * num);
                    }
                    System.out.println();

                }

            }
        }
    }
}