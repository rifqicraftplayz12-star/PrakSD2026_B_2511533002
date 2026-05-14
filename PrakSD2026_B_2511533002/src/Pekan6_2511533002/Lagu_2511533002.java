package Pekan6_2511533002;

public class Lagu_2511533002 {
    private String judul_3002;
    private String penyanyi_3002;

    public Lagu_2511533002 next_3002;
    public Lagu_2511533002 prev_3002;

    public Lagu_2511533002(String judul_3002, String penyanyi_3002) {
        this.judul_3002 = judul_3002;
        this.penyanyi_3002 = penyanyi_3002;
        this.next_3002 = null;
        this.prev_3002 = null;
    }

    public String getJudul_3002() {
        return judul_3002;
    }

    public String getPenyanyi_3002() {
        return penyanyi_3002;
    }

    public void setJudul_3002(String judul_3002) {
        this.judul_3002 = judul_3002;
    }

    public void setPenyanyi_3002(String penyanyi_3002) {
        this.penyanyi_3002 = penyanyi_3002;
    }
}