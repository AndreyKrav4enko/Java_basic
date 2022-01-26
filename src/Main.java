public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Присваиваем значения переменным
        double x = 234.3434;
        byte y = 127;

        //Задача №3
        int[] array = {1, 8, 22, 15, 50};
        array[0] = array[array.length - 1];
        array[4] = 1;
        System.out.println(array[0] + array[array.length - 3]);

    }
}
