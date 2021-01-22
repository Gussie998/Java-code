package List;

import java.util.Stack;

/**
 * User:DELL
 * Date:2021-01-22
 * Time:11:12
 */
public class TestDemo2 {
    public static void main2(String[] args) {
        MyStack  stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //拿到栈顶元素，但是不是删除
        System.out.println(stack.peek());
        //弹出栈顶元素
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
    public static void main1(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //拿到栈顶元素，但是不是删除
        System.out.println(stack.peek());
        //弹出栈顶元素
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());

    }
}
