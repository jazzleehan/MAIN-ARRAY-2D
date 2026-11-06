package gliane_array2d;

public class Rowsum {

    int[] getSum(int[][] a) {

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            int sum = 0;

            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }

            result[i] = sum;
        }

        return result;
    }
}
