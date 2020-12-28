import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * User:DELL
 * Date:2020-12-28
 * Time:20:47
 */
public class MyArrayList {
    /*public int[] elem = new int[10];
    public int usedSize = 0;
    */
    private int[] elem;//null
    private int usedSize;

    public MyArrayList() {
        this.elem = new int[5];
    }

    public MyArrayList(int capacity) {
        this.elem = new int[capacity];
    }

    // 打印顺序表√
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] +" ");
        }
        System.out.println( ) ;
    }


    // 在 pos 位置新增元素√
    public boolean isFull(){
        if(this.usedSize==this.elem.length) {
            return true;
        }
        return false;
    }
    public void add(int pos, int data) {
        if(isFull()) {
            resize();
        }
        if(pos<0 || pos>this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        for (int i = this.usedSize-1; i >=pos ; i--) {
            this.elem[i+1] = this.elem[i] ;
        }
        this.elem[pos] = data;
        this.usedSize++;

    }
    //默认插在后面
    public void add2(int data) {
        this.elem[this.usedSize] = data;
        this.usedSize++;

    }
    //扩容
    public  void resize() {
        this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
    }

    // 判定是否包含某个元素√
    public boolean contains(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i] == toFind ) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置√
    public int search(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素√
    public int getPos(int pos) {
        if(pos<0 || pos>=this.usedSize) {
            System.out.println("位置不合法");
            return -1;
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value√
    public void setPos(int pos, int value) {
        if(pos<0 || pos>=this.usedSize) {
            System.out.println("位置不合法");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key√
    public void remove(int toRemove) {
        if (contains(toRemove)) {
            int pos = search(toRemove);
            for (int i = pos; i <usedSize-1 ; i++) {
                this.elem[i]=this.elem[i+1];
            }
            this.usedSize--;
        }else {
            System.out.println("无关键字key");
            return;

        }

    }
    // 获取顺序表长度
    public int size() {

        return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.display();
        list.add(6,6);
        list.add(5,6);
        list.display();
        list.add2(7);
        list.display();
        boolean a=list.contains(2);
        System.out.println(a);
        boolean b=list.contains(9);
        System.out.println(b);
        int pos=list.search(4);
        System.out.println(pos);
        int elem = list.getPos(3);
        System.out.println(elem);
        list.setPos(6,777);
        list.display();
        list.remove(5);
        list.display();
        System.out.println(list.size());


    }


}
