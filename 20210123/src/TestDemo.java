import java.util.ArrayList;
import java.util.List;

/**
 * User:DELL
 * Date:2021-01-23
 * Time:19:39
 */

public class TestDemo {
//    public boolean IsPopOrder(int [] pushA,int [] popA) {
////        List list = new ArrayList;
////        list.add(pushA);
////        list.add(pushA);
////        list
////        return list.contains(popA);
//
//    }


    public static void main(String[] args) {
        List list = new ArrayList();
        char[] ch = {'1','2','3','4'};
        list.add(ch.toString());
        list.add(ch.toString());
        System.out.println(list);
        char[] ch1 = {'4','3','2','1'};
        System.out.println((list.contains(ch1.toString())));
    }
}
