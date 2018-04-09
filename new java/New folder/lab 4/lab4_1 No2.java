package oot.lab4.group1.y58;

public class No2 {

    public static void main(String[] args) {
        int[][] a = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] b = {{0, 1, 1}, {3, 2, 1}, {1, 3, 2}};
        System.out.println("Matrix A:");
        prtArr(a);
        System.out.println("Matrix B:");
        prtArr(b);
        int[][] c = plus(a, b);
        System.out.println("A + B:");
        prtArr(c);
    }

    private static void prtArr(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] plus(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}
