package Day_03;

import java.util.Scanner;
public class MenuDrivenCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("\nEnter Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("\nEnter the operation to be performed +, -, *, / or % ");
        char opr = sc.next().charAt(0);

        switch (opr){
            case '+':
                int add = num1 + num2;
                System.out.println("Addition of two numbers "+ num1 +" + "+ num2 + " is = "+add);
                break;

            case '-':
                int sub = num1 - num2;
                System.out.println("Subtraction of two numbers "+ num1 +" - "+ num2 + " is = "+sub);
                break;

            case '*':
                int mul = num1 * num2;
                System.out.println("Multiplication of two numbers "+ num1 +" * "+ num2 + " is = "+mul);
                break;

            case '/':
                if(num2==0){
                    System.out.println("Division by Zero is not allowed!");
                    break;
                }
                double div = (double) num1 / num2;
                System.out.println("Division of two numbers "+ num1 +" / "+ num2 + " is = "+div);
                break;

            case '%':
                if(num2==0){
                    System.out.println("Modulus by Zero is not allowed!");
                    break;
                }
                int mod = num1 % num2;
                System.out.println("Modulus of two numbers "+ num1 +" % "+ num2 + " is = "+mod);
                break;

            default:
                System.out.println("Invalid Operation Choice!");
        }
        sc.close();
    }
}
