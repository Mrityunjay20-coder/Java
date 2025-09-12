package OOPsShradha;

public class Constructor {
    public static void main(String[] args) {
        //Student s1=new Student("Mrityunjay");
        //System.out.println(s1.name);
        Student s2=new Student();
        s2.name="mrityunjay";
        s2.roll=123;
        s2.password="abcd";

        Student s3=new Student(s2);
        s3.password="123";
    }
}

class Student{
    String name;
    int roll;
    String password;
//parametrized constructor
    Student(String name){
        //System.out.println();
        this.name=name;
    }

//non parametrized constructor
    Student(){
        System.out.println("constructor is called");
    }

//copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.roll= s2.roll;
    }
}