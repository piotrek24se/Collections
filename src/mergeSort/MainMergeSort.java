package mergeSort;

import java.util.Arrays;

public class MainMergeSort {

    public static void main(String[] args) {

        int[] ints1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MainMergeSort mainMergeSort = new MainMergeSort();

        mainMergeSort.splitArray(ints1);

        int[] ints2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        mainMergeSort.sumArraysTheSameLength(ints1, ints2);

        int[] ints3 = new int[]{12, 14, 15, 16};

        mainMergeSort.sumArraysTheDifferentLength(ints1, ints3);

        // z zajec

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 150};
        int[] array2 = new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[] array3 = new int[]{9, 10, 11};

        int[] array4 = new int[]{1, 4, 8, 9, 19};
        int[] array5 = new int[]{2, 3, 7, 10, 16, 17, 18};

        System.out.println("Ex1 V1:");
        divArray(array);
        System.out.println("Ex1 V2:");
        divArrayV2(array);

        System.out.println("Ex2 V1:");
        System.out.println(Arrays.toString(concatSameSizeArrayV1(array, array2)));
        System.out.println("Ex2 V2:");
        System.out.println(Arrays.toString(concatSameSizeArrayV2(array, array2)));
        System.out.println("Ex2 V3:");
        System.out.println(Arrays.toString(concatSameSizeArrayV3(array, array2)));

        System.out.println("Ex3 V1:");
        System.out.println(Arrays.toString(concatDiffSizeArrayV1(array, array3)));
        System.out.println("Ex3 V2:");
        System.out.println(Arrays.toString(concatDiffSizeArrayV2(array, array3)));

        System.out.println("Ex4:");
        System.out.println(Arrays.toString(concatSortSizeArray(array4, array5)));

    }

    // zadanie 1 (metoda dzielaca tablice na dwie rowne (+/-1) czesci)

    public void splitArray(int[] ints) {

        if (ints.length % 2 == 0) {
            int[] ints1 = new int[ints.length / 2];
            int[] ints2 = new int[ints.length / 2];

            for (int i = 0; i < ints.length; i++) {
                if (i < ints.length / 2) {
                    ints1[i] = ints[i];
                } else {
                    ints2[i - ints1.length] = ints[i];
                }
            }

            System.out.println(Arrays.toString(ints1));
            System.out.println(Arrays.toString(ints2));

        } else {
            int[] ints3 = new int[(ints.length - 1) / 2];
            int[] ints4 = new int[(ints.length + 1) / 2];

            for (int i = 0; i < ints.length; i++) {
                if (i < ints3.length) {
                    ints3[i] = ints[i];
                } else {
                    ints4[i - ints3.length] = ints[i];
                }
            }

            System.out.println(Arrays.toString(ints3));
            System.out.println(Arrays.toString(ints4));
        }
    }

    // zadanie 1 rozwiazanie z zajec

    // v.1

    public static void divArray(int[] array) {
        int mid = array.length / 2; // 7/2 = 3

        int[] left = new int[mid]; //3
        int[] right = new int[array.length - mid]; //7 - 3 = 4

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }

    // v.2

    public static void divArrayV2(int[] array) {
        int mid = array.length / 2; // 7/2 = 3

        int[] left = new int[mid]; //3
        int[] right = new int[array.length - mid]; //7 - 3 = 4

        for (int i = 0; i < array.length; i++) {
            if (i < mid) {
                left[i] = array[i];
            } else {
                right[i - mid] = array[i];
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }

    // zadanie 2 (Napisz metodę łączącą dwie tablice takiego samego rozmiaru (a1, a2) => a1[0], a2[0], a1[1], a2[1], itd.)

    public void sumArraysTheSameLength(int[] ints1, int[] ints2) {
        int[] ints3 = new int[ints1.length + ints2.length];

        int counter = 0;

        for (int i = 0; i < ints1.length; i++) {

            ints3[i + counter] = ints1[i];
            ints3[i + 1 + counter] = ints2[i];
            counter += 1;
        }
        System.out.println(Arrays.toString(ints3));
    }

    // zadanie 2 rozwiazanie z zajec

    // v.1

    public static int[] concatSameSizeArrayV1(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        int dodatkowaZmienna = 0;
        for (int i = 0; i < result.length; i += 2) {
            result[i] = left[dodatkowaZmienna];
            result[i + 1] = right[dodatkowaZmienna];
            dodatkowaZmienna++;
        }

        return result;
    }

    // v.2

    public static int[] concatSameSizeArrayV2(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        for (int i = 0; i < result.length; i += 2) {
            result[i] = left[i / 2];
            result[i + 1] = right[i / 2];
        }

        return result;
    }

    // v.3

    public static int[] concatSameSizeArrayV3(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++) {
            result[2 * i] = left[i];
            result[2 * i + 1] = right[i];
        }

        return result;
    }

    // zadanie 3 (Napisz metodę łączącą dwie tablice różnych rozmiarów (a1, a2) => a1[0], a2[0], a1[1], a2[1], a1[2], a1[3], itd.)

    public void sumArraysTheDifferentLength(int[] ints1, int[] ints2) {
        int[] ints3 = new int[ints1.length + ints2.length];

        int counter = 0;

        for (int i = 0; i < ints1.length; i++) {
            if (i < ints2.length) {
                ints3[i + counter] = ints1[i];
                ints3[i + 1 + counter] = ints2[i];
                counter += 1;
            } else {
                if (ints1.length - ints2.length > 0) {
                    ints3[i + counter] = ints1[i];
                } else if (ints1.length - ints2.length < 0) {
                    ints3[i + counter] = ints2[i];
                }
            }
        }
        System.out.println(Arrays.toString(ints3));
    }

    // zadanie 3 rozwiazanie z zajec

    // v.1

    public static int[] concatDiffSizeArrayV1(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftSize = left.length;
        int rightSize = right.length;

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < result.length; i += 2) {
            if (currentLeftIndex < leftSize && currentRightIndex < rightSize) {
                result[i] = left[currentLeftIndex];
                result[i + 1] = right[currentRightIndex];
                currentLeftIndex++;
                currentRightIndex++;
            } else if (currentLeftIndex >= leftSize) {
                result[i] = right[currentRightIndex];
                currentRightIndex++;
                if (currentRightIndex < rightSize) {
                    result[i + 1] = right[currentRightIndex];
                    currentRightIndex++;
                }
            } else {
                result[i] = left[currentLeftIndex];
                currentLeftIndex++;
                if (currentLeftIndex < leftSize) {
                    result[i + 1] = left[currentLeftIndex];
                    currentLeftIndex++;
                }
            }
        }

        return result;
    }

    // v.2

    public static int[] concatDiffSizeArrayV2(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftSize = left.length;
        int rightSize = right.length;

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (currentLeftIndex < leftSize && currentRightIndex < rightSize) {
                result[i] = left[currentLeftIndex];
                i++;
                result[i] = right[currentRightIndex];

                currentLeftIndex++;
                currentRightIndex++;
            } else if (currentLeftIndex < leftSize) {
                result[i] = left[currentLeftIndex];
                currentLeftIndex++;
            } else {
                result[i] = right[currentRightIndex];
                currentRightIndex++;
            }
        }

        return result;
    }

    // zadanie 4, 5 (Napisz metodę łącząca dwie posortowane tablice roznej (w tym jednakowej) wielkości w jedną posortowaną (kolejność elementów ustalana podczas łączenia tablic - nie używaj metod sortujących na tablicy wynikowej)

    public static int[] concatSortSizeArray(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftSize = left.length;
        int rightSize = right.length;

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (currentLeftIndex < leftSize && currentRightIndex < rightSize) {
                if (left[currentLeftIndex] <= right[currentRightIndex]) {
                    result[i] = left[currentLeftIndex];
                    currentLeftIndex++;
                } else {
                    result[i] = right[currentRightIndex];
                    currentRightIndex++;
                }
            } else if (currentLeftIndex < leftSize) {
                result[i] = left[currentLeftIndex];
                currentLeftIndex++;
            } else {
                result[i] = right[currentRightIndex];
                currentRightIndex++;
            }
        }

        return result;
    }
}
