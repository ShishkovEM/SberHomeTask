package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task2 {
    /**
     * Петя пришел домой и помогает дочке решать математику. Ей нужно
     * определить, принадлежит ли точка с указанными координатами первому
     * квадранту. Недолго думая, Петя решил автоматизировать процесс и написать
     * программу: на вход нужно принимать два целых числа (координаты точки),
     * выводить true, когда точка попала в квадрант и false иначе.
     * Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её
     * координаты удовлетворяют условию: x >= 0 и y >= 0.
     */

    public static void main(String[] args) {
        int x, y; //Координаты точки
        boolean isInFirstQuadrant;

        //Получим от пользователя координаты точки
        System.out.print("Введите координаты X и Y проверяемой точки через пробел: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();

        //Проверим принадлежность точки первому квадранту
        isInFirstQuadrant = x >= 0 && y >= 0 && (x != 0 || y != 0);
        System.out.println(isInFirstQuadrant);
    }
}
