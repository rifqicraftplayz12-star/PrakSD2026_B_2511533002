package Pekan6_2511533002;

import java.util.Scanner;

public class LaguDriver_2511533002 {
    private Lagu_2511533002 head_3002;
    private Lagu_2511533002 tail_3002;

    public void tambahLagu_3002(String judul_3002, String penyanyi_3002) {
        Lagu_2511533002 nodeBaru = new Lagu_2511533002(judul_3002, penyanyi_3002);
        
        if (head_3002 == null) {
            head_3002 = nodeBaru;
            tail_3002 = nodeBaru;
        } else {
            tail_3002.next_3002 = nodeBaru;
            nodeBaru.prev_3002 = tail_3002;
            tail_3002 = nodeBaru;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    public void hapusLaguAwal_3002() {
        if (head_3002 == null) {
            System.out.println("Playlist kosong! Tidak ada lagu yang bisa dihapus.");
            return;
        }
        
        if (head_3002 == tail_3002) {
            head_3002 = null;
            tail_3002 = null;
        } else {
            head_3002 = head_3002.next_3002;
            head_3002.prev_3002 = null;
        }
        System.out.println("Lagu pertama berhasil dihapus!");
    }

    public void tampilMaju_3002() {
        if (head_3002 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        
        Lagu_2511533002 current = head_3002;
        System.out.println("=== Daftar Playlist (Maju) ===");
        while (current != null) {
            System.out.println("Judul: " + current.getJudul_3002() + " - Penyanyi: " + current.getPenyanyi_3002());
            current = current.next_3002;
        }
    }

    public void tampilMundur_3002() {
        if (tail_3002 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        
        Lagu_2511533002 current = tail_3002;
        System.out.println("=== Daftar Playlist (Mundur) ===");
        while (current != null) {
            System.out.println("Judul: " + current.getJudul_3002() + " - Penyanyi: " + current.getPenyanyi_3002());
            current = current.prev_3002;
        }
    }

    public void cariLagu_3002(String judul_3002) {
        if (head_3002 == null) {
            System.out.println("Playlist kosong! Tidak dapat mencari lagu.");
            return;
        }
        
        Lagu_2511533002 current = head_3002;
        boolean ditemukan = false;
        
        while (current != null) {
            if (current.getJudul_3002().equalsIgnoreCase(judul_3002)) {
                System.out.println("Lagu ditemukan: " + current.getJudul_3002() + " oleh " + current.getPenyanyi_3002());
                ditemukan = true;
                break;
            }
            current = current.next_3002;
        }
        
        if (!ditemukan) {
            System.out.println("Lagu dengan judul '" + judul_3002 + "' tidak ditemukan di playlist.");
        }
    }

    public static void main(String[] args) {
        LaguDriver_2511533002 playlist = new LaguDriver_2511533002();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 6) {
            System.out.println("\n=== Playlist Musik ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            if(scanner.hasNextInt()){
                pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan) {
                    case 1:
                        System.out.print("Judul: ");
                        String judulInput = scanner.nextLine();
                        System.out.print("Penyanyi: ");
                        String penyanyiInput = scanner.nextLine();
                        playlist.tambahLagu_3002(judulInput, penyanyiInput);
                        break;
                    case 2:
                        playlist.hapusLaguAwal_3002();
                        break;
                    case 3:
                        playlist.tampilMaju_3002();
                        break;
                    case 4:
                        playlist.tampilMundur_3002();
                        break;
                    case 5:
                        System.out.print("Masukkan judul lagu yang dicari: ");
                        String cariJudul = scanner.nextLine();
                        playlist.cariLagu_3002(cariJudul);
                        break;
                    case 6:
                        System.out.println("Keluar dari program. Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}