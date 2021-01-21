package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * User:DELL
 * Date:2021-01-21
 * Time:15:29
 */

public class TestDemo3<T> {
    T value;

    TestDemo3(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }

    @Override
    public String toString() {
        return "TestDemo3{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        List <TestDemo3> list = new ArrayList<>();
        TestDemo3 testDemo3=new TestDemo3(33);
        list.add(testDemo3);
        System.out.println(list);
        System.out.println(testDemo3.get());
    }
}

