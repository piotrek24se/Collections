package bubbleSort;

import searchAlgorithms.SortingAlgorithm;

import java.util.Arrays;
import java.util.List;

public class BubbleSortAlgorithm extends Main implements SortingAlgorithm {


    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

//    BubbleSort(A[0..N-1])
//    for i <- 0 to n-2
//            for j <- 0 to n-2
//            if (A[j] > A[j+1)
//    A[j] <-> A[j+1]
//            return A


    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i <= result.length - 2; i++) {
            for (int j = 0; j <= result.length - 2; j++) {
                if (result[j] > result [j + 1]) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }
}
