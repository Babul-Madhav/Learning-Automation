package Day_03;

import java.util.Scanner;
public class PrimeNumberCheck {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int n = sc.nextInt();

        if(n<=1){
            System.out.println("Enter number greater than 1!");
            sc.close();
            return;
        }
        boolean isPrime= true;
        for(int i=2; i<=n/2; i++){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Entered Number is prime!");
        }else
            System.out.println("Entered Number is not a prime number!");
        sc.close();
    }

}
