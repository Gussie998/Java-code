import java.util.Arrays;

/**
 * User:DELL
 * Date:2021-02-01
 * Time:9:53
 */
public class TestSort {

    //三个数取中

    public static void swap(int[] array,int k,int i){
        int temp = array[k];
        array[k]=array[i];
        array[i]=temp;
    }
    public static void medianOfThree(int[] array,int low,int high){
        int mid=(low+high)/2;
        if (array[low]<=array[mid]){
            swap(array,low,mid);
        }
        if(array[low]>array[high]){
            swap(array,low,high);
        }
        if(array[mid]>array[high]){
            swap(array,mid,high);
        }
    }
    // 冒泡：时间O(n2)空间O(1),稳定

    //快排：最好情况：时间O(nlogn)空间O(logn),稳定；
    //      最坏情况有序：时间O(n2)空间O(logn),不稳定；
    public static int pivot(int[] array,int start,int end){
        int tmp=array[start];
        while (start<end){
            while (array[end]>tmp){
                end--;
            }
            while (array[start]<tmp){
                start++;
            }
            if (array[start]>array[end]){
                int temp = array[start];
                array[start]=array[end];
                array[end]=temp;
            }
        }
        array[start]=tmp;

        return start;
    }

    public static void quick(int[] array,int low,int high){
        if(low<high){
            int piv=pivot(array,low,high);
            quick(array,low,piv-1);
            quick(array,piv+1,high);

        }
    }
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }

    // 堆排序：时间O(n*logn)，空间O(1)，不稳定



    //双向选择排序


    //选择排序：时间O(n2),空间O(1),不稳定
    public static void selectSort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]<array[i]){
                    int tmp = array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }


    //希尔排序

    public static void shell(int[] array,int gap){
        for (int i = gap; i <array.length ; i++) {
            int tmp=array[i];
            int j=i-gap;
            for ( ;j>=0;j-=gap){
                if (array[j]>tmp){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }

    }

    public static void shellSort(int[] array){
        int[] gap={7,5,1};

        for (int i = 0; i <gap.length ; i++) {
            shell(array,gap[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,33,11,99,5,27,44,21,24};
        System.out.println(Arrays.toString(arr));
        //shellSort(arr);
        //selectSort(arr);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
