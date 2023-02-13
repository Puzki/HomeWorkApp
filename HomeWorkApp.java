package org.example;

import org.w3c.dom.html.HTMLAppletElement;

import java.sql.SQLOutput;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int varA = 10;
        int varB = 5;
        int varC = varA + varB;

        if (varC >= 0) {
            System.out.println("Сумма положительная");
        }
            if (varC < 0) {
                System.out.println("Сумма отрицательная");
            }


    }

    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers() {
        int A = 100;
        int B = 200;

        if (A >= B) {
            System.out.println("A>=B");
        } else if (A < B) {
            System.out.println("A<B");
        }
    }
}
