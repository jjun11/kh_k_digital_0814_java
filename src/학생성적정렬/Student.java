package 학생성적정렬;

public class Student implements Comparable<Student> {
     String stuName;
     int stuScore;

    public Student(String stuName, int stuScore) {
        this.stuName = stuName;
        this.stuScore = stuScore;
    }

    @Override
    public int compareTo(Student o) {
        if (this.stuScore < o.stuScore) return 1;
        else {
            if (this.stuScore == o.stuScore)
                return this.stuName.compareTo(o.stuName);
        }
        return -1;
    }

}


