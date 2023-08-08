import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static BigInteger fact(int n){
        BigInteger result = BigInteger.valueOf(1);
        for (int i=1;i<=n;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i+"! = "+fact(i));
        }
    }
}
