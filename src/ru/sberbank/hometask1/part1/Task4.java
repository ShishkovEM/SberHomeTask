package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task4 {
    /**
     * На вход подается количество секунд, прошедших с начала текущего дня – count.
     * Выведите в консоль текущее время в формате: часы и минуты.
     */

    public static void main(String[] args) {
        final int SECONDS_PER_HOUR = 3600; //Количество секунд в часе
        final int SECONDS_PER_MINUTE = 60; //Количество секунд в минуте
        int count; //Количество секунд, прошедших с начала дня
        int hours; //Текущее значение параметра "час"
        int minutes; //Текущее значение параметра "секунды"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество секунд, прошедших с начала текущего дня: ");
        count = scanner.nextInt();
        scanner.close();

        //Вычислим количество полных часов и минут
        hours = count / SECONDS_PER_HOUR;
        minutes = count % SECONDS_PER_HOUR / SECONDS_PER_MINUTE;

        //Выведем результат в  требуемом формате
        System.out.println(hours + " " + minutes);
    }
}