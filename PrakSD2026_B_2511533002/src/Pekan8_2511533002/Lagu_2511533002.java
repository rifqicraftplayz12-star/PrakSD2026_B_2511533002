package Pekan8_2511533002;
class Lagu {
 String judul;
 String penyanyi;
 int durasi; // dalam detik

 public Lagu(String judul, String penyanyi, int durasi) {
     this.judul = judul;
     this.penyanyi = penyanyi;
     this.durasi = durasi;
 }
}

//Kelas Utama menggunakan NIM lengkap
public class Lagu_2511533002 {
 
 // Array untuk menyimpan maksimal 20 lagu
 Lagu[] dataLagu_3002 = new Lagu[20];
 int jumlahLagu_3002 = 0;

 // Method untuk mengisi data awal (minimal 7 lagu)
 public void inputData_3002() {
     dataLagu_3002[jumlahLagu_3002++] = new Lagu("Let Go", "Centrall Cee", 270);
     dataLagu_3002[jumlahLagu_3002++] = new Lagu("I LIke You", "Post Malone", 252);
     dataLagu_3002[jumlahLagu_3002++] = new Lagu("Silence", "Marshmellow", 196);
     dataLagu_3002[jumlahLagu_3002++] = new Lagu("God's Plan", "Drake", 354);
     dataLagu_3002[jumlahLagu_3002++] = new Lagu("See You Again", "Charlie Puth", 390);
     dataLagu_3002[jumlahLagu_3002++] = new Lagu("Danza Kuduro", "Don Omar", 233);
     dataLagu_3002[jumlahLagu_3002++] = new Lagu("Humble", "Skrillex", 200);
 }

 // Method menampilkan data sebelum dan sesudah sorting
 public void tampilData_3002(String pesan) {
     System.out.println(pesan);
     for (int i = 0; i < jumlahLagu_3002; i++) {
         System.out.println((i + 1) + ". " + dataLagu_3002[i].judul + " - " + dataLagu_3002[i].durasi + " detik");
     }
     System.out.println();
 }

 // Method algoritma yang dipilih (Shell Sort: urut berdasarkan judul A-Z)
 public void shellSort_3002() {
     int n = jumlahLagu_3002;
     
     // Memulai dengan gap besar, lalu memperkecil gap
     for (int gap = n / 2; gap > 0; gap /= 2) {
         // Lakukan insertion sort untuk setiap gap
         for (int i = gap; i < n; i++) {
             Lagu temp = dataLagu_3002[i];
             int j;
             
             // Geser elemen yang lebih besar ke kanan
             // compareToIgnoreCase digunakan untuk membandingkan string abjad A-Z
             for (j = i; j >= gap && dataLagu_3002[j - gap].judul.compareToIgnoreCase(temp.judul) > 0; j -= gap) {
                 dataLagu_3002[j] = dataLagu_3002[j - gap];
             }
             
             // Tempatkan temp di posisi yang benar
             dataLagu_3002[j] = temp;
         }
     }
 }

 public static void main(String[] args) {
     Lagu_2511533002 playlist = new Lagu_2511533002();
     
     // Memasukkan data lagu
     playlist.inputData_3002();

     // Mencetak Header
     System.out.println("=== Sorting Playlist NIM: 2511533002 ===");

     // Menampilkan data sebelum diurutkan
     playlist.tampilData_3002("Data Sebelum Sorting:");

     // Menjalankan algoritma sorting
     playlist.shellSort_3002();

     // Menampilkan data setelah diurutkan
     playlist.tampilData_3002("Data Setelah Shell Sort (Judul A-Z):");
 }
}