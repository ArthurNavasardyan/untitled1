package com.company;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(fib(scanner.nextInt()));
        //System.out.println(factorial(scanner.nextInt()));
//        int maxnum = scanner.nextInt();
//        for (int i = 0; i < maxnum; i++) {
//            System.out.print(fib(i) + " ");
//        }
        //System.out.println(reverseString("asdf 1234"));
        //countDown(3);
        //reverseNumber(1234);
        //digitsToWords(0);
        //System.out.println(power(2,3));


    }

    //Напишите программу для печати рядов Фибоначчи на Java с использованием рекурсии.
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


    //Напишите программу для вычисления факториала с использованием рекурсии на Java.
    public static int factorial(int n) {
        if (n <= 1) {
            return n;
        } else {
            n = n * factorial(n - 1);
        }
        return n;
    }


    //Напишите программу для реверсирования строки в Java с использованием рекурсии
    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }

    }

    //Напишите метод countDown(int number) на Java, используя рекурсию,
    // который выводит обратный отсчет до нуля на консоль
    public static void countDown(int number) {
        if (number == 0) {
            System.out.println(number);
            ;
        } else {
            System.out.println(number);
            countDown(number - 1);
        }
    }


    //Программа для реверсирования числа с использованием рекурсии в Java
    public static void reverseNumber(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reverseNumber(n / 10);
        }
    }


    //Напишите программу Java для печати digitsToWords(int number)
    public static void digitsToWords(int number) {
        String[] str = new String[]{"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        if (number == 0) {
            return;
        } else {
            int m = number % 10;
            number = number / 10;
            digitsToWords(number);
            System.out.print(str[m]);
            System.out.print(" ");
        }
    }

    //Напишите программу на Java для вычисления степени числа,
    public static int power(int number, int power) {
        if (power == 0) {
            return 1;
        } else {
            return number * power(number, power - 1);
        }
    }

    //Напишите программу Java для преобразования десятичного числа в двоичное
//    public static int decimalToBinary(int decimal) {
//
//        if (decimal / 2 == 0) {
//            return 1;
//        } else {
//            return power(10,countDigitsNumber(decimal)) +decimal % 2 *power(10,countDigitsNumber(decimal)) + decimalToBinary(decimal / 2);
//
//
//        }
//
//    }
//    public static int countDigitsNumber(int number){
//        int count = 1;
//        if (number / 10 == 0){
//            //count++;
//            return count++;
//        }else {
//            //count++;
//            return count + countDigitsNumber(number / 10);
//
//        }
//    }

}


