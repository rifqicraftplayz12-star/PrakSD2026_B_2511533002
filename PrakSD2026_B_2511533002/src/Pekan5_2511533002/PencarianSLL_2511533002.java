package Pekan5_2511533002;

public class PencarianSLL_2511533002 {
	static boolean searchKey_3002(NodeSLL_2511533002 head_3002, int key_3002) {
		NodeSLL_2511533002 curr_3002 = head_3002;
		while (curr_3002 != null) {
			if (curr_3002.data_3002 == key_3002)
				return true;
			curr_3002 = curr_3002.next_3002; }
			return false; }
		public static void traversal_3002(NodeSLL_2511533002 head_3002) {
			// mulai dari head
			NodeSLL_2511533002 curr_3002 = head_3002;
			//telusuri sampai pointer null
			while (curr_3002 != null) {
				System.out.print(" " + curr_3002.data_3002);
				curr_3002 = curr_3002.next_3002; }
			System.out.println(false); }
			public static void main(String[] Args) {
				NodeSLL_2511533002 head_3002 = new NodeSLL_2511533002(14);
				head_3002.next_3002 = new NodeSLL_2511533002(21);
				head_3002.next_3002.next_3002 = new NodeSLL_2511533002(13);
				head_3002.next_3002.next_3002.next_3002 = new NodeSLL_2511533002(30);
				head_3002.next_3002.next_3002.next_3002.next_3002 = new NodeSLL_2511533002(10);
				System.out.print("Penelusuran SLL : ");
				traversal_3002(head_3002);
				// data yang akan di cari
				int key_3002 = 30;
				System.out.print("Cari data "+ key_3002+ " = ");
				if (searchKey_3002(head_3002, key_3002))
				System.out.print("Ketemu");
				else
					System.out.println("Tidak ada");
			}
		
}
