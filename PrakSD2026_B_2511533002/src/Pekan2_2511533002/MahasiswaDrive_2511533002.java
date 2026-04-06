package Pekan2_2511533002;
import java.util.ArrayList;
import java.util.Scanner;
public class MahasiswaDrive_2511533002 {
	//Method untuk menampilkan menu
	public static void tampilkanMenu() {
		System.out.println("\nMenu : ");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Tampilkan Semua Mahasiswa");
		System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	
	//method untuk tambah mahasiswa
	public static void tambahMahasiswa(ArrayList<Mahasiswa_2511533002> list, Scanner sc) {
		System.out.print("Masukkan NIM : ");
		String nim = sc.nextLine();
		System.out.print("Masukkan Nama : ");
		String nama = sc.nextLine();
		System.out.print("Masukkan Prodi : ");
		String prodi = sc.nextLine();
		list.add(new Mahasiswa_2511533002(nim, nama, prodi));
		System.out.println("Mahasiswa Berhasil Ditambahkan.");
	}
	
	//method untuk tampilkan semua data
	public static void tampilkanSemuaMahasiswa(ArrayList<Mahasiswa_2511533002> list) {
		if(list.isEmpty()) {
			System.out.println("Daftar Mahasiswa Kosong.");
		}else {
			System.out.println("Data Mahasiswa : ");
			for (Mahasiswa_2511533002 mhs : list) {
				System.out.println(mhs);
			}
		}
	}
	
	//method untuk hapus mahasiswa berdasarkan NIM
	public static void hapusMahasiswa(ArrayList<Mahasiswa_2511533002> list, Scanner sc) {
		System.out.println("Masukkan NIM yang akan di hapus : ");
		String nimHapus = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));
		
		if (removed) {
			System.out.println("Data dengan NIM" + nimHapus + "berhasil dihapus.");
		}else {
			System.out.println("NIM tidak ditemukan.");
		}
	}
		
	//method untuk cari mahasiswa berdasarkan NIM
	public static void cariMahasiswa(ArrayList<Mahasiswa_2511533002> list, Scanner sc) {
		System.out.println("Masukkan NIM yang dicari");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		
		for (Mahasiswa_2511533002 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil pencarian :" + mhs);
				ditemukan = true;
				break;
			}
		}
		
		if (!ditemukan) {
			System.out.println("NIM tidak ada.");
		}
	}
	public static void main(String[] args) {
		ArrayList<Mahasiswa_2511533002> mahasiswaList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			tampilkanMenu();
			System.out.println("Pilih Menu : ");
			choice = scanner.nextInt();
			scanner.nextLine();//consume newline
			
			switch (choice) {
			case 1:
				tambahMahasiswa(mahasiswaList, scanner);
				break;
			case 2:
				tampilkanSemuaMahasiswa(mahasiswaList);
				break;
			case 3:
				hapusMahasiswa(mahasiswaList, scanner);
				break;
			case 4:
				cariMahasiswa(mahasiswaList, scanner);
				break;
			case 5:
				System.out.println("Keluar dari program.");
				break;
			default:
				System.out.println("Pilihan tidak valid.");
			}
	} while (choice != 5);
		scanner.close();
	}
	}
