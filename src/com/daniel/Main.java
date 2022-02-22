package com.daniel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        arrayPrinter();
//        threeLargestDigits();
        specialStuff();

    }

    // Prints two arrays with random numbers but better.
    static void arrayPrinter() {

        ArrayList<Integer> array1 = arrayGen();
        ArrayList<Integer> array2 = arrayGen();

        System.out.println("Array1: " + array1);
        System.out.println("Array2: " + array2);
    }

    // Generate an array of numbers
    static ArrayList<Integer> arrayGen() {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            array.add((int) (Math.random() * 10));
        }

        return array;
    }

    // Finds the highest 3 digits in an array
    static void threeLargestDigits() {

        ArrayList<Integer> array = arrayGen();
        System.out.println("The array: " + array);

        int highestDigits = 0;

        for (int i = 0; i < 13; i++) {

            int hundredsDig = array.get(i) * 100;
            int dozensDig = array.get(i + 1) * 10;
            int unitsDig = array.get(i + 2);
            int newDigits = hundredsDig + dozensDig + unitsDig;

            if (newDigits > highestDigits)
                highestDigits = newDigits;
        }

        System.out.println("The highest digits in the array are: " + highestDigits);
    }

    static void specialStuff() {

        // First two arrays
        ArrayList<Integer> array1 = arrayGen();
        ArrayList<Integer> array2 = arrayGen();
        System.out.println("Array1: " + array1);
        System.out.println("Array2: " + array2);

        ArrayList<Integer> specialArr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            specialArr.add(-1);
        }

        for (int num1 : array1)

            for (int num2 : array2)
                if (num1 == num2)
                    break;
                else
                    for (int i = 0; i < specialArr.size(); i++)
                        if (specialArr.get(i) != -1) {
                            specialArr.set(i, num1);
                            break;
                        }


        for (int num1 : array2)

            for (int num2 : array1)
                if (num1 == num2)
                    break;
                else
                    for (int i = 0; i < specialArr.size(); i++)
                        if (specialArr.get(i) != -1) {
                            specialArr.set(i, num1);
                            break;
                        }


        System.out.println("Special array: " + specialArr);

    }

}
