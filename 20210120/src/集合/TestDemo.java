package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * User:DELL
 * Date:2021-01-20
 * Time:11:32
 */

class MyArrayList{
    public  int[] elem;
    public int usedSize;
}

public class TestDemo {

    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("boyfriend","冯虎虎");
        map.put("me","高虎虎");
        System.out.println(map.get("boyfriend"));

        //存放的顺序不一定是打印的顺序
        System.out.println(map);
    }
    public static void main1(String[] args) {
        //接口不可以实例化
        //错误//Collection collection = new Collection();

        Collection collection = new ArrayList();
        //放什么类型都可以，乱套
        collection.add("a");
        collection.add(false);

        //指定只能放String
        Collection<String> collection1 = new ArrayList<String>();

    }
}
