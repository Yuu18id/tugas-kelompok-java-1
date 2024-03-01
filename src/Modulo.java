import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        //memanggil method
        modulo();
    }

    //Method untuk operasi modulo/sisa bagi
    public static void modulo() {
        //import scanner untuk sistem input
        Scanner scanner = new Scanner(System.in);

        //tampilan CLI
        System.out.println("Menghitung Modulo (Sisa Bagi)");
        System.out.print("Angka 1: ");

        //variabel untuk menampung angka 1
        int angka1 = scanner.nextInt();
        System.out.print("Angka 2: ");

        //variabel untuk menampung angka 2
        int angka2 = scanner.nextInt();

        //variabel yg menyimpan hasil modulo berdasarkan rumus yg dibuat
        int hasil = angka1 % angka2;

        //cetak hasil akhir
        System.out.println("Hasil Modulo : "+ hasil);

        //menutup scanner
        scanner.close();
    }
}