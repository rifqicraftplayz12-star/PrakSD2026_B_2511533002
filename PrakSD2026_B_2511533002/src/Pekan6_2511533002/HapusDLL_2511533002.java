package Pekan6_2511533002;
public class HapusDLL_2511533002 {
	//fungsi menghapus DLL
	public static NodeDLL_2511533002 delHead_2511533002(NodeDLL_2511533002 head_3002) {
		if (head_3002 == null) {
			return null;
		}
		head_3002 = head_3002.next_3002;
		if (head_3002 != null) {
			head_3002.prev_3002 = null;
		}
		return head_3002;
	}
	//fungsi menghapus di akhir
	public static NodeDLL_2511533002 delLast_2511533002(NodeDLL_2511533002 head_3002) {
		if (head_3002 == null) {
			return null;
		}
		if (head_3002.next_3002 == null) {
			return null;
		}
		NodeDLL_2511533002 curr_3002 = head_3002;
		while (curr_3002.next_3002 != null) {
			curr_3002 = curr_3002.next_3002;
		}
		// update pointer previous node
		if (curr_3002.prev_3002 != null) {
			curr_3002.prev_3002.next_3002 = null;
		}
		return head_3002;
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeDLL_2511533002 delPos_2511533002(NodeDLL_2511533002 head_3002, int pos_3002) {
		//jika DLL kosong
		if (head_3002 == null) {
			return head_3002;
		}
		NodeDLL_2511533002 curr_3002 = head_3002;
		//telusuri sampai ke node yang akan di hapus
		for (int i = 1; curr_3002 != null && i < pos_3002; ++i) {
			curr_3002 = curr_3002.next_3002;
		}
		//jika posisi tidak ditemukan
		if (curr_3002 == null) {
			return head_3002;
		}
		//update pointer
		if (curr_3002.prev_3002 != null) {
			curr_3002.prev_3002.next_3002 = curr_3002.next_3002;
		}
		if (curr_3002.next_3002 != null) {
			curr_3002.next_3002.prev_3002 = curr_3002.prev_3002;
		}
		//jika yang dihapus head
		if (head_3002 == curr_3002) {
			head_3002 = curr_3002.next_3002;
		}
		return head_3002;
	}
	//fungsi mencetak DLL	
	public static void printList_2511533002(NodeDLL_2511533002 head_3002) {
		NodeDLL_2511533002 curr_3002 = head_3002;
		while (curr_3002 != null) {
			System.out.print(curr_3002.data_3002 + " ");
			curr_3002 = curr_3002.next_3002;
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		//buat sebuah DLL
		NodeDLL_2511533002 head_3002 = new NodeDLL_2511533002(1);
		head_3002.next_3002 = new NodeDLL_2511533002(2);
		head_3002.next_3002.prev_3002 = head_3002;
		
		head_3002.next_3002.next_3002 = new NodeDLL_2511533002(3);
		head_3002.next_3002.next_3002.prev_3002 = head_3002.next_3002;
		
		head_3002.next_3002.next_3002.next_3002 = new NodeDLL_2511533002(4);
		head_3002.next_3002.next_3002.next_3002.prev_3002 = head_3002.next_3002.next_3002;
		
		head_3002.next_3002.next_3002.next_3002.next_3002 = new NodeDLL_2511533002(5);
		head_3002.next_3002.next_3002.next_3002.next_3002.prev_3002 = head_3002.next_3002.next_3002.next_3002;
		
		System.out.print("DLL awal : ");
		printList_2511533002(head_3002);
		
		System.out.print("Setelah head di hapus : ");
		head_3002 = delHead_2511533002(head_3002);
		printList_2511533002(head_3002);
		
		System.out.print("Setelah node terakhir di hapus : ");
		head_3002 = delLast_2511533002(head_3002);
		printList_2511533002(head_3002);
		
		System.out.print("Menghapus node ke 2 : ");
		head_3002 = delPos_2511533002(head_3002, 2);
		
		printList_2511533002(head_3002);
	}//
}
