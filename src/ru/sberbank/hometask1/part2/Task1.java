package ru.sberbank.hometask1.part2;
import java.util.Scanner;

public class Task1 {
    /**
     За каждый год работы Петя получает на ревью оценку. На вход
     подаются оценки Пети за последние три года (три целых положительных числа).
     Если последовательность оценок убывает, то вывести "Петя, пора трудиться"
     В остальных случаях вывести "Петя молодец!"
     */

    public static void main(String[] args) {
        int a, b, c; //Оценки Пети за 1-й, 2-й и 3-й год работы соответственно
        boolean isDescendingSequence; //Переменна

        //Получим от пользователя значения оценок
        System.out.print("Введите оценки Пети за последние три года через пробел: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();

        //Проверим, является ли последовательности введённых оценок убывающей
        isDescendingSequence = b < a && c < b;
        System.out.println(isDescendingSequence ? "Петя, пора трудиться" : "Петя молодец!");
    }
}
