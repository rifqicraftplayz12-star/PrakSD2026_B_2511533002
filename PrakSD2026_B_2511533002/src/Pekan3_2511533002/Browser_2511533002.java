package Pekan3_2511533002;
import java.util.Scanner;
import java.util.Stack;
public class Browser_2511533002 {
	public static void main(String[] args) {
        // Inisialisasi Stack dengan tipe objek Class ADT
        Stack<Website_2511533002> historyStack_2511533002 = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\n=== Browser History  ===");
            System.out.println("1. Kunjungi Website ");
            System.out.println("2. Tombol Back ");
            System.out.println("3. Lihat Halaman Aktif ");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Judul: ");
                    String judul_2511533002 = input.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url_2511533002 = input.nextLine();
                    
                    historyStack_2511533002.push(new Website_2511533002(judul_2511533002, url_2511533002));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    
                    if (!historyStack_2511533002.isEmpty()) {
                        Website_2511533002 webDihapus_2511533002 = historyStack_2511533002.pop();
                        System.out.println("\nBerhasil menekan tombol Back. Halaman '" + webDihapus_2511533002.getJudul_3002() + "' dihapus.");
                    } else {
                        System.out.println("\nTidak dapat kembali. Riwayat (History) masih kosong!");
                    }
                    break;

                case 3:
                    if (!historyStack_2511533002.isEmpty()) {
                        Website_2511533002 webAktif = historyStack_2511533002.peek();
                        System.out.println("\nHalaman Aktif Saat Ini:");
                        System.out.println("Judul : " + webAktif.getJudul_3002());
                        System.out.println("URL   : " + webAktif.getUrl_3002());
                    } else {
                        System.out.println("\nBelum ada halaman yang sedang aktif dibuka.");
                    }
                    break;

                case 4:
                    System.out.println("\nTotal riwayat tersimpan: " + historyStack_2511533002.size());
                    if (historyStack_2511533002.isEmpty()) {
                        System.out.println("Status: Riwayat browser saat ini KOSONG.");
                    } else {
                        System.out.println("Status: Terdapat riwayat penelusuran.");
                    }
                    break;

                case 5:
                    System.out.println("\nKeluar dari simulasi Browser. Terima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih menu 1-5.");
            }
        }
        
        input.close();
    }
}
