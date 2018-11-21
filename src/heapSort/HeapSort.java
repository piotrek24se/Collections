package heapSort;

import searchAlgorithms.SortingAlgorithm;

import java.util.List;

public class HeapSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        BuildHeap.execute(input);
        ShiftHeap.execute(input);
        return input;
    }
}
