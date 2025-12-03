package Day_02;

import java.util.Scanner;
public class ComplexExpression {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the value for a: ");
        int a= sc.nextInt();

        System.out.println("Input the value for b: ");
        int b= sc.nextInt();

        System.out.println("Input the value for b: ");
        int c= sc.nextInt();

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Input value must be positive and greater than 0!");
            sc.close();
            return;
        }

        int result = (a + b) * c - (a % b);
        System.out.println(result);

        sc.close();
    }
}
