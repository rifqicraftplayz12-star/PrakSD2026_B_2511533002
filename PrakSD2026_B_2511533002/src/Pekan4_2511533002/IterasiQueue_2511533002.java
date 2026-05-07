package Pekan4_2511533002;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class IterasiQueue_2511533002 {
	public static void main(String[] args) {
		
		Queue<String> q_3002 = new LinkedList<> () ;
		
		q_3002.add("Praktikum");
		q_3002.add("Struktur");
		q_3002.add("Data");
		q_3002.add("Dan");
		q_3002.add("Algoritma");
		Iterator<String> iterator = q_3002.iterator() ;
		while ( iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}