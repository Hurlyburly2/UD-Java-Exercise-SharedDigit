package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(SharedDigit.hasSharedDigit(12, 23) == true);
        System.out.println(SharedDigit.hasSharedDigit(9, 99) == false);
        System.out.println(SharedDigit.hasSharedDigit(15, 55) == true);
        System.out.println(SharedDigit.hasSharedDigit(15, 34) == false);

    }
}
