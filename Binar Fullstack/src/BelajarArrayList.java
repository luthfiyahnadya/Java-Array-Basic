import java.util.ArrayList;

public class BelajarArrayList {
    public static void main(String[] args) {
        ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add(1243132);
        kantongAjaib.add("Siapa aku");
        kantongAjaib.add("binar");

        System.out.println(kantongAjaib); //nanti keluar tiga-tiganya
        System.out.println("jumlah --->" + kantongAjaib.size());

        kantongAjaib.remove("binar"); // ini buat ngilangin salah satu index

        System.out.println(kantongAjaib);
        System.out.println("jumlah --->" + kantongAjaib.size());

        System.out.println(kantongAjaib.get(0)); // ini buat ambil index yg nomor 1 (0)

       kantongAjaib.clear();
        System.out.println(kantongAjaib);


    }
}
