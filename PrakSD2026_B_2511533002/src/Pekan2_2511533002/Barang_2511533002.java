package Pekan2_2511533002;

public class Barang_2511533002 {
	    private String nama_3002;
	    private String kategori_3002;
	    private int stok_3002;

	    public Barang_2511533002(String namaBarang, String kategoriBarang, int jumlahStok) {
	        this.nama_3002 = namaBarang;
	        this.kategori_3002 = kategoriBarang;
	        this.stok_3002 = jumlahStok;
	    }

	    public String getNama_3002() { 
	        return nama_3002; 
	    }
	    public String getKategori_3002() { 
	        return kategori_3002; 
	    }
	    public int getStok_3002() { 
	        return stok_3002; 
	    }

	    public void setNama_3002(String nama) { 
	        this.nama_3002 = nama; 
	    }
	    public void setKategori_3002(String kategori) { 
	        this.kategori_3002 = kategori; 
	    }
	    public void setStok_3002(int stok) { 
	        this.stok_3002 = stok; 
	    }
}
