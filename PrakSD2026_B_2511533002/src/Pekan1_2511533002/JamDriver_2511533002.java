package Pekan1_2511533002;

public class JamDriver_2511533002 {

	public static void main(String[] args) {
		Jam_2511533002 a = new Jam_2511533002(23, 59, 50);
		Jam_2511533002 b = new Jam_2511533002(0, 0, 15);
		System.out.println("a        = "+a);
		System.out.println("b        = "+b);
		System.out.println("a+b      ="+a.plus(b));
		System.out.println("next 20s = "+a.nextNSeconds(20));
		System.out.println("durasi (a,b)       = "+Jam_2511533002.durasiDetik(a, b));
		
	}

}
