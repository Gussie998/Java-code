import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0) {
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num+"不是偶数");
        }
    }
    public static void main1(String[] args) {
        System.out.println("hello world!!!");

    }
}


