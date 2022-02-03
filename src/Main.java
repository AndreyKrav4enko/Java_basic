import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Присваиваем значения переменным
        double x = 234.3434;
        byte y = 127;

        //Задача №3
        int[] array = {1, 8, 22, 15, 50};
        array[0] = array[array.length - 1];
        array[4] = 1;
        System.out.println(array[0] + array[array.length - 3]);

        //Задача №4
        //1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        double num3 = in.nextInt();
        //2
        double num4 = (num1 + num2 + num3) / 3;
        System.out.printf("Среднее арифметическое чисел равно: %.0f \n", num4);
        //3
        double round = Math.floor(num4/2);
        if (round>3){
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Что-то пошло не так");
        }
    }
}
