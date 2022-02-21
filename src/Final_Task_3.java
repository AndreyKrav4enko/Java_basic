import java.util.Scanner;

import static java.lang.System.in;

public class Final_Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int size = in.nextInt();
        int numberStr = 1;

        String[] array= new String[size];
        for (int i = 0; i < size; i++) {
                System.out.print("Строка " + numberStr++ + " ");
                array[i] = in.next();
        }
        in.close();


    }
}
