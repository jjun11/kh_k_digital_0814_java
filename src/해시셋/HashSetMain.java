package 해시셋;

import java.util.Arrays;
import java.util.HashSet;

// 중복 허용하지않음, 순서 보장하지않음, 수학의 집하과 유사한 개념
public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Phython");
        set.add("Java"); // add 안됨
        for(String e : set) System.out.println(e+" ");

    }
}
