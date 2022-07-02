package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task8 {
    /**
     * На вход подается баланс счета в банке – n.
     * Рассчитайте дневной бюджет на 30 дней.
     */

    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 30; //Количество дней, для которых расчитывается дневной бюджет
        int n; //Баланс счета в банке
        double dailyBudget; //Дневной бюджет

        //Получаем от пользователя значение баланса
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите баланс счета в банке: ");
        n = scanner.nextInt();
        scanner.close();

        //Вычисляем дневной бюджет
        dailyBudget = (double)n / NUMBER_OF_DAYS;

        //Представим результат в требуемом формате
        System.out.println(dailyBudget);
    }
}