package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task1 {
    /**
     * Вычислите и выведите объем шара, прочитав его радиус r с консоли.
     * Примечание: считать по формуле V  =  4/3 * 3.14 * r^3
     */

    public static void main(String[] args) {
        final double SPHERE_CONSTANT = 4.0 / 3 * 3.14; //Константа для вычисления объёма шара
        int radius; //Радиус шара
        double volume; //Объём шара
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите корректное значение радиуса (r > 0): ");
        radius = scanner.nextInt();
        scanner.close();

        //Вычислим объём шара и выведем результат вычисления
        if (radius < 0) {
            System.out.println("Радиус шара не может быть отрицательным!");
        } else {
            volume = SPHERE_CONSTANT * radius * radius * radius;
            System.out.println("V = " + volume);
        }
    }
}