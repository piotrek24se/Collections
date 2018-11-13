package algorithms;

import searchAlgorithms.LinearSearch;
import searchAlgorithms.SearchAlgorithm;

import java.util.List;

public class MainPerson {

    public static void main(String[] args) {

        Person[] personArray = new Person[] {
                new Person("A", "B", 12L),
                new Person("C", "D", 14L),
                new Person("E", "F", 14L),
                new Person("G", "H", 15L),
                new Person("I", "J", 16L),
                new Person("K", "L", 14L),
        };

        // binary search

//        SearchAlgorithm<Person> binarySearch = new BinarySearchRec<>();
//
//        int result = binarySearch.search(new Person("E", "F", 12L), personArray);
//
//        System.out.println("Result: " + result);

        // linear search

        LinearSearch<Person> linearSearch =
                new LinearSearch<>();

        List<Integer> result = linearSearch.searchAll(
                new Person("E", "F", 14L),
                personArray);

        System.out.println("Result: " + result);

    }
}
