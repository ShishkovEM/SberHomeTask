package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task7 {
    /**
     * Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
     * Ему хочется уметь разделять строку по первому пробелу. Для этого он может
     * воспользоваться методами indexOf() и substring().
     * На вход подается строка. Нужно вывести две строки, полученные из входной
     * разделением по первому пробелу.
     */

    public static void main(String[] args) {
        String str; //Входная строка

        //Получим от пользователя строку
        System.out.print("Введите Вашу строку: ");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        input.close();

        //Продемонстрируем результат пользователю
        divisionByFirstSpace(str);
    }

    /**
     * Выводит в консоль входную строку в виде двух отдельных строк,
     * разделённых по первому пробелу
     * @param inputString входная строка символов
     */
    public static void divisionByFirstSpace(String inputString) {
        int indexOfFirstSpace; //Индекс первого пробела
        indexOfFirstSpace = inputString.indexOf(" ");
        System.out.println(inputString.substring(0,indexOfFirstSpace));
        System.out.println(inputString.substring(indexOfFirstSpace + 1));
    }
}
