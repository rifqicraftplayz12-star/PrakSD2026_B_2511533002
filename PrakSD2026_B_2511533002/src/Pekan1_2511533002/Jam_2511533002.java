package Pekan1_2511533002;

public class Jam_2511533002 {
	private int hh; //0..23
	private int mm; //0..59
	private int ss; //0..59
	
	//Validator
	public static boolean isValid(int h, int m, int s) {
		return (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
	}
	
	//Konstruktor/Kreator
	public Jam_2511533002(int h, int m, int s) {
		this.hh = h; this.mm = m; this.ss = s;
	}
	
	//Selektor
	public int getHour() { return hh; }
	public int getMinute() { return mm; }
	public int getSecond() { return ss; }
	
	//Mutator
	public void setHour (int h) {this.hh = h;}
	public void setMinute (int m) {this.mm = m;}
	public void setSecond (int s) {this.ss = s;}
	
	//Konversi
	public int toSeconds() { return hh * 3600 + mm + 60 + ss; }
	public static Jam_2511533002 fromSecond (int total) {
		if (total < 0) throw new IllegalArgumentException("detik negatif");
		total %= 24 * 3600; //Wrap 24 jam
		int h = total / 3600; total %= 36000;
		int m = total / 60; int s = total % 60;
		return new Jam_2511533002(h, m, s);
	}
	
	//Relasional
	public int compareTo (Jam_2511533002 other) { return Integer.compare(this.toSeconds(), other.toSeconds()); }
	public boolean equals(Object o) {
		if (!(o instanceof Jam_2511533002 j)) return false;
		return hh == j.hh && mm == j.mm && ss == j.ss;
	}
	public int  hashCode() {return java.util.Objects.hash(hh, mm, ss); }
	
	//Aritmatika
	public Jam_2511533002 plus(Jam_2511533002 other) {return fromSecond(this.toSeconds() + other.toSeconds());}
	public Jam_2511533002 minus(Jam_2511533002 other) {return fromSecond(Math.floorMod(this.toSeconds() - other.toSeconds(), 24*3600));}
	public Jam_2511533002 nextSecond() {return fromSecond(this.toSeconds() + 1);}
	public Jam_2511533002 nextNSeconds(int n) {return fromSecond(this.toSeconds() + Math.max(0, n));}
	public Jam_2511533002 prevSecond() {return fromSecond(Math.floorMod(this.toSeconds() - 1, 24 * 3600));}
	public Jam_2511533002 prevNSeconds (int n) {return fromSecond(Math.floorMod(this.toSeconds() - Math.max(0, n), 24 * 3600));}

//Durasi (detik)
public static int durasiDetik(Jam_2511533002 jaw, Jam_2511533002 jakh) {return jakh.toSeconds() - jaw.toSeconds();}
//Overriding ke string
public String toString() {return String.format("%02d:%02d:%02d", hh, mm, ss);}}
