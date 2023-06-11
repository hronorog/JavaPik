package JavaPik;


import java.util.Scanner;

public class Lesson6 {
    public static class Task1 {
        // отрефакторить код https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task2SwitchCase.java
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            printMessage("Enter string: ");
            String s = scanner.nextLine();
            scanner.close();

            printMessage(chooseAnswer(s));
            }

        public static String chooseAnswer(String s) {
            return switch (s) {
                case "Hi" -> "Hello";
                case "Bye" -> "Good bye";
                case "How are you" -> "How are you doing";
                default -> "Unknown message";
            };
        }

        public static void printMessage (String s) {
            System.out.println(s);
        }
    }

    public static class Task2 {
        // отрефакторить код https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task4.java
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = scanner.nextInt();

            System.out.println("Enter b: ");
            int b = scanner.nextInt();
            scanner.close();

            isEqual(a, b);

            if (a % 6 == 0) {
                double result  = Math.pow(a, b);
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    System.out.println("Результат выражения слишком большой!");
                } else {
                    System.out.println((int) result);
                }
            }
        }

        public static void isEqual (int a, int b) {
            if (a % 2 == 0 || b % 3 == 0) {
                System.out.println(a == b);
            }
        }
    }

    //  Задача 3:
    //  Написать программу, которая принимает длину и ширину прямоугольника
    //  (2 целых числа). Нарисовать в консоли заданный прямоугольник,
    //  используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
    //  Каждая единица длины должна обозначаться одним символом “-“,
    //  каждая единица ширины – символом “|“.
    //
    // Произвести декомпозицию по своему усмотрению.
    public static class Task3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int length = sc.nextInt();
            int width = sc.nextInt();

            drawRectangle(length, width);
        }

        public static void drawRectangle(int length, int width) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < length; j++) {
                    if (i == 0 || i == width - 1) {
                        if (j == 0 || j == length - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("-");
                        }
                    } else {
                        if (j == 0 || j == length - 1) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
