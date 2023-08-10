import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if (n%3==0 && n%5==0){
            System.out.println("fizzbuzz");
        }else if (n%5==0) {
            System.out.println("buzz");
        }
        else if (n%3==0) {
            System.out.println("fizz");
        }else{
            System.out.println(n);
        }
    }
}