package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch victorSeiko = new Watch("Seiko", "victor", 18_000.0);
        Watch dmitrySeiko = new Watch("Seiko", "Dmitry", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(victorSeiko, vitaliySeiko,
                dmitrySeiko, valentinOmega));
        System.out.println("Наши часы:" + watches);
//        Вывести часы у которых цена больше 30_000 рублей

        for (Watch elementWatch : watches) {
            if (elementWatch.getPrice() > (25_000.0)) {
                System.out.println(elementWatch + " ");
            }
        }
// первые часы у которых цена больше 25_000
        for (Watch watch : watches) {
            if (watch.getPrice() > (25_000.0)) {
                System.out.println(watch + " ");
                break;
            }
            System.out.println();
        }
// пропустить первых два элемента
        System.out.println("Пропустить первых два элемента фирмы Seiko");
        int count = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && count < 2) {
                count++;
            }else
            System.out.println(watches.get(i));
        }


    }
}
