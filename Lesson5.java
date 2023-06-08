package JavaPik;

import java.util.Scanner;

public class Lesson5 {
//  Задача 1:
//  Создать массив char, заполненный буквами своего имени в верном порядке.
//  Используя этот массив, вывести свое имя в консоль.
//  Вариант 1: не используя переменную типа String;
//  Вариант 2: предварительно собрав значения массива в переменную типа
    public static class Task1 {
        public static void main(String[] args) {
            char[] name = new char[] {'D', 'i', 'c', 'k'};
            System.out.print("Charname: ");
            for (char i: name) {
                System.out.print(i);
            }
            System.out.println();

            System.out.printf("Stringname: %s", String.valueOf(name));
        }
    }

//  Задача 2:
//  Создать массив int’ов из 5 элементов. Заполнить его значениями,
//  введенными с клавиатуры. Вывести на экран сумму каждого значения
//  с предыдущим. Предыдущим значением для 0-го (нулевого) элемента
//  считать последнее значение массива.
    public static class Task2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] mass = new int[5];
            for (int i = 0; i < mass.length; i++) {
                System.out.println("Введите целое число: ");
                mass[i] = sc.nextInt();
            }

            System.out.println("Сумма соседних элементов:");
            System.out.println(mass[0] + mass[mass.length-1]);
            for(int i = 1; i < mass.length; i++){
                System.out.println(mass[i] + mass[i-1]);
            }
        }
    }

//  Задача 3 (*):
//  Вычислить и записать в массив первые 10 простых чисел.
//  Простое число – положительное целое число, которое делится без
//  остатка лишь на себя и на 1. 1 не является простым числом.
//  Вывести в консоль сумму всех элементов полученного массива.
    public static class Task3_1 {
        public static void main(String[] args) {
            int[] primeMassive = new int[10];
            int count = 0; // count of prime numbers
            int number = 2; // start number

            while (count < 10) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeMassive[count] = number;
                    count++;
                }
                number++; // next number for circle
            }

            int sum = 0; // sum of all prime numbers
            for (int i: primeMassive) {
                sum += i;
            }

            System.out.printf("Sum for first 10 prime numbers: %d", sum);
        }
    }
}
