package 자바파이널_텍스트파일읽기;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    private String name;
    private int total;

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name); // 이름순정렬
        return o.getTotal() - this.getTotal(); // 내림차순 정렬
    }
}
