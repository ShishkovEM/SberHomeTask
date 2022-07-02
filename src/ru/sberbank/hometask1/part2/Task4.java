package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task4 {
    /**
     * После вкусного обеда Петя принимается за подсчет дней до выходных.
     * Календаря под рукой не оказалось, а если спросить у коллеги Феди, то тот
     * называет только порядковый номер дня недели, что не очень удобно. Поэтому
     * Петя решил написать программу, которая по порядковому номеру недели
     * выводит сколько осталось дней до субботы. А если же сегодня шестой
     * (суббота) или седьмой (воскресенье) день, то программа выводит "Ура,
     * выходные!"
     */

    public static void main(String[] args) {
        final int WEEKEND_STARTING_DAY = 6; //Первый день выходных
        int x; //Текущий день недели
        int remainingDays; //Количество дней до субботы
        boolean isWeekend;

        //Получим от пользователя номер текущего дня
        Scanner input = new Scanner(System.in);
        System.out.print("Введите порядковый номер текущего дня недели: ");
        x = input.nextInt();
        input.close();

        //Проверим, является ли текущий день выходным
        remainingDays = WEEKEND_STARTING_DAY - x;
        isWeekend = remainingDays < 1;
        System.out.println(isWeekend ? "Ура, выходные!" : remainingDays);
    }
}
