package icu.cyclone.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number: ");
        System.out.println(isPalindromeN(sc.nextInt()) ? "It's palindrome" : "It isn't palindrome");
    }

    public static boolean isPalindromeS(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("int must be bositive");
        }

        String str = String.valueOf(number);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeN(int digit) {
        if (digit < 0) {
            throw new IllegalArgumentException("int must be bositive");
        }

        int originalDigit = digit;
        int invertDigit = 0;

        while (digit > 0) {
            invertDigit = invertDigit * 10 + digit % 10;
            digit /= 10;
        }

        if (invertDigit == originalDigit) {
            return true;
        }
        return false;
    }
}
