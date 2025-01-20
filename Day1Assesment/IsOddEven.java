package Day1Assesment;
// Determining Even/Odd Numbers

import java.util.Scanner;
public class IsOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The Number " + num + " is " + ((num & 1) == 0 ? "Even" : "Odd"));
    }
}