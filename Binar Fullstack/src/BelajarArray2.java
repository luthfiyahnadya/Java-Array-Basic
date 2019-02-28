import java.util.Arrays;

public class BelajarArray2 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = a1;
        a2[0] = 5;

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
