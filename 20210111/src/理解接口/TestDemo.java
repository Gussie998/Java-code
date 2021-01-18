package 理解接口;

/**
 * User:DELL
 * Date:2021-01-17
 * Time:11:11
 */

class Animal{
    public String name;

    public  Animal(String name){
        this.name=name;
    }

}
interface IRuning{
    void iRuning();
}
class Duck extends Animal implements IRuning{

    public Duck(String name){
        super(name);
    }

    @Override
    //构造方法
    public void iRuning() {
        System.out.println(this.name + "走");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        IRuning iRuning = new Duck("丫丫");
        iRuning.iRuning();

    }
    public static void goRun(IRuning iRuning){

    }
}
