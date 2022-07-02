package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task2 {
    /**
     * На вход подается два целых числа – a и b. Вычислите и выведите среднее квадратическое a и b.
     */

    public static void main(String[] args) {
        final int NUMBER_OF_ARGUMENTS = 2; //Число входных аргументов
        int a, b; //Входные числа для вычисления среднего квадратического
        double rms; //Среднее квадратическое

        //Получение исходных чисел
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение первого числа а: ");
        a = scanner.nextInt();
        System.out.print("Введите значение второго числа b: ");
        b = scanner.nextInt();
        scanner.close();

        //Вычисление среднего квадратического
        rms = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / NUMBER_OF_ARGUMENTS);

        //Выведем результат в требуемом формате
        System.out.println(rms);
    }
}