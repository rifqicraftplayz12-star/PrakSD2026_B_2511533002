package Pekan1_2511533002;

public class Mobil_2511533002 {
	    private String nama;
	    private int tahun;
	    private int cc;
	    private long harga;
	    private String merk;

	    // Constructor (Pembuat Objek)
	    public Mobil_2511533002(String nama, int tahun, int cc, long harga, String merk) {
	        this.nama = nama;
	        this.tahun = tahun;
	        this.cc = cc;
	        this.harga = harga;
	        this.merk = merk;
	    }
	    public String getNama() { return nama; }
	    public int getTahun() { return tahun; }
	    public int getCc() { return cc; }
	    public long getHarga() { return harga; }
	    public String getMerk() { return merk; }
	    public void setNama(String nama) { this.nama = nama; }
	    public void setTahun(int tahun) { this.tahun = tahun; }
	    public void setCc(int cc) { this.cc = cc; }
	    public void setHarga(long harga) { this.harga = harga; }
	    public void setMerk(String merk) { this.merk = merk; }
	    public void infoMobil() {
	        System.out.println(merk + " " + nama + " (" + tahun + ") - " + cc + "cc - Rp" + harga);
	    }
	
}