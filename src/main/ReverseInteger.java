package main;

public class ReverseInteger {
    public static void main(String[] args) {
        int input = 123456789;
        int reverseInt = getReverseInteger(input);
        System.out.println(reverseInt);
    }

    private static int getReverseInteger(int input) {
        int output = 0;

        while (input > 0) {
            output = output * 10 + input % 10;
            input /= 10;
        }
        return output;
    }
}
