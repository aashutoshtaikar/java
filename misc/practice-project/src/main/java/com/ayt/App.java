package com.ayt;

import java.util.Iterator;
import java.util.List;

class Student {
    public int enrollmentNumber;
    public String name;
    public static int totalStudents;

    public Student(String name) {
        this.name = name;
        enrollmentNumber = totalStudents;
        totalStudents++;
    }

    @Override
    public String toString() {
        return this.enrollmentNumber + ':' + this.name;
    }

}

class Example {
    // member variable / instance variable
    public int numb = 10; // stack

    // stack: s(ref)-> heap: Student object
    public Student s = new Student("ash");

    // class variable/ global variable
    public static Student ss = new Student("tim");

    void someMethod() {
        // local variable/
        Student t = new Student("tanya");
    }
}

public final class App {

    public static long getIdealNums(long low, long high) {
        // write your code here
        long idealNums = 0;
        for (long i = low; i <= high; i++) {
            if (isIdealNumber(i)) {
                idealNums++;
            }
        }
        return idealNums;
    }

    public static boolean isIdealNumber(long num) {
        while (num % 3 == 0 && num != 0) {
            num = num / 3;
        }
        while (num % 5 == 0 && num != 0) {
            num = num / 5;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // System.out.println(getIdealNums(200, 405));
        int a[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int b[][] = { { 3, 2, 1 }, { 3, 2, 1 }, { 3, 2, 1 } };
        // System.out.println(a[0].length);
        int c[][] = addTwoMatrices(a, b);
        System.out.println(c);
    }

    public static int[][] addTwoMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length && (a[i].length == b[i].length); j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        return c;
    }
}
