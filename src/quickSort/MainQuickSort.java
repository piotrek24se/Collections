package quickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainQuickSort {

    public static void main(String[] args) {

        MainQuickSort mainQuickSort = new MainQuickSort();

        // zadanie 1

        int[] ints1 = new int[]{1, 2, 8, 3, 5, 6, 9};
        System.out.println(mainQuickSort.getMidElement(ints1));
        System.out.println("----------------------------");

        // zadanie 2

        System.out.println(mainQuickSort.getRandomElement(ints1));
        System.out.println("----------------------------");

        // zadanie 3

        Integer [] ints2 = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(mainQuickSort.getListOfElements(ints2));

        System.out.println("----------------------------");

        // zadanie 3

        System.out.println(mainQuickSort.getListOfElements2(ints2));

        System.out.println("----------------------------");

        // zadanie 5

        System.out.println("Concat: " + Arrays.toString(concatArrays(ints1)));
        System.out.println("----------------------------");

        lowerGreaterTab(ints1);
        System.out.println("Lower Greater: " +
                Arrays.toString(ints1));
        System.out.println("----------------------------");
    }


    // zadanie 1 (Napisz metodę do pobierania środkowego elementu z tablicy)

    public int getMidElement(int[] ints) {

        int midIndex = ints.length / 2;

        return ints[midIndex];

    }

    // zadanie 1 (rozwiazanie z zajec)

    private static int getMiddle(int[] tab) {
        int length = tab.length;
        int middle = length / 2;

        return tab[middle];
    }

    // zadanie 2 (Napisz metodę do pobierania losowego elementu z tablicy)

    public int getRandomElement(int[] ints) {

        Random random = new Random();

        int randomElement = random.nextInt(ints.length);

        return ints[randomElement];

    }

    // zadanie 2 (Napisz metodę do pobierania losowego elementu z tablicy) wersja 2

    public Integer getRandomElementV2 (Integer[] ints) {

        Random random = new Random();

        int randomElement = random.nextInt(ints.length);

        return ints[randomElement];

    }

    // zadanie 2 (rozwiazanie z zajec)

    private static int getRandom(int[] tab) {

        int random = new Random().nextInt(tab.length);
        return tab[random];
    }

    // zadanie 3 (Napisz metodę która będzie zwracać tablicę elementów mniejszych od elementu wybranego powyższą metodą)

    public List<Integer> getListOfElements(Integer[] ints) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(ints));

        int randomValue = getRandomElementV2(ints);

        System.out.println("Random value: " + randomValue);

        List<Integer> filteredList = list.stream()
                .filter(s -> s < randomValue)
                .collect(Collectors.toList());

        return filteredList;

    }

    // zadanie 3 (rozwiazanie z zajec) - petla

    private static Integer[] lowerArray(int[] tab) {
        int midVal = getMiddle(tab);
        List<Integer> result = new ArrayList<>();

        for (int aTab : tab) {
            if (midVal > aTab) {
                result.add(aTab);
            }
        }

        return result.toArray(new Integer[]{});
    }

    // zadanie 3 (rozwiazanie z zajec) - strumien

    private static int[] lowerArrayStream(int[] tab) {
        int midVal = getMiddle(tab);

        return Arrays.stream(tab)
                .filter(tabVal -> tabVal < midVal)
                .toArray();
    }

    // zadanie 4

    public List<Integer> getListOfElements2(Integer[] ints) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(ints));

        int randomValue = getRandomElementV2(ints);

        System.out.println("Random value: " + randomValue);

        List<Integer> filteredList = list.stream()
                .filter(s -> s > randomValue)
                .collect(Collectors.toList());

        return filteredList;

    }

    // zadanie 4 (rozwiazanie z zajec) - petla

    private static Integer[] greaterArray(int[] tab) {
        int midVal = getMiddle(tab);
        List<Integer> result = new ArrayList<>();

        for (int aTab : tab) {
            if (midVal < aTab) {
                result.add(aTab);
            }
        }

        return result.toArray(new Integer[]{});
    }

    // zadanie 4 (rozwiazanie z zajec) - strumien

    private static int[] greaterArrayStream(int[] tab) {
        int midVal = getMiddle(tab);

        return Arrays.stream(tab)
                .filter(tabVal -> tabVal > midVal)
                .toArray();
    }

    // zadanie 5 (*Napisz metodę która będzie ustawiać elementy mniejsze po lewej stronie środkowego elementu, a większe po prawej np [2,9,8,5,4,7,6] -> środkowy element 5 -> [2,4,5,9,8,7,6])

    // zadanie 5 (rozwiazanie z zajec - petle - dziala tylko dla tablicy wartosci unikalnych)

    private static int[] concatArrays (int[] tab) {
        int midVal = getMiddle(tab);

        int[] lower = lowerArrayStream(tab);
        int[] greater = greaterArrayStream(tab);

        int[] result = new int[tab.length];

        for (int i = 0; i < lower.length; i++) {
            result[i] = lower[i];
        }
        result[lower.length] = midVal;

        for (int i = lower.length + 1; i < result.length; i++) {
            result[i] = greater[i - (lower.length + 1)];
        }
        return result;
    }

    // zadanie 5 (rozwiazanie z zajec - pivot - wydajniejszy niz poprzedni sposob)

    private static void lowerGreaterTab(int[] tab) {

        int midVal = getMiddle(tab); //pivot
        int midIndex = tab.length / 2; //pivot index

        swap(tab, midIndex, tab.length - 1); //ustawiamy pivot na końcu, a element ostatni na pivotIndex

        int j = 0; //j to pierwszy większy element od pivota

        //pętla od początku do przedostatniego elementu
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] <= midVal) { //sprawdzamy czy wrtośc spod i jest mniejsza lub równa pivot
                swap(tab, i, j); //jeśli tak to zamiana elemntów w tablicy i <-> j
                j++; //pierwszy większy element od pivot jest na pozycji j++ po zamianie wartości
            }
        }

        swap(tab, j, tab.length - 1); //zamiana pivota z pierwszym większym od niego elementem
    }

    private static void swap(int[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }
}




