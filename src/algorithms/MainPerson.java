package algorithms;

import searchAlgorithms.SearchAlgorithm;

public class MainPerson {

    public static void main(String[] args) {

        Person[] personArray = new Person[] {
                new Person("A", "B", 12L),
                new Person("C", "D", 14L),
                new Person("E", "F", 14L),
                new Person("G", "H", 15L),
                new Person("I", "J", 16L),
                new Person("K", "L", 17L),
        };

        // zmodyfikowac zgodnie z git ponizsza czesc

        SearchAlgorithm<Person> binarySearch = new BinarySearchRec<>();

        int result = binarySearch.search(new Person("E", "F", 14L), personArray);

        System.out.println("Result: " + result);


    }

}
