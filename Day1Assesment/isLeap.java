// 3. Validating Leap Years
import java.util.Scanner;
 public class isLeap{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("The year " + year + " is " + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "Leap Year" : "Not a Leap Year"));
    }
 }