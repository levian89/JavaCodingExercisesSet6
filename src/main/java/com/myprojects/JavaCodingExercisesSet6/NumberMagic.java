package com.myprojects.JavaCodingExercisesSet6;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberMagic {

    public static List<Integer> determineAllFactors(int number) {

        List<Integer> divisorsOfNumber = new ArrayList<>();

//        if(number<=0) {
//            return divisorsOfNumber;
//        }

        for (int i = 1; i<=number; i++) {
            if(number%i==0) {
                divisorsOfNumber.add(i);
            }
        }
        return divisorsOfNumber;
    }

    public static List<Integer> determineMultiples(int number, int limit) {

        List<Integer> multiplesOfGivenNumber = new ArrayList<>();

        if (number<=0 || limit<=0) {
            return multiplesOfGivenNumber;
        }

        for (int i = 1; i * number < limit; i++) {
            multiplesOfGivenNumber.add(i*number);
        }
        return multiplesOfGivenNumber;
    }

    private static int getNumberFromUser(Scanner scanner) {
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        return number;
    }

    private static int getLimitFromUser(Scanner scanner) {
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();
        return limit;
    }


    public static void main(String[] args) {
        System.out.println(determineAllFactors(100));
        System.out.println(determineMultiples(1,0));

        Scanner scanner = new Scanner(System.in);
        int number = getNumberFromUser(scanner);

        int limit = getLimitFromUser(scanner);

        System.out.println("The list of divisors of the number " + number + " is: " + determineAllFactors(number));
        System.out.println("The list of multiples of the number " + number + " up to the limit " + limit
                + " is: " + determineMultiples(number,limit));
    }
}