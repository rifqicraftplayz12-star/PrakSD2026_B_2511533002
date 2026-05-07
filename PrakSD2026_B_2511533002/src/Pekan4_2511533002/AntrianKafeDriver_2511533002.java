package Pekan4_2511533002;
import java.util.Scanner;

public class AntrianKafeDriver_2511533002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan batas maksimal antrian kafe: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine(); 

        AntrianKafe_2511533002 kafe = new AntrianKafe_2511533002(kapasitas);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN PESANAN KAFE ===");
            System.out.println("1. Tambah Pesanan Baru");
            System.out.println("2. Selesaikan Pesanan");
            System.out.println("3. Lihat Daftar Antrian");
            System.out.println("4. Reverse Urutan Antrian");
            System.out.println("5. Tutup Program");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    kafe.enqueue(nama);
                    break;
                case 2:
                    kafe.dequeue();
                    break;
                case 3:
                    kafe.display();
                    break;
                case 4:
                    kafe.Reverse();
                    break;
                case 5:
                    System.out.println("Sistem ditutup. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan salah, silakan masukkan angka 1-5.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}