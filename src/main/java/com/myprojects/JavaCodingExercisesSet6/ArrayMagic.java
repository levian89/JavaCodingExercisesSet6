package com.myprojects.JavaCodingExercisesSet6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMagic {

    public static boolean doesHaveElementGreaterThan(int[] array, int number) {

        if (array.length==0) {
            return false;
        }

        for(int var:array) {
            if (var>number) {
                return true;
            }
        }
        return false;
    }

    public static int findSecondLargestElement(int[] array) {
        if (array.length==0) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element:array) {
            if(element>largest) {
                secondLargest = largest;
                largest = element;
            } else if (element>secondLargest && element != largest) {
                secondLargest = element;
            }
        }

        if (secondLargest==Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;

    }

    public static boolean isSorted(int[] array) {

        if (array.length<=1) {
            return true;
        }

        //1,2,3,4
        //10, 8, 3, 4
        //1,10,4,5
        //0,1,2,3

        for (int i=0; i<array.length-1; i++) {
            if(array[i+1]<array[i]) {
                return false;
            }

        }
        return true;
    }

    public static int[] reverseArray(int[] array) {
        if (array.length <=1 ) {
            return array;
        }

        //array:        {1, 2, 3, 4, 5}
        //reversedArray:{0, 0, 0, 4, 5}

        //reversedArray[0] = array[4]
        //reversedArray[4] = array[0]
        //reversedArray:{5, 0, 0, 0, 1}

        //reversedArray[1] = array[3]
        //reversedArray[3] = array[1]
        //reversedArray:{5, 4, 0, 2, 1}

        //reversedArray[2] = array[2]
        //reversedArray:{5, 4, 3, 2, 1}


        int start = 0;
        int end = array.length - 1;
        int[] reversedArray = new int[array.length];

        while(start<=end) {
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;
        }
        return reversedArray;
    }

    private static int[] getArrayFromUser(Scanner scanner) {
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] integers = new int[arraySize];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arraySize; i++) {
            integers[i]= scanner.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for(int i=0; i<arraySize; i++) {
            System.out.print(integers[i] + " ");
        }
        return integers;
    }

    private static int getNumberFromUser(Scanner scanner) {
        System.out.println("Enter the number: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
//        int[] integers = {1, 3, 5};
        System.out.println("Is there a number in array greater than the outside number?: "
                + doesHaveElementGreaterThan(new int[]{1, 3, 5},5));
        System.out.println("The second largest element in second array is: "
                + findSecondLargestElement(new int[]{1, 2, 5, 4}));
        System.out.println("Is this array sorted? " + isSorted(new int[]{1, 2, 5, 4}));
        System.out.println("Reverse initial array: " + Arrays.toString(reverseArray(new int[]{1, 3})));

        Scanner scanner = new Scanner(System.in);

        int[] integers = getArrayFromUser(scanner);
        System.out.println();
        int number = getNumberFromUser(scanner);
        System.out.println("Is there a number in array greater than the number introduced?: "
                + doesHaveElementGreaterThan(integers, number));

        int[] integers1 = getArrayFromUser(scanner);
        System.out.println();
        System.out.println("The second largest element in array is: " + findSecondLargestElement(integers1));

        int[] integers2 = getArrayFromUser(scanner);
        System.out.println();
        System.out.println("Is this array sorted? " + isSorted(integers2));

        int[] integers3 = getArrayFromUser(scanner);
        System.out.println();
        System.out.println("Reverse introduced array: " + Arrays.toString(reverseArray(integers3)));
    }
}