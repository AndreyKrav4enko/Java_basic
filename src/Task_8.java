import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if(!(i % 2 == 0)){
                sum += i;
            }
        }
        System.out.println("Сумма чисел составляет: " + sum);
    }
}
