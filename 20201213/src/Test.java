import java.util.Arrays;

/**
 * User:DELL
 * Date:2020-12-13
 * Time:19:28
 */
public class Test {

    /**
     * 方法 toString, 把一个整型数组转换成字符串
     */
    public static void myToString(int[] arr) {
        String str=new String();
        str="[";
        for (int i = 0; i <arr.length; i++) {
            if(i!=arr.length-1) {
                str+=arr[i]+", ";
            }else {
                str+=arr[i];
            }
        }
        str+="]";
        System.out.println(str);
    }
    public static void main(String[] args) {
        int[] array = {1,9,5,8,6,7,2};
        myToString(array);
    }


    /**
     * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
     */
    public static int[] copyOf(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }
    public static void main4(String[] args) {
        int[] array = {1,9,5,8,6,7,2};
        int[] ret =copyOf(array);
        System.out.println(Arrays.toString(ret));
    }

    /**
     * 有序整型数组, 实现二分查找
     */
    public static  int binarySearch(int[] arr,int toFind) {
        int left=0;
        int right = arr.length - 1;
        while (left<=right) {
            int mid=(left+right)/2;
            if(toFind<arr[mid]) {
                right = mid -1;
            } else if (toFind > arr[mid]) {
                left =mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int ret=binarySearch(array,7);
        System.out.println(ret);

    }


    /**
     *判定数组是否有序
     */
    public static boolean toJudge(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        int[] array={9,7,5,8,1,6,3,4};
        System.out.println(toJudge(array));

    }


    /**
     * 冒泡升序排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main1(String[] args) {
        int[] array={9,7,5,8,1,6,3,4};
        bubbleSort(array);
    }
}
