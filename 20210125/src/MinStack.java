import java.util.Stack;

/**
 * User:DELL
 * Date:2021-01-25
 * Time:10:52
 */
public class MinStack {
        Stack <Integer>stack = new Stack<>();
        Stack <Integer>minStack = new Stack<>();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            stack.push(x);
            if(minStack.empty()){
                minStack.push(x);
            } else if (x<= minStack.peek()){
                minStack.push(x);
            }

        }

        public void pop() {
            int x = stack.pop();
            if(x==minStack.peek()){
                minStack.pop();
            }
        }

        public int top() {
            return  -1;

        }

        public int getMin() {
            return  -1;
        }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

}
