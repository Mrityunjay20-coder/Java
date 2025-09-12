package OOPSinJAVA;

 class information {
    int rollno;
    String name;
    int age;
}
//generally main method public class k andar rehta haii
public class Student {
    public static void main(String[] args) {
        information obj = new information();
        obj.rollno =242459;
        obj.name="Mrityunjay";
        obj.age=21;
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.rollno);
        
        information obj2 = new information();
        obj2.rollno = 242403;
        obj2.name="Abhijeet";
        obj2.age=21;
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.rollno);
    }
}