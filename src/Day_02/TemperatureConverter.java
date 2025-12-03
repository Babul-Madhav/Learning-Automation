package Day_02;


import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //F = C * 9/5 + 32
        //C = (F - 32) * 5/9

        System.out.println("Enter Temperature to Convert into Fahrenheit:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0/5.0) + 32;
        System.out.printf("Post Conversion to Fahrenheit the value is: %.2f \n", fahrenheit);

        System.out.println("Now Enter the Temperature to Convert into Celsius:");
        double fahrenheit1 = sc.nextDouble();
        double celsius1 = (fahrenheit1 -32) * 5.0/9.0;
        System.out.printf("Post Conversion to Celsius the value is: %.2f", celsius1);

        sc.close();
    }
}
