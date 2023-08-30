package System클래스;

import static java.lang.Thread.sleep;

public class SystemClass {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000]; // 정수형 변수 data 의 배열길이를 1000으로 선언한다.
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 1000) + 1; // 0~999인데 + 1을 해서 1~1000
        for(i = 0; i < data.length; i++) { // i에 0을 대입하고 i가 data.length보다 작을때까지 1씩 반복증가한다
            data[i] = i+1; // data는
        }
        long startTime = System.currentTimeMillis(); // 시작시간
        for(i = 0; i < data.length; i++) {
            cnt++; // 몇번에 찾았는지 횟수 구하기
            sleep(1); // 1000분의 1초동안 잠재우기
            if(randVal == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (endTime - startTime) + "밀리초 입니다.");
    }
}
