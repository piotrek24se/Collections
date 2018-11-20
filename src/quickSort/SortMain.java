package quickSort;

// uzupelnic z git

import bubbleSort.BubbleSortAlgorithm;
import searchAlgorithms.SortingAlgorithm;
import selectionSort.SelectionSortAlgorithm;

import java.util.Arrays;

public class SortMain {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{2, 9, 8, 5, 5, 5, 5, 5, 5, 4, 7, 6};

        SortingAlgorithm bubbleSort = new BubbleSortAlgorithm();

        Integer[] bubbleSrotResult = bubbleSort.sort(array);

        System.out.println("BS: " + Arrays.toString(bubbleSrotResult));


        SortingAlgorithm selection = new SelectionSortAlgorithm();

        Integer[] selectionResult = selection.sort(array);

        System.out.println("Sel: " + Arrays.toString(selectionResult));

        SortingAlgorithm quickSort = new QuickSort();

        Integer[] quickSortResult = quickSort.sort(array);

        System.out.println("Quick: " + Arrays.toString(quickSortResult));

//        SortingAlgorithm heapSort = new HeapSort();
//        Integer[] heapSortResult = heapSort.sort(array);
//        System.out.println("Heap: " + Arrays.toString(heapSortResult));
    }

}
