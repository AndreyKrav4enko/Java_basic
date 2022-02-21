import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку разделяя слова пробелами: ");
        String text = input.nextLine();
        int count = 0;

        String str1 = text.replaceAll("[а-яА-Я\\d]", "");
        System.out.println(str1);

        count = str1.split(" +").length;
        System.out.println("Количество введенных слов : "+ count);
    }
}
