import java.util.Random;
import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        int mid = 0;
        int a = 0, b = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();


        int[][] array = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите элемент в ячеку массива [" + i + "][" + j + "]:");
                array[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println("Ваша матрица: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Первая строка матрицы: ");
        for (int i = 0; i < a; i--) {
            for (int j = 0; j < b; j++) {
                array[i][j] *= 3;
                System.out.print(array[i][j] + " ");
            }
        }
    }
}