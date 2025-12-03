/* Day-01/NumberTypeCheck.java

Write a program to check if a given number is even, odd, or divisible by both 2 and 5.

*/



package Day_01;
import java.util.Scanner;

public class NumberTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 5 ==0) {
            System.out.println("Given number is even and it is divisible by both 2 and 5");
        } else if (num % 2 == 0) {
            System.out.println("Given number is even");
        } else if (num % 5 == 0) {
            System.out.println("Given number is odd but divisible by 5");
        }else {
            System.out.println("Given number is odd");
            }
        sc.close();
        }
    }