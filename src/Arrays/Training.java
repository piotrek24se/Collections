package Arrays;

import java.util.Random;

public class Training {

    // zadanie 1 (metoda swap zamieniająca 2 elementy tablicy)

    public static int[] swap(int[] ints1, int index1, int index2) {

        int a = ints1[index1];
        int b = ints1[index2];

        ints1[index1] = b;
        ints1[index2] = a;

        return ints1;
    }

    // zadanie 2

    public static int[] fillArray1(int n) {

        int[] ints = new int[n];

        for (int i = ints.length - 1; i >= 0; i--) {

            ints[ints.length - 1 - i] = i;

        }

        return ints;

    }

    // zadanie 3

    public static int[] fillArray2(int n) {

        int[] ints = new int[n];

        for (int i = 0; i < ints.length; i++) {

            ints[i] = i;

        }

        return ints;

    }

    // zadanie 4

    public static int[] fillRandom(int n, int a, int b) {

        int[] ints = new int[n];

        Random random = new Random();

        for (int i = 0; i < ints.length; i++) {

            ints[i] = random.nextInt(b + 1 - a) + a;

        }

        return ints;

    }

    // zadanie 5

    public static int[] sumArraysTheSameLength(int[] ints1, int[] ints2) {

        int[] ints = new int[ints1.length];

        if (ints1.length == ints2.length) {

            for (int i = 0; i < ints.length; i++) {

                ints[i] = ints1[i] + ints2[i];

            }

        } else System.out.println("Metoda sumuje tylko tablice o jednakowych rozmiarach");

        return ints;
    }

    // zadanie 7 (dokonczyc)

//    public static int[] sumArraysDifferentLength(int[] ints1, int[] ints2) {
//
//
//        int[] ints7 = new int[];
//
//    }


    public static void main(String[] args) {

        // zadanie 1

        int[] ints1 = new int[5];

        ints1[0] = 1;
        ints1[1] = 2;
        ints1[2] = 3;
        ints1[3] = 4;
        ints1[4] = 5;

        swap(ints1, 2, 4);

        for (int i : ints1) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        // zadanie 2

        for (int i : fillArray1(6)) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        // zadanie 3

        for (int i : fillArray2(6)) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        // zadanie 4

        for (int i : fillRandom(10, 5, 100)) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        // zadanie 5

        int[] ints2 = new int[3];

        ints2[0] = 1;
        ints2[1] = 2;
        ints2[2] = 3;

        int[] ints3 = new int[3];

        ints3[0] = 1;
        ints3[1] = 2;
        ints3[2] = 3;

        int[] ints4 = new int[4];

        ints4[0] = 1;
        ints4[1] = 2;
        ints4[2] = 3;
        ints4[3] = 4;

        for (int i : sumArraysTheSameLength(ints2, ints4)) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        // zadanie 6

        int[] ints5 = fillArray2(10);

        for (int i : ints5) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        int[] ints6 = new int[ints5.length];

        ints6[0] = ints5[0];
        ints6[1] = ints5[1];
        ints6[2] = ints5[2];

        for (int i = 3; i < ints6.length; i++) {

            if (i % 2 != 0) {
                ints6[i] = ints5[i] + ints5[i - 2];
            } else ints6[i] = ints5[i];
        }

        for (int i : ints6) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        for (int i = 0; i < ints6.length; i++) {

            if (i % 2 == 0) {
                ints6[i] = ints6[i] / 2;
            }
        }

        for (int i : ints6) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        int sum = 0;

        for (int i = 0; i < ints6.length; i++) {

            sum += ints6[i];

        }
        System.out.println("Suma: " + sum);

        System.out.println("-----------------");

    }

}
