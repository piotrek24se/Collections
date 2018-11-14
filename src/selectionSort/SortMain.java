package selectionSort;

import bubbleSort.BubbleSortAlgorithm;
import searchAlgorithms.SortingAlgorithm;

import java.util.Arrays;

public class SortMain {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{3, 8, 1, 2, 9, 15, 11};

        SortingAlgorithm bubbleSort = new BubbleSortAlgorithm();

        Integer[] bubbleSortResult = bubbleSort.sort(array);

        System.out.println("BS: " + Arrays.toString(bubbleSortResult));


        SortingAlgorithm selection = new SelectionSortAlgorithm();

        Integer[] selectionResult = selection.sort(array);

        System.out.println("Sel: " + Arrays.toString(selectionResult));
    }

}
