package ListSetMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Training {

    public static void main(String[] args) {

        List<String> listWithDups = new ArrayList<>();

        listWithDups.add("A");
        listWithDups.add("A");
        listWithDups.add("B");
        listWithDups.add("B");
        listWithDups.add("B");
        listWithDups.add("C");
        listWithDups.add("C");
        listWithDups.add("D");

        System.out.println("Lista z duplikatami");
        System.out.println(listWithDups.toString());

        Set<String> dupsSet = new HashSet<>(listWithDups);

        System.out.println("Set bez duplikatow");
        System.out.println(dupsSet);

        List<String> listWithoutDups = new ArrayList<>(dupsSet);

        System.out.println("List bez duplikatow");
        System.out.println(listWithoutDups);

        listWithoutDups = new ArrayList<>(new HashSet<>(listWithDups));

        listWithoutDups = listWithDups.stream().distinct().collect(Collectors.toList());
        



    }




}
