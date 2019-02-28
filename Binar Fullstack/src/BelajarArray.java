import java.util.Scanner;

public class BelajarArray {
    public static void main(String[] args) {

        String nama [] = new String[5];
        nama [0] = "Aya";
        nama [1] = "Nadya";
        nama [2] = "Satya";
        nama [3] = "Siapa";
        nama [4] = "Yaa";

//        String [] namakedua = {"Satria","Dinda","Ketiga"};

        for(int i = 0; i < nama.length; i++) {
            System.out.println("Nama ke- " + i + " : " +nama[i]);
            System.out.println();
        }

//        for(int i = 0; i < namakedua.length; i++) {
//            System.out.println("Nama ke- " + i + " : " +namakedua[i]);
//            System.out.println();
//        }

    }
}
