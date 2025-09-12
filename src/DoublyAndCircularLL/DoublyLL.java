package DoublyAndCircularLL;

public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static Node insertAtHead(Node head,int x){
        Node t=new Node(30);
        t.next=head;
        head.prev=t;
        head=t;
        return t;
    }

    public static void insertAtTail(Node Head,int x){
        Node temp=Head;
        //temp ko tail tk le jaate hai
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }

    public static void insertAtIdx(Node head,int idx,int x){
        Node s=head;
        for(int i=0;i<=idx-1;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random){
        Node temp=random;
        //move this temp backwards to head
        while(temp.prev!=null){
            temp=temp.prev;
        }
        //temp is at head
        //print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(18);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        //displayrev(e);
        //display2(c);
        //Node newHead=insertAtHead(a,22);
        //display(newHead);
        insertAtTail(a,30);
        display(a);
        insertAtIdx(a,3,56);
        display(a);
    }
}
