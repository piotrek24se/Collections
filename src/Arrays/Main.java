package Arrays;

public class Main {

    public static void fibonacciFor () {

        int[] ints1 = new int[10];

        ints1[0] = 0;
        ints1[1] = 1;

        for (int i = 2; i < ints1.length; i++) {

            ints1[i] = ints1[i - 1] + ints1[i - 2];

        }

        System.out.print("Ciag Fibonacciego: " );

        for (int i : ints1) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        fibonacciFor();

    }

}
