package Pekan2_2511533002;
import java.util.ArrayList;
public class DaftarKata_2511533002 {
	private final ArrayList<String> data;
	//konstruktor : inisialisasi list kosong
	public DaftarKata_2511533002() {
		this.data = new ArrayList<>();
	}
	//menambahkan elemen di akhir list
	public void tambah_2511533002(String elemen) {
		data.add(elemen);
	}
	//menambahkan elemen pada indek tertentu (menyisipkan)
	public void tambahPada_2511533002(int index, String elemen) {
		data.add(index, elemen);
	}
	//mengubah elemen pada posisi 'index' menjadi 'nilaiBaru;'
	//bertindah sebagai "setter" untuk elemen tertentu
	public void ubahElemen_2511533002(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	//menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus
	public String hapusElemen_2511533002(int index) {
		return data.remove(index);
	}
	//melakukan iterasi dan mencetak setiap elemen dalam format : (index) nilai
	//(metode ini tidak mengembalikan nilai; hanya demonstrasi itersi).
	public void iterasiCetak_2511533002() {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i)+" ");
		}
	}
	
	//mengambil elemen berdasarkan index
	public String get(int index) {
		return data.get(index);
	}
	
	//representasi string agar mudah di cetak
	@Override
	public String toString() {
		return data.toString();
	}
}
