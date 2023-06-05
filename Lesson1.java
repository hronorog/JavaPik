package JavaPik;


public class Lesson1 {
// Задача 1:
// написать код, который присвоит переменной a значение переменной b и наоборот.
// реализовать задачу, НЕ используя третью переменную.
    public static class Task1 {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            a += b;
            b = a - b;
            a = a - b;
            System.out.println("Значение а: " + a + ". Значение b: " + b);
        }
    }

// Используя
// a) Переменную типа String
// b) несколько переменных типа char
// c) одну переменную типа char
// вывести свое имя в консоль.
//
// Вывод в консоль с переходом на новую строку:
// System.out.println(/*ваша переменная*/);
//
// Вывод в консоль без перехода на новую строку:
// System.out.print(/*ваша переменная*/);
//
// Усложнение для внимательных:
// вывести ваше имя посимвольно, где каждая буква — на новой строке, не используя System.out.println().
// Реализуется как с использованием String, так и используя char.
    public static class Task2 {
        public static void main(String[] args) {
            String name = "Шлакоблокунь";
            char[] name2char = name.toCharArray();

            for (int i=0; i < name2char.length; i++) {
                System.out.print(name2char[i] + "\n");
            }
        }
}
}

