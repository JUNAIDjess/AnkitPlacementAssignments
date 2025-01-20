import java.util.Scanner; 
public class isPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The number " + num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
    }
    public static boolean isPrime(int n){
        if(n <= 1)
        return false;
        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
