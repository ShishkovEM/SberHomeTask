package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task6 {
    /**
     * На вход подается количеств миль – count.
     * Переведите мили в километры (1 миля = 1,60934 км) и выведите количество километров.
     */

    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.60934; //Количество километров в одной миле
        int count; //Входное количество миль
        double kilometers; //Выходное количество километров

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество миль: ");
        count = scanner.nextInt();
        scanner.close();

        //Вычислим количество километров
        kilometers = count * KILOMETERS_PER_MILE;

        //Представим результат в требуемом формате
        System.out.println(kilometers);
    }
}