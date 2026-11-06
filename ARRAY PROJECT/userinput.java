package gliane_array2d; 

import java.util.Scanner; 

public class Userinput {
    int[] getSize() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        return new int[] {rows, cols};
    }
}
