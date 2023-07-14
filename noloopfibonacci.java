public class noloopfibonacci {
    public static void main(String[] args) {
        int n = 5; // Number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series:");
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            return;
        }

        printFibonacciSeries(n - 1);
        System.out.print(fibonacci(n - 1) + " ");
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
