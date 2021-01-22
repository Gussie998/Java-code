package List;

/**
 * User:DELL
 * Date:2021-01-22
 * Time:12:07
 */

/*
类加载器 加载
双亲委派模型
 */
public class MyStack {
    private int[] elem;
    private int top;

    public MyStack() {
        this.elem = new int[10];
    }

    public boolean isFull(){
        return this.top==this.elem.length;
    }

    public int push(int item) {
        if(isFull()){
            return -1;
        }
        this.elem[this.top]=item;
        this.top++;
        return this.elem[this.top-1];
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("kong");
        } else {
            this.top--;
            return this.elem[this.top];
        }

    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("kong");
        }
        return this.elem[this.top-1];
    }
    public boolean isEmpty(){
        return  this.top==0;
    }

    public int size() {
        return  this.top;
    }


}
