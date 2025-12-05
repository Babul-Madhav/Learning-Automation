package Day_03;

import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int a = sc.nextInt();
        System.out.println("Enter the power number: ");
        int b = sc.nextInt();

        if(b<0){
            System.out.println("\nEnter a valid power number");
            sc.close();
            return;
        }

        int result=1;

        if(b==0){
            System.out.println("\nFinal Computed Power Value is: " +result);
            sc.close();
            return;
        }

        if(a==0 && b>0){
            result =0;
            System.out.println("\nFinal Computed Power Value is: " +result);
            sc.close();
            return;
        }
        for(int i=1; i<=b; i++){
            result*=a;
        }
        System.out.println("\nFinal Computed Power Value is: " +result);
        sc.close();
    }
}
