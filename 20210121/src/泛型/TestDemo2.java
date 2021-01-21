package 泛型;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * User:DELL
 * Date:2021-01-21
 * Time:11:32
 */

class Student{
    public String name;
    public  String grade;
    public Double score;

    public Student(String name, String grade, Double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                '}';
    }
}

public class TestDemo2 {

    public static void main5(String args[]){
        int num = 10;
        System.out.println(test(num));//30
    }
    public static int test(int b){
        try {
            b += 10;
            return b;
        }catch(RuntimeException e){
        }catch(Exception e2){
        } finally{
            b += 10;
            return b;
        }
    }

    public static void main4(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main3(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("zhang","1",99.1));
        list.add(new Student("li","2",66.1));
        list.add(new Student("wang","3",66.3));

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //迭代器实现
//        Iterator<Student> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }


    }

    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        //放在数组的最后
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator指向第一个元素的前一个位置
        }

        iterator.remove();
        //删除最后一个元素，也就是迭代器现在所指的位置
        //如果remove第二次就会摆错
        //要慎用，比较抽象，迭代器的位置不好判断
        System.out.println(list);



    }
    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        //放在数组的最后
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //放在index位置
        list.add(0,3);
        System.out.println(list);
        //ArrayList底层是数组，
        /*
        1 调用不带参数的构造方法时，大小为0；
        2 添加第一个元素时，第一次扩容10；之后是1.5倍扩容
         */

        list.remove(1);//匹配参数，注意类型
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1 = list.subList(0,3);
        //sublist在原来的数组上面改变
        System.out.println(list1);

        list1.set(0,88);//更改list1但是
        System.out.println(list);//list做出了改变



    }

}
