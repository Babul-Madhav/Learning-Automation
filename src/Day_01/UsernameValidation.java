/* Day-01/UsernameValidation.java

Write a program that checks whether a given username string is valid.
The rule: must be at least 6 characters and must not contain spaces.

*/
package Day_01;
import java.util.Scanner;
public class UsernameValidation {

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        if(username.length() >= 6 && !username.contains(" ")){
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        } sc.close();
    }
}
