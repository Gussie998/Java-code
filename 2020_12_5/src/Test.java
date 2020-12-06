import java.util.Random;
import java.util.Scanner;

/**
 * User:DELL
 * Date:2020-12-05
 * Time:19:03
 */
public class Test {
    /**
     * 输出n*n的乘法口诀表，n由用户输入。
     */
    public static void main15(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        for(int i=1;i<=input;i++) {
            for (int j=1 ;j<=i;j++) {
                int ret=i*j;
                System.out.print(i+"*"+j+"="+ret+"  ");
            }
            System.out.println(" ");
        }
    }
    /**
     * 编写代码模拟三次密码输入的场景。
     * 最多能输入三次密码，
     * 密码正确，提示“登录成功”,密码错误，
     * 可以重新输入，最多输入三次。三次均错，则提示退出程序
     */
    public static void main13(String[] args) {
        String password="gaoxuexue";
        int count=2;
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        while (count!=0) {
            if (input.equals(password)) {
                System.out.println("登录成功");
                break;

            } else {
                count--;
                System.out.println("重新输入");
                String input2=sc.nextLine();
                if (input2.equals(password)) {
                    System.out.println("登录成功");
                    break;
                }
            }
        }


    }

    /**
     * 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
     */
    public static void main12(String[] args) {
        int a=37;
        System.out.println("偶数位");
        for(int i=0;i<32;i+=2) {
            if(((a>>i) & 1)==1) {
                System.out.print(1+" ");
            } else {
                System.out.print(0+" ");
            }
        }
        System.out.println( );
        System.out.println("奇数位");
        for(int i=1;i<32;i+=2) {
            if(((a>>i) & 1)==1) {
                System.out.print(1+" ");
            } else {
                System.out.print(0+" ");
            }
        }
    }

    /**
     * 求一个整数，在内存当中存储时，二进制1的个数。
     */
    public static void main11(String[] args) {
        int a=34;
        int count=0;
        for(int i=0;i<=31;i++) {
            if (((a>>i) & 1)==1){
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * 最大公约数
     */
    public static void main10(String[] args) {
        int a=12;
        int b=18;
        while(b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
    /**
     * 输出一个整数的每一位
     */
    public static void main14(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=0;
        int ret=0;
        int temp=n;
        String[] str=new String[100];
        while(temp!=0) {
            temp/=10;
            len++;
        }

            for(int i=0;i<len;i++){
                ret=n%10;
                str[i]=String.valueOf(ret);
                n=n/10;
            }

        for(int i=len-1;i>=0;i--) {
            System.out.println(str[i]);
        }

    }
    /**
     *计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
     */
    public static void main9(String[] args) {
        double sum=0;
        for (int i=1;i<=100;i++){

            if(i%2==0){
                sum -= (1.0/i);
            } else {
                sum +=(1.0/i);
            }
        }
        System.out.println(sum);
    }


    /**
     * 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
     * 其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
     */
    public static void main8(String[] args) {

        for(int i=0;i<=999;i++) {
            if(i<=9) {
                System.out.println(i );
            }
            else if (i>=10 && i<99) {
                if (Math.pow((i%10),2)+Math.pow((i/10),2)==i) {
                    System.out.println(i );
                }
            }
            else {
                if((Math.pow((i/100),3)+Math.pow((i%100)/10,3)+Math.pow((i%100)%10,3)==i)) {
                    System.out.println(i );
                }
            }
        }
    }
    /**
     * 猜数字
     */
    public static void main7(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int num=random.nextInt(100);
        while(sc.hasNext()){
            int input=sc.nextInt();
            if(input==num){
                System.out.println("猜对了");
                break;
            } else if(input>num) {
                System.out.println("大了");
            }else {
                System.out.println("小了");
            }
        }
        sc.close();
    }

    /**
     * 打印 X 图形
     */
    public static void main6(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==n-i-1||j==i) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
    /**
     * 打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
     */
    public static void main5(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个整数>>");
        int input=scanner.nextInt();
        if(input<=18) {
            System.out.println("少年");
        }else if(input>=19 && input<=28){
            System.out.println("青年");
        }else if(input>=29 && input<=55){
            System.out.println("中年");
        } else{
            System.out.println("老年");
        }
    }
    /**
     *给定一个数字，判定一个数字是否是素数
     * @param args
     */
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个整数>>");
        int input=scanner.nextInt();
        int temp=1;
        for(int i=2;i<=input/2;i++){
            if(input%i==0){
                System.out.println("不是素数");
                temp=0;
                break;
            }
        }
        if(temp==1){
            System.out.println("素数");
        }
    }
    /**
     *打印 1 - 100 之间所有的素数
     * @param args
     */
    public static void main3(String[] args) {
        int i=3;
        for(;i<=100;i++) {
            int temp=1;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    temp = 0;
                    break;
                }
            }
            if(temp==1){
                System.out.println(i);
                temp=0;
        }
        }
    }
    /**
     * 1000 - 2000 之间所有的闰年
     * @param args
     */
    public static void main2(String[] args) {
        int year=1000;
        for(;year<=2000;year++) {
            if((year%4==0 && year%100!=0)||year%400==0){
                System.out.println(year);
            }
        }
    }
    /**
     * 数一下 1到 100 的所有整数中出现多少个数字9
     */
    public static void main1(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++) {
            if(i%10==9){
                count++;
                if(i/10==9){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
