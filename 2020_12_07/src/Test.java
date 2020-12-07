import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

/**
 * User:DELL
 * Date:2020-12-07
 * Time:19:02
 */
public class Test {



    //青蛙跳台阶
    public static long frogJump(int n ){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return frogJump(n-1)+frogJump(n-2);
    }

    public static void main9(String[] args) {
        System.out.println(frogJump(5));
    }

    /**
     * 递归求汉诺塔
     */
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }

    }
    public static void main10(String[] args) {
        hanoi(3,'A','B','C');
    }

    /**
     * 递归求 N 的阶乘
     */
    public static int mul(int n) {
        if(n==1){
            return 1;
        }
        return n*mul(n-1);
    }

    /**
     * 求和
     */
    public static int sumAdd(int n) {
        if (n == 1) {
            return 1;
        }
        return n +sumAdd(n-1);
    }

    /**
     * 组成数字的每一位的数
     */
    public static void print(int num) {
    if (num > 9) {
        print(num / 10);
    }
    System.out.println(num % 10);
    }

    /**
     * 返回组成它的数字之和
     */
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if(n<10){
            return n;
        }
        return sum(n/10)+n%10;

    }



        /**
         * 汉诺塔
         */
//    public static int fib(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }

        /**
         * 重载2
         */
        public static void main7 (String[]args){
            int a = 10;
            int b = 20;
            int ret = add(a, b);
            System.out.println("ret = " + ret);
            double a2 = 10.5;
            double b2 = 20.5;
            double ret2 = add(a2, b2);
            System.out.println("ret2 = " + ret2);
            double a3 = 10.5;
            double b3 = 10.5;
            double c3 = 20.5;
            double ret3 = add(a3, b3, c3);
            System.out.println("ret3 = " + ret3);
        }
        public static int add ( int x, int y){
            return x + y;
        }
        public static double add ( double x, double y){
            return x + y;
        }
        public static double add ( double x, double y, double z){
            return x + y + z;
        }


        /**
         *重载
         */
        public static void main6 (String[]args){
            int a = 10;
            int b = 20;
            int ret = max(a, b);
            System.out.println("ret = " + ret);
            double a2 = 10.5;
            double b2 = 20.5;
            double ret2 = max(a2, b2);
            System.out.println("ret2 = " + ret2);
            int a3 = 10;
            double b3 = 10.5;
            double ret3 = max(a3, b3);
            System.out.println("ret3 = " + ret3);
        }
        public static int max ( int a, int b){
            return a > b ? a : b;
        }
        public static double max ( double a, double b){
            return a > b ? a : b;
        }
        public static double max ( double a, int b){
            return a > b ? a : b;
        }


        /**
         * 在max3这个函数中，调用max2函数，来实现3个数的最大值计算
         */
        public static int max3 ( int a, int b, int c){

            return max2(a, b) > c ? max2(a, b) : c;
        }
        public static int max2 ( int a, int b){
            return a > b ? a : b;
        }
        public static void main5 (String[]args){
            int a1 = 5;
            int a2 = 9;
            int a3 = 7;
            int ret = max3(a1, a2, a3);
            System.out.println(ret);
        }

        /**
         * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
         */
        public static void main4 (String[]args){
            int[] arr = new int[]{1, 8, 7, 2, 3, 1, 4, 5};
            int i = 0;
            for (i = 0; i < arr.length - 1; i++) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                        int tmp;
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        // continue;
                    }
                }
            }
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        /**
         * N 的阶乘
         * @param args
         */
        public static void main3 (String[]args){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ret = 1;
            int i = 1;
            for (; i <= n; i++) {
                ret *= i;
            }
            System.out.println(ret);
        }


        /**
         * 求1！+2！+3！+4！+........+n!的和
         */
        public static void main2 (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int ret = 1;
                for (int j = 1; j <= i; j++) {
                    ret *= j;
                }
                sum += ret;
            }
            System.out.println(sum);

        }


        /**
         *     求斐波那契数列的第n项 迭代实现
         */
        public static int fib ( int n){
            int f1 = 1;
            int f2 = 1;
            int ret = 0;
            for (int i = 3; i <= n; i++) {
                ret = f1 + f2;
                f1 = f2;
                f2 = ret;
            }
            return ret;
        }
        public static void main1 (String[]args){
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int ret = fib(input);
            System.out.println(ret);
        }

    }


