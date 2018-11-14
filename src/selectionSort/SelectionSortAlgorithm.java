package selectionSort;

import searchAlgorithms.SortingAlgorithm;

import java.util.Arrays;
import java.util.List;

public class SelectionSortAlgorithm implements SortingAlgorithm {

    // poprawic - nie dziala poprawnie (git)

    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = Arrays.copyOf(input, input.length);

        for (int i = 0; i < result.length; i++) {
            int minIndex = minFromAToEnd(result, i);
            swap(result, i, minIndex);
        }
        return result;
    }

    public int minFromAToEnd(Integer[] array, int a) {
        int minIndex = a;

        for (int i = a; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public void swap(Integer[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
