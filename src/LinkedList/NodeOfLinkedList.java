package LinkedList;


public class NodeOfLinkedList {
    public static void main(String[] args) {
        // 10 20 30 40 50
        Node a = new Node(10); // LinkedList.Node@8efb846
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // to connect the values and nodes:
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.next.next.next.val);
        System.out.println(b.next);
        System.out.println(a.next.next);

    }
}
