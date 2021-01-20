package String;

/**
 * User:DELL
 * Date:2021-01-20
 * Time:9:03
 */
public class TestDemo2 {



    public static void main12(String[] args) {
        //String string ="  A bc  Def   ";
        String string ="  ";
        System.out.println(string.isEmpty());//f



    }

    public static void main11(String[] args) {
        String string ="  A bc  Def   ";
        String str2 = string.toLowerCase();
        System.out.println(str2);

        String str3 = string.toUpperCase();
        System.out.println(str3);
    }

    public static void main10(String[] args) {
        //去掉左右俩边空格
        String string ="  a bc  def   ";
        String str2 = string.trim();
        System.out.println(str2);
    }



    //字符串切割

    public static void main9(String[] args) {
        String string ="abcdef";
        String str2 = string.substring(2,4);//[2,4)
        System.out.println(str2);
    }

    public static void main8(String[] args) {
        String string = "192*34#55-3";

        //String[] strings = string.split("\\.");
        //String[] strings = string.split(".");特殊符号需要转义, | . * /等
        //空格也算
        String[] strings = string.split("#|-");
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }

    }

    public static void main7(String[] args) {
        String string = "suername=zhangsan&password=123";
        String[] strings = string.split("&",3);
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }

    }

    public static void main6(String[] args) {
        String string = "suername=zhangsan&password=123";
        String[] strings = string.split("&");
        for (int i = 0; i <strings.length ; i++) {
            //System.out.println(strings[i]);
            String[] stringss=strings[i].split("=");
//            for (int j = 1; j <stringss.length ; j+=2) {
//                System.out.println(stringss[j]);
//            }
            System.out.println(stringss[1]);

        }
    }

    //字符串替换
    public static void main5(String[] args) {
        String str1 = "abcdeeyabjhcfab";
        String ret = str1.replaceAll("ab","xx");
        System.out.println(ret);
        //不是在原来字符串上操作的

        String ret2 = str1.replaceFirst("ab","xx");
        System.out.println(ret2);

        //形参不是String而是CharSequence
        //String 实现了CharSequence接口
        String ret3 = str1.replace("ab","xx");
        System.out.println(ret3);

    }

    //字符串查找
    public static void main4(String[] args) {
        String str1 = "abcdeeyjhcf";
        String str2 = "bc";
        System.out.println(str1.contains(str2));//true
        System.out.println(str1.indexOf("cd"));//2
        //字符串匹配kmp算法

        System.out.println(str1.indexOf("cd",3));//-1
        System.out.println(str1.lastIndexOf("ed",3));//-1
       // System.out.println(str1.lastIndexOf("ey",0));//-1

        //以什么开头
        System.out.println(str1.startsWith("ab"));//t
        System.out.println(str1.startsWith("cd",3));//f

        //以什么结尾
        System.out.println(str1.endsWith("cf"));//t




    }


    //123字符串比较三种方法
    public static void main3(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println(str1.compareTo(str2));
        //实现了compoare接口，相等返回0，
        // str1大则返回大于零的数字，
        // 否则小于零

    }

    public static void main2(String[] args) {
        String str1 = "abc";
        String str2 = "Abc";
        System.out.println(str1.equalsIgnoreCase(str2));//T

    }
    public static void main1(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "abcdef";
        String str4 = str1 + "def";
        //运行时才知道当前变量存储的内容
        String str5 = str1+str2;

        System.out.println(str3 ==str4);//false
        System.out.println(str3 ==str5);//false
        System.out.println(str5 ==str4);//false

    }



}
