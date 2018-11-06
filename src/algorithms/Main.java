package algorithms;

public class Main {

    public static void main(String[] args) {

        // obliczanie NWD dwoch liczb - 1 sposob

        int a = 154;
        int b = 78;

        while (true) {

            int c = a % b;
            a = b;
            b = c;

            if (b == 0) {
                break;
            }
        }
        System.out.println("NWD: " + a);
    }

    // obliczanie NWD dwoch liczb - 2 sposob

    public static int nwd(int a, int b) {
        while (true) {

            int c = a % b;
            a = b;
            b = c;

            if (b == 0) {
                return a;
            }
        }
    }
}
