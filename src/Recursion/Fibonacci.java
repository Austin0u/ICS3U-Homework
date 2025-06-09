package Recursion;

public class Fibonacci {
    public static int fibonacci(int term) {
        if (term == 1) {
            return 0;
        } else if (term == 2) {
            return 1;
        } else {
            return (fibonacci(term - 1) + fibonacci(term - 2));
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + fibonacci(5));
    }
}
