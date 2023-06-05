package JavaPik;

import java.util.Scanner;

public class Lesson3 {
//    Задача 1:
//    Ввести с клавиатуры два целых числа. Если Число1 четное,
//    вывести произведение двух чисел(пр.1) если нет - частное(пр.2).
//    Также если числа равны - вывести надпись "Числа равны!"
//
//    пр1.: "Число1 * Число2 = Произведение", где число1 -
//    значение 1го числа, число2 - значение 2го числа,
//    Произведение - результат умножения.
//
//    пр2.: "Число1 / Число2 = Частное", где число1 - значение 1го числа,
//    число2 - значение 2го числа, Частное - результат деления. Помните,
//    что результат деления двух целых чисел – тоже целое число.
    public static class Task1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int FirstNum = sc.nextInt();
            int SecondNum = sc.nextInt();

            if (1.0 * FirstNum % 2 == 0) {
                System.out.println(FirstNum * SecondNum);
            } else {
                System.out.println(1.0 * FirstNum / SecondNum);
            }
        }
    }

//    Написать программу, которая принимает строку с клавиатуры.
//    Если строка == "Hi" - вывести в консоль "Hello", если
//    Bye - Good bye, если How are you - How are your doing.
//    Если любая другая строка - вывести Unknown message.
//    Сделать через:
//            1)   if-else
//            2)   switch-case
//    Примечание: для сравнения строк некорректно использовать
//    оператор "==", почему - разберем позже. Можно воспользоваться
//    методом equals().
//    Например: "Hi".equals(s); или s.equals("Hi");
    public static class Task2 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();

            // if -else
            if (sentence.equals("Hi")){
                System.out.println("Hello");
            } else if (sentence.equals("Bye")) {
                System.out.println("Good bye");
            } else if(sentence.equals("How are you")) {
                System.out.println("How are you doing");
            } else {
                System.out.println("Unknown message");
            }

            //switch
            switch (sentence) {
                case "Hi" -> System.out.println("Hello");
                case "Bye" -> System.out.println("Good Bye");
                case "How are you" -> System.out.println("How are you doing");
                default -> System.out.println("Unknown message");
            }
        }
    }

//    Задача 3:
//    Завести три переменные типа String. С клавиатуры ввести в них
//    вашу фамилию, имя и отчество. Вывести в консоль в одну строку
//    ваше ФИО. Сделать, используя:
//    1)   System.out.println
//    2)   System.out.printf
    public static class Task3 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String FirstWord = sc.next();
            String SecondWord = sc.next();
            String ThirdWord = sc.next();

            System.out.println(FirstWord + " " + SecondWord + " " + ThirdWord);
            System.out.printf("%s %s %s", FirstWord, SecondWord, ThirdWord);
        }
    }

//    Задача 4:
//    Ввести с клавиатуры два целых числа. Если первое – четное ИЛИ
//    второе – кратно трем, вывести в консоль результат сравнения этих
//    чисел.
//
//    Если первое число кратно и двум, и трем – вывести на экран число
//    один, возведенное в степень N, где N – второе число. Для возведения
//    в степень можно использовать Math.pow(). В случае, если результат
//    выражения выходит за пределы типа int
//    (допустимые значения - [-2147483648; 2147483647]) – вывести
//    сообщение «Результат выражения слишком большой!»
//
//    Также минимальное и максимальное значение int содержится в
//    константах Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.
    public static class Task4 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int FirstNum = sc.nextInt();
            int SecondNum = sc.nextInt();

            if (FirstNum % 2 == 0 || SecondNum % 3 == 0) {
                if (FirstNum > SecondNum) {
                    System.out.println("Первое число больше второго");
                } else if (FirstNum < SecondNum) {
                    System.out.println("Первое число меньше второго");
                } else {
                    System.out.println("Числа равны");
                }
            }

            if (FirstNum % 2 == 0 && FirstNum % 3 == 0) {
                double pow = Math.pow(FirstNum, SecondNum);
                if (pow > Integer.MAX_VALUE || pow < Integer.MIN_VALUE) {
                    System.out.println("Результат выражения слишком большой!");
                } else {
                    System.out.println(pow);
                }
            }
        }
    }
}

