public class TwoDimentionArrayStatic {
    public static void main(String[] args) {

        String[][] nomorHP = {{"tedy","0983481"},{"nadya","0878844"},{"dinda","01893912"}}; //ini 3 row  2 column

        System.out.println(nomorHP[2][0]);

        for(int i = 0; i < nomorHP.length; i++){
            System.out.println("nama: " + nomorHP[i][0]); // [0] column 1 (yg isinya nama)
            System.out.println("nama: " + nomorHP[i][1]); // [1] column 2 (yang isinya nomor)
        }
    }
}
