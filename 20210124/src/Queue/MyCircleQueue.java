package Queue;

/**
 * User:DELL
 * Date:2021-01-24
 * Time:10:47
 */

/**
 * 构造循环队列
 */
public class MyCircleQueue {
    private int front;
    private  int rear;//当前可以存储数据元素的下标
    private  int[] elem;

    public MyCircleQueue(int k){
        this.elem = new  int[k+1];
    }

    //入队

    public boolean enQueue(int value){
        if(isFull()){
            return false;
        } else {
            this.elem[this.rear]=value;
            this.rear=(this.rear+1)%this.elem.length;
        }
        return true;
    }

    public boolean isFull(){
        if ((this.rear + 1)%this.elem.length== this.front) {
            return true;
        }
        return false;
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }

    public boolean isEmpty(){
        if(this.rear==this.front) {
                return true;
        }
        return false;
    }

    public int front(){
        if(isEmpty()){
            return -1;
        }
        return this.elem[this.front];
    }

    public int rear(){
        if(isEmpty()){
            return -1;
        }
        int index=-1;
        if(this.rear==0) {
            index=this.elem.length-1;
        } else {
            index = this.rear-1;
        }
        return this.elem[index];
    }

}
