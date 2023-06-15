package JavaPik;

import java.util.Scanner;

public class Lesson7 {
    // Задача 1:
    //Написать программу, которая объединяет любое количество строк,
    // объединяя их через пробел. Реализацию конкатенации строк вынести
    // в отдельный метод.
    public static class Task1 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String score = "";
            String stopWord = "stop";
            String line = sc.nextLine();
            String delimeter = " ";

            while (!line.toLowerCase().equals(stopWord)) {
                score = concatStrings(delimeter, score, line);
                line = sc.nextLine();
            }

            sc.close();
            System.out.println(score.trim());
        }

        public static String concatStrings (String delimeter, String score, String line) {
            return String.join(delimeter, score, line);
        }
    }

    // Задача 2:
    //  Реализовать методы «вычисления суммы» для всех примитивных типов,
    // кроме void. Возвращать:
    //
    //  Для числовых типов — тот же тип. Даже если это ведет к потере
    // точности. При угрозе потери данных — выводить сообщение в
    // консоль и возвращать текущий результат (для byte, short, int);
    //  Для boolean — определение истинности всех переданных параметров,
    // принимая то, что их стоит объединять через логическое И;
    //  Для char — строку, полученную в результате конкатенации всех
    // переданных параметров.
    //  Количество параметров может быть любым. Используйте перегрузку —
    // у всех методов должны быть одинаковые названия.
    //
    //  Примечание: это задача без вариантов, методы для всех типов
    // должны быть реализованы в одной программе.
    public static class Task2 {
        public static void main (String[] args) {
            System.out.println("Int:\n" + sum(10, 24, 56));
            System.out.println("Int (overrange):\n" + sum(2_147_483_000, 100_000));
            System.out.println("Byte:\n" + sum(1, 34, 3, 6));
            System.out.println("Byte (overrange):\n" + sum(100, 50));
            System.out.println("Short:\n" + sum(345, 67));
            System.out.println("Short (overrange):\n" + sum(14325, 9284545, 12284));
            System.out.println("Long:\n" + sum(345L, 943985L, 12L, 3L));
            System.out.println("Double:\n" + sum(1, 23.09, 55,2));
            System.out.println("Float:\n" + sum(1,34f, 7,708f, 12f));
            System.out.println("Boolean:\n" + sum(true, true));
            System.out.println("Boolean:\n" + sum(true, false));
            System.out.println("Char:\n" + sum('H', 'e', 'l', 'l', 'o', '!'));
        }

        public static int sum (int ...args) {
            long result = 0;
            for (int i: args) {
                result += i;

                if (result > Integer.MAX_VALUE) {
                    System.out.println("Warning!");
                    result -= i;
                    return (int) result;
                }
            }
            return (int) result;
        }

        public static byte sum (byte ...args) {
            long result = 0;
            for (byte i: args) {
                result += i;

                if (result > Byte.MAX_VALUE) {
                    System.out.println("Warning!");
                    result -= i;
                    return (byte) result;
                }
            }
            return (byte) result;
        }

        public static short sum (short ...args) {
            long result = 0;
            for (short i : args) {
                result += i;

                if (result > Short.MAX_VALUE) {
                    System.out.println("Warning!");
                    result -= i;
                    return (short) result;
                }
            }
            return (short) result;
        }

        public static double sum (double ...args) {
            double result = 0;
            for (double i: args) {
                result += i;
            }
            return result;
        }

        public static float sum (float ...args) {
            float result = 0;
            for (float i: args) {
                result += i;
            }
            return result;
        }

        public static long sum (long ...args) {
            long result = 0;
            for (long i: args) {
                result += i;
            }
            return result;
        }

        public static boolean sum (boolean ... args) {
            for (boolean i: args) {
                if (!i) {
                    return false;
                }
            }
            return true;
        }

        public static String sum (char ...args) {
            return String.valueOf(args);
        }
    }

    // Задача 3:
    // Вычислите факториал введенного с клавиатуры целого числа,
    // используя рекурсивный алгоритм.
    public static class Task3 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println(factorial(num));
        }

        public static int factorial(int num) {
            if (num == 1) {
                return 1;
            }
            return num * factorial(num - 1);
        }
    }

    // Задача 4:
    // Вычислите результат выражения, используя рекурсивный алгоритм.
    // n — число, введенное с клавиатуры. Для N < 1 — вывести
    // соответствующее сообщение в консоль и завершить выполнение
    // программы.
    public static class Task4 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number more than 1");
            int num = sc.nextInt();

            if (num < 1) {
                System.out.println("Wrong number!");
            } else {
                System.out.println(Mathsqrt(num));
            }
        }

        public static double Mathsqrt (int num) {
            if (num == 1) {
                return Math.sqrt(1);
            }
            return Math.sqrt(Math.sqrt(num) + Mathsqrt(num - 1));
        }
    }


}
