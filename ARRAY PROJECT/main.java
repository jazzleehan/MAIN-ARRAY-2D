package gliane_array2d;

public class Gliane_Array2D {

    public static void main(String[] args) {
        Userinput input = new Userinput();
        int[] size = input.getSize();

        Arraydata data = new Arraydata();
        int[][] a = data.getArray(size[0], size[1]);

        Rowsum row = new Rowsum();
        int[] r = row.getSum(a);

        Columnsum col = new Columnsum();
        int[] c = col.getSum(a);

        Display display = new Display();
        display.show(a, r, c);

        DuplicateChecker dup = new DuplicateChecker(); 
        dup.check(a);
    }
}
