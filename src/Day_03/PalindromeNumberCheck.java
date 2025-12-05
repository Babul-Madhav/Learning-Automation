package Day_03;

import java.util.Scanner;
public class PalindromeNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if the number is palindrome or not: ");
        int n = sc.nextInt();

        int original = n;
        int sign = (n < 0) ? -1 : 1;
        n = Math.abs(n);

        int reverse = 0;
        while (n != 0) {
            int digit = n % 10; //  1234 % 10 = 4
            reverse = reverse * 10 + digit; // 0*10 +4 = 4
            n = n / 10;
        }
        reverse*=sign;

        if (reverse == original) {
            System.out.println("Given number "+ original + " is palindrome!");
        } else System.out.println("Given number "+ original + " is not a palindrome!");
        sc.close();
    }
}
