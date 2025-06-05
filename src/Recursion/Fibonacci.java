package Recursion;

public class Fibonacci {
    public static int fibonacci(int previous, int term) {
        if (term < 2) {
            return 1;
        } else {
            return (fibonacci(term - 1) + term);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
