package com.ayt;

public class sapp {
    public static boolean isIdealNumber(long num) {
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        if (num == 0) {
            return true;
        }
        return false;
    } 
}