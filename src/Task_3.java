public class Task_3 {
    public static void main(String[] args) {
        int[] array = {1, 8, 22, 15, 50};
        array[0] = array[array.length - 1];
        array[4] = 1;
        System.out.println(array[0] + array[array.length - 3]);
    }
}
