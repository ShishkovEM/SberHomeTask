package ru.sberbank.hometask1.part1;
import java.util.Scanner;

public class Task3 {
    /**
     *(1 балл) Прочитайте из консоли имя пользователя и выведите в консоль строку:
     *Привет, <имя пользователя>!
     */

    public static void main(String[] args) {
        String userName; //Имя пользователя

        Scanner scanner = new Scanner(System.in);
        System.out.print("Назови своё имя: ");
        userName = scanner.nextLine();
        scanner.close();

        //Выведем результат (предусмотрим случай ввода пользователем пустой строки)
        System.out.println(userName.isBlank() ? "Привет, незнакомец!" : "Привет, " + userName + "!");
    }
}