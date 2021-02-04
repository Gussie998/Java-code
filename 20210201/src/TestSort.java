import java.util.Arrays;
import java.util.Stack;

/**
 * User:DELL
 * Date:2021-02-01
 * Time:9:53
 */
public class TestSort {

    //非递归归并排序
    public static void merge2(int[] array,int gap){
        int s1=0;
        int e1=s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1<array.length?s2+gap-1:array.length-1;
        int[] tmp = new int[array.length];
        int k=0;

        while (s2<array.length){
            while (s1<=e1 && s2<=e2){
                if(array[s1]<=array[s2]){
                    array[k++]=array[s1++];
                } else {
                    array[k++]=array[s2++];

                }
            }
            //有可能第一段还有数据
            while (s1<=e1 ){
                tmp[k++]=array[s1++];
            }
            //有可能第二段还有数据
            while (s2<=e2){
                tmp[k++]=array[s2++];
            }
            s1=e2+1;
            e1=s1+gap-1;
            s2=e1+1;
            e2 = s2+gap-1<array.length?s2+gap-1:array.length-1;
        }
        //退出上面循环后，
        // 那么把s1段内的数据给拷贝下来,因为 有可能e1已经越界了
        while (s1 < array.length) {
            tmp[k++] = array[s1++];
        }

        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }
    }


    //合并俩个有序数组
    public static void merge(int[] array,int low,int mid,int high){
        int s1=low;
        int s2=mid+1;
        int[] tmp = new int[high-low+1];
        int k=0;
        while (s1<=mid &&s2<=high){
            if(array[s1]<=array[s2]){
                tmp[k++]=array[s1++];
            } else {
                tmp[k++]=array[s2++];
            }
        }
        //有可能第一段还有数据
        while (s1<=mid ){
            tmp[k++]=array[s1++];
        }
        //有可能第二段还有数据
        while (s2<=high){
            tmp[k++]=array[s2++];
        }
        for (int i = 0; i <tmp.length ; i++) {
            array[i+low]=tmp[i];
        }


    }
    public static void mergeSortInternal(int[] array,int low,int high){
        if(low==high) return;
        int mid = (low+high)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);

    }
    public static void mergeSort(int[] array){

    }

    //快排非递归 O(nlogn) 空间最坏O(n)， O(log2 n)
    public static void quickSort1(int[] array){
        Stack<Integer> stack= new Stack<>();
        int low = 0;
        int high = array.length-1;
        int piv=pivot(array,low,high);
        if(piv>low+1){
            stack.push(low);
            stack.push(piv-1);

        }
        if(piv<high+1){
            stack.push(piv+1);
            stack.push(high);


        }
        while (!stack.isEmpty()){
            high=stack.pop();
            low=stack.pop();
            piv=pivot(array,low,high);
            if(piv > low + 1) {
                stack.push(low);
                stack.push(piv-1);
            }
            if(piv < high-1) {
                stack.push(piv+1);
                stack.push(high);
            }
        }
    }

    public static void insertSortBount(int[] array,int low,int high){
        for (int i = low+1; i <=high ; i++) {
            int tmp=array[i];
            int j=i-1;
            for(j=i-1;j>=low;--j){
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

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
    //      最坏情况有序：时间O(n2)空间O(n),不稳定；
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

    //插入排序
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0 ; j--) {
                //如果这里是一个大于等于号 此时这个排序就不稳定了
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
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
