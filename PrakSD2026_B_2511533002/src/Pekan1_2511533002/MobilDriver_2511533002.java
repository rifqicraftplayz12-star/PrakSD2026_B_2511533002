package Pekan1_2511533002;
import java.util.ArrayList;
public class MobilDriver_2511533002 {
	    public static void tambahMobil(ArrayList<Mobil_2511533002> daftar, Mobil_2511533002 mobilBaru) {
	        daftar.add(mobilBaru);
	        System.out.println("[Sukses] Mobil " + mobilBaru.getNama() + " berhasil ditambahkan.");
	    }

	    public static void hapusMobil(ArrayList<Mobil_2511533002> daftar, int index) {
	        if (index >= 0 && index < daftar.size()) {
	        	Mobil_2511533002 mobilDihapus = daftar.remove(index);
	            System.out.println("[Sukses] Mobil " + mobilDihapus.getNama() + " berhasil dihapus.");
	        } else {
	            System.out.println("[Gagal] Indeks mobil tidak ditemukan.");
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList<Mobil_2511533002> daftarMobil = new ArrayList<>();

	        System.out.println("=== PROGRAM DATA SHOWROOM MOBIL ===\n");

	        System.out.println("--- Tambah Data ---");
	        Mobil_2511533002 mobil1 = new Mobil_2511533002("Innova", 2020, 1300, 150000000, "Toyota");
	        Mobil_2511533002 mobil2 = new Mobil_2511533002("Fortuner", 2022, 1200, 160000000, "Honda");
	        
	        tambahMobil(daftarMobil, mobil1);
	        tambahMobil(daftarMobil, mobil2);

	        System.out.println("\n--- Daftar Mobil Saat Ini ---");
	        for (int i = 0; i < daftarMobil.size(); i++) {
	            System.out.print((i + 1) + ". ");
	            daftarMobil.get(i).infoMobil();
	        }

	        System.out.println("\n--- Uji Coba ---");
	        System.out.println("Harga awal " + mobil1.getNama() + " : Rp" + mobil1.getHarga()); 
	        mobil1.setHarga(145000000); 
	        System.out.println("Harga update " + mobil1.getNama() + " : Rp" + mobil1.getHarga());
	        System.out.println("\n--- Proses Hapus Data ---");
	        hapusMobil(daftarMobil, 0);

	        System.out.println("\n--- Sisa Daftar Mobil ---");
	        for (int i = 0; i < daftarMobil.size(); i++) {
	            System.out.print((i + 1) + ". ");
	            daftarMobil.get(i).infoMobil();
	        }
	    }
	}


