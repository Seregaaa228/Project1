package factorial;
import java.util.Scanner;

public class FactoricalWithCycle {

        public static void main(String[] args) {
            System.out.println("Введите число для факториала");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if  (n < 0){
                System.out.println("Нельзя так делать!");
                return;
            }
            int result = 1;

            for (int i = 1; i <= n ; i++) {
                result = result * i;


            }
            System.out.println("Factorial = " + result);
        }
    }


