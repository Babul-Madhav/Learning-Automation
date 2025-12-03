package Day_02;

import java.util.Scanner;
public class SwapTwoNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        if (num1 <=0 || num2<=0){
            System.out.println("Enter a positive value number to swap");
            sc.close();
            return;
        }
        System.out.println("Values before swapping: " + num1 + " , " + num2);
        num1 = num1 + num2; // num1 = 1 + 2 = 3 num1 becomes 3
        num2 = num1 - num2; // num2 = 3 - 2 = 1 --> num1 value is stored in num2
        num1 = num1 - num2;
        System.out.println("Values after swapping: " +num1 + " , " + num2);
        sc.close();
    }
}
