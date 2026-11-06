package gliane_array2d;

public class Display {
    void show(int[][] a, int[] r, int[] c) {
        System.out.println("\nMatrix (with row sum on the right):");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.printf("  | %d%n", r[i]);
        }

        System.out.print("-----");
        for (int j = 1; j < a[0].length; j++) System.out.print("-----");
        System.out.println();

        for (int j = 0; j < c.length; j++) {
            System.out.printf("%5d", c[j]);
        }
        System.out.println("  <- column sum");
    }
}
