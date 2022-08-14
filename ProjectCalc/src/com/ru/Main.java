package com.ru;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws IOException {
        System.out.println("Введите выражение, используя пробелы, и нажмите «Enter»");
        System.out.println("Чтобы прекратить работу, введите слово «Ex» и нажмите «Enter»");
        Scanner console = new Scanner(System.in);
        String inp1;
        String inp2;
        int var1;
        int var2;
        String op;
        int size;
        int result;
        String [] ROMANinput = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String [] ARABICinput = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String [] ROMAN = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        do {
            String input = console.nextLine();
            if (input.equals("Ex")) {
            break;
            }
                String[] INPUT = input.split(" ");
                size = INPUT.length;
                    if (size != 3) {
                        throw new IOException("Ошибка. Количество элементов должно равняться трём: два операнда и один оператор (+, -, /, *)");
                    }
                    op = INPUT[1];
                    if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                        System.out.print("");
                    } else {
                        throw new IOException("Ошибка. К вводу доступны операторы (+, -, /, *)");
                    }
                    inp1 = INPUT[0];
                    inp2 = INPUT[2];

                            if (Arrays.asList(ARABICinput).contains(inp1) && Arrays.asList(ARABICinput).contains(inp2)) {
                                var1 = Integer.parseInt(INPUT[0]);
                                var2 = Integer.parseInt(INPUT[2]);
                                                if (op.equals("+")) {
                                                    result = var1 + var2;
                                                } else if (op.equals("-")) {
                                                    result = var1 - var2;
                                                } else if (op.equals("*")) {
                                                    result = var1 * var2;
                                                } else {
                                                    result = var1 / var2;
                                                }
                                                System.out.println(result);
                            } else if (Arrays.asList(ROMANinput).contains(inp1) && Arrays.asList(ROMANinput).contains(inp2)) {
                                int indexinp1 = Arrays.asList(ROMANinput).indexOf(inp1);
                                int indexinp2 = Arrays.asList(ROMANinput).indexOf(inp2);
                                var1 = Integer.parseInt(ARABICinput[indexinp1]);
                                var2 = Integer.parseInt(ARABICinput[indexinp2]);
                                                if (op.equals("+")) {
                                                    result = var1 + var2;
                                                } else if (op.equals("-")) {
                                                    result = var1 - var2;
                                                } else if (op.equals("*")) {
                                                    result = var1 * var2;
                                                } else {
                                                    result = var1 / var2;
                                                }
                                if (result >= 1) {
                                    String resultinRoman = ROMAN[result - 1];
                                    System.out.println(resultinRoman);
                                } else
                                    throw new IOException("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
                            } else
                                throw new IOException("Ошибка. Значение обеих операнд должно быть записано целыми римскими или арабскими числами от 1 до 10");
        } while (true);
   }
}
