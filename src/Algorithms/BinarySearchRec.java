package Algorithms;

import searchAlgorithms.SearchAlgorithm;

import java.util.List;

public class BinarySearchRec implements SearchAlgorithm {


    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        return searchRec(value, input, 0, input.length - 1);
    }

//    BinarySearchRec(A[0..N-1], value, low, high)
//    if high < low
//        return not_found
//    mid <- (low + high) / 2
//            if A[mid] > value
//        return BinarySearch(A, value, low, mid-1)
//    else if (A[mid] < value)
//            return BinarySearch(A, value, mid+1, high)
//    else
//            return mid

    private Integer searchRec(Integer value, Integer[] input, int low, int high) {

        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (input[mid] > value) {
            return searchRec(value, input, low, mid - 1);
        } else  if (input[mid] < value) {
            return searchRec(value, input, mid + 1, high);
        } else {
            return mid;
        }
    }
}
