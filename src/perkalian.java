import java.util.Scanner;

public class perkalian {
    public static void Kali(){
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
    public static void main(String[] args) {
        Kali();
    }
}
