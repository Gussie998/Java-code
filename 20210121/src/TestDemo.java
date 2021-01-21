/**
 * User:DELL
 * Date:2021-01-21
 * Time:9:30
 */

/**
 * 写一个通用的顺序表
 * 1、class MyArrayList<T> 代表占位符，表示当前类是泛型类
 * 2、简单类型不能做泛型类型的参数
 * 不能放在 <>里，例如<int>，只能是<Integer>
 * 3、泛型是如何编译的？它只存在于编译时期，
 * 程序运行时不存在泛型的概念了
 * 泛型的擦除机制，不会执行类型替换，只是类型检查，add时检查
 * 编译的时候进行类型擦除 将泛型擦除为Object，任意类型都可以放
 * 4、不能new泛型类型数组
 * 5、不参与类型的组成
 *
 *
 *
 */

class MyArrayList<T>{
    public T[] elem;
    public int useSize;

    public MyArrayList(){
        this.elem=(T[])new Object[10];
    }

    public void add(T data){
        this.elem[useSize] = data;
        this.useSize++;
    }

    public Object get(int pos) {
        return this.elem[pos];
    }
}
public class TestDemo {

    public static void main1(String[] args) {

        MyArrayList<String> myArrayList=new MyArrayList<String>();
        myArrayList.add("只能放<>中指定的String");


//        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.add(1);
//        myArrayList.add("qwe");
//
//        String str = (String) myArrayList.get(1);
    }

}
