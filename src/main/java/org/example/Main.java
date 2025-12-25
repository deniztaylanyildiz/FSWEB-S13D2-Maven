package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {

        int originalNumber = Math.abs(number);
        int reversedNumber = 0;
        int temp = originalNumber;


        while (temp > 0) {
            int lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }

        return originalNumber == reversedNumber;
    }


    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // i tam bölünüyorsa toplama ekle
            }
        }
        return sum == number;
    }


    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        String numberString = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);

            switch (digit) {
                case '0': result.append("Zero"); break;
                case '1': result.append("One"); break;
                case '2': result.append("Two"); break;
                case '3': result.append("Three"); break;
                case '4': result.append("Four"); break;
                case '5': result.append("Five"); break;
                case '6': result.append("Six"); break;
                case '7': result.append("Seven"); break;
                case '8': result.append("Eight"); break;
                case '9': result.append("Nine"); break;
            }
            if (i < numberString.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
