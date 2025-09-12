package LinkedList;

public class ReverseLL {
    public static void reverse(Node head){
        if (head==null) return;
        reverse(head.next);
        System.out.print(head.data+" ");
    }

    public static class Node {
        int data; //value
        Node next; //address of next node
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        //5->3->9->8->16---TARGET
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        reverse(a);
    }
}
