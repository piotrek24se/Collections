package ListSetMap;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Zadania {

    // add zadanie 2

    private static String convertKey(String key) {

        String newKey = key.toLowerCase();
        return newKey;
    }

    // zadanie 3

    private static String polishToEnglish(String polishWord, Map<String, String> translator) {

        if (translator.containsKey(polishWord)) {
            return translator.get(polishWord);
        } else return "Brak hasla w slowniku";
    }

    private static String polishToEnglishSentence(String polishSentence, Map<String, String> translator) {

        String[] list = polishSentence.split(" ");
        String translatedSentence = "";

        for (int i = 0; i < list.length; i++) {
            if (translator.containsKey(list[i])) {
                translatedSentence = translatedSentence + " " + translator.get(list[i]);
            } else return "Brak hasla w slowniku";
        }
        return translatedSentence.trim();
    }

    public static void main(String[] args) {

        // zadanie 1 (moje rozwiazanie)

        List<Float> randomList = new ArrayList<>();

        int counter = 0;

        randomList.add((float) (Math.random() * 100));

        while (randomList.get(counter) > 0.01) {
            randomList.add((float) (Math.random() * 100));
            counter++;
        }

        System.out.println(randomList);

        randomList.stream().forEach(value -> System.out.println("Result: " + Math.PI * value));

        System.out.println("-----------------------------");

        // zadanie 1 (rozwiazanie z zajec)

        List<Float> floatList = new LinkedList<>();

        Random random = new Random();

        double randomValue = Math.random();
        System.out.println("Random val: " + randomValue);

        while (randomValue > 0.01) {

            randomValue = Math.random();

            Float value = random.nextFloat() * 100.0f;
            floatList.add(value);

        }

        floatList.forEach(value ->
                System.out.println("Result: " + Math.PI * value));

        System.out.println("-----------------------------");

        // zadanie 2 (moje rozwiazanie)

        List<String> names = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("a1234", "Jan Kowalski");
        map.put("b1234", "Anna Kowalska");

        System.out.println(map.get("a1234"));
        System.out.println(map.get(convertKey("A1234")));

        System.out.println("-----------------------------");

        // zadanie 2 (rozwiazanie z zajec)

        // zadanie 3 (moje rozwiazanie)

        Map<String, String> translator = new HashMap<>();

        translator.put("pies", "dog");
        translator.put("jest", "is");
        translator.put("duzy", "big");
        translator.put("moj", "my");

        System.out.println(polishToEnglish("pies", translator));

        System.out.println(polishToEnglishSentence("moj pies", translator));

    }

}
