public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int firstTerm=0;
        int secondTerm=1;
        System.out.println(firstTerm);
        System.out.println(secondTerm);
        int i=2;
        while (i<n) {
            int thirdTerm = firstTerm+secondTerm;
            System.out.println(thirdTerm);
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
            i++;
        }
    }
}

