import java.util.Scanner;

public class add_calc {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Kalkulator Sederhana");
        System.out.println("Pilih Operator");
        System.out.println("1. Penjumlahan  (Haidar)");
        System.out.println("2. Pengurangan  (Renitha)");
        System.out.println("3. Perkalian    (Asni)");
        System.out.println("4. Pembagian    (Leo)");
        System.out.println("5. Modulo       (Bayu)");
        System.out.print("Masukan input (1 - 5) : ");

        try {
            int operand_chooser = input.nextInt();
            switch (operand_chooser) {
                case 1:
                    System.out.print("Masukan angka pertama : ");
                    int num1 = input.nextInt();
                    System.out.print("Masukan angka ke dua  : ");
                    int num2 = input.nextInt();
                    System.out.print("Hasil Penjumlahan     : ");
                    add_operator(num1, num2);
                    break;
                default:
                    System.out.println("Mohon pilih angka dari 1 - 5");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Input harus merupakan bilangan bulat");
        }

        input.close();
    }

    static void add_operator(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
