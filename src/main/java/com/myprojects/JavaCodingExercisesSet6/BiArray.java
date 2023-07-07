package com.myprojects.JavaCodingExercisesSet6;

import java.util.Scanner;

public class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {
        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

//        if (sum1==sum2) {
//            return true;
//        }
//        return false;

        //or

        boolean areSumsEqual = (sum1==sum2);
        return areSumsEqual;
//        return sum1 == sum2;
    }

    public static boolean areSumsEqual(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int element:array1) {
            sum1 = sum1 + element;
        }
        for(int element:array2) {
            sum2 = sum2 + element;
        }

        return sum1 == sum2;
    }

    private static int calculateSum(int[] array) {

        int sum = 0;
        for(int element:array) {
            sum = sum + element;
        }
        return sum;
    }

    private static int[] getArrayFromUser(Scanner scanner) {
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] integers = new int[arraySize];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<arraySize; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for(int i=0; i<arraySize; i++) {
            System.out.print(integers[i] + " ");
        }
        return integers;
    }


    public static void main(String[] args) {
        BiArray biArray = new BiArray(new int[]{1, 4, 6}, new int[]{1, 4, 6});
        System.out.println(biArray.areSumsEqual());

        System.out.println("Sum of the elements of the array: " +calculateSum(new int[]{1, 4, 6}));
        System.out.println("Are sums of the two arrays equal?: " +areSumsEqual(new int[]{1, 4, 6},new int[]{1, 4, 6}));

        Scanner scanner = new Scanner(System.in);
        int[] integers = getArrayFromUser(scanner);
        System.out.println();

        System.out.println("The sum of the elements of the array: " + calculateSum(integers));

        int[] integers1 =getArrayFromUser(scanner);
        System.out.println();
        int[] integers2 =getArrayFromUser(scanner);
        System.out.println();
        System.out.println("Are the sums from the two arrays provided by user equal? " + areSumsEqual(integers1,integers2));


    }


}