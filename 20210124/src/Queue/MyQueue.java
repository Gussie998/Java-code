package Queue;

/**
 * User:DELL
 * Date:2021-01-24
 * Time:9:49
 */
//链表

class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    public Node first;
    public Node last;

    public boolean offer(int val){
        Node node = new Node(val);
        if(this.first==null) {
            this.first=node;
            this.last = node;
        } else {
            this.last.next=node;
            this.last=node;
        }
        return true;
    }

    public int poll(){
        if (isEmpty()){
            throw  new RuntimeException("null");
        }
        int ret = this.first.val;
        this.first = this.first.next;
        return ret;
    }

    public boolean isEmpty() {
        if(this.first==null && this.last==null){
            return true;
        }
        return false;
    }

    public int peek(){
        if (isEmpty()){
            throw  new RuntimeException("null");
        }
        return this.first.val;
    }

}
