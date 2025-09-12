package Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;
public class percentageElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage of the condition: ");
        int n = sc.nextInt();
        if (n>90){
            System.out.println("excellent");
        }
        else if (n>80){
            System.out.println("very good");
        }
        else if (n>70){
            System.out.println("good");
        }
        else if (n>60){
            System.out.println("can do better");
        }
        else if (n>50){
            System.out.println("average marks");
        }
        else if (n>40){
            System.out.println("below average");
        }
        else {
            System.out.println("fail");
        }
    }
}
