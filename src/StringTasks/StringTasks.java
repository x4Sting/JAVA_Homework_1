package StringTasks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        {
//          1.	На вход подается текст, все предложения, которого начинаются с маленькой буквы. Вывести исправленный текст на консоль.
            String str1 = "на вход подается текст. все предложения, которого начинаются с маленькой буквы. вывести исправленный текст на консоль. тут еще текст.";

            String subStr = str1.substring(0, 1);

            str1 = str1.replaceFirst(subStr, subStr.toUpperCase());

            int i = 0;

            do {
                i = str1.indexOf(". ", i);

                if (i != -1 && i < str1.length()) {
                    subStr = str1.substring(i, i + 3);

                    str1 = str1.replace(subStr, subStr.toUpperCase());

                    i += 3;
                }

            } while (i != -1);

            //System.out.println(str1);     // uncomment
        }
        {
//          2.	На вход подается 1 строка. Необходимо вывести букву, которая встречается в строке дважды.

            String str2 = "a 2 ss ddd ffff gg 2 h";

            while (!str2.isEmpty()) {
                char ch = str2.toCharArray()[0];

                str2 = str2.substring(1);

                if (ch == ' ')
                    continue;

                int num = 1;

                for (int i = 0; i < str2.length(); i++) {
                    if (str2.charAt(i) == ch) {
                        num++;
                        str2 = str2.substring(0, i) + str2.substring(i + 1);
                        i--;
                    }
                }

//                if (num == 2)                 // uncomment
//                    System.out.println(ch);
            }
        }
        {
//          3.	На вход подается 1 строка. Необходимо вывести букву, которая встречается в строке больше всего.

            String str3 = "a 2 ss dddd ffff gg 2 h";

            int numResults = 0;
            ArrayList results = new ArrayList();

            while (!str3.isEmpty()) {
                char ch = str3.toCharArray()[0];

                str3 = str3.substring(1);

                if (ch == ' ')
                    continue;

                int num = 0;

                for (int i = 0; i < str3.length(); i++) {
                    if (str3.charAt(i) == ch) {
                        num++;
                        str3 = str3.substring(0, i) + str3.substring(i + 1);
                        i--;
                    }
                }

                if (num > numResults) {
                    numResults = num;
                    results.clear();
                }

                if (num >= numResults)
                    results.add(ch);

            }

//            System.out.println(results); // uncomment
        }


        {
//          4.	На вход подается 1 строка. Необходимо вывести эту же строку символы которой будут менять свой регистр.

            String str4 = "a B c D f E";

            for (int i = 0; i < str4.length(); i++) {
                if (Character.isUpperCase(str4.charAt(i))) {
                    str4 = str4.substring(0, i) + Character.toLowerCase(str4.charAt(i)) + str4.substring(i + 1);
                }
                else{
                    str4 = str4.substring(0, i) + Character.toUpperCase(str4.charAt(i)) + str4.substring(i + 1);
                }
            }

//            System.out.println(str4);     // uncomment

        }

        {
//        5.	При вводе пользователь выделяет строки используя пробел. Необходимо вывести каждую из этих строк.}

            String str5 = "aaaaa Bbbb cccc Dddddd ff Eeeee ";

            while (!str5.isEmpty())
            {
                int i = str5.indexOf(' ');

                if (i != -1) {
//                    System.out.println(str5.substring(0, i));     // uncomment
                    str5 = str5.substring(i + 1);
                }
                else {
//                    System.out.println(str5);                     // uncomment
                    str5 = "";
                }
            }
        }

        {
//        6.	На вход подается строка. Известно, что она содержит ровно три одинаковые подстроки длинною в три символа. Найдите их, верните подстроку.

            String str6 = "3332233315555533344444444";

            for (int i = 0; i < str6.length() - 3; i++) {

                String str = str6.substring(i, i + 3);

                int num = 0;

                for (int j = i; j < str6.length() - 2; j++) {

                    int index = str6.indexOf(str, j );

                    if (index != -1) {
                        num++;
                        j = index + 2;
                    }
                }

                if (num == 3) {
//                    System.out.println(str);          // uncomment
                    break;
                }
            }
        }
        {
            //        7.	Количество слов в строке
            //        Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

            String str7 = " sdff efsef dsfe rew.";

            str7 = str7.trim();

            int num = 0;

            if (!str7.isEmpty()) {

                num++;

                for (int i = 0; i < str7.length(); i++) {
                    if (str7.charAt(i) == ' ')
                        num++;
                }
            }

//            System.out.println(num);          // uncomment

        }
        {
//        8.	Количество строчных и прописных букв в строке
//        Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

            String str8 = "as3F,D4s ";

            str8 = str8.replaceAll("[^a-zA-Z]", "");

            int numLowCase = 0;
            int numUpCase = 0;

            for (int i = 0; i < str8.length(); i++) {

                char ch = str8.charAt(i);

                if (Character.isUpperCase(ch))
                    numUpCase++;
                else
                    numLowCase++;
            }

//            System.out.println("Number in uppercase: " + numUpCase);          // uncomment
//            System.out.println("Number in lowercase: " + numLowCase);
        }

        {
//          9.	Самое длинное слово в строке
//            Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.

            String str9 = "1 22 55555 88888888 4444";

            String maxSubStr = "";

            for (int i = 0; i < str9.length(); i++) {
                if (str9.charAt(i) == ' ') {
                    String subStr = str9.substring(0, i);

                    if (maxSubStr.length() < subStr.length())
                        maxSubStr = subStr;

                    str9 = str9.substring(i + 1);
                    i = -1;
                }
            }

//            System.out.println(maxSubStr);          // uncomment
        }
        {
//        10.	Удаление из строки повторяющихся символов
//        Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".

            String str10 = "abc cde def";

            String result = "";

            str10 = str10.replaceAll("\\s", "");

            for (int i = 0; i < str10.length(); ) {

                char ch = str10.charAt(i);
                String str = str10.substring(i + 1);

                str10 = str.replaceAll("[" + ch + "]", "");

                result = result + ch;
            }

//            System.out.println(result);          // uncomment
        }


        {
//        11.	Отфильтровать из строки числа
//        Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0.

            String str11 = "data 48 call 9 read13 blank0a";

            String strNum = "";

            ArrayList<Integer> results = new ArrayList<Integer>();

            for (int i = 0; i < str11.length(); i++) {

                char ch = str11.charAt(i);

                if (Character.isDigit(ch)) {
                    strNum += ch;
                    continue;
                }

                if (strNum.length() != 0) {
                    results.add(Integer.parseInt(strNum));
                    strNum = "";
                }
            }

//            System.out.println(results);          // uncomment
        }
        {
//        12.	Составить из букв введенной строки слова
//        Вводится строка, состоящая из букв и пробелов. Составить из входящих в нее букв несколько любых их сочетаний (слов) любой длины. Каждую букву строки можно использовать неограниченное количество раз.

            String str12 = "qwertyuiop asdfghjkl zxcvbnm ";

            int numWords = 10;
            int minLength = 10;

            Random rand = new Random();

            for (int i = 0; i < numWords; i++) {

                String word = "";

                while(true){
                    char ch = str12.charAt(rand.nextInt(str12.length()));

                    if (ch == ' ') {
                        if (word.length() < minLength)
                            continue;

                        break;
                    }

                    word += ch;
                }

                if (word.isEmpty())
                    i--;
//                else                                      // uncomment
//                    System.out.println(word);
            }
        }

        {
//        13.	Напишите программу проверки, читается ли стока одинаково в обоих направлениях одинаково. Вводится строка.
//        Удалить из нее все пробел, привести к единому регистру. После этого определить, является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.

            String str13 = "as dtds a ";

            str13 = str13.replaceAll("\\s", "").toUpperCase();

            int halfLength = str13.length() / 2;

            boolean polindrom = true;

            for (int i = 0; i < halfLength; i++) {

                char ch = str13.charAt(i);

                int lastIndex = str13.lastIndexOf(ch);

                if (str13.length() != 1 && lastIndex == i || i != str13.length() - lastIndex - 1) {
                    polindrom = false;
                    break;
                }
            }

//            if (polindrom)                                        // uncomment
//                System.out.println("Является полиндромом");
//            else
//                System.out.println("Не является полиндромом");

        }
//        14.	Решить предыдущую задачу не используя классы StringBuffer и StringBuilder.

        {
//        15.	Напишите программу удаления указанного символа из строки.
//        (исп. метод replaceAll для замены всех вхождений в строку другой строкой.

            // uncomment

//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Введите строку:");
//            String str = sc.nextLine();
//            System.out.println("Введите символ:");
//            char ch = sc.nextLine().charAt(0);
//
//            str = str.replaceAll("[" + ch + "]", "");

//            System.out.println(str);
        }

        {
//        16.	Решить предыдущую задачу, не используя replace/ replaceAll.}
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Введите строку:");
//            String str = sc.nextLine();
//            System.out.println("Введите символ:");
//            char ch = sc.nextLine().charAt(0);
//
//            int i = str.indexOf(ch);
//
//            while (i != -1){
//                str = str.substring(0, i) + str.substring(i + 1);
//                i = str.indexOf(ch);
//            }
//
//            System.out.println(str);            // uncomment
        }

    }
}
