package LinkedList;

public class ImplementationLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtBeginning(int val){
            Node temp=new Node(val);
            if(head==null){ //empty list
                head=tail=temp;
            }
            else{ //non empty list
                temp.next=head;
                head=temp;
            }
        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtBeginning(2);
        ll.display();
        ll.insertAtEnd(4);
        ll.display();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtBeginning(7);
        ll.display();
    }
}
