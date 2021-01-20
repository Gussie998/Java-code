package String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * User:DELL
 * Date:2021-01-19
 * Time:9:01
 */
public class TestDemo {


    public static void main7(String[] args) {
        String str1 = "abc";
        char ch = str1.charAt(0);//取‘a’
        System.out.println(ch);

        char[] chars = str1.toCharArray();
        //字符转字符串

        //字符串转字符
        //1、new String（chars）
        //2、String.copeValueOf(chars)
        //3、String.ValueOf(chars)
    }


    //反射更改字符串
    public static void main6(String[] args) {
        String str1 = "abc";
        Class c1 = String.class;
        try {
            Field field = c1.getDeclaredField("value"); //获取对应字段
            field.setAccessible(true);
            try {
                char[] value = (char[]) field.get(str1);
                System.out.println(Arrays.toString(value));
                System.out.println(str1);
                value[0] = 'G';
                System.out.println(str1);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main5(String[] args) {
        //字符串常量由于不可更改，所以下列做法不可取
        String str1="abc";
        for (int i = 0; i <10 ; i++) {
            str1 = str1+i;
        }

    }
    public static void main4(String[] args) {
        String str1="abcde";
        String str2=new String("abcde").intern();
        //内容比较,equals先比较是否引用同一个对象
        //
        //转换为数组，遍历数组然后比较数组内容是否相等
        str1.equals(str2);
    }
    public static void main3(String[] args) {
        String str1="abcde";
        //字符串常量不可更改，value数组是用final修饰的
        String str2=new String("abcde").intern();
        System.out.println(str1==str2);//ture

    }
    public static void main2(String[] args) {
        String str1="abcde";
        String str2=new String("abcde");
        String str3="abc"+"de";//编译时就拼接了
        //str1==str3;
        String str4 = new String("abc")+new String("de");
    }
    public static void main1(String[] args) {
        //构造字符串的三种方式
        //str!=str1
        //str1!=str2
        //str!=str2
        String str ="hello";
        String str2=new String("hello");
        char[] value = {'h','e','l','l','o'};

        String str3=new String(value);

    }

}
