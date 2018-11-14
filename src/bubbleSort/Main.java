package bubbleSort;

import searchAlgorithms.SortingAlgorithm;
import selectionSort.SelectionSortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] ints = new Integer[]{6, 2, 5, 4, 5, 9};

//        printIndexAndElement(ints);

        System.out.println("");

//        printIndexAndElementLines(ints);

        System.out.println("");

        // bubble algorithm test

        SortingAlgorithm sortingAlgorithm = new BubbleSortAlgorithm();

        System.out.println(Arrays.toString(sortingAlgorithm.sort(ints)));

    }




    // zadanie 1 (metoda do zamiany elementow tablicy)

    public static void swap(int[] ints, int index1, int index2) {

        int a = ints[index1];
        int b = ints[index2];

        ints[index1] = b;
        ints[index2] = a;

    }

    // zadanie 1 rozwiazanie z zajec

    public void swapV2(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    // zadanie 2 metoda wypisujaca wartosci tablicy wraz z numerem indeksu

    public static void printIndexAndElement(int[] ints) {

        for (int i = 0; i < ints.length; i++) {
            System.out.print(i + ":" + ints[i] + ",");
        }
    }

    // zadanie 2 rozwiazanie z zajec

    private void ex2(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ":" + array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    // zadanie 3 (metoda wypisujaca zawartosc tablicy w tylu wierszach ile posiada elementow)

    public static void printIndexAndElementLines(int[] ints) {

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(j + ":" + ints[j] + ",");
            }
            System.out.println("");
        }
    }

    // zadanie 3 rozwiazanie z zajec

    private void ex3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            ex2(array);
        }
    }

    // zadanie 4 (zmodyfikuj kod z powyższego zadania tak aby w każdej linii element który znajduje się początkowo pod indeksem 0 przesuwał się o jedno miejsce w prawo)

    private void ex4(int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (a > 0) {
                swap(array, a - 1, a);
            }
            ex2(array);
        }
    }

    // zadanie 5
    // Napisz metodę która będzie wypisywała wartości z tablicy w tylu wierszach ile posiada ona elementów, z tym że w każdym kolejnym wierszu powinien być pomijany każdy kolejny element z końca tablicy. Przykład:
    //[0:43, 1:56, 2:11]
    //[0:43, 1:56]
    //[0:43]

    private void ex5(int[] array) {
        for (int a = 0; a < array.length; a++) {
            System.out.print("[");
            for (int i = 0; i < array.length - a; i++) {
                System.out.print(i + ":" + array[i]);
                if (i != array.length - 1 - a) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}


