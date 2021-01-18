package exception;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:11:43
 */
public class TeatDemo {
    public void  func4(int y)throws ArithmeticException{
        //声明异常↑
        if(y==0){

            //抛出异常↓
            throw new  ArithmeticException();

        }

    }

    public static void main1(String[] args) {
        int a=0;
        try {
            System.out.println(10/a);
        } catch (ArithmeticException e) {
            //处理异常
            e.printStackTrace();
        } finally{
            //一定会执行
            //scanner.close();
            //不要在finally中写return

            System.out.println("释放资源的作用，善后工作");
        }
        //不处理异常则会交给JVM处理，程序异常终止
        System.out.println("ksj");
    }

}
