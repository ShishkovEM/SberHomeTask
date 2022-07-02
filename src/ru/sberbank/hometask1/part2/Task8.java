package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task8 {
    /**
     * Раз так легко получается разделять по первому пробелу, Петя решил
     * немного изменить предыдущую программу и теперь разделять строку по
     * последнему пробелу.
     */

    public static void main(String[] args) {
        String str; //Входная строка

        //Получим от пользователя строку
        System.out.print("Введите Вашу строку: ");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        input.close();

        //Продемонстрируем результат пользователю
        divisionByLastSpace(str);
    }

    /**
     * Выводит в консоль входную строку в виде двух отдельных строк,
     * разделённых по последнему пробелу
     * @param inputString входная строка символов
     */
    public static void divisionByLastSpace(String inputString) {
        int indexOfLastSpace; //Индекс первого пробела
        indexOfLastSpace = inputString.lastIndexOf(" ");
        System.out.println(inputString.substring(0,indexOfLastSpace));
        System.out.println(inputString.substring(indexOfLastSpace + 1));
    }
}
