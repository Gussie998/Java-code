import java.util.ArrayList;
import java.util.List;

/**
 * User:DELL
 * Date:2021-01-22
 * Time:9:03
 */

/*
先想要使用哪个集合，String
从s1去掉s2里的字符
 */
public class TestDemo {
    public static List<Character> func2(String s1,String s2){
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            if (!s2.contains(ch +"")) {
                ret.add(ch);
            }
        }
        return ret;
    }


        public static List<Character> func(String s1,String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2=s2.toCharArray();
        List list = new ArrayList();
        for(int i = 0;i<s1.length();i++) {
            for (int j = 0; j <s2.length() ; j++) {
                if(chars1[i]!=chars2[j]) {
                    list.add(chars1[i]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s1= "welcome to hah";
        String s2 = "cohe";
        System.out.println(func2(s1, s2));

    }

}
