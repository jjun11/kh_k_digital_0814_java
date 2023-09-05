package 자바파이널_텍스트파일읽기;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//
//public class TextFileRead {
//    public static void main(String[] args) {
//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("src/자바파이널_텍스트파일읽기/score.txt");
//        }catch (FileNotFoundException e) {
//            System.out.println("읽을 파일을 찾지 못했습니다.");
//        }
//        Scanner sc = new Scanner(inputStream);
//        while (sc.hasNext()) {
//            String line = sc.nextLine();
//            System.out.println(line); // 점수 출력
//
//        }
//    }
//}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextFileRead {
    public static void main(String[] args) {
        // 각 학생의 이름과 총합 점수를 저장하기 위한 Map을 생성합니다.
        Map<String, Integer> totalScores = new HashMap<>();

        try {
            // 파일을 읽기 위한 FileReader 객체를 생성합니다.
            FileReader fileReader = new FileReader("src/자바파이널_텍스트파일읽기/score.txt");
            // BufferedReader를 사용하여 파일을 효율적으로 읽습니다.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            // 파일을 한 줄씩 읽어옵니다.
            while ((line = bufferedReader.readLine()) != null) {
                // 각 줄을 공백을 기준으로 분리하여 배열로 저장합니다.
                String[] tokens = line.split(" ");
                // 배열의 길이가 최소 4개 이상이어야 학생의 정보가 올바르게 포함된 줄입니다.
                if (tokens.length >= 4) {
                    // 첫 번째 토큰은 학생의 이름입니다.
                    String name = tokens[0];
                    // 나머지 세 토큰은 학생의 점수입니다.
                    int score1 = Integer.parseInt(tokens[1]);
                    int score2 = Integer.parseInt(tokens[2]);
                    int score3 = Integer.parseInt(tokens[3]);
                    // 세 점수를 합산하여 총합 점수를 계산합니다.
                    int totalScore = score1 + score2 + score3;
                    // 학생의 이름과 총합 점수를 Map에 저장합니다.
                    totalScores.put(name, totalScore);
                }
            }

            // 파일을 닫습니다.
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
        }

        // 총합 점수를 큰 순서대로 정렬하기 위해 Map을 List로 변환합니다.
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(totalScores.entrySet());
        // 정렬을 수행하는데, 총합 점수를 비교하여 내림차순으로 정렬합니다.
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // 정렬된 결과를 출력합니다.
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "점");
        }
    }
}