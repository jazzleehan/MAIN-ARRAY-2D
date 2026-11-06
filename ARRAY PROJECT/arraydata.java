package gliane_array2d; 

import java.util.Scanner; 

public class Arraydata {
    int[][] getArray(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[rows][cols];
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
}
