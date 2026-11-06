package gliane_array2d;

public class Columnsum {

    int[] getSum(int[][] a) {

        int[] result = new int[a[0].length];

        for (int j = 0; j < a[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }

            result[j] = sum;
        }

        return result;
    }
}
