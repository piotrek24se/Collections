package selectionSort;

public class MainSelectionSort {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 5, 6, 2, 0, 11, 10};

        getMin(ints);

        getMinFromAToB(ints, 0, 4);
    }




    // zadanie 1 (metoda do wyszukiwania wartosci min)

    public static int getMin(int[] ints) {

        int min = ints[0];
        int index = 0;

        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
                index = i;
            }
        }

        System.out.println("Wartosc minimalna: " + min + " " + "Index: " + index);

        return min;
    }

    // zadanie 2

    public static int getMinFromAToB(int[] ints, int a, int b) {

        int min = ints[a];
        int index = a;

        for (int i = a + 1; i < b + 1; i++) {
            if (ints[i] < min) {
                min = ints[i];
                index = i;
            }
        }

        System.out.println("Wartosc minimalna w zakresie od " + a + " do " + b + ": "+ min + " " + "Index: " + index);

        return min;
    }

}
