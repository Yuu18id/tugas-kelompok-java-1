import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        //memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();
        
        //memanggil metode pengurangan
        double hasil = angkaPertama - angkaKedua;

        //menampilkan hasil pengurangan
        System.out.println("Hasil pengurangan: " + hasil);

        scanner.close();
    }
}
