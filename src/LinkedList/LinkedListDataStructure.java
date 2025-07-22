package LinkedList;
class Node{ // user defined data type
    int val;
    Node next;
    Node(int val){
        this.val = val;

    }
}
class Linkedlist{ // user defined data structure
    Node head ; // null
    Node tail; // null
    void addAtTail(int val){
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist  ll = new Linkedlist();
        ll.addAtTail()
    }


}
