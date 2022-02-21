import java.util.Scanner;

public class Final_Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String equation = input.next();
        char a = equation.charAt(0);
        char b = equation.charAt(2);
        char c = equation.charAt(4);
        if (equation.length() == 5 && equation.indexOf('=',3) !=-1 &&
                (equation.indexOf('-',1) !=-1 || equation.indexOf('+',1) !=-1) && equation.indexOf('x') !=-1){
            //Проверяем если второй символ "+"
            if (equation.indexOf('+',1) != -1){
                if (equation.indexOf('x',0) !=-1){
                    int result = c - b;
                    System.out.println("Вывод:" + result);
                }
                else if (equation.indexOf('x',2) != -1){
                    int result = c - a;
                    System.out.println("Вывод:" + result);
                }
                else {
                    int result = a + b;
                    System.out.println("Вывод:" + result);
                }
            }
            //Проверяем если второй символ "-"
            else{
                if (equation.indexOf('x',0) !=-1){
                    int result = c + b;
                    System.out.println("Вывод:" + result);
                }
                else if (equation.indexOf('x',2) !=-1){
                    int result = a - c;
                    System.out.println("Вывод:" + result);
                }
                else {
                    int result = a - b;
                    System.out.println("Вывод:" + result);
                }
            }
        }
        else {
            System.out.println("Вы ввели некорректное уравнение, попробуйте еще раз");
        }
    }
}
