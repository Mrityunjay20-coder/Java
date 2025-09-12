package LinkedList;

public class DisplayingFuctionLL {
    public static void displayrecursively(Node head){
        if (head==null) return;
        System.out.print(head.data+" ");
        displayrecursively(head.next);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        display(a);
        System.out.println();
        displayrecursively(a);
    }
}