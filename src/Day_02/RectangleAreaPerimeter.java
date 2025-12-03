package Day_02;
/*

Write a program that asks the user to input the length and breadth of a rectangle. Then compute and display both the area and the perimeter of the rectangle.

Core formulas:
Area = length × breadth
Perimeter = 2 × (length + breadth)

 */

import java.util.Scanner;

public class RectangleAreaPerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of a rectangle: ");
        double breadth = sc.nextDouble();
        if(length<=0 || breadth<=0) {
            System.out.println("Enter a value greater than 0");
            sc.close();
            return;
        }
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        System.out.printf("The Area of the rectangle for the given input is: %.2f \n", area);
        System.out.printf("The Perimeter of the rectangle for the given input is: %.2f \n", perimeter);
        sc.close();
    }
}
