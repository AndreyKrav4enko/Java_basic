import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        String a = input.next();
        int b = input.nextInt();
        int max = Math.max(Integer.parseInt(a),b);
        double min = Math.min(Integer.parseInt(a),b);
        System.out.println("Большее число - " + max);
        System.out.println("Меньшее число - " + min);
    }
}
