import java.util.LinkedList;
import java.util.Queue;

/**
 * User:DELL
 * Date:2021-01-25
 * Time:9:30
 */
public class MyStack {

    private Queue<Integer> qu1 = new LinkedList<>();

    private Queue<Integer> qu2 = new LinkedList<>();


    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        //谁不为空入到哪个队列当中
        if(qu1.isEmpty()){
            qu1.offer(x);
            return;
        } else if(qu2.isEmpty()){
            qu2.offer(x);
        } else {
            qu1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        //每次出不为空的队列，出size-1个 到另外一个为空的队列，最后弹出剩余的那一个元素
        if(empty()) return -1;
        if(!qu2.isEmpty()){
            int size=qu2.size();
            while (size-1>0) {
                qu1.offer(qu2.peek());
                qu2.poll();
            }
            return qu2.poll();
        }
        if(!qu1.isEmpty()){
            int size=qu1.size();
            while (size-1>0) {
                qu2.offer(qu1.peek());
                qu1.poll();
            }
        }
        return qu1.poll();
    }

    /** Get the top element. */
    public int top() {
        return 1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return qu2.isEmpty()&&qu1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
