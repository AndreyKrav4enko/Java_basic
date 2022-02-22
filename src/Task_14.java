import java.util.Random;

public class Task_14 {
    public static void main (String [] args){

        int min = 0;
        int max = 0;
        Random random = new Random();
        int [] array = new int [15];
            for(int i = 0; i < 15; i++){
                array[i] = (int) Math.round((Math.random() * 41) - 20);
                System.out.println(array[i] + " ");
                if (array[i] > max){
                    max = array[i];
                }
                if (array[i] < min){
                    min = array[i];
                }
            }
        System.out.println("Максимальный элемент массива " + max);
        System.out.println("Минимальный элемент массива " + min);

        if (Math.abs(max) > Math.abs(min)){
            System.out.println("Наибольшее число по модулю " + Math.abs(max));
            }
        else if (Math.abs(max) == Math.abs(min)) {
            System.out.println("Наибольшоее и наименьшее числа по модулю равны ");
        }
        else {
            System.out.println("Наибольшее число по модулю " + Math.abs(min));
        }
    }
}
