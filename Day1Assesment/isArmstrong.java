// 4. Calculating Armstrong Numbers
import java.util.Scanner;
public class isArmstrong {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The number " + num + " is " + (is_armstrong(num) ? "Armtrong" : "Not an Armstrong"));
    }
    public static boolean is_armstrong(int n){
        double sum = 0;
        int temp = n;
        int count = 0;
        // Count the number of digits
        while(temp > 0){
            temp /= 10;
            count ++;
        }
        temp = n;
        while(temp > 0){
            int remainder = temp % 10;
            sum = sum + Math.pow(remainder, count);
            temp /= 10;
        }
        if(sum == n)
        return true;
        else
        return false;
    }
}
