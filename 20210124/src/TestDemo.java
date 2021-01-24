import java.util.LinkedList;
import java.util.Queue;

/**
 * User:DELL
 * Date:2021-01-24
 * Time:9:09
 */
public class TestDemo {
    //约瑟夫问题2
    public int Joseph(int n) {
        // write code here
        if(n<1){return -1;}
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int i =1;
        int round=2;
        int cur = 0;
        for(;i<=n;i++) {
            queue.add(i);
        }
        while(queue.size()>1){
            i=0;
            while (queue.size()>1 && i<queue.size()){
                cur = (cur + 1) % round;
                if(cur!=1) {
                    queue.remove(i);
                } else{
                    i++;
                }
            }
            round++;
            cur=0;
            if(queue.size()>1){
                int last = queue.removeLast();
                queue.addFirst(last);
            }
        }
        return queue.pop();
    }

    public static void main2(String[] args) {
        LinkedList <Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.removeLast());
        for (int i = 0; i <queue.size() ; i++) {
            System.out.print(queue.get(i));
        }
    }
    public static void main1(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        queue.add(1);//默认尾入，LinkedLast
        queue.offer(2);//尾插
        /*
        区别：队列满了的话，offer由于add ，因为add会抛出异常
        offer用的多
         */
        queue.remove(1);
        System.out.println(queue.poll());
        //poll多一点


        queue.peek();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("hello");
        linkedList.push("world");//addFirst

    }
}
