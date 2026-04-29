package Pekan2_2511533002;
import java.util.ArrayList;
import java.util.Scanner;
public class BarangDriver_2511533002 {
	public static void main(String[] args) {
        ArrayList<Barang_2511533002> daftarBarang_3002 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) { 
            System.out.println("\n=== Inventaris Gudang ===");
            System.out.println("1. Input Barang Baru");
            System.out.println("2. Cek Daftar Barang");
            System.out.println("3. Keluarkan Barang (Hapus)");
            System.out.println("4. Info Total Jenis Barang");
            System.out.println("5. Tutup Program");
            System.out.print("Masukkan instruksi (1-5): ");

            String opsi = input.nextLine();

            if (opsi.equals("1")) {
                System.out.print(" -> Nama Barang : ");
                String nama_3002 = input.nextLine();
                
                System.out.print(" -> Kategori    : ");
                String tipe_3002 = input.nextLine();
                
                System.out.print(" -> Jumlah Stok : ");
                try {
                    int stok_3002 = Integer.parseInt(input.nextLine());
                    daftarBarang_3002.add(new Barang_2511533002(nama_3002, tipe_3002, stok_3002));
                    System.out.println("[+] Barang berhasil masuk ke gudang.");
                } catch (NumberFormatException e) {
                    System.out.println("[!] Gagal: Stok harus berupa angka.");
                }

            } else if (opsi.equals("2")) {
                System.out.println("\n--- Data Barang di Gudang ---");
                if (daftarBarang_3002.isEmpty()) {
                    System.out.println("Gudang saat ini kosong.");
                } else {
                    for (int i = 0; i < daftarBarang_3002.size(); i++) {
                        Barang_2511533002 brg = daftarBarang_3002.get(i);
                        System.out.println((i + 1) + ". " + brg.getNama_3002() + 
                                           " [" + brg.getKategori_3002() + "] - Stok: " + 
                                           brg.getStok_3002() + " unit");
                    }
                }

            } else if (opsi.equals("3")) {
                if (daftarBarang_3002.isEmpty()) {
                    System.out.println("[!] Tidak ada barang yang bisa dihapus.");
                } else {
                    System.out.print(" -> Masukkan nomor urut barang yang dihapus: ");
                    try {
                        int index = Integer.parseInt(input.nextLine());
                        if (index > 0 && index <= daftarBarang_3002.size()) {
                            daftarBarang_3002.remove(index - 1);
                            System.out.println("[-] Barang berhasil dihapus dari sistem.");
                        } else {
                            System.out.println("[!] Nomor urut tidak ditemukan.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("[!] Masukkan angka yang benar.");
                    }
                }

            } else if (opsi.equals("4")) {
                System.out.println("\n[i] Saat ini terdapat " + daftarBarang_3002.size() + " jenis barang di dalam gudang.");

            } else if (opsi.equals("5")) {
                System.out.println("\nMematikan sistem inventaris. Sampai jumpa!");
                break; 

            } else {
                System.out.println("[!] Instruksi tidak dipahami. Pilih angka 1 sampai 5.");
            }
        }

        input.close();
    }
}
