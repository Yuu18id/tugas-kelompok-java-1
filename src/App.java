import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kalkulator Sederhana Kelompok 5");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.println("5. Modulo/sisa bagi");
        System.out.print("Pilih Operasi: ");

        Scanner scanner = new Scanner(System.in);
        int pilihan = scanner.nextInt();
        if (pilihan == 1) {
            // method tambah
            penjumlahan();
        } else if (pilihan == 2) {
            // method kurang
            pengurangan();
        } else if (pilihan == 3) {
            // method kali
            Kali();
        } else if (pilihan == 4) {
            // method bagi
            pembagian();
        } else if (pilihan == 5) {
            // method modulo
            modulo();
        } else {
            System.out.println("Input yang anda masukkan salah");
        }
        scanner.close();
    }

    // Method untuk operasi modulo/sisa bagi
    public static void modulo() {
        // import scanner untuk sistem input
        Scanner scanner = new Scanner(System.in);

        // tampilan CLI
        System.out.println("Menghitung Modulo (Sisa Bagi)");
        System.out.print("Angka 1: ");

        // variabel untuk menampung angka 1
        int angka1 = scanner.nextInt();
        System.out.print("Angka 2: ");

        // variabel untuk menampung angka 2
        int angka2 = scanner.nextInt();

        // variabel yg menyimpan hasil modulo berdasarkan rumus yg dibuat
        int hasil = angka1 % angka2;

        // cetak hasil akhir
        System.out.println("Hasil Modulo : " + hasil);

        // menutup scanner
        scanner.close();
    }

    public static void penjumlahan() {
        Scanner scanner = new Scanner(System.in);

        // memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        // masukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        // memanggil metode penjumlahan
        operasi_penjumlahan(num1, num2);

        // Menutup object scanner
        scanner.close();
    }

    public static void pengurangan() {
        Scanner scanner = new Scanner(System.in);

        // memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        // masukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        // memanggil metode pengurangan
        double hasil = angkaPertama - angkaKedua;

        // menampilkan hasil pengurangan
        System.out.println("Hasil pengurangan: " + hasil);

        scanner.close();
    }

    public static void Kali() {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua bilangan untuk dikalikan
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        // Menghitung hasil perkalian
        double hasilPerkalian = bilangan1 * bilangan2;

        // Menampilkan hasil perkalian
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        // Menutup objek Scanner
        scanner.close();
    }

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

    // Method untuk menjumlahkan
    static void operasi_penjumlahan(double num1, double num2) {
        double result = num1 + num2;

        // menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan: " + result);
    }
}
