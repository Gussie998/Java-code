/**
 * User:DELL
 * Date:2021-01-23
 * Time:19:40
 */
class LinkedNode{
    public int val;
    public LinkedNode next;

    public LinkedNode(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
    public LinkedNode head;

    public LinkedNode addFirst(int data){
        LinkedNode node = new LinkedNode(data);
        if(this.head==null) {
            this.head=node;
            return this.head;
        }
        node.next=this.head;
        this.head=node;
        return this.head;
    }

    public LinkedNode findLastNode(){
        if(this.head==null) {
            return null;
        }
        LinkedNode cur = this.head;
        while (cur.next!=null) {
            cur = cur.next;
        }
        return cur;
    }

    public LinkedNode addLast(int data) {
        LinkedNode node = new LinkedNode(data);
        if(this.head==null) {
            this.head=node;
            return this.head;
        }
        LinkedNode cur = findLastNode();
        cur.next=node;
        return this.head;
    }

    public void display(){
        if(this.head==null) {
            return;
        }
        LinkedNode cur = this.head;
        while (cur!=null) {
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public int size(){
        LinkedNode cur = this.head;
        int count = 0;
        while (cur!=null) {
            count++;
            cur=cur.next;
        }
        return count;
    }



    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.display();
        System.out.println(linkedList.size());

    }
}
