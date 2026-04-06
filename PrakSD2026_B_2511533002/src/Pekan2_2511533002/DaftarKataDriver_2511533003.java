package Pekan2_2511533002;

public class DaftarKataDriver_2511533003 {
	public static void main(String[] args) {
		DaftarKata_2511533002 al = new DaftarKata_2511533002();
		
		//menambahkan elemen (akhir)
		al.tambah_2511533002("Kami");
		al.tambah_2511533002("Informatika");
		
		//Menyisipkan elemen pada index
		al.tambahPada_2511533002(1, "Mahasiswa");
		
		//cetak isi awal
		System.out.println("Awal     : " + al);
		
		//mengubah elemen (index 1)
		al.ubahElemen_2511533002(1, "Dapartemen");
		System.out.println("Setelah ubah   : " + al);
		
		//menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511533002(0);
		System.out.println("Terhapus       : " + terhapus);
		System.out.println("Setelah Terhapus : " + al);
		
		//iterasi pada ArrayList (cetak setiap elemen)
		System.out.println("Iterasi: ");
		al.iterasiCetak_2511533002();
		System.out.println();
	}
}
