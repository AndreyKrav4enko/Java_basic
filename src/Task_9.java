import java.util.Scanner;

public class Task_9 {
    public static void main(String [] args) {
        double average = 0;
        double multiplication = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        double array[] = new double[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println();
        if (size > 0) {
            double sum = 0;
            for (int i = 0; i < size; i++) {
                sum += array[i];
            }
            average = sum / size;
            System.out.println("Среднее значение = " + average);
            System.out.println();
            System.out.println("Полученный массив: ");
            for (int i = 0; i < size; i++) {
                array[i] *= average;
                System.out.print(array[i] + " ");
            }
        }
    }
}
