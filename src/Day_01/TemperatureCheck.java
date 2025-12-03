/* Day-01/TemperatureCheck.java

Given a temperature value in Celsius, convert it to Fahrenheit and determine whether it falls within safe operational limits for a system (10°C to 40°C).

*/


package Day_01;
import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the temperature in Celsius: ");
        double temp = sc.nextDouble(); // Read temperature input and store in variable 'temp' 
        double fahrenheit = (temp * 9.0/5.0) + 32; // Convert Celsius to Fahrenheit and store in 'fahrenheit', 
        // making sure that 9/5 is treated as a double division and not integer division.
        if(temp >= 10 &&  temp <= 40) {
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Alert: Temperature is out of the safe range. Temperature in Fahrenheit: " + fahrenheit);
        }
        sc.close();
    }
}
