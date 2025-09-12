package OOPsShradha;

public class Multilevelinheritance {
    public static void main(String[] args) {
        humans h1=new humans();
        h1.color="black";
        System.out.println(h1.color);
        h1.eat();
        h1.lifespan();
    }

    static class Animal{
        String color;
        void eat(){
            System.out.println("animal eats");
        }
    }
    static class Mammals extends Animal{
        int legs;
        void function(){
            System.out.println("mamals are warm blooded");
        }
    }
    static class humans extends Mammals{
        String gender;
        void lifespan(){
            System.out.println("humans have generally 60 years of lifespan");
        }
    }
}
