package algorithms;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsRepeat {

    public static void main(String[] args) throws IOException {

//        // zadanie 1
//
//        Map<String, List<String>> emplHolder = new HashMap<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            String line = scanner.nextLine();
//
//            if ("list".equals(line)) {
//                System.out.println(emplHolder);
//                break;
//            }
//            String[] splitArray = line.split(" ");
//            String name = splitArray[0];
//            String dzial = splitArray[1];
//
//            if (emplHolder.containsKey(dzial)) {
//                emplHolder.get(dzial).add(name);
//            } else {
//                List<String> newList = new ArrayList<>();
//                newList.add(name);
//                emplHolder.put(dzial, newList);
//            }
//        }
//
//        System.out.println("****************************");

        // zadanie 2

        // 1 wersja - scanner do poprawienia (2 sposob do uzupelnienia z git)

        File file = new File("C:\\Users\\Piotr\\Desktop\\Java SDA\\Pliki do zadań\\Database.txt");
        Scanner fileScanner = new Scanner(file);

        List<Employee> emplList = new ArrayList<>();

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] splitArray = line.split(";");

            Employee employee = new Employee(splitArray[0], splitArray[1], splitArray[2], Long.valueOf(splitArray[3]));

            emplList.add(employee);
        }

        Collections.sort(emplList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getId() - o2.getId());
            }
        });

        System.out.println(emplList);

        List<String> lines = emplList.stream().map(e -> e.getName() + ";" + e.getSurname()+ ";" + e.getPosition()+ ";" + e.getId()).collect(Collectors.toList());

        Files.write(Paths.get("result.txt"), lines);



    }

}
