import java.util.Scanner;

public class SumStop {

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        int i = scanner1.nextInt();


        while (true) {

            sum = sum + i;


            String scanner2 = scanner1.nextLine();
            if (scanner2.equals("Стоп")) {
                System.out.println("Сумма = " + sum);
                break;

            }

        }


    }
}

