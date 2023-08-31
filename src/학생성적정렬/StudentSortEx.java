package 학생성적정렬;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

// 5명의 학생에 대해서 이름과 성적을 입력, 성적이 높은 사람 순으로 정렬하고 성적이 같으면 이름순으로 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();
        list.add(new Student("김갑수", 95));
        list.add(new Student("오춘배", 48));
        list.add(new Student("임꺽쇠", 60));
        list.add(new Student("지우리", 60));
        list.add(new Student("고길동", 98));

        for(Student e: list) {
            System.out.println("이름 : " + e.stuName);
            System.out.println("점수 : " + e.stuScore);
        }
    }
}
