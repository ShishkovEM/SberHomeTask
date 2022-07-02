package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class ExtraTask1 {
    /**
     * (2 балла) У Марата был взломан пароль. Он решил написать программу,
     * которая проверяет его пароль на сложность. В интернете он узнал, что пароль
     * должен отвечать следующим требованиям:
     * ● пароль должен состоять из хотя бы 8 символов;
     * ● в пароле должны быть:
     * ○ заглавные буквы
     * ○ строчные символы
     * ○ числа
     * ○ специальные знаки(_*-)
     * Если пароль прошел проверку, то программа должна вывести в консоль строку
     * идеально! :D, иначе строку: пароль не прошел проверку(
     */

    public static void main(String[] args) {
        final int MINIMAL_LENGTH = 8; //Минимальная длина пароля
        String password; //Пароль Марата
        boolean isLegalPassword; //Переменная для хранения сведений о надёжности пароля
        boolean hasEnoughLength;
        boolean hasCapitals;
        boolean hasLowerCaseLetters;
        boolean hasNumbers;
        boolean hasSpecialSymbols;

        //Получим от пользователя строку
        System.out.print("Введите Ваш пароль: ");
        Scanner input = new Scanner(System.in);
        password = input.nextLine();
        input.close();

        //Проверим, достаточна ли длина пароля
        hasEnoughLength = password.length() >= MINIMAL_LENGTH;

        //Проверим, содержатся ли в строке заглавные буквы
        hasCapitals = !password.toLowerCase().equals(password);

        //Проверим, содержатся ли в строке строчные буквы
        hasLowerCaseLetters = !password.toUpperCase().equals(password);

        //Проверим, содержатся ли в строке цифры
        hasNumbers = password.contains("0") ||
                     password.contains("1") ||
                     password.contains("2") ||
                     password.contains("3") ||
                     password.contains("4") ||
                     password.contains("5") ||
                     password.contains("6") ||
                     password.contains("7") ||
                     password.contains("8") ||
                     password.contains("9");

        //Проверим, содержатся ли в строке специальные символы
        hasSpecialSymbols = password.contains("_") ||
                            password.contains("*") ||
                            password.contains("-");

        //Проверим, удовлетворяет ли строка всем требованиям и выведем результат
        isLegalPassword = hasEnoughLength &&
                          hasCapitals &&
                          hasLowerCaseLetters &&
                          hasNumbers &&
                          hasSpecialSymbols;

        System.out.println(isLegalPassword ? "пароль надежный" : "пароль не прошел проверку (");
    }
}
