package Pekan1_2511533002;

import java.util.Scanner;

public class JamDriver2_2511533002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("== Program Driver Objek Jam ==");
		
		//input jam pertama
		System.out.println("\n--- Input Jam 1 ---");
		Jam_2511533002 j1 = buatJamDariInput(input);
		
		//input jam kedua
		System.out.println("\n--- Input Jam 2 ---");
		Jam_2511533002 j2 = buatJamDariInput(input);
		
		//menampilkan data
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam 1 (string)           = "+j1.toString());
		System.out.println("Jam 2 (string)           = "+j2.toString());
		System.out.println("Jam 1 dalam detik        = "+j1.toSeconds());
		System.out.println("Jam 2 dalam detik        = "+j2.toSeconds());
		
		//operasi rasional (perbandingan)
		int perbandingan = j1.compareTo(j2);
		if (perbandingan > 0) {
			System.out.println("Status                        : Jam 1 lebih lambat (setelah) Jam 2");
		}else if (perbandingan < 0) {
			System.out.println("Status                        : Jam 1 lebih awal (sebelum) Jam 2");
		}else {
			System.out.println("Status                        : Jam 1 dan Jam 2 sama persis");
		}
		
		//operasi aritmatika
		System.out.println("Durasi (J1 ke J2         : " + Jam_2511533002.durasiDetik(j1, j2) + "detik");
		
		Jam_2511533002 JNext = j1.nextSecond();
		System.out.println("Jam 1 detik berikutnya : " + JNext);
		
		Jam_2511533002 JPrev = j1.prevSecond();
		System.out.println("Jam 1 detik sebelumnya : " + JPrev);
		
		//operasi penjumlahan jam
		Jam_2511533002 JHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 + J2          : "+ JHasilPlus);
		
		input.close();
		System.out.println("\nProgram Selesai.");
		
	}
		private static Jam_2511533002 buatJamDariInput(Scanner sc) {
			int h, m, s;
			while (true) {
				System.out.println("Masukkan Jam (0-23)   : ");
				h = sc.nextInt();
				System.out.println("Masukkan Menit (0-59)   : ");
				m = sc.nextInt();
				System.out.println("Masukkan Detik (0-59)   : ");
				s = sc.nextInt();
				
				//memanggil method static isvalid dari kelas jam
				if (Jam_2511533002.isValid(h, m, s)) {
					return new Jam_2511533002(h, m, s);
				}else {
					System.out.println("[Error] input tidak valid! silahkan ulangi.\n");
				}
			}
		
	
}
}
