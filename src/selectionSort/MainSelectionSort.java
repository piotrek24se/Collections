package selectionSort;

public class MainSelectionSort {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 5, 6, 2, 1, 11, 0};

        getMin(ints);

        getMinFromAToB(ints, 0, 4);
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

    // zadanie 2

    public static int getMinFromAToB(int[] ints, int a, int b) {

        if (a <= b && a < ints.length && b < ints.length && a >= 0 && b >= 0) {

            int min = ints[a];
            int index = a;

            for (int i = a + 1; i < b + 1; i++) {
                if (ints[i] < min) {
                    min = ints[i];
                    index = i;
                }
            }

            System.out.println("Wartosc minimalna w zakresie od " + a + " do " + b + ": " + min + " " + "Index: " + index);

            return index;
        }
        return -1;
    }

}
