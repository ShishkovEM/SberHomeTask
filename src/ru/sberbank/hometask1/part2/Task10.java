package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task10 {
    /**
     * "А логарифмическое?" - не унималась дочь.
     * Напишите программу, которая проверяет, что log(e^n) == n для любого
     * вещественного n.
     */

    public static void main(String[] args) {
        final double EPS = 1E-5; //Точность расчёта
        double n; //Входное значение аргумента n
        boolean isTrue;

        //Получим от пользователя значение аргумента
        System.out.print("Введите значение аргумента n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();
        input.close();

        //Проверим выполнение тождества log(e^n) == n с точностью до EPS и выведем результат
        isTrue = Math.abs(Math.log(Math.pow(Math.E, n)) - n) < EPS;
        System.out.println(isTrue);
    }
}
