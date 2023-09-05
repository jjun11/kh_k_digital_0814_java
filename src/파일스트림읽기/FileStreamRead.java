//package 파일스트림읽기;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.*;
//import java.io.FileNotFoundException;
//
//public class FileStreamRead {
//    public static void main(String[] args) {
//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("src/자바파이널_텍스트파일읽기/score.txt");
//        }catch (FileNotFoundException e) {
//            System.out.println("읽을 파일을 찾지 못했습니다.");
//        }
//        Scanner sc = new Scanner(inputStream);
//        Map<String, Integer> scoreMap = new HashMap<>();
//
//        while (sc.hasNextLine()) { // 읽을 때 내용이 있으면 참이 됨
//            String line = sc.nextLine(); // 문자열을 줄바꿈 기준으로 읽음
//
//            String[] tokens = line.split(" ");
//            if (tokens.length >= 4) { // 이름과 3개 이상의 점수가 있는 경우에만 처리
//                String name = tokens[0];
//                int sum = 0;
//
//                for (int i = 1; i < tokens.length; i++) {
//                    int score = Integer.parseInt(tokens[i]);
//                    sum += score;
//                }
//
//                scoreMap.put(name, sum);
//            }
//        }
//
//        List<Map.Entry<String, Integer>> sortedScores =
//                new ArrayList<>(scoreMap.entrySet());
//
//        Collections.sort(sortedScores,
//                Comparator.comparingInt(Map.Entry::getValue).reversed());
//
//        // 결과 출력
//        for (Map.Entry<String, Integer> entry : sortedScores) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}