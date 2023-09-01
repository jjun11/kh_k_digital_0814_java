package 쓰레드예제2번;

import javax.tools.Tool;
import java.awt.*;

import static java.lang.Thread.sleep;

public class ThMainEx2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(); // sumThread가 작업을 완료할때
            System.out.println("main이 일을 하는지 확인???");
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());
    }
}
        class SumThread extends Thread {
            private long sum;

            public long getSum() {
                return sum;
            }

            public  void setSum(long sum) {
                this.sum = sum;
            }
            @Override
            public void run() {
                for(int i = 0; i<=100; i++){
                    sum += 1;
                }
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for(int i = 0; i < 10; i++) {
//            toolkit.beep();
//            try {
//            sleep(3000);
//            } catch (InterruptedException ignored) {
//
            }
        }

