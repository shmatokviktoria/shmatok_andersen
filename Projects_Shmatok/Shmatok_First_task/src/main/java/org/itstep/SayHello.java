package org.itstep;

import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner consoleScanner = new Scanner(System.in);
        int numberFromConsole = consoleScanner.nextInt();
        consoleScanner.close();
        if (numberFromConsole >= 7) {
            System.out.println("Привет");
        }
    }
}
