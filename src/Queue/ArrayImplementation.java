package Queue;

public class ArrayImplementation {
    public static class queueA{
        int [] arr=new int[100];
        int f=-1; //front
        int r=-1; //rear
        int size=0;

        void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if(f==-1) {
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[r+1]=val;
                r++;
            }
            size++;
        }

        int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            int x=arr[f];
            f++;
            size--;
            return x;
        }

        int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }

        boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }

        void display(){
            if(size==0){
                System.out.println("queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueA q=new queueA();
        q.display();
        q.add(5);
        //q.display();
        q.add(2);
       // q.display();
        q.add(3);
        q.add(4);
        q.add(6);
        q.display();
        q.remove();
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
