package heapSort;

public class HeapHelper {

    // moje rozwiazania zadanie 1

    public int leftSonIndex(int[] ints, int father) {
        int leftSonIndex = 2 * father + 1;
        return leftSonIndex;
    }

    public int rightSonIndex(int[] ints, int father) {
        int rightSonIndex = 2 * father + 2;
        return rightSonIndex;
    }

    public int fatherIndex(int[] ints, int son) {
        if (son > 0) {
            int leftSonIndex = (son - 1) / 2;
            return leftSonIndex;
        } else return -1;
    }

    public boolean leftSonExists(int[] ints, int father) {
        return 2 * father + 1 < ints.length;
    }

    public boolean rightSonExists(int[] ints, int father) {
        return 2 * father + 2 < ints.length;
    }



    // sprawdzenie, czy wezel k jest lisciem

    public boolean isNodeLeaf(int[] ints, int node) {
        return 2 * node + 2 > ints.length;
    }

    // metody static z zadania 1

    public static int getLeftSonIndex(int[] ints, int father) {
        int leftSonIndex = 2 * father + 1;
        return leftSonIndex;
    }

    public static int getRightSonIndex(int[] ints, int father) {
        int rightSonIndex = 2 * father + 2;
        return rightSonIndex;
    }

    public static int getFatherIndex(int[] ints, int son) {
        if (son > 0) {
            int leftSonIndex = (son - 1) / 2;
            return leftSonIndex;
        } else return -1;
    }

    public static boolean ifLeftSonExists(int[] ints, int father) {
        return 2 * father + 1 < ints.length;
    }

    public static boolean ifRightSonExists(int[] ints, int father) {
        return 2 * father + 2 < ints.length;
    }

    // zadanie 2 (metoda do porownywania wartosci dziecka z rodzicem

    public void compareSonAndFather(int[] ints, int sonIndex) {

        if (sonIndex > 0) {
            int sonValue = ints[sonIndex];
            int fatherValue = ints[(sonIndex - 1) / 2];
            System.out.println("Son value: " + sonValue + ", " + "Father value: " + fatherValue);
            if (fatherValue > sonValue) {
                System.out.println("Father value: " + fatherValue + " is greater than " + "Son value: " + sonValue);
            } else if (fatherValue < sonValue) {
                System.out.println("Father value: " + fatherValue + " is less than " + "Son value: " + sonValue);
            } else {
                System.out.println("Father value: " + fatherValue + " and " + "Son value: " + sonValue + " are equals");
            }
        } else System.out.println("Podany wezel jest korzeniem. Wprowadz wartosc > 0");

    }

    // zadanie 3 - metoda do wymiany rodzic <-> dziecko (lewe lub prawe), metoda ma korzystac z ENUM Child {LEFT, RIGHT}
    // niedokonczona (skasowac lub dokonczyc)

    public void swapChildAndParent(int[] ints, int parentIndex, Child childEnum) {

        int fatherValue = ints[parentIndex];

        if (childEnum.equals(Child.LEFT)) {
            int childValue = ints[2 * parentIndex + 1];
            ints[2 * parentIndex + 1] = fatherValue;
            ints[parentIndex] = childValue;
            System.out.println("Father value: " + fatherValue);
        } else if (childEnum.equals(Child.RIGHT)) {
            int childValue = ints[2 * parentIndex + 2];
            ints[2 * parentIndex + 2] = fatherValue;
            ints[parentIndex] = childValue;
        } else
            System.out.println("Podaj LEFT dla lewego syna lub RIGHT dla prawego");


    }

    // zadanie 3 (rozwiazanie z zajec)
    // uzupelnic z git

    private static void swapParentChild (int[] tree, int index, Child child) {
        switch (child){
            case LEFT:
                swap(tree, index, getLeftSonIndex(tree, index));
                break;
            case RIGHT:
                swap(tree, index, getRightSonIndex(tree, index));
                break;
        }
    }

    private static void swap (int[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

    enum Child {
        LEFT, RIGHT
    }
}
