import java.util.Scanner;

public class CalculatorArgs {
    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        int result = 0;
        String op = args[1];

        switch (op) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "/" -> result = a / b;
            case "*" -> result = a * b;
            case "%" -> result = a % b;
            default -> System.out.println("Неизвестная операция");
        }
        System.out.println("Результат = " + result);

    }
}