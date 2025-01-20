// 5. Generating the Fibonacci Series
import java.util.Scanner;
public class IsFibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = input.nextInt();
        System.out.println("The Fibonacci numbers upto " + limit + " are: ");
        if (limit == 0){
            System.out.println("0");
            return;
        }
        System.out.print("0 1 ");
        int a = 0, b = 1, c = 0;
        for(int i = 0; i <= limit && limit > 0; i ++){
            c = a + b;
            a = b;
            b = c;
            if(c > limit)
            break;
            System.out.print(c + " ");
        }
    }
}
