package Pekan5_2511533002;
import java.util.Scanner;

public class KendaraanDriver_2511533002 {
    private Kendaraan_2511533002 head_3002 = null;
    private int counter_3002 = 0;

    public void daftarkanKendaraan_3002(String nama_3002, String jenis_3002) {
        counter_3002++;
        Kendaraan_2511533002 nodeBaru_3002 = new Kendaraan_2511533002(nama_3002, jenis_3002, counter_3002);
        
        if (head_3002 == null) {
            head_3002 = nodeBaru_3002;
        } else {
            Kendaraan_2511533002 temp_3002 = head_3002;
            while (temp_3002.getNext_3002() != null) {
                temp_3002 = temp_3002.getNext_3002();
            }
            temp_3002.setNext_3002(nodeBaru_3002);
        }
        System.out.println("Kendaraan berhasil masuk antrean! Nomor Antrean: " + counter_3002);
    }

    public void layaniKendaraan_3002() {
        if (head_3002 == null) {
            System.out.println("Antrean kosong, tidak ada kendaraan untuk dilayani.");
        } else {
            System.out.println("Melayani kendaraan: " + head_3002.getNamaPemilik_3002() + " (" + head_3002.getJenisKendaraan_3002() + ")");
            head_3002 = head_3002.getNext_3002();
        }
    }

    public void tampilkanAntrean_3002() {
        if (head_3002 == null) {
            System.out.println("Antrean saat ini kosong.");
        } else {
            System.out.println("\n--- Daftar Antrean Car Wash ---");
            Kendaraan_2511533002 temp_3002 = head_3002;
            int posisi_3002 = 1;
            while (temp_3002 != null) {
                System.out.println(posisi_3002 + ". [" + temp_3002.getNomorAntrean_3002() + "] " + 
                                   temp_3002.getNamaPemilik_3002() + " - " + temp_3002.getJenisKendaraan_3002());
                temp_3002 = temp_3002.getNext_3002();
                posisi_3002++;
            }
        }
    }

    public void cariKendaraan_3002(String namaCari_3002) {
        if (head_3002 == null) {
            System.out.println("Antrean kosong.");
            return;
        }
        Kendaraan_2511533002 temp_3002 = head_3002;
        boolean ditemukan_3002 = false;
        while (temp_3002 != null) {
            if (temp_3002.getNamaPemilik_3002().equalsIgnoreCase(namaCari_3002)) {
                System.out.println("Data Ditemukan: Nomor " + temp_3002.getNomorAntrean_3002() + 
                                   ", Pemilik: " + temp_3002.getNamaPemilik_3002() + 
                                   ", Jenis: " + temp_3002.getJenisKendaraan_3002());
                ditemukan_3002 = true;
            }
            temp_3002 = temp_3002.getNext_3002();
        }
        if (!ditemukan_3002) System.out.println("Data dengan nama '" + namaCari_3002 + "' tidak ditemukan.");
    }

    public void cekStatus_3002() {
        if (head_3002 == null) {
            System.out.println("Antrean kosong.");
        } else {
            int total_3002 = 0;
            Kendaraan_2511533002 temp_3002 = head_3002;
            while (temp_3002 != null) {
                total_3002++;
                temp_3002 = temp_3002.getNext_3002();
            }
            System.out.println("Total kendaraan dalam antrean: " + total_3002);
            System.out.println("Kendaraan paling depan: " + head_3002.getNamaPemilik_3002());
        }
    }

    public static void main(String[] args) {
        KendaraanDriver_2511533002 program_3002 = new KendaraanDriver_2511533002();
        Scanner input_3002 = new Scanner(System.in);
        int pilihan_3002;

        do {
            System.out.println("\n=== Antrean Car Wash NIM: 2511533002 ===");
            System.out.println("1. Tambah Antrean Kendaraan");
            System.out.println("2. Layani Kendaraan (Selesai Cuci)");
            System.out.println("3. Lihat Seluruh Antrean");
            System.out.println("4. Cari Data Pemilik");
            System.out.println("5. Cek Status Antrean");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3002 = input_3002.nextInt();
            input_3002.nextLine();

            switch (pilihan_3002) {
                case 1:
                    System.out.print("Masukkan Nama Pemilik: ");
                    String n_3002 = input_3002.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan (Mobil/Motor): ");
                    String j_3002 = input_3002.nextLine();
                    program_3002.daftarkanKendaraan_3002(n_3002, j_3002);
                    break;
                case 2:
                    program_3002.layaniKendaraan_3002();
                    break;
                case 3:
                    program_3002.tampilkanAntrean_3002();
                    break;
                case 4:
                    System.out.print("Cari Nama Pemilik: ");
                    String c_3002 = input_3002.nextLine();
                    program_3002.cariKendaraan_3002(c_3002);
                    break;
                case 5:
                    program_3002.cekStatus_3002();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_3002 != 6);
        input_3002.close();
    }
}