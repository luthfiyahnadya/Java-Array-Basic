public class HelloWorld {

    /* ini comment semua line
    contohnya
    banyak line
     */

    public static void main (String []args){
        System.out.println("Hello World"); //ini comment di line. Pake double slash di depan doang
        System.out.println("Tulisan");
        methodA();
        System.out.print("Ini ga pake ");
        System.out.print("line baru ");

        System.out.print("hallo");
        System.out.println("there");
        System.out.println("yea");
        System.out.println();
        System.out.println("Itu yang di atas kalo kosong seakan2 enter atau line kosong");

        System.out.println("Ini satu baris \nbaris baru \t tab \\ backslash satu");
    }

    public static void methodA(){
        System.out.println("Method A");
    }

    public static void methodB(){
        System.out.println("Method B");
    }
}
