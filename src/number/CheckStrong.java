package number;

public class CheckStrong {
    static int[] facts = new int[10];

    public static void main(String[] args) {
        preCompute();

        int x = 145;
        if (isStrong(x)) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }

    private static boolean isStrong(int x) {
        int factSum = 0;
        int temp = x;
        while (temp > 0) {
            factSum += facts[temp % 10];
            temp /= 10;
        }
        return factSum == x;
    }

    private static void preCompute() {
        facts[0] = facts[1] = 1;
        for (int i = 2; i < 10; i++) {
            facts[i] = facts[i-1] * i;
        }
    }
}
