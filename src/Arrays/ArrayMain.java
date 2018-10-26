package Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayMain {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[5];
        Integer[] arrayOfIntegers = new Integer[5];

        arrayOfIntegers[0] = 1;
        arrayOfIntegers[2] = 1;
        arrayOfIntegers[3] = 1;
        arrayOfIntegers[4] = 1;

        arrayOfInts[0] = 1;
        arrayOfInts[1] = 1;
        arrayOfInts[2] = 1;
        arrayOfInts[3] = 1;


        for (int element:arrayOfInts) {
            System.out.println(element);
        }

        System.out.println("----------------------");

        for (Integer element:arrayOfIntegers) {
            System.out.println(element);
        }

        arrayOfInts[1] = 0;
        Arrays.stream(arrayOfInts).forEach(i -> System.out.println(i)); //dziala dobrze dla obiektow i prymitywow

        System.out.println("----------------------");

        Stream.of(arrayOfInts).forEach(i -> System.out.println(i));

        System.out.println("----------------------");

        Stream.of(arrayOfIntegers).forEach(i -> System.out.println(i)); //dziala dobrze tylko dla obiektow

    }


}
