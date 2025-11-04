import java.util.*;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Cek Bilangan Ganjil atau Genap");
        System.out.print("Masukkan sebuah bilangan: ");
        int angka = in.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan GENAP");
        } else {
            System.out.println(angka + " adalah bilangan GANJIL");
        }

        in.close();
    }
}

    

