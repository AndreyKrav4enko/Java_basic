package com.ma.idea;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа:");
        double x = in.nextInt();
        double y = in.nextInt();
        System.out.println();
        System.out.println("Введите символ желаемой операции ('+', '-', '*', '/')");
        String z = in.next();
        System.out.println();
        if (z.equals("+")) {
            double a = x + y;
            System.out.printf("Сумма чисел равна: %.2f", a);
        }
        else if (z.equals("-")) {
            double a = x - y;
            System.out.printf("Разница чисел равна: %.2f", a);
        }
        else if (z.equals("/")) {
            double a = x / y;
            System.out.printf("Частное чисел равно: %.2f", a);
        }
        else if (z.equals("*")){
            double a = x * y;
            System.out.printf("Произведение чисел равно: %.2f", a);
        }
        else {
                System.out.println("Вы ввели неверный символ!");
            }
    }
}