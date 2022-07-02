package ru.sberbank.hometask1.part2;

import java.util.Scanner;

public class ExtraTask3 {
    /**
     * Старый телефон Андрея сломался, поэтому он решил приобрести
     * новый. Продавец телефонов предлагает разные варианты, но Андрея
     * интересуют только модели серии samsung или iphone. Также Андрей решил
     * рассматривать телефоны только от 50000 до 120000 рублей. Чтобы не тратить
     * время на разговоры, Андрей хочет написать программу, которая поможет ему
     * сделать выбор.
     * На вход подается строка – модель телефона и число – стоимость телефона.
     * Нужно вывести "Можно купить", если модель содержит слово samsung или
     * iphone и стоимость от 50000 до 120000 рублей включительно. Иначе вывести
     * "Не подходит".
     * Гарантируется, что в модели телефона не указано одновременно несколько
     * серий.
     */

    public static void main(String[] args) {
        final int MINIMUM_PRICE = 50000;
        final int MAXIMUM_PRICE = 120000;
        String phoneModel;
        int price;
        boolean isAcceptableModel;
        boolean isAcceptablePrice;

        //Получим от пользователя входную строку и число
        Scanner input = new Scanner(System.in);
        phoneModel = input.nextLine();
        price = input.nextInt();
        input.close();

        //Проверим, что введённая строка содержит подстроки "iphone" или "samsung"
        isAcceptableModel = phoneModel.toLowerCase().contains("iphone") ||
                            phoneModel.toLowerCase().contains("samsung");

        //Проверим, что введённая цена находится в допустимом диапазоне
        isAcceptablePrice = price >= MINIMUM_PRICE && price <= MAXIMUM_PRICE;

        System.out.println(isAcceptableModel && isAcceptablePrice ? "Можно купить" : "Не подходит");
    }
}
