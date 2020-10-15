package org.itstep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloName {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFromConsole = reader.readLine();
        if (nameFromConsole.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, " + nameFromConsole);
        } else
            System.out.println("Нет такого имени");
    }
}
