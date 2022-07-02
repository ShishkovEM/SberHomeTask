package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task5 {
    /**
     * Дома дочери Пети опять нужна помощь с математикой! В этот раз ей
     * нужно проверить, имеет ли предложенное квадратное уравнение решение или
     * нет.
     * На вход подаются три числа - коэффициенты уравнения a, b, c. Нужно вывести
     * "Решение есть", если оно есть и "Решения нет", если нет.
     */

    public static void main(String[] args) {
        int a, b, c; //Коэффициенты квадратного уравнения

        //Получим от пользователя величины коэффициентов a, b, c
        System.out.print("Введите коэффициенты a, b и c через пробел: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();

        //Проверим, есть ли действительные корни у уравнения с введёнными коэффициентами
        System.out.println(hasSolution(a, b, c) ? "Решение есть" : "Решения нет");
    }

    /**
     * Метод проверяет, есть ли у квадратного уравнения вида a * x^2 + b * x + c = 0 действительные корни
     * @param a старший коэффициент квадратного уравнения
     * @param b средний коэффициент квадратного уравнения
     * @param c свободный член квадратного уравнения
     * @return возвращает true, если у уравнения есть действительные корни и false, если действительных корней нет
     */

    public static boolean hasSolution (int a, int b, int c) {
        int discriminant; //Дискриминант квадратного уравнения
        discriminant = b * b - 4 * a * c;
        return discriminant >= 0;
    }
}
