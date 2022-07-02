package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task5 {
    /**
     * Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход подается количество дюймов, выведите количество сантиметров.
     */

    public static void main(String[] args) {
        final double CENTIMETERS_PER_INCH = 2.54; //Количество сантиметров в одном дюйме
        int count; //Входное значение количества дюймов
        double centimeters; //Результирующее количество сантиметров

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дюймов: ");
        count = scanner.nextInt();
        scanner.close();

        //Вычислим количество сантиметров
        centimeters = count * CENTIMETERS_PER_INCH;

        //Представим результат в требуемом формате
        System.out.println(centimeters);
    }
}