import java.util.Scanner;

public class Task_6_Converter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int a = in.nextInt();
        if (a == 1) {
            System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - унция, 4 - центнер");
            int b = in.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Введите количество выбранных единиц:");
                    double c = in.nextInt();
                    System.out.printf("Килограммы: %.3f\nФунты: %.3f\nУнция: %.3f\nЦентнер: %.3f\n", c, c * 2.20462, c * 35.274, c * 0.01);
                    break;
                case 2:
                    System.out.println("Введите количество выбранных единиц:");
                    double d = in.nextInt();
                    System.out.printf("Фунты: %.3f\nКилограммы: %.3f\nУнция: %.3f\nЦентнер: %.3f\n", d, d * 0.453, d * 16, d * 0.00453);
                    break;
                case 3:
                    System.out.println("Введите количество выбранных единиц:");
                    double e = in.nextInt();
                    System.out.printf("Унция: %.3f\nКилограммы: %.3f\nФунты: %.3f\nЦентнер: %.3f\n", e, e * 0.0283495, e * 0.0625, e * 0.000283495);
                    break;
                case 4:
                    System.out.println("Введите количество выбранных единиц:");
                    double f = in.nextInt();
                    System.out.printf("Центнер: %.3f\nКилограммы: %.3f\nФунты: %.3f\nУнция: %.3f\n", f, f * 100, f * 220.462, f * 3527,4);
                    break;
            }
        } else if (a == 2) {
            System.out.println("Выберите единицу измерения: 1 - Метр, 2 - Миля, 3 - Ярд, 4 - Фут");
            int b = in.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Введите количество выбранных единиц:");
                    double c = in.nextInt();
                    System.out.printf("Метр: %.3f\nМиля: %.3f\nЯрд: %.3f\nФут: %.3f\n", c, c * 0.000621371, c * 1.9361, c * 3.28084);
                    break;
                case 2:
                    System.out.println("Введите количество выбранных единиц:");
                    double d = in.nextInt();
                    System.out.printf("Миля: %.3f\nМетр: %.3f\nЯрд: %.3f\nФут: %.3f\n", d, d * 1609.4, d * 1760, d * 5280);
                    break;
                case 3:
                    System.out.println("Введите количество выбранных единиц:");
                    double e = in.nextInt();
                    System.out.printf("Ярд: %.3f\nМетр: %.3f\nМиля: %.3f\nФут: %.3f\n", e, e * 0.9144, e * 0.000568182, e * 3);
                    break;
                case 4:
                    System.out.println("Введите количество выбранных единиц:");
                    double f = in.nextInt();
                    System.out.printf("Фут: %.3f\nМетр: %.3f\nМиля: %.3f\nЯрд: %.3f\n", f, f * 0.3048, f * 0.000189394, f * 0.333333);
                    break;
            }
        }
        else {
            System.out.println("Вы ввели неверное число, перезапустите программу!");
        }
    }
}
