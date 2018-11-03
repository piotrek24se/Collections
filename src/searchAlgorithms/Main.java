package searchAlgorithms;

public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{9, 13, 5, 2, 9, 7, 4};

        SearchAlgorithm searchAlgorithm = new LinearSearch();

        Integer result = searchAlgorithm.search(17, array);

        System.out.println(result);

    }

}
