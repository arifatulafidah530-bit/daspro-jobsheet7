import java.util.Scanner;
public class Bioskop06 {
     
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        int TotalTiketTerjual = 0;
        double TotalPenjualan = 0.0;
        final int HARGA_TIKET = 50000;
        String lanjut;

        System.out.println("===== PROGRAM PENJUALAN TIKET BIOSKOP =====");

        do {
            int JumlahTiket;
            do {
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                JumlahTiket = sc.nextInt();
                if (JumlahTiket < 0) {
                    System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif.");
                }
            } while (JumlahTiket < 0);

            double hargaAwal = JumlahTiket * HARGA_TIKET; 
            double diskon = 0.0; 
            double TotalBayar;

            if (JumlahTiket > 10) { 
                diskon = 0.15; 
            } else if (JumlahTiket > 4) { 
                diskon = 0.10; 
            } 
            TotalBayar = hargaAwal - (hargaAwal * diskon); 
            System.out.println("Total yang harus dibayar: Rp " + (int)TotalBayar); 
 
            TotalTiketTerjual += JumlahTiket; 
            TotalPenjualan += TotalBayar; 
 
            System.out.print("Apakah ada transaksi lain? (ya/Tidak): "); 
            lanjut = sc.next(); 
 
        } while (lanjut.equalsIgnoreCase("ya")); 

        System.out.println("===== REKAP PENJUALAN HARIAN ====="); 
        System.out.println("Total tiket terjual: " + TotalTiketTerjual + " tiket"); 
        System.out.println("Total penjualan hari ini: Rp " + (int)TotalPenjualan); 
        System.out.println("======================================"); 
        sc.close(); 
        }
    } 
