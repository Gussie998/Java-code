package String;

/**
 *
 * 1、StringBuilder 和 StringBuffer 多了一些String没有的方法
 * 例如reverse(),
 * 2、StringBuilder 和 StringBuffer的区别:
 * StringBuffer比StringBuilder多了synchronized，
 * 保证了线程的安全，相当于一把锁，一般出现在多线程的情况下
 * 加锁解锁都需要占用资源
 * 3、StringBuilder和String区别：
 * String +拼接 会被优化成StringBuilder.append
 * 在循环中不能用string直接拼接
 *
 * User:DELL
 * Date:2021-01-20
 * Time:10:41
 */
public class TestDemo3 {

    public static void main3(String[] args) {
        String s = "abc";
        for (int i = 0; i <10 ; i++) {
            s=s+i;
        }
        System.out.println(s);

        //优化
        String s1 = "abc";
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        for (int i = 0; i <10 ; i++) {
            s1=sb.append(i).toString();
        }
        System.out.println(s1);
    }

    public static void main2(String[] args) {
        //String拼接创建其他对象
        String s = "abc";//1
        s=s+"def";//2

        //1/2优化为：
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.append("def");
        s=stringBuilder.toString();


    }

    public static void main1(String[] args) {
        //string 不可改变
        String s1="abcdef";
        //stringbuilder有更多方法；
        StringBuilder sb = new StringBuilder("abcdef");
        //拼接返回的是this
        System.out.println(sb.append("xxxx"));

    }


}
