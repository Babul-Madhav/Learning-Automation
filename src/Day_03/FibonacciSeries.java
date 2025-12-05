package Day_03;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to print the Fibonacci Series: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Entered a Number greater than Zero!");
            sc.close();
            return;
        }

        int first = 0, second=1;

        if (n == 1) {
            System.out.println("The Fibonacci Series for the given number is: " + first);
            sc.close();
            return;
        }

        System.out.print("The Fibonacci Series for the given number are: " + first + " " + second + " ");

        for(int i=3; i<=n; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        sc.close();
    }
}
