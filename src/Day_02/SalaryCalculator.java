package Day_02;

import java.util.Scanner;
public class SalaryCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        if(basic <=0){
            System.out.println("Enter value greater than 0!");
            sc.close();
            return;
        }

        double da = 0.40 * basic;
        double hra = 0.20 * basic;

        double gross = basic + da + hra;
        System.out.printf("\nGross Salary is: %.2f \n", gross);
        System.out.printf("With (40%%) of Dearness Allowance being: %.2f \n", da);
        System.out.printf("With (20%%) of HRA being: %.2f \n", hra);
        sc.close();

    }
}
