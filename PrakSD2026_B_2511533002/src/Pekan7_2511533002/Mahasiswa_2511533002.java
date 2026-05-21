package Pekan7_2511533002;

public class Mahasiswa_2511533002 {
    private String nama_3002;
    private String nim_3002;
    private String prodi_3002;

    public Mahasiswa_2511533002(String nama_3002, String nim_3002, String prodi_3002) {
        this.nama_3002 = nama_3002;
        this.nim_3002 = nim_3002;
        this.prodi_3002 = prodi_3002;
    }

    public String getNama_3002() { return nama_3002; }
    public void setNama_3002(String nama_3002) { this.nama_3002 = nama_3002; }

    public String getNim_3002() { return nim_3002; }
    public void setNim_3002(String nim_3002) { this.nim_3002 = nim_3002; }

    public String getProdi_3002() { return prodi_3002; }
    public void setProdi_3002(String prodi_3002) { this.prodi_3002 = prodi_3002; }

    @Override
    public String toString() {
        return nama_3002 + " | " + nim_3002 + " | " + prodi_3002;
    }
}