package number;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Integer counter = 0;
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            System.out.println(n + " is prime number");
        }
        else {
            System.out.println(n + " is not prime number");
        }
    }
}
