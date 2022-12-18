package AlgorithmProblems;

import java.util.Scanner;

public class PrimeInRange {
    public static void primeInRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial number");
        int initial = sc.nextInt();
        System.out.println("Enter Final number");
        int last = sc.nextInt();
        System.out.println("Prime Number In Range Are---");
        for (int i = initial; i <= last; i++)
            if (isPrime(i))
                System.out.print(i + " | ");
    }
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        primeInRange();
    }
}
