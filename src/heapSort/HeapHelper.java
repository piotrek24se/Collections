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

    public static int getLeftSonIndexV2(int index) {
        return 2 * index + 1;
    }

    public static int getRightSonIndexV2(int index) {
        return 2 * index + 2;
    }

    public static int getFatherIndex(int[] ints, int son) {
        if (son > 0) {
            int leftSonIndex = (son - 1) / 2;
            return leftSonIndex;
        } else return -1;
    }

    public static int getParentIndex(int index) {
        if (index > 0)
            return (index - 1) / 2;

        return -1;
    }

    public static boolean ifLeftSonExists(int[] ints, int father) {
        return 2 * father + 1 < ints.length;
    }

    public static boolean ifRightSonExists(int[] ints, int father) {
        return 2 * father + 2 < ints.length;
    }

    // zadanie 2
    /*
    Stwórz metodę do porównywania wartości dziecka z rodzicem w kompletnym drzewie binarnym (niekoniecznie kopcu) -
    przykładowo podany zostanie węzeł o indeksie 7 wtedy należy wypisać jego rodzica i czy jest większy czy mniejszy:
    “child: 43 - index: 7, parent: value = 54 greater than child - index: 3”
     */

    // moje rozwiazanie

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

    // rozwiazanie z zajec

    private static void compareWithParent(int index, int[] tree) {
        int parentIndex = getFatherIndex(tree, index);
        if (parentIndex < 0) {
            System.out.println("Nie dla korzenia");
            return;
        }

        int value = tree[index];
        int parentValue = tree[parentIndex];

        if (value == parentValue) {
            printParentChild(index, value, parentIndex, parentValue, "equal to");
        } else if (value > parentValue) {
            printParentChild(index, value, parentIndex, parentValue, "less than");
        } else {
            printParentChild(index, value, parentIndex, parentValue, "greater than");
        }
    }

    private static void printParentChild(int index, int value, int parentIndex,
                                         int parentValue, String result) {
        System.out.println("Child = " + value + " - index: " + index + ", parent = " + parentValue + " " +
                result + " child - index: " + parentIndex);
    }

    // zadanie 3

    /*
     *Stwórz metodę do wymiany rodzic <-> dziecko (lewe lub prawe).
     * Metoda powinna korzystać z enum Child {LEFT, RIGHT}.
     * Następnie wypisz jakie elementy zostały wymienione (indeks, wartość, rodzic czy dziecko lewe czy prawe)
     */



    private static void swapParentChild(int[] tree, int index, Child child) {
        int childIndex = 0;
        switch (child) {
            case LEFT:
                if (!ifLeftSonExists(tree, index)) {
                    System.out.println("Left son doesn't exist!!!");
                    return;
                }
                childIndex = getLeftSonIndex(tree, index);
                break;
            case RIGHT:
                if (!ifRightSonExists(tree, index)) {
                    System.out.println("Right son doesn't exist!!!");
                    return;
                }
                childIndex = getRightSonIndex(tree, index);
                break;
        }

        swap(tree, index, childIndex);

        System.out.println("Index: " + index + " Value before: " + tree[childIndex] + " Value after: " +
                tree[index] + " Child: " + child);
    }

    private static void swap(int[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

    enum Child {
        LEFT, RIGHT
    }
}
