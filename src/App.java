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
            //method tambah
        }
        else if (pilihan == 2){
            //method kurang
            pengurangan();
        }
        else if (pilihan == 3){
            //method kali
        }
        else if (pilihan == 4){
            //method bagi
        }
        else if (pilihan == 5){
            //method modulo
            modulo();
        } else {
            System.out.println("Input yang anda masukkan salah");
        }
        scanner.close();
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
public static void pengurangan(){
    Scanner scanner = new Scanner(System.in);

    //memasukkan angka pertama
    System.out.print("Masukkan angka pertama: ");
    double angkaPertama = scanner.nextDouble();

    //masukkan angka kedua
    System.out.print("Masukkan angka kedua: ");
    double angkaKedua = scanner.nextDouble();

    //memanggil metode pengurangan
    double hasil = angkaPertama - angkaKedua;

    //menampilkan hasil pengurangan
    System.out.println("Hasil pengurangan: " + hasil);

    scanner.close();
}
}



