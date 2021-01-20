/**
 * User:DELL
 * Date:2021-01-18
 * Time:16:15
 */


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class TestDemo {


    public static void main5(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6

    }


    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main4(String[] args){
        System.out.println(isAdmin("Admin"));
    }
        String str = new String("good");
        char[ ] ch = { 'a' , 'b' , 'c' };
        public static void main3(String args[]){
            TestDemo ex = new TestDemo();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str + " and ");
            System.out.print(ex.ch);
        }
        public void change(String str,char ch[ ]){
            str = "test ok";
            ch[0] = 'g';
        }


        public static void main2(String[] args) {
        try {
            throw new MyException("hahhaha");
        } catch (MyException e) {
            e.printStackTrace();

        }
    }
    public static void mystery(int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0) {
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }

    public static void main1(String[] args) {
        mystery(1234);

    }
}
