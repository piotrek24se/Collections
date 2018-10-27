package Queues;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sandbox {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // rownoznaczne z powyzszym

        for (String element: list) {
            System.out.println(element);
        }

        list.forEach(e -> System.out.println(e));

        list.forEach(System.out::println);

    }

}
