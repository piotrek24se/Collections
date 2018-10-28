package ListSetMap;

import java.util.ArrayList;
import java.util.List;

public class Zadania {

    public static void main(String[] args) {

        // zadanie 1

        List<Float> randomList = new ArrayList<>();

        int counter = 0;

        randomList.add((float) (Math.random()*100));

        while (randomList.get(counter) > 0.01) {
            randomList.add((float) (Math.random()*100));
            counter++;
        }

        System.out.println(randomList);

        // zadanie 2

        

    }

}
