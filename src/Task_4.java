import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        double num3 = in.nextInt();

        double num4 = (num1 + num2 + num3) / 3;
        System.out.printf("Среднее арифметическое чисел равно: %.0f \n", num4);

        double round = Math.floor(num4/2);
        if (round>3){
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Что-то пошло не так");
        }
    }
}
