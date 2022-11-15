package ru.itsjava.strings;

import java.io.StringBufferInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Я строка";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));
        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = " +
                str.equalsIgnoreCase("Я строкА"));

        System.out.println("str.compareTo(\"Я стрОка\") = " + str.compareTo("Я стрОка"));

        String[] strs = str.split(" ");
        System.out.println(strs[0]);
        System.out.println(strs[1]);


        StringBuilder builderStr = new StringBuilder(str);
        for (int i = 0; i < 1; i++) {
            builderStr.append('!');
            System.out.println(builderStr);
        }
        String stringForHomeWork = "Строка для домашней работы";
        System.out.println(stringForHomeWork.length());/* возвращает длинну строки*/

        System.out.println(stringForHomeWork.charAt(24));/* возвращает символ по указанному индексу*/

        stringForHomeWork.compareTo("Другая строка");/* сравнивает строки лексикографически, ответ
          представляется ввиде >0,<0,=0 */

        stringForHomeWork.compareToIgnoreCase("Другая строка");/* сравнивает строки лексикографически
         игнорируя регистр */

        stringForHomeWork.equals("Другая строка");/* сравнение строки с  обьектом*/

        stringForHomeWork.equalsIgnoreCase("Другая строка");/* сравнение строки с  обьектом
        игнорируя регистр */

        System.out.println("stringForHomeWork.getBytes(StandardCharsets.UTF_8) = " +
                stringForHomeWork.getBytes(StandardCharsets.UTF_8));/* кодирует строку в последовательность
                байтов и сохраняет в новый массив байтов используя кодировку UTF_8 */

        stringForHomeWork.toLowerCase(Locale.ROOT);/* переводит строку в нижний регистр с базовым представлением алфавита*/

        stringForHomeWork.toUpperCase();/* переводит строку в верхний регистр*/

        String[] strsForHomeWork = stringForHomeWork.split(" ");/* разделяет строку на массивы*/

        stringForHomeWork.isEmpty();/* проверяет пустая ли строка */

        stringForHomeWork.trim();/* возвращает копию строки без пробело по краям */

        String str2 = stringForHomeWork.intern();/* возвращает строку в пул строк */

        System.out.println("stringForHomeWork.concat(\" Другая строка\") = " + stringForHomeWork.concat(" Другая строка"));
        /* конкатенация строк*/

        System.out.println("stringForHomeWork.hashCode() = " + stringForHomeWork.hashCode());/* возвращает хэшкод обьекта*/

        System.out.println("stringForHomeWork.indent(3) = " + stringForHomeWork.indent(3));/* позволяет сделать отступ
        в n пробелов перед строкой*/

        System.out.println("stringForHomeWork.indexOf(\"Для работы\") = " + stringForHomeWork.indexOf("для"));/* возвращает индекс под которым
        строка первый раз совпала с нашей строкой, т.е. первое вхождение указанного параметра в обьект String*/

        String replace = stringForHomeWork.replace("С", "V");
        System.out.println("replace = " + replace); /* позволяет заменить символ*/
    }
}
