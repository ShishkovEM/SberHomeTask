package ru.sberbank.hometask1.part1;

import java.util.Scanner;

public class Task7 {
    /**
     * На вход подается двузначное число n. Выведите число, полученное перестановкой цифр в исходном числе n.
     */

    public static void main(String[] args) {
        int n, firstDigit, secondDigit, result;
        final int RANK_TEN = 10;

        //Получаем от пользователя исходное число
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        n = scanner.nextByte();
        scanner.close();

        //Выделяем значения первой и второй цифры и отображаем их в нужном порядке
        firstDigit = n / RANK_TEN;
        secondDigit = n % RANK_TEN;
        System.out.print(secondDigit + "" + firstDigit);
    }
}