package org.itstep;

import java.util.Scanner;

public class MultiplesOfThree {

    public static void main(String[] args) {
        System.out.println("Введите числа через пробел:");
        Scanner consoleScanner = new Scanner(System.in);
        String numbersFromConsole = consoleScanner.nextLine();
        String numbersFromConsoleInArray[] = numbersFromConsole.split(" ");
        int arrayOfNumbers[] = new int[numbersFromConsoleInArray.length];
        for (int i = 0; i < numbersFromConsoleInArray.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(numbersFromConsoleInArray[i]);
        }
        consoleScanner.close();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 3 == 0) {
                System.out.println(arrayOfNumbers[i]);
            }
        }
    }
}
