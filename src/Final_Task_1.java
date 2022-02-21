import java.util.Scanner;

public class Final_Task_1 {
    public static void main (String [] args){

        Scanner input  = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double rate = input.nextDouble();

        System.out.print("Введите количество рублей: ");
        double count = input.nextDouble();

        double result = count/rate;
        System.out.printf("Итого: %.2f",result);
    }
}
