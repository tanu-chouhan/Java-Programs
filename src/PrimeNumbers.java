import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime(int n){
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();

        for(int i=1;i<=l;i++){
            if(isPrime(i)){
                System.out.println(i+" Prime");
            }else {
                System.out.println(i+" Not Prime");
            }
        }
    }
}
