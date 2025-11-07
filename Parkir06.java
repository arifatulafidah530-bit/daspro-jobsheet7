import java.util.Scanner; 
    public class Parkir06 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int jenis, durasi; 
        double total = 0.0; 
        
        do { 
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): "); 
            jenis = sc.nextInt(); 
 
            if (jenis == 1 || jenis == 2) { 
                System.out.print("Masukkan durasi parkir (jam): "); 
                durasi = sc.nextInt(); 
 
                if (durasi > 5) { 
                    total += 12500; 
                } else { 
                    if (jenis == 1) { 
                        total += (double) durasi * 3000; 
                    } else { 
                        total += (double) durasi * 2000; 
                    } 
                } 
                System.out.println("Biaya parkir saat ini: Rp " + (int)total); 
            } else if (jenis != 0) { 
                System.out.println("Pilihan tidak valid, silakan coba lagi."); 
            } 
 
        } while (jenis != 0); 
 
        System.out.println("===== TOTAL PENDAPATAN PARKIR ====="); 
        System.out.println("Total pendapatan hari ini: Rp " + (int)total); 
        System.out.println("======================================"); 
 
    } 
} 
    

