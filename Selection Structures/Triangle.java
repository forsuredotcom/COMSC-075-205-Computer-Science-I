import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("Enter three lengths of sides of the triangle separated by space: ");

        try (Scanner input = new Scanner(System.in)) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
        }

        if ( (a >= b + c) 
            || (b >= a + c) 
            || (c >= a + b) ) {
            System.out.print("Those sides do not specify a valid triangle.");
        } else {
            System.out.printf("The perimeter of the triangle is %f", a + b + c);  
        }
    }
}