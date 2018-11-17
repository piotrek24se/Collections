package heapSort;

import java.util.Arrays;

public class HeapMain {

    public static void main(String[] args) {

        int[] ints = new int[]{8, 7, 6, 6, 4, 6, 5, 2, 1, 4, 3, 6, 2, 4};

        HeapHelper heapHelper = new HeapHelper();

        // numer lewego syna

        System.out.println("Left son index: " + heapHelper.leftSonIndex(ints, 4));
        System.out.println("------------------------------");

        // numer prawego syna

        System.out.println("Right son index: " + heapHelper.rightSonIndex(ints, 4));
        System.out.println("------------------------------");

        // numer ojca

        System.out.println("Father index: " + heapHelper.fatherIndex(ints, 4));
        System.out.println("------------------------------");

        // istnienie lewego syna

        System.out.println("Left son exists: " + heapHelper.leftSonExists(ints, 6));
        System.out.println("------------------------------");

        // istnienie prawego syna

        System.out.println("Right son exists: " + heapHelper.rightSonExists(ints, 5));
        System.out.println("------------------------------");

        // sprawdzenie, czy wezel k jest lisciem

        System.out.println("Node is leaf: " + heapHelper.isNodeLeaf(ints, 7));
        System.out.println("------------------------------");

        // zadanie 2 (metoda do porownywania wartosci dziecka z rodzicem

        heapHelper.compareSonAndFather(ints, 4);
        System.out.println("------------------------------");

        // implementacja HeapSortAlgorithm

        HeapSortAlgorithm heapSortAlgorithm = new HeapSortAlgorithm();

        int[] treeForBuildHeap = new int[]{5, 9, 12, 4, 13, 81, 65};

        System.out.println(Arrays.toString(heapSortAlgorithm.buildHeap(treeForBuildHeap)));
        System.out.println("------------------------------");

        // uzupelnic rozbieranie kopca z git

    }

}
