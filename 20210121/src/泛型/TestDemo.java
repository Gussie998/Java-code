package 泛型;

/**
 * User:DELL
 * Date:2021-01-21
 * Time:10:55
 */
public class TestDemo {


    public static void main3(String[] args) {
        Integer a=139;
        Integer b=139;
        System.out.println(a==b);//false
        Integer a1=100;
        Integer b1=100;
        System.out.println(a1==b1);//true
        //if(127>i>=-128),return~
        //else return new ~
        Integer a2=-1;
        Integer b2=-1;
        System.out.println(a2==b2);
    }

    public static void main2(String[] args) {
        Integer i =10;
        int a = i;//自动拆箱

        int b = i.intValue();//显示拆箱

    }
    public static void main1(String[] args) {
        int a = 10;
        Integer integer1 = new Integer(a);//显示装包
        Integer integer2 = Integer.valueOf(a); //显示装白
        Integer integer3 = a;//自动装包
    }
}
