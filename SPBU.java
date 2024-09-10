class SPBU {
    private double hargaSRLite = 9000;
    private double hargaSRMax = 10000;
    private double hargaSuperSR = 12000;

    // Getter untuk harga bahan bakar
    public double getHargaSRLite() {
        return hargaSRLite;
    }

    public double getHargaSRMax() {
        return hargaSRMax;
    }

    public double getHargaSuperSR() {
        return hargaSuperSR;
    }

    public double transaksi(int jenisBahanBakar, double jumlahRupiah) {
        double hargaPerLiter = 0;

        switch (jenisBahanBakar) {
            case 1:
                hargaPerLiter = hargaSRLite;
                break;
            case 2:
                hargaPerLiter = hargaSRMax;
                break;
            case 3:
                hargaPerLiter = hargaSuperSR;
                break;
            default:
                System.out.println("Jenis bahan bakar tidak valid!");
                break;
        }

        if (hargaPerLiter > 0) {
            double liter = jumlahRupiah / hargaPerLiter;
            System.out.println("Anda telah membeli " + liter + " liter.");
        }

        return jumlahRupiah;
    }

}