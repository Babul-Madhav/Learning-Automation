/* Day-01/MarksValidation.java

Given three numbers, determine if they can form a valid set of marks where the pass condition is each subject >= 40 and average >= 50.

*/

package Day_01;

import java.util.Scanner;
public class MarksValidation {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();
        double avg = (sub1 + sub2 + sub3) / 3.0;
        System.out.println("Average Marks: " + avg);

        if(sub1 >=40 && sub2 >=40 && sub3 >=40 && avg >=50){
            System.out.println("Valid Set of Marks");
        } else {
            System.out.println("Invalid Set of Marks");
        } sc.close();
    } 
}
