import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        System.out.println("Time:");
        System.out.println("1. 1 second");
        System.out.println("2. 1 minute");
        System.out.println("3. 1 hour");
        System.out.print("Choose: ");
        int choose = option.nextInt();

        long[] durations = {1_000_000_000L, 60_000_000_000L, 3_600_000_000_000L};
        long timeLimit = choose >= 1 && choose <= 3 ? durations[choose - 1] : 0;

        if (timeLimit == 0) {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("Maximum values computed in " +
                (choose == 1 ? "1 second" : choose == 2 ? "1 minute" : "1 hour") + ":");

        System.out.println("Logarithm: " + findMax(timeLimit, n -> Math.log(n)));
        System.out.println("n^2: " + findMax(timeLimit, n -> Math.pow(n, 2)));
        System.out.println("n^3: " + findMax(timeLimit, n -> Math.pow(n, 3)));
        System.out.println("Square root: " + findMax(timeLimit, n -> Math.sqrt(n)));
    }

    private static long findMax(long timeLimit, java.util.function.DoubleUnaryOperator operation) {
        long startTime = System.nanoTime();
        long n = 0;
        while (System.nanoTime() - startTime < timeLimit) {
            operation.applyAsDouble(++n);
        }
        return n - 1;
    }
}