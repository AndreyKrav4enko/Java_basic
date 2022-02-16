import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int i = in.nextInt();
        System.out.println("Введите данные констант: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
       int [] array = new int[i];
            for(i = 0; i <= array.length; i++){
                if(i==x || i==y || i==z){
                    System.out.println("Введенное значение имеется в константах");
                    break;
                   }
         }
    }
}

