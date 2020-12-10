import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * User:DELL
 * Date:2020-12-10
 * Time:9:41
 */
public class TestDemo {

    /**
     * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
     */
    public static void main4(String[] args) {
        int[] arr = new int[100];
        arr[0]=1;
        for (int i = 1; i <100 ; i++) {
            arr[i]=arr[i-1]+1;
        }
    }


    /**
     * 循环打印
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    /**
     * 数组元素×2
     */
    public static void main3(String[] args) {
        int[] arr = new int[]{4,3,6,8,1,3,54,78,12,9};
        int[] arr2 = transform(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] transform (int[] arr) {
        int[] ret =new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ret[i] = arr[i]*2;
        }
        return ret;
    }
    /**
     * 数组元素之和
     */
    public static void main2(String[] args) {
        int[] arr = new int[]{4,3,6,8,1,3,54,78,12,9};
        int sum=sum(arr);
        System.out.println(sum);
    }
    public static int sum(int[] arr) {
        int ret = 0;
        for (int i = 0; i <arr.length ; i++) {
            ret += arr[i];
        }
        return ret;
    }

    /**
     * 数组元素平均数
     * @param args
     */
    public static void main1(String[] args) {
        int[] arr = new int[]{4,3,6,8,1,3,54,78,12,9};
        double ret = arv(arr);
        System.out.println(ret);
    }
    public static double arv(int[] arr) {
        double ret=0;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        ret = sum/arr.length;
        return ret;
    }
}
