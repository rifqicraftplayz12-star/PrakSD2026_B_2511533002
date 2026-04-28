package Pekan4_2511533002;
import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511533002 {
	public static void main(String[] args) {
		
		Queue<Integer> q_3002 = new LinkedList<> ();
		// menambah elemen ke dalam antrian
		
		for(int i = 0 ; i < 6 ; i ++) 
			q_3002.add(i);
		
		// menampilkan ke dalam antrian 
		System.out.println("elemen antrian " + q_3002);
		//untuk menghapus kepala antrian 
		int hapus_1004 = q_3002.remove();
		System.out.println("elemen yang dihpaus " + hapus_1004);
		System.out.println(q_3002);
		//untuk melihat antrian di depan
		int depan = q_3002.peek();
		System.out.println("elemen terdepan " + depan);
		
		int banyak = q_3002.size();
		System.out.println("size antrian " + banyak);
		
	}

}