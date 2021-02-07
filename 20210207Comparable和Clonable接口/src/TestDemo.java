import java.util.Arrays;

class Student implements Comparable<Student>{

    private int age;
    private  String name;
    private int score;

    public Student(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        if (this.score > o.score) {
            return 1;
        }else if (this.score < o.score) {
            return -1;
        }else {
            return 0;
        }
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student(10,"hello",67);
        student[1] = new Student(20,"hello",90);
        student[2] = new Student(5,"hello",22);
        System.out.println(Arrays.toString(student));
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }


    public static void main1(String[] args) {
        Student student1 = new Student(10,"hello",67);
        Student student2 = new Student(10, "world", 50);
        if (student1.compareTo(student2) > 0) {
            System.out.println("Student1>Student2");
        }else if (student1.compareTo(student2) < 0) {
            System.out.println("Student1<Student2");
        }else {
            System.out.println("Student1==Student2");
        }
    }
}
