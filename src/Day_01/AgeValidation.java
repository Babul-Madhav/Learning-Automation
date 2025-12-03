package Day_01;
/* Day-01/AgeValidation.java

Write a program that takes an integer input and determines whether it is a valid age for system registration (valid range: 18–60).

*/


import java.util.Scanner;

public class AgeValidation {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); // This is used for taking input from user.
        System.out.println("Enter your age: "); // Prompt user for age input on the console.
        int age = sc.nextInt(); // Read the integer input from user and store it in variable 'age'.
        if(age >= 18 && age <= 60){ // Check if age is within valid range
            System.out.println("Valid age for registration."); // Check if age is within valid range
        } else {
        System.out.println("Invalid age for registration."); // Age is outside valid range
        }
        sc.close(); // Closing the scanner since if it is not closed it may lead to resource leak.
    }
}
