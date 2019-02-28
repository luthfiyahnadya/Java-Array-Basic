import java.util.Arrays;

public class ArrayAsParameter {
    public static void main(String[] args) {
        int[] x = {2,4,6};
        System.out.println(Arrays.toString(x));
        dikalidua(x);
        System.out.println(Arrays.toString(x));
    }

    public static void dikalidua (int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = a[i] * 2;
        }
    }
}
