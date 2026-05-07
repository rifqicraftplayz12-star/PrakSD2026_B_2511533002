package Pekan5_2511533002;
public class Kendaraan_2511533002 {
    private String namaPemilik_3002;
    private String jenisKendaraan_3002;
    private int nomorAntrean_3002;
    Kendaraan_2511533002 next_3002;

    public Kendaraan_2511533002(String nama_3002, String jenis_3002, int antrean_3002) {
        this.namaPemilik_3002 = nama_3002;
        this.jenisKendaraan_3002 = jenis_3002;
        this.nomorAntrean_3002 = antrean_3002;
        this.next_3002 = null;
    }

    public String getNamaPemilik_3002() { return namaPemilik_3002; }
    public String getJenisKendaraan_3002() { return jenisKendaraan_3002; }
    public int getNomorAntrean_3002() { return nomorAntrean_3002; }
    public Kendaraan_2511533002 getNext_3002() { return next_3002; }

    public void setNamaPemilik_3002(String nama_3002) { this.namaPemilik_3002 = nama_3002; }
    public void setJenisKendaraan_3002(String jenis_3002) { this.jenisKendaraan_3002 = jenis_3002; }
    public void setNomorAntrean_3002(int antrean_3002) { this.nomorAntrean_3002 = antrean_3002; }
    public void setNext_3002(Kendaraan_2511533002 next_3002) { this.next_3002 = next_3002; }//
}