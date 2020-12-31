/**
 * User:DELL
 * Date:2020-12-30
 * Time:19:50
 */
public class TestDemo {
    public static void main(String[] args) {
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
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(1);
        myLinkedList.display();
//        myLinkedList.addIndex(99,2);
//        myLinkedList.addIndex(88,2);
//        myLinkedList.display();
//        myLinkedList.addIndex(88,7);
//        myLinkedList.remove(3);
        myLinkedList.removeAllKey(5);
        myLinkedList.display();






    }
}
