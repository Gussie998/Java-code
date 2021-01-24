package Queue;

/**
 * User:DELL
 * Date:2021-01-24
 * Time:9:58
 */
public class TestQueue {
    public static void main1(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.peek());

    }
}
