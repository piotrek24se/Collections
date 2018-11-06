package listSetMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Examples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("111", "222", "333")); // w takim przypadku mozna zmodyfikowac liste z poziomu np. metody
//                Arrays.asList("111", "222", "333"); // nie mozna modyfikowac takiej listy (jezeli byloby z uzyciem new to daloby sie uzyc metody do sth)
//                new ArrayList<>();
//
//        list.add("AAA");
//        list.add("BBB");
//        list.add("CCC");

        doSth(list);

        System.out.println(list);

    }
    private static void doSth(List<String> list) {
        list.add("111");
        list.add("222");
        list.add("333");
    }

}
