/**
 * User:DELL
 * Date:2020-12-30
 * Time:19:50
 */
public class TestDemo {

    //环入口
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        myLinkedList.head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        System.out.println(myLinkedList.detectCycle().val);

    }

    //是否有环
    public static void main20(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        Node headA = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        headA.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        System.out.println(myLinkedList.hasCycle(headA));
    }

    //相交
    public static void main19(String[] args) {
        MyLinkedList myLinkedList1=new MyLinkedList();
        MyLinkedList myLinkedList2=new MyLinkedList();
        Node headA = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        headA.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        Node headB = new Node(1);
        Node node11 = new Node(1);
        Node node22 = new Node(1);
        headB.next=node11;
        node11.next=node22;
        node22.next=node2;
        System.out.println(TestDemo.chk(headA, headB).val);

    }

    //回文
    public static void main18(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        Node node = new Node();
        myLinkedList.addLast(9);
        myLinkedList.addLast(7);
        myLinkedList.addLast(7);
        myLinkedList.addLast(9);
        System.out.println(myLinkedList.chkPalindrome());
    }

    //doubleLinkedList
    public static void main17(String[] args) {
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addLast(5);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addIndex(5,666);
        doubleLinkedList.display();
//        doubleLinkedList.remove(1);
//        doubleLinkedList.remove(666);
//        doubleLinkedList.remove(3);
//        doubleLinkedList.display();
        doubleLinkedList.removeAllKey(3);
        doubleLinkedList.display();


    }

    //相交
    public static Node chk(Node headA,Node headB) {
        if(headA==null || headB==null) {
            return null;
        }
        Node plong = headA;
        Node pshort = headB;
        int lenA = 0;
        int lenB =0;
        while (plong!= null ) {
            plong = plong.next;
            lenA++;
        }
        while (pshort!= null ) {
            pshort = pshort.next;
            lenB++;
        }
        plong= headB;
        pshort = headA;
        int n = lenA-lenB;
        if(n <0) {
            plong = headB;
            pshort = headA;
            n=lenB-lenA;
        }

        while (n!=0) {
            plong = plong.next;
            n--;
        }

        while (plong!= pshort) {
            plong = plong.next;
            pshort = pshort.next;
        }
        return plong;


    }

    public static void main16(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(2);
        myLinkedList.addLast(233);
        System.out.print("删除前 ： ");
        myLinkedList.display();
        System.out.print("删除后 ： ");
        myLinkedList.remove(233);
        myLinkedList.display();


    }

    public static void main15(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(2);
        myLinkedList.display();
        System.out.print("key结点的前驱 ： ");
        System.out.println(myLinkedList.searchPrev(9).val);
    }

    public static void main14(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(2);
        System.out.print("添加前 ： ");
        myLinkedList.display();
        System.out.print("添加后 ： ");
        myLinkedList.addIndex(23,2);
        myLinkedList.display();
    }

    public static void main13(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(2);
        myLinkedList.display();
        System.out.println(myLinkedList.moveIndex(3).val);

    }

    public static void main12(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(1);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(5));
        System.out.println(myLinkedList.contains(15));

    }

    public static void main11(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(1);
        myLinkedList.display();
        System.out.println("第n个结点： " +myLinkedList.findN(2).val);
    }

    public static void main10(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(1);
        myLinkedList.display();
        System.out.println("链表长度： " +myLinkedList.size());
    }

    public static void main9(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(1);
        myLinkedList.display();
        System.out.println(myLinkedList.findLastTwoNode().val);
    }

    public static void main8(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(1);
        myLinkedList.display();
        System.out.println("尾结点： "+myLinkedList.findLastNode().val);
    }

    public static void main7(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(27);
        myLinkedList.addFirst(27);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(35);
        myLinkedList.addFirst(27);
        myLinkedList.addFirst(19);
        myLinkedList.addFirst(27);
        System.out.print("原链表：");
        myLinkedList.display();
        System.out.print("删除后：");
        myLinkedList.removeAllKey(27);
        myLinkedList.display();

    }

    public static void main6(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(17);
        myLinkedList.addFirst(18);
        myLinkedList.addFirst(21);
        myLinkedList.addFirst(35);
        myLinkedList.addFirst(37);
        myLinkedList.addFirst(69);
        System.out.print("原链表：");
        myLinkedList.display();
        System.out.print("反转链表：");
        myLinkedList.display(myLinkedList.reverse());

    }

    public static void main5(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(17);
        myLinkedList.addFirst(18);
        myLinkedList.addFirst(21);
        myLinkedList.addFirst(35);
        myLinkedList.addFirst(37);
        myLinkedList.addFirst(69);
        myLinkedList.display();
        System.out.print("中间结点是：");
        System.out.println(myLinkedList.midNode().val);
    }


    public static void main4(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(17);
        myLinkedList.addFirst(18);
        myLinkedList.addFirst(21);
        myLinkedList.addFirst(35);
        myLinkedList.addFirst(37);
        myLinkedList.addFirst(69);
        myLinkedList.display();
        System.out.println(myLinkedList.findKthToTail(4).val);

    }

    public static void main3(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(17);
        myLinkedList.addFirst(18);
        myLinkedList.addFirst(21);
        myLinkedList.addFirst(35);
        myLinkedList.addFirst(37);
        myLinkedList.addFirst(69);
        System.out.print("List1 : ");
        myLinkedList.display();
        MyLinkedList myLinkedList2=new MyLinkedList();
        myLinkedList2.addFirst(7);
        myLinkedList2.addFirst(17);
        myLinkedList2.addFirst(31);
        myLinkedList2.addFirst(36);
        myLinkedList2.addFirst(44);
        myLinkedList2.addFirst(57);
        System.out.print("List2 : ");
        myLinkedList2.display();
        Node node1 =myLinkedList.mergeTwoLists(myLinkedList.head,myLinkedList2.head);
        myLinkedList.display(node1);


    }

    public static void main2(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(27);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(35);
        myLinkedList.addFirst(17);
        myLinkedList.addFirst(19);
        myLinkedList.display();
        Node node1=myLinkedList.partition(18);
        myLinkedList.display(node1);


    }

    public static void main1(String[] args) {
        Node node = new Node();
        MyLinkedList myLinkedList=new MyLinkedList();
//        myLinkedList.createLinked();
//        myLinkedList.display();
//        System.out.println(myLinkedList.contains(12));
//        System.out.println(myLinkedList.contains(99));
//        System.out.println(myLinkedList.findLastNode().val);
//        System.out.println(myLinkedList.findLastTwoNode().val);
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.findN(2).val);
//        myLinkedList.findN(5);
//        myLinkedList.addFirst(9);
//        myLinkedList.addFirst(7);
//        myLinkedList.addFirst(5);
//        myLinkedList.addFirst(1);
//        myLinkedList.display();
//        myLinkedList.addIndex(99,2);
//        myLinkedList.addIndex(88,2);
//        myLinkedList.display();
//        myLinkedList.addIndex(88,7);
//        myLinkedList.remove(3);
        //myLinkedList.removeAllKey(5);
        //myLinkedList.display(myLinkedList.reverse());
        //System.out.println(myLinkedList.findKthToTail(5).val);

        MyLinkedList myLinkedList2= new MyLinkedList();
        myLinkedList2.addFirst(68);
        myLinkedList2.addFirst(67);
        myLinkedList2.addFirst(54);
        myLinkedList2.addFirst(32);
        myLinkedList2.addFirst(32);
        myLinkedList2.addFirst(32);
        myLinkedList2.addFirst(22);
        myLinkedList2.display();
        //Node node1=myLinkedList.mergeTwoLists(myLinkedList.head,myLinkedList2.head);
        //myLinkedList.display(node1);
        //Node node1=myLinkedList2.partition(23);
        //myLinkedList2.display(node1);
        Node node1 = myLinkedList2.deleteDuplication(myLinkedList2.head);
        myLinkedList2.display(node1);




    }
}
