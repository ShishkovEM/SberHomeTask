package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class ExtraTask2 {
    /**
     * У нас есть почтовая посылка (String mailPackage). Каждая почтовая
     * посылка проходит через руки проверяющего. Работа проверяющего
     * заключается в следующем:
     * ● во-первых, посмотреть не пустая ли посылка;
     * ● во-вторых, проверить нет ли в ней камней или запрещенной продукции.
     * Наличие камней или запрещенной продукции указывается в самой посылке в конце
     * или в начале. Если в посылке есть камни, то будет написано слово "камни!", если
     * запрещенная продукция, то будет фраза "запрещенная продукция".
     * После осмотра посылки проверяющий должен сказать:
     * ● "камни в посылке" – если в посылке есть камни;
     * ● "в посылке запрещенная продукция" – если в посылке есть что-то запрещенное;
     * ● "в посылке камни и запрещенная продукция" – если в посылке находятся камни
     * и запрещенная продукция;
     * ● "все ок" – если с посылкой все хорошо.
     * Если посылка пустая, то с посылкой все хорошо.
     * Напишите программу, которая будет заменять проверяющего.
     */

    public static void main(String[] args) {
        String mailPackage;
        boolean isEmptyPackage;
        boolean hasStones;
        boolean hasBannedProducts;

        //Получим от пользователя строку
        System.out.print("Введите состав посылки: ");
        Scanner input = new Scanner(System.in);
        mailPackage = input.nextLine();
        input.close();

        //Проверим, является ли посылка пустой. Если нет - продолжим проверки.
        isEmptyPackage = mailPackage.isBlank();
        if (isEmptyPackage) {
            System.out.println("все ок");
        } else {
            //Проверим, содержатся ли в посылке камни и запрещенная продукция
            hasStones = mailPackage.contains("камни!");
            hasBannedProducts = mailPackage.contains("запрещенная продукция");
            if (hasStones && hasBannedProducts)
                System.out.println("в посылке камни и запрещенная продукция");
            if (hasStones && !hasBannedProducts)
                System.out.println("камни в посылке");
            if (!hasStones && hasBannedProducts)
                System.out.println("в посылке запрещенная продукция");
            if (!hasStones && !hasBannedProducts)
                System.out.println("все ок");
        }
    }
}
