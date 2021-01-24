import java.util.Stack;

/**
 * User:DELL
 * Date:2021-01-24
 * Time:12:09
 */
//字符串匹配
public class TestDemo2 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else {
                //判断当前栈是否为空
                if (stack.empty()){
                    return false;
                }
                char topch = stack.peek();
                if(topch=='{'&&ch=='}' ||topch=='['&&ch==']' ||topch=='('&&ch==')' ){
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
