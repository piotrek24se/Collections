package heapSort;

import java.util.Arrays;

public class HeapSortAlgorithm {

    public static int[] buildHeap(int[] A) {

        int[] B = Arrays.copyOf(A, A.length);

        for (int i = 1; i < B.length; i++) {
            int currentNodeIndex = i;
            int parentIndex = HeapHelper.getFatherIndex(B, currentNodeIndex);
            int insertedValue = B[i];
            while (parentIndex >= 0 && B[parentIndex] < insertedValue) {
                B[currentNodeIndex] = B[parentIndex];
                currentNodeIndex = parentIndex;
                parentIndex = HeapHelper.getFatherIndex(B, currentNodeIndex);
            }
            B[currentNodeIndex] = insertedValue;
        }
        return B;
    }

    public static int[] shiftHeap(int[] A) {
        int[] B = Arrays.copyOf(A, A.length);

        for (int i = B.length - 1; i > 0; i--) {
            swap(B, 0, i);
            int parentIndex = 0;
            int leftChildIndex = 1;

            while (leftChildIndex < i) {
                int greaterChildIndex = leftChildIndex;
                int rightChildIndex = leftChildIndex + 1;
                if (rightChildIndex < i && B[rightChildIndex] > B[leftChildIndex]) {
                    greaterChildIndex = rightChildIndex;
                }
                if (B[greaterChildIndex] <= B[parentIndex]) {
                    break;
                }
                swap(B, parentIndex, greaterChildIndex);
                parentIndex = greaterChildIndex;
                leftChildIndex = HeapHelper.getLeftSonIndex(B, parentIndex);
            }
        }
        return B;
    }

    private static void swap(int[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

}
