package Conditionals;
import java.util.Scanner;
public class areaPerimeterGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        if (area > perimeter) {
            System.out.println("The area is greater than the perimeter of the rectangle");
        }
        else if (area < perimeter) {
            System.out.println("The area is less than the perimeter of the rectangle");
        }
        else {
            System.out.println("The area is equal to the perimeter of the rectangle");
        }
    }
}
