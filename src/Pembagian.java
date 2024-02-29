import java.util.Scanner;

public class Pembagian {
    public static void main(String[] args) {
        pembagian();
}
public static void pembagian(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan angka pertama: ");
    double angkaPertama = scanner.nextDouble();

    System.out.print("Masukkan angka kedua: ");
    double angkaKedua = scanner.nextDouble();

    // Memastikan pembagian tidak oleh nol
    if (angkaKedua != 0) {
        double hasil = angkaPertama / angkaKedua;
        System.out.println("Hasil pembagian: " + hasil);
    } else {
        System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
    }

    scanner.close();
}
}