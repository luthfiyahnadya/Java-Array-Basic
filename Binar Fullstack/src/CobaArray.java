import java.util.Scanner;

public class CobaArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama [] = new String[5];

        for(int i = 0; i < nama.length; i++) {
            System.out.println("Nama ke- " + i + " : ");
            nama[i] = input.nextLine();
            System.out.println();
        }

        for(String binar : nama){
            System.out.println(binar);
        }

    }
}
