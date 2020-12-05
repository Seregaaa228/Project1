package factorial;

import java.util.Scanner;

public class FactoricalWithRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число чтобы посчитать факториал.");
        System.out.println(factorial(scanner.nextInt()));


    }

    private static int factorial(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("Нельзя так делать!");
            return n;
        }
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}


