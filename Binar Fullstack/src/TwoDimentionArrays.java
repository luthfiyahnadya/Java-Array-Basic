import java.util.Arrays;

public class TwoDimentionArrays {
    public static void main(String[] args) {
        int count = 0;
        int[][] myArr = new int[3][5];

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                myArr[i][j] = count;
                count++;
            }
        }
        System.out.println(Arrays.toString(myArr));
    }
}
