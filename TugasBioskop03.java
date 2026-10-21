import  java.util.Scanner;

public class TugasBioskop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerTiket = 50000;
        int totalTiketTerjual = 0;
        int totalPendapatan = 0;
        int jumlahTiket;
        

        System.out.println("=== Program Penghitungan Penjualan Tiket Bioskop ===");
        System.out.println("Ketik '0' atau nilai negatif jika ingin berhenti menginput data hari ini.\n");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau ketik negatif untuk abaikan): ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid (negatif tidak diperbolehkan). Silakan masukkan ulang.\n");
                continue; 
            }
                
            if (jumlahTiket == 0) {
                break;
            }
            
            double hargaTotal = jumlahTiket * hargaPerTiket;
            double diskon = 0;
            
            if (jumlahTiket > 4) {
                diskon = 0.10;
            } else if (jumlahTiket > 10) {
                diskon = 0.15;
            }
            
            double totalBayar = hargaTotal - (hargaTotal * diskon);
            
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;
            
            System.out.println("-> Detail Transaksi: " + jumlahTiket + " tiket | Diskon: " + (int)(diskon * 100) + "% | Total Bayar: Rp " + (long)totalBayar);
            System.out.println();
        }   
        
        System.out.println("\n========================================");
        System.out.println("JUMLAH TOTAL PENJUALAN TIKET DALAM SATU HARI");
        System.out.println("========================================");
        System.out.println("Total tiket yang terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan    : Rp " + (long)totalPendapatan);
    }
}