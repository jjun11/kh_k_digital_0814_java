package 매개변수와다형성;

import java.util.Scanner;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Compueter compueter = new Compueter();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.print("[1] TV [2] Computer [3] Audio [4]quit : ");
        int sel = sc.nextInt();
            switch(sel) {
                case 1 :
                    buyer.buy(tv);
                    buyer.viewInfo();
                    break;
                case 2 :
                    buyer.buy(compueter);
                    buyer.viewInfo();
                    break;
                case 3 :
                    buyer.buy(audio);
                    buyer.viewInfo();
                    break;
                case 4 : return;
                default : System.out.println("해당 제품이 없습니다.");
                    break;
            }
        }
    }
}
