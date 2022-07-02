package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task3 {
    /**
     * Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
     * обед строго после полудня. Периодически он посматривает на часы (x - час,
     * который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
     * время больше полудня, то вывести "Пора". Иначе - “Рано” На вход
     * гарантируется передача числа от 0 до 23 включительно.
     */

    public static void main(String[] args) {
        final int TIME_FOR_DINNER = 12; //Время обеда
        int x; //Час, который увидел Петя
        boolean isTimeForDinner;

        //Получим от пользователя значение часа, который увидел Петя
        Scanner input = new Scanner(System.in);
        System.out.print("Введите текущий час от 0 до 23 включительно: ");
        x = input.nextInt();
        input.close();

        //Проверим, пора ли Пете обедать
        isTimeForDinner = x > TIME_FOR_DINNER;
        System.out.println(isTimeForDinner ? "Пора" : "Рано");
    }
}
