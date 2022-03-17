package number;

import java.util.Scanner;

public class CheckPrime2 {
    public static void main(String[] args) {
        Integer counter = 0, j = 2;
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        if (n <= 1) {
            counter = 1;
        }

        while (j <= n/2) {
            if (n % j == 0) {
                counter = 1;
                break;
            }
            else {
                j++;
            }
        }

        if (counter == 0) {
            System.out.println(n + " is prime number");
        }
        else {
            System.out.println(n + " is not prime number");
        }
    }
}
