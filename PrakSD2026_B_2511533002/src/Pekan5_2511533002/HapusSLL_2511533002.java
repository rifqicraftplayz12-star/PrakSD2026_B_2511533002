package Pekan5_2511533002;

public class HapusSLL_2511533002 {
// fungsi untuk menghapus head
	public static NodeSLL_2511533002 deletehead_3002(NodeSLL_2511533002 head_3002) {
		// jika sll kosong
		if (head_3002 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_3002 = head_3002.next_3002;
		//return ke head baru
		return head_3002;}
	
	
	// fungsi menghapus node terakhir sll
		public static NodeSLL_2511533002 removeLastNode_3002(NodeSLL_2511533002 head_3002) {
			//jika list kosong, return null
			if (head_3002 == null) {
				return null;
			}
			// jika list satu node, hapus node dan return null
			if (head_3002.next_3002 == null) {
				return null;
			}
			
			// temukan node terakhir ke dua
			NodeSLL_2511533002 secondLast_3002= head_3002;
			while (secondLast_3002.next_3002.next_3002 != null) {
				secondLast_3002 = secondLast_3002.next_3002;
			}
			//hapus node terakhir
			secondLast_3002.next_3002 = null;
			return head_3002;}
		
			// fungsi menghapus node di posisi tertentu
			public static NodeSLL_2511533002 deleteNode_3002(NodeSLL_2511533002 head_3002, int position_3002) {
			    NodeSLL_2511533002 temp_3002 = head_3002;
			    NodeSLL_2511533002 prev = null;

			    // jika linked list null
			    if (temp_3002 == null) {
			        return head_3002;
			    }

			    // kasus 1: head dihapus
			    if (position_3002 == 1) {
			        head_3002 = temp_3002.next_3002;
			        return head_3002;
			    }

			    // kasus 2: menghapus node di tengah
			    // telusuri ke node yang dihapus
			    for (int i = 1; temp_3002 != null && i < position_3002; i++) {
			        prev = temp_3002;
			        temp_3002 = temp_3002.next_3002;
			    }

			    // jika ditemukan, hapus node
			    if (temp_3002 != null) {
			        prev.next_3002 = temp_3002.next_3002;
			    } else {
			        System.out.println("Data tidak ada");
			    }

			    return head_3002;
			}

			// fungsi mencetak SLL
			public static void printList_3002(NodeSLL_2511533002 head_3002) {
			    NodeSLL_2511533002 curr_3002 = head_3002;
			    while (curr_3002 != null && curr_3002.next_3002 != null) {
			        System.out.print(curr_3002.data_3002 + " -> ");
			        curr_3002 = curr_3002.next_3002;
			    }
			    
			    if (curr_3002 != null) {
			        System.out.print(curr_3002.data_3002);
			    }
			    System.out.println();
		}
			public static void main(String[] args) {
				NodeSLL_2511533002 head_3002 = new NodeSLL_2511533002(1);
				head_3002.next_3002 = new NodeSLL_2511533002(2);
				head_3002.next_3002.next_3002 = new NodeSLL_2511533002(3);
				head_3002.next_3002.next_3002.next_3002 = new NodeSLL_2511533002(4);
				head_3002.next_3002.next_3002.next_3002.next_3002 = new NodeSLL_2511533002(5);
				
				System.out.println("List awal :");
				printList_3002(head_3002);
				
				head_3002 = deletehead_3002(head_3002);
				System.out.println("List setelah head di hapus: ");
				printList_3002(head_3002);
				
				int position_3002 = 2;
				head_3002 = deleteNode_3002(head_3002, position_3002);
				System.out.println("List setelah node 2 di hapus : ");
				printList_3002(head_3002);
			}
	}

