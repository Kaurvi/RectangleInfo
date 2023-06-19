import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        boolean done = false;
        while (!false) {
            System.out.println("Enter the width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
                ;} else {
                System.out.println("Enter the valid value!");
                in.nextLine();}
            { System.out.println("Enter the height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
                ;} else {
                System.out.println("Enter the valid value!");
                in.nextLine();
        } double area = width * height;
                double perimeter = 2 * (width + height);
                double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
            System.out.println("The area of rectangle = "+area);
                System.out.println("The perimeter of rectangle = "+perimeter);
                System.out.println("The diagonal of rectangle = "+diagonal);
                while(true);
    }
        }
    }
}
