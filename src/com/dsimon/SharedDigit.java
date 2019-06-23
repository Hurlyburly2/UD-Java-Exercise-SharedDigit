package com.dsimon;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        while (firstNumber > 0) {
            int currentDigit = firstNumber % 10;
            int secondNumberTemp = secondNumber;

            while (secondNumberTemp > 0) {
                if (secondNumberTemp % 10 == currentDigit) {
                    return true;
                }
                secondNumberTemp /= 10;
            }
            firstNumber /= 10;
        }
        return false;
    }
}
