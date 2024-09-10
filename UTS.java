import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SPBU spbu = new SPBU();

        int jenisBahanBakar;
        double jumlahRupiah;

        do {
            System.out.println("=======================================");
            System.out.println("===| SELAMAT DATANG DI SPBU UNSERA |===");
            System.out.println("=======================================");
            System.out.println("Pilih jenis bahan bakar:");
            System.out.println("1. SR - Lite " +spbu.getHargaSRLite() +" /Liter");
            System.out.println("2. SR - Max " +spbu.getHargaSRMax()+" /Liter");
            System.out.println("3. Super SR " +spbu.getHargaSuperSR() +"/Liter");
            System.out.print("Masukkan pilihan Anda: ");
            jenisBahanBakar = input.nextInt();
        } while (jenisBahanBakar < 1 || jenisBahanBakar > 3);

        do {
            System.out.print("Masukkan jumlah uang (dalam Rupiah): ");
            jumlahRupiah = input.nextDouble();
        } while (jumlahRupiah <= 0);

        // Memanggil metode transaksi dan menyimpan total uang yang dibayarkan
        double totalUangDibayar = spbu.transaksi(jenisBahanBakar, jumlahRupiah);
        System.out.println("Total uang yang dibayarkan: " + totalUangDibayar + " Rupiah");
    }
}
