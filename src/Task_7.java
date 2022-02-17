import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int size = in.nextInt();
        System.out.println("Введите данные констант: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
       int [] array = new int[size];
            for(int i = 0; i < size; i++) {
                System.out.print("Введите элемент в ячеку массива [" + i + "]:");
                array[i] = in.nextInt();
            }
            for(int i =0; i < size; i++){
                if (array[i] == x || array[i] == y || array[i] == z) {
                    System.out.println();
                    System.out.println("Введенное значение имеется в константах");
                }
            }
    }
}

