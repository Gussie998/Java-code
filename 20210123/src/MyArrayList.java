import java.util.Arrays;
import java.util.List;

/**
 * User:DELL
 * Date:2021-01-23
 * Time:19:46
 */
public class MyArrayList<T> {private int usedSize;
    private T[] elem;

    public MyArrayList(){
        this.elem=(T[])new Object[10];
        usedSize=0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elem=" + Arrays.toString(elem) +
                '}';
    }

    //展示
    public void display(){
        for(int i = 0; i <this.usedSize; i++) {
        System.out.print(elem[i]+" ");
    }
        System.out.println();
}

    //尾插
    public void add(T val){
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }
    public void remove(){
        this.elem[usedSize - 1] = null;
        usedSize--;
    }
}
