package searchAlgorithms;

import Algorithms.BinarySearchIter;
import Algorithms.BinarySearchRec;

public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{9, 13, 5, 2, 9, 7, 4, 5};

        SearchAlgorithm searchAlgorithm = new LinearSearch();

        Integer result = searchAlgorithm.search(17, array);

        System.out.println(result);

        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(midElement(ints));
        System.out.println("--------------------------");

        elementsTo(ints, 4);
        System.out.println("--------------------------");

        elementsFrom(ints, 5);
        System.out.println("--------------------------");

        elementsFromTo(ints, 0, 2);
        System.out.println("--------------------------");

        System.out.println("Fibonacci 0 element");
        System.out.println(printFibonacci(0));
        System.out.println("Fibonacci 1 element");
        System.out.println(printFibonacci(1));
        System.out.println("Fibonacci 2 element");
        System.out.println(printFibonacci(2));
        System.out.println("Fibonacci 3 element");
        System.out.println(printFibonacci(3));
        System.out.println("Fibonacci 4 element");
        System.out.println(printFibonacci(4));
        System.out.println("Fibonacci 5 element");
        System.out.println(printFibonacci(5));
        System.out.println("Fibonacci 6 element");
        System.out.println(printFibonacci(6));
        System.out.println("Fibonacci 7 element");
        System.out.println(printFibonacci(7));
        System.out.println("--------------------------");

        // binary searching

        Integer[] ints1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        SearchAlgorithm binary = new BinarySearchIter();

        int binaryResult = binary.search(10, ints1);

        System.out.println("Binary:" + binaryResult);

        // binary searching recurence

        SearchAlgorithm binaryRec = new BinarySearchRec();
        int binaryRecResult = binaryRec.search(5, ints1);
        System.out.println("Binary rec: " + binaryRecResult);


    }


    // zadanie 1 (metoda do wyszukiwania srodkoweo elementu indeksu)

    public static int midElement(int[] ints) {

        int midIndex = 0;

        if (ints.length % 2 != 0) {
            return midIndex = (ints.length - 1) / 2;
        } else return midIndex = ints.length / 2;
    }

    public static int midElementV2(int[] ints) {

        int midIndex = 0;

        if (ints.length % 2 != 0) {
            return midIndex = (ints.length - 1) / 2;
        } else return midIndex = ints.length / 2 - 1;
    }

    // zadanie 2 (metoda do wypisywania indeksow tablicy od poczatku do a)

    public static void elementsTo(int[] ints, int a) {

        for (int i = 0; i <= a; i++) {
            System.out.println(ints[i]);
        }
    }

    // zadanie 3 (metoda do wypisywania indeksow tablicy od b do konca)

    public static void elementsFrom(int[] ints, int b) {

        for (int i = b; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    // metoda do wypisywania elementow od a do b

    public static void elementsFromTo(int[] ints, int a, int b) {

        for (int i = a; i <= b; i++) {
            System.out.println(ints[i]);
        }
    }

    // metoda rekurencyjna do wypisywania n-tego elementu ciagu fibonacciego

    public static int printFibonacci(int lastIndex) {

        if (lastIndex == 0) {
            return 0;
        } else if (lastIndex == 1) {
            return 1;
        }

        return printFibonacci(lastIndex - 1) + printFibonacci(lastIndex - 2);
    }


}
