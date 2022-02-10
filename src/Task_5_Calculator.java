import java.util.Scanner;

public class Task_5_Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа:");
        double x = in.nextInt();
        double y = in.nextInt();
        System.out.println();
        System.out.println("Введите символ желаемой операции ('+', '-', '*', '/')");
        String z = in.next();
        System.out.println();
        switch (z) {
            case "+" :
                double a = x + y;
                System.out.printf("Сумма чисел равна: %.2f", a);
                break;
            case "-" :
                double b = x - y;
                System.out.printf("Разница чисел равна: %.2f", b);
                break;
            case "/" :
                double c = x / y;
                System.out.printf("Частное чисел равно: %.2f", c);
                break;
            case "*" :
                double d = x * y;
                System.out.printf("Произведение чисел равно: %.2f", d);
                break;
        }
    }
}