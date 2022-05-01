package com.letscode.bankservice.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateNumber {

    Random generator = new Random();
    List<Integer> numbersHistory = new ArrayList<>();

    public int execute() {
        int number;

        do {
            number = generator.nextInt(100) * 1000;
        } while (number == 0);

        numbersHistory.add(number);

        if (numbersHistory.contains(number)) {
            do {
                number = generator.nextInt(100) * 1000;
            } while (numbersHistory.contains(number));
        }

        return number;
    }
}
