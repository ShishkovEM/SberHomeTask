package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class Task6 {
    /**
     * На следующий день на работе Петю и его коллег попросили заполнить
     * анкету. Один из вопросов был про уровень владения английского. Петя и его
     * коллеги примерно представляют, сколько они знают иностранных слов. Также у
     * них есть табличка перевода количества слов в уровень владения английском
     * языком. Было бы здорово автоматизировать этот перевод!
     *
     * На вход подается положительное целое число count - количество выученных
     * иностранных слов. Нужно вывести какому уровню соответствует это количество.
     */

    public static void main(String[] args) {
        int count; // Количество слов
        String level = null; //Уровень английского

        //Получим от пользователя количество слов
        System.out.print("Введите количество выученных иностранных слов: ");
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        input.close();

        //Определим уровень и представим результат для пользователя
        if (count < 500) level = "beginner";
        if (count >= 500 && count < 1500) level = "pre-intermediate";
        if (count >= 1500 && count < 2500) level = "intermediate";
        if (count >= 2500 && count < 3500) level = "upper-intermediate";
        if (count >= 3500) level = "fluent";
        System.out.println(level);
    }
}
