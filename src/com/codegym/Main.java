package com.codegym;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] myList = new int[5];

        Scanner input = new Scanner(System.in);

            for (int i = 0; i < myList.length; i++) {
                System.out.print("myList[" + i + "]:");
                myList[i] = input.nextInt();
            }



        for (int i : myList) {
            System.out.println(i);
        }

        System.out.println("\n");

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }


        int a = 10;
        int b = 20;
        int kq = addNumber(a, b);
        System.out.println("kq=" + kq);
        showMessage();

        int[] array = new int[5];

        Main main = new Main();
        int[] result = main.addArray(array);

        System.out.println("\n");
        for (int element : result) {
            System.out.println(element);

        }
    }

    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static void showMessage() {
        System.out.println("hello");
    }

    public int[] addArray(int[] array) {
        array[0] = 3;
        array[1] = 6;
        array[2] = 9;
        array[3] = 20;
        array[4] = 40;

        return array;
    }
}
