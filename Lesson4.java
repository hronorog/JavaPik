package JavaPik;

import java.util.Scanner;

//    Задача 1:
//    Ввести с клавиатуры целое число. Вывести в консоль его факториал.
public class Lesson4 {
    public static class Task1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int score = 1;

            for (int i = 1; i <= num; i++) {
                score *= i;
            }

            System.out.printf("Факториал числа %d равен %d", num, score);
        }
    }

//    Задача 2:
//    Ввести с клавиатуры целое число. Вывести в консоль сумму цифр
//    введенного числа.
    public static class Task2 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int score = 0;

            while (num % 10 >= 1) {
                score += num % 10;
                num = num / 10;
            }

            System.out.printf("Сумма всех цифр числа %d равна %d \n", num, score);
        }
    }

//    Задача 4:
//    Ввести с клавиатуры целое число (Число 2). Для каждого из чисел
//    от 1 до 10 выполнить:
//    Если число1 четное, вывести сумму двух чисел (пр.1), если нет -
//    разность(пр.2). Также если числа равны - вывести надпись "числа равны!".
//
//    пр1.: "Число1 + Число2 = Сумма", где число1 - значение 1го числа
//    (от 1 до 10), число2 - значение введенного с клавиатуры числа,
//    Сумма - результат сложения.
//
//    пр2.: "Число1 - Число2 = Разность", где число1 - значение 1го числа
//    (от 1 до 10), число2 - значение введенного с клавиатуры числа,
//    Разность - результат вычитания.
    public static class Task4 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            for (int i = 1; i < 10; i++) {
                if (i == num) {
                    System.out.println("Числа равны!");
                }
                if (i % 2 == 0) {
                    System.out.println(i + num);
                } else {
                    System.out.println(i - num);
                }
            }
        }
    }

//    Задача 5:
//    Выводить на экран "Не угадал!" до тех пор, пока с клавиатуры
//    не будет введено число 1. Запрашивать число с клавиатуры:
//    Вариант 1: перед выводом на экран "Не угадал!"
//    Вариант 2: после вывода на экран "Не угадал!"
//    Подумать, где стоило бы использовать цикл do-while, а где – нет.
    public static class Task5_1 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = sc.nextInt();

            while (num != 1) {
                System.out.println("Не угадал!");
                System.out.print("Введите число: ");
                num = sc.nextInt();
            }
        }
    }
}
