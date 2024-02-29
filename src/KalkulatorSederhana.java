import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        double hasil = angkaPertama - angkaKedua;
        System.out.println("Hasil pengurangan: " + hasil);

        scanner.close();
    }
}