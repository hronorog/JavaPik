package JavaPik;

import java.util.Scanner;

public class Lesson2 {
// Задача 1:
// Введите с клавиатуры вещественные числа a и b.
// Выведите на экран результат выражения
// c = b*a*(a + b)/(a2),         где a2 - a в квадрате
// Совпадает ли результат выражения, если a и b — переменные типа int
// (для проверки не забудьте также использовать подходящий метод Scanner)?
    public static class Task1 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            double c = b * a * (a + b) / (a * a);

            System.out.println(c);
        }
        // нет, не совпадают из-за операции деления, которая округляет до целого,
        // если введенные числа - целые
    }

// Задача 2:
// Введите с клавиатуры целые числа a и b.
// Выведите на экран результат сравнения:
// a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате
    public static class Task2 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(Math.pow(a, 3) > Math.pow(b, 2));
        }
    }

//Задача 3:
// чему равны переменные после каждого изменения?
    public static class Task3 {
        public static void main (String[] args) {
            int a = 1;
            int b = a++; // a = 2, b = 1
            b += a++; // a = 3, b = 3

            System.out.println(b);
        }
}
}
