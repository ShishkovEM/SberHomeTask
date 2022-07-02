package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task9 {
    /**
     * Пока Петя практиковался в работе со строками, к нему подбежала его
     * дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+
     * cos^2(x) - 1 == 0) всегда-всегда выполняется?"
     * Напишите программу, которая проверяет, что при любом x на входе
     * тригонометрическое тождество будет выполняться (то есть будет выводить true
     * при любом x).
     */

    public static void main(String[] args) {
        final double EPS = 1E-5; //Точность расчёта
        int x; //Входное значение аргумента x
        boolean isTrue;

        //Получим от пользователя значение аргумента
        System.out.print("Введите значение аргумента x: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        input.close();

        //Проверим выполнение тождества с точностью до EPS и выведем результат
        isTrue = Math.abs(Math.sin(x) * Math.sin(x) + Math.cos(x) * Math.cos(x) - 1) < EPS;
        System.out.println(isTrue);
    }
}
