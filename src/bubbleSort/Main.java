package bubbleSort;

import searchAlgorithms.SortingAlgorithm;

import java.util.Arrays;

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

    public static void swap(Integer[] ints, int index1, int index2) {

        int a = ints[index1];
        int b = ints[index2];

        ints[index1] = b;
        ints[index2] = a;

    }

    // zadanie 2 metoda wypisujaca wartosci tablicy wraz z numerem indeksu

    public static void printIndexAndElement(int[] ints) {

        for (int i = 0; i < ints.length; i++) {
            System.out.print(i + ":" + ints[i] + ",");
        }
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

    // zadanie 4 (zmodyfikuj kod z powyższego zadania tak aby w każdej linii element który znajduje się początkowo pod indeksem 0 przesuwał się o jedno miejsce w prawo)

    // rozwiazanie patrz (git)

    private void ex4 (int[] array) {


    }

    // zadanie 5
    // Napisz metodę która będzie wypisywała wartości z tablicy w tylu wierszach ile posiada ona elementów, z tym że w każdym kolejnym wierszu powinien być pomijany każdy kolejny element z końca tablicy. Przykład:
    //[0:43, 1:56, 2:11]
    //[0:43, 1:56]
    //[0:43]




}


