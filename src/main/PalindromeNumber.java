package main;

public class PalindromeNumber {
    public static void main(String[] args) {
        int input = 1221;
        boolean output = isPalindromeNumber(input);
        System.out.println(output);
    }

    private static boolean isPalindromeNumber(int input) {
        int tempInput = input;
        int result = 0;

        while (tempInput > 0) {
            result = result * 10 + tempInput % 10;
            tempInput /= 10;
        }

        if (result == input) {
            return true;
        }
        return false;
    }
}
