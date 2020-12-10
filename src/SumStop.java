import java.util.Scanner;

public class SumStop {

    public static void main(String[] args) {

        int sum = 0;

        Scanner input = new Scanner(System.in);



        while (true) {

            String i = input.next();

            if (i.equals("Стоп") && sum == 0) {
                System.out.println("Вы ничего не ввели");
                break;


            }else if(i.equals("Стоп")) {
                System.out.println("Сумма = " + sum );
                break;
            }
            sum = sum + Integer.parseInt(i);

        }

    }


}
