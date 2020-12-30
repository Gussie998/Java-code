/**
 * User:DELL
 * Date:2020-12-30
 * Time:11:33
 */
class Node{
    public int val;
    public Node next;
    public Node(){

    }
    public Node(int val){
        this.val=val;
    }
}

public class MyLinkedList {

    public Node head;//引用

    public void display() {
        Node cur=this.head;
        while (cur!=null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void createLinked( ) {
        this.head = new Node(12);
        Node node2 = new Node(22);
        Node node3 = new Node(32);
        Node node4 = new Node(42);
        this.head.next=node2;
        node2.next=node3;
        node3.next=node4;

    }

    public Node findLastNode() {
        if(this.head==null) {
            System.out.println("null");
            return null;
        }
        Node cur = this.head;
        while (cur.next!= null) {
            cur = cur.next;
        }
        return cur;
    }

    public Node findLastTwoNode(){
        if(this.head==null) {
            System.out.println("null");
            return null;
        }
        if(this.head.next==null) {
            System.out.println("only one node");
            return null;
        }
        Node cur=this.head;
        while (cur.next.next!=null) {
            cur = cur.next;
        }
        return cur;
    }

    public int size() {
        Node cur =this.head;
        int count=0;
        while (cur!= null) {
            count++;
            cur= cur.next;
        }
        return count;
    }

    public Node findN(int n) {
        if(this.head == null) {
            System.out.println("null");
            return null;
        }
        if(n<=0 || n>size()) {
            System.out.println("too big or small");
            return null;
        }
        int count=1;
        Node cur = this.head;
        while (count!=n) {
            cur= cur.next;
            count++;
        }
        return cur;
    }

    public boolean contains(int key) {
        Node cur = this.head;
        while (cur!= null) {
            if(cur.val==key) {
                return true;
            } else {
                cur =cur.next;
            }
        }
        return false;
    }

    //头插法
    public void addFirst( int data) {
        Node newNode =new Node(data);
        if(this.head==null) {
            this.head=newNode;
        } else {
            newNode.next=this.head;
            this.head=newNode;
        }
    }

    //尾插法
    public void addLast( int data ) {
        Node newNode =new Node(data);
        if(this.head==null) {
            this.head=newNode;
        } else {
            Node cur = findLastNode();
            cur.next=newNode;
        }


    }

    public Node moveIndex (int index) {
        Node cur = this.head;
        int count=index-1;
        while (count!=0) {
            cur= cur.next;
            count--;
        }
        return cur;
    }

    public void addIndex(int data,int index ){
        if(index<0 || index > size()) {
            System.out.println("index不合法");
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index==size()) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node cur = moveIndex(index);
        newNode.next=cur.next;
        cur.next=newNode;
    }
}
