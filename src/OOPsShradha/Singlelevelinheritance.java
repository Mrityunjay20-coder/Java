package OOPsShradha;

public class Singlelevelinheritance {
    public static void main(String[] args) {
        Bat b=new Bat();
        b.eat();
    }
    static class Animal{
        String color;
        void eat(){
            System.out.println("animal eats");
        }
    }

    static class Bat extends Animal{
        int fins;
        void function(){
            System.out.println("it is seen in night");
        }
    }
}
