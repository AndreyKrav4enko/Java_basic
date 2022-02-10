import java.util.Scanner;

public class Task_6_Converter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int value = in.nextInt();
        if (value == 1) {
            System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - унция, 4 - центнер");
            int mass = in.nextInt();
            switch (mass) {
                case 1:
                    System.out.println("Введите количество выбранных единиц:");
                    double kg = in.nextInt();
                    System.out.printf("Килограммы: %.3f\nФунты: %.3f\nУнция: %.3f\nЦентнер: %.3f\n", kg, kg * 2.20462, kg * 35.274, kg * 0.01);
                    break;
                case 2:
                    System.out.println("Введите количество выбранных единиц:");
                    double pound = in.nextInt();
                    System.out.printf("Фунты: %.3f\nКилограммы: %.3f\nУнция: %.3f\nЦентнер: %.3f\n", pound, pound * 0.453, pound * 16, pound * 0.00453);
                    break;
                case 3:
                    System.out.println("Введите количество выбранных единиц:");
                    double ounce = in.nextInt();
                    System.out.printf("Унция: %.3f\nКилограммы: %.3f\nФунты: %.3f\nЦентнер: %.3f\n", ounce, ounce * 0.0283495, ounce * 0.0625, ounce * 0.000283495);
                    break;
                case 4:
                    System.out.println("Введите количество выбранных единиц:");
                    double hundredweight = in.nextInt();
                    System.out.printf("Центнер: %.3f\nКилограммы: %.3f\nФунты: %.3f\nУнция: %.3f\n", hundredweight, hundredweight * 100, hundredweight * 220.462, hundredweight * 3527,4);
                    break;
                default:
                    System.out.println("Вы ввели неверное число, перезапустите программу и попробуйте снова.");
            }
        } else if (value == 2) {
            System.out.println("Выберите единицу измерения: 1 - Метр, 2 - Миля, 3 - Ярд, 4 - Фут");
            int range = in.nextInt();
            switch (range) {
                case 1:
                    System.out.println("Введите количество выбранных единиц:");
                    double meter = in.nextInt();
                    System.out.printf("Метр: %.3f\nМиля: %.3f\nЯрд: %.3f\nФут: %.3f\n", meter, meter * 0.000621371, meter * 1.09361, meter * 3.28084);
                    break;
                case 2:
                    System.out.println("Введите количество выбранных единиц:");
                    double mile = in.nextInt();
                    System.out.printf("Миля: %.3f\nМетр: %.3f\nЯрд: %.3f\nФут: %.3f\n", mile, mile * 1609.4, mile * 1760, mile * 5280);
                    break;
                case 3:
                    System.out.println("Введите количество выбранных единиц:");
                    double yard = in.nextInt();
                    System.out.printf("Ярд: %.3f\nМетр: %.3f\nМиля: %.3f\nФут: %.3f\n", yard, yard * 0.9144, yard * 0.000568182, yard * 3);
                    break;
                case 4:
                    System.out.println("Введите количество выбранных единиц:");
                    double foot = in.nextInt();
                    System.out.printf("Фут: %.3f\nМетр: %.3f\nМиля: %.3f\nЯрд: %.3f\n", foot, foot * 0.3048, foot * 0.000189394, foot * 0.333333);
                    break;
                default:
                    System.out.println("Вы ввели неверное число, перезапустите программу и попробуйте снова.");
            }
        }
        else {
            System.out.println("Вы ввели неверное число, перезапустите программу и попробуйте снова.");
        }
    }
}
