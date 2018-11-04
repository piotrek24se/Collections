package mergeSort;

import java.util.Arrays;

public class MainMergeSort {

    public static void main(String[] args) {

        int[] ints1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MainMergeSort mainMergeSort = new MainMergeSort();

        mainMergeSort.splitArray(ints1);

        int[] ints2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        mainMergeSort.sumArraysTheSameLength(ints1, ints2);

        int[] ints3 = new int[]{12, 14, 15, 16};

        mainMergeSort.sumArraysTheDifferentLength(ints1, ints3);


    }

    // zadanie 1 (metoda dzielaca dwie tablice na dwie rowne (+/-1)czesci)

    public void splitArray(int[] ints) {

        if (ints.length % 2 == 0) {
            int[] ints1 = new int[ints.length / 2];
            int[] ints2 = new int[ints.length / 2];

            for (int i = 0; i < ints.length; i++) {
                if (i < ints.length / 2) {
                    ints1[i] = ints[i];
                } else {
                    ints2[i - ints1.length] = ints[i];
                }
            }

            System.out.println(Arrays.toString(ints1));
            System.out.println(Arrays.toString(ints2));

        } else {
            int[] ints3 = new int[(ints.length - 1) / 2];
            int[] ints4 = new int[(ints.length + 1) / 2];

            for (int i = 0; i < ints.length; i++) {
                if (i < ints3.length) {
                    ints3[i] = ints[i];
                } else {
                    ints4[i - ints3.length] = ints[i];
                }
            }

            System.out.println(Arrays.toString(ints3));
            System.out.println(Arrays.toString(ints4));
        }
    }

    // zadanie 2 (Napisz metodę łączącą dwie tablice takiego samego rozmiaru (a1, a2) => a1[0], a2[0], a1[1], a2[1], itd.)

    public void sumArraysTheSameLength(int[] ints1longer, int[] ints2shorter) {
        int[] ints3 = new int[ints1longer.length + ints2shorter.length];

        int counter = 0;

        for (int i = 0; i < ints1longer.length; i++) {

            ints3[i + counter] = ints1longer[i];
            ints3[i + 1 + counter] = ints2shorter[i];
            counter += 1;
        }
        System.out.println(Arrays.toString(ints3));
    }

    // zadanie 3 (Napisz metodę łączącą dwie tablice różnych rozmiarów (a1, a2) => a1[0], a2[0], a1[1], a2[1], a1[2], a1[3], itd.)

    public void sumArraysTheDifferentLength(int[] ints1, int[] ints2) {
        int[] ints3 = new int[ints1.length + ints2.length];

        int counter = 0;

        for (int i = 0; i < ints1.length; i++) {
            if (i < ints2.length) {
                ints3[i + counter] = ints1[i];
                ints3[i + 1 + counter] = ints2[i];
                counter += 1;
            } else {
                if (ints1.length - ints2.length > 0) {
                    ints3[i + counter] = ints1[i];
                } else if (ints1.length - ints2.length < 0) {
                    ints3[i + counter] = ints2[i];
                }
            }
        }
        System.out.println(Arrays.toString(ints3));
    }

    // zadanie 4, 5 (Napisz metodę łącząca dwie posortowane tablice jednakowej wielkości w jedną posortowaną (kolejność elementów ustalana podczas łączenia tablic - nie używaj metod sortujących na tablicy wynikowej)

    // dokonczyc z git

    public void sumSortedArraysIntoSortedArray (int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int leftSize = left.length;
        int rightSize = right.length;

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if(currentLeftIndex < leftSize && currentRightIndex < rightSize) {
//                if (left[currentLeftIndex] <= )
            }

        }




        System.out.println(Arrays.toString(result));

    }
}
