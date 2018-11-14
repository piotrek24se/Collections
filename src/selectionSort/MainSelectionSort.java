package selectionSort;

public class MainSelectionSort {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 5, 6, 2, 1, 11, 0};

        getMin(ints);

    }


    // zadanie 1 (metoda do wyszukiwania wartosci min)

    public static int getMin(int[] ints) {

        int index = 0;
        int min = ints[index];


        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
                index = i;
            }
        }

        System.out.println("Wartosc minimalna: " + min + " " + "Index: " + index);

        return index;
    }

    // zadanie 1 rozwiazanie z zajec

    private int min(int[] array) {

        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    // zadanie 2

    public int minFromAToB(int[] array, int a, int b) {
        if (a <= b && a < array.length && b < array.length && a >=0 && b >= 0) {

            int minIndex = a;

            for (int i = a; i <= b; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            return minIndex;
        }

        return -1;
    }

}
