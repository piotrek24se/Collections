package selectionSort;

import searchAlgorithms.SortingAlgorithm;

import java.util.Arrays;
import java.util.List;

public class SelectionSortAlgorithm extends MainSelectionSort implements SortingAlgorithm {

    // poprawic - nie dziala poprawnie (git)

    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {

        Integer[] result = Arrays.copyOf(input, input.length);

        for (int i = 0; i < result.length; i++) {
            int minIndex = getMinFromAToEnd(input, i);
            swap(result, i, minIndex);
        }

        return result;
    }

    public static int getMinFromAToEnd(Integer[] ints, int a) {

        if (a < ints.length && a >= 0) {

            int min = ints[a];
            int index = a;

            for (int i = a + 1; i <= ints.length; i++) {
                if (ints[i] < min) {
                    min = ints[i];
                    index = i;
                }
            }

            return index;
        }
        return -1;
    }

    public static void swap(Integer[] ints, int index1, int index2) {

        int a = ints[index1];
        int b = ints[index2];

        ints[index1] = b;
        ints[index2] = a;

    }
}
