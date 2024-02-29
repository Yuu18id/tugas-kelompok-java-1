import java.util.Scanner;

public class Pembagian {
    public static void main(String[] args) {
        // Memanggil fungsi pembagian untuk menjalankan operasi pembagian
        pembagian();
    }

    // Fungsi untuk melakukan operasi pembagian dua angka
    public static void pembagian() {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        // Meminta pengguna memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        // Memastikan pembagian tidak oleh nol
        if (angkaKedua != 0) {
            // Melakukan pembagian jika angka kedua tidak sama dengan nol
            double hasil = angkaPertama / angkaKedua;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            // Menampilkan pesan kesalahan jika pembagian oleh nol terdeteksi
            System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
        }

        // Menutup objek Scanner untuk menghindari kebocoran sumber daya
        scanner.close();
    }
}
