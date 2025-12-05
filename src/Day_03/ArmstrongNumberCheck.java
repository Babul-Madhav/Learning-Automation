package Day_03;

import java.util.Scanner;
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check the Armstrong Number: ");
        int arm = sc.nextInt();

        if (arm < 0) {
            System.out.println("Armstrong Number cannot be a Negative Number");
            sc.close();
            return;
        }

        int original = arm;
        int count = 0;
        int temp = arm;
        while(temp>0){
            temp/=10;
            count++;
        }

        int temp2 = arm;
        int sum = 0;
        while(temp2 > 0){
            int digit = temp2 %10;
            sum += Math.pow(digit, count);
            temp2 /=10;
        }

        if(sum==original){
            System.out.println(original+ " is an Armstrong Number");
        } else System.out.println(original+ " is not an Armstrong Number");

        sc.close();

    }
}
