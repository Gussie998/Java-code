package 堆;

import java.util.Arrays;

/**
 * User:DELL
 * Date:2021-01-29
 * Time:11:09
 */
public class HeapDemo {
    public int[] elem;
    public int usedSize;



    //堆排序
    public void heapSort(){
        int end  = this.usedSize-1;

        while (end>0){
            int temp = this.elem[0];
            temp=this.elem[end];
            this.elem[end] = temp;
            adjustDown(0,end);
            end--;
        }
    }
    public HeapDemo(){
        this.elem= new  int[10];
    }
    public void adjustDown(int parent,int len){
        int child = parent*2+1;
        //说明有左孩子
        while (child<len){
            if(child+1<len && this.elem[child]<this.elem[child+1]){
                child++;
            }
            if(this.elem[child]>this.elem[parent]){
                int temp = this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=temp;
                parent=child;
                child=2*parent+1;
            } else {
                break;
            }
        }
    }
    public void createBigHeap(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            this.elem[i] = arr[i];
            this.usedSize++;
        }

        for (int i = (this.usedSize-1-1)/2; i >=0 ; i--) {
            adjustDown(i,this.usedSize);
        }
    }
    public void show(){
        for (int i = 0; i <usedSize-1 ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }



    //向上调整
    public void adjustUp(int child){
        int parent = (child-1)/2;

        while (child>0) {
            if(this.elem[child]>this.elem[parent]){
                int temp = this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=temp;
                parent=child;
                child=2*parent+1;
            } else{
                break;
            }
        }
    }
    public void push(int val){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[usedSize]=val;
        usedSize++;
        adjustUp(this.usedSize-1);
    }
    public boolean isFull(){
        return this.usedSize==this.elem.length;
    }

    //第一个元素和最后一个元素换，然后乡下调整
    public int poll(){
        if(isEmpty()) {
            throw new RuntimeException("kong");
        }
        int ret = this.elem[0];
        int tmp=this.elem[0];
        this.elem[0]=this.elem[usedSize-1];
        this.elem[usedSize-1]=tmp;

        this.usedSize--;
        adjustDown(0,this.usedSize);

        return ret;
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }

    public static void main2(String[] args) {

    }

    public static void main1(String[] args) {
        HeapDemo heapDemo= new HeapDemo();
        int[] array={ 27,15,19,18,28,34,65,49,25,37 };
        System.out.println(Arrays.toString(array));
        heapDemo.createBigHeap(array);
        heapDemo.show();
    }
}
