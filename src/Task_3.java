import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[0] = array[array.length - 1];
        array[4] = array[array.length - 4];
        System.out.println(array[0] + array[array.length - 3]);
    }
}
