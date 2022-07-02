package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task9 {
    /**
     * На вход подается бюджет мероприятия – n тугриков.
     * Бюджет на одного гостя – k тугриков.
     * Вычислите и выведите, сколько гостей можно пригласить на мероприятие.
     */

    public static void main(String[] args) {
        int n, k; //Бюджет мероприятия n и бюджет на одного гостя k
        int quantity; //Максимальное количество гостей, которое можно пригласить

        //Получение исходных данных
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите бюджет мероприятия n: ");
        n = scanner.nextInt();
        System.out.print("Введите бюджет на одного гостя k: ");
        k = scanner.nextInt();
        scanner.close();

        //Вычислим максимальное количество гостей
        quantity = n / k;

        //Представим результат в требуемом формате
        System.out.println(quantity);
    }
}