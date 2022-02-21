import java.util.Scanner;

public class Final_Task_4 {
    public static void main(String[] args) {
        String hint = "Подсказка";
        String answer = "Заархивированный вирус";
        Scanner input = new Scanner(System.in);
        System.out.println("Отгадайте загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.\nВведите ответ: ");
        String text = input.nextLine();
        //Выполняем код при вводе правильного ответа
        if (answer.equals(text)) {
            System.out.println("Правильно!");
        }
        //Выполняем код при запросе подсказки
        else if ((text.equals(hint))) {
            System.out.println("Это связано с компьютерным ПО");
            //Выполняем код при еще одном запросе подсказки
            if (hint.equals(input.next())) {
                System.out.println("Подсказка уже недоступна. Введите ваш ответ:");
                if (!(answer.equals(input.nextLine()))) {
                    System.out.println("Обидно, приходи в другой раз!");
                } else {
                    System.out.println("Правильно");
                }
            }
            else if (answer.equals(input.nextLine())) {
                System.out.println("Правильно");
            } else {
                System.out.println("Обидно, приходи в другой раз!!");
            }
        }
        //Выполняем код при неправильном ответе
        else {
                System.out.println("Осталось 2 попытки");
                if (!(answer.equals(input.nextLine()))) {
                    System.out.println("Осталась 1 попытка");
                    if (!(answer.equals(input.nextLine()))) {
                        System.out.println("Обидно, приходи в другой раз");
                    } else {
                        System.out.println("Правильно!");
                    }
                } else {
                    System.out.println("Правильно!");
                }
            }
        }
    }
