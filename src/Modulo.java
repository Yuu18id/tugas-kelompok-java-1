import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        modulo();
    }

    public static void modulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menghitung Modulo (Sisa Bagi)");
        System.out.print("Angka 1: ");
        int angka1 = scanner.nextInt();
        System.out.print("Angka 2: ");
        int angka2 = scanner.nextInt();
        int hasil = angka1 % angka2;
        System.out.println("Hasil Modulo : "+ hasil);
    }
}