package oot.lab4.group2;

public class No2 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{19, 18, 17}, {16, 15, 14}, {13, 12, 11}};
        System.out.println("Matrix A:");
        print(a);
        System.out.println("Matrix B:");
        print(b);
        int[][] c = time2plus(a, b);
        System.out.println("2*A + B:");
        print(c);
    }

    private static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] time2plus(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = 2 * a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
