package 常见接口;

/**
 * User:DELL
 * Date:2021-01-17
 * Time:11:41
 */

//import java.util.Arrays;
//
//
//class Student implements Comparable{
//    public  String name;
//    public int score;
//
//    public Student(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//    public Student() {
//        super();
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", score=" + score +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        if(this.score>o.score) {
//            return 1;
//        } else if (this.score==o.score) {
//            return 0;
//        }
//        return -1;
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Student[] students = new Student[3];
//        students[0] = new Student("bit",89);
//        students[1] = new Student("bit",79);
//        students[2] = new Student("bit",99);
//
//        System.out.println(Arrays.toString(students));
//        System.out.println(students[0].compareTo(students[2]));
//
//
//    }
//}
