package Pekan5_2511533002;

public class TambahSLL_2511533002 {
	public static NodeSLL_2511533002 insertAtFront(NodeSLL_2511533002 head_3002, int value_3002) {
		NodeSLL_2511533002 new_node = new NodeSLL_2511533002(value_3002);
		new_node.next_3002 = head_3002;
		return new_node;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511533002 InsertAtEnd(NodeSLL_2511533002 head_3002, int value_3002) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511533002 newNode = new NodeSLL_2511533002(value_3002);
		// jika list kososng maka node menjadi head
		if (head_3002 == null) {
			return newNode;
		}
		// simpan head ke variabel sementara
		NodeSLL_2511533002 last = head_3002;
		// telusuri ke node akhir
		while (last.next_3002 != null) {
			last = last.next_3002;
		}
		// ubah pointer
		last.next_3002 = newNode;
		return head_3002;
	}
	static NodeSLL_2511533002 GetNode(int data_3002) {
		return new NodeSLL_2511533002(data_3002);
	}
	static NodeSLL_2511533002 InsertPos(NodeSLL_2511533002 headNode_3002, int position_3002, int value_3002) {
		NodeSLL_2511533002 head_3002 = headNode_3002;
		if (position_3002 < 1) 
			System.out.println("Invalid Position");
		if (position_3002 == 1) {
			NodeSLL_2511533002 new_node = new NodeSLL_2511533002(value_3002);
			new_node.next_3002 = head_3002;
			return new_node;
		}else {
			while (position_3002-- != 0) {
				if (position_3002 == 1) {
					NodeSLL_2511533002 newNode = GetNode(value_3002); 
					newNode.next_3002 = headNode_3002.next_3002; 
					headNode_3002.next_3002 = newNode;
					break;
				}
				headNode_3002 = headNode_3002.next_3002;
			}
			if (position_3002 != 1)
				System.out.print("Posisi di luar jangkauan");
		}
			return head_3002;
	}
		public static void printList_2511533002(NodeSLL_2511533002 head_3002) {
			NodeSLL_2511533002 curr_3002 = head_3002;
			while (curr_3002.next_3002 != null) {
				System.out.print(curr_3002.data_3002+"-->");
				curr_3002 = curr_3002.next_3002;
			}
			if (curr_3002.next_3002==null) {
				System.out.print(curr_3002.data_3002); }
				System.out.println();
			}
		
		public static void main(String[] args) {
				// buat LinkedList 2->3->5->6
				NodeSLL_2511533002 head_3002 = new NodeSLL_2511533002(2);
				head_3002.next_3002 = new NodeSLL_2511533002(3);
				head_3002.next_3002.next_3002 = new NodeSLL_2511533002(5);
				head_3002.next_3002.next_3002.next_3002 = new NodeSLL_2511533002(6);
				// cetak list asli
				System.out.print("Senarai berantai awal:");
				printList_2511533002(head_3002);
				// tambahkan node baru di belakang
				System.out.print("Tambah 1 simpul di belakang: ");
				int data2_3002 = 7;
				head_3002 = InsertAtEnd(head_3002, data2_3002);
				//cetak update list
				printList_2511533002(head_3002);
				System.out.print("Tambah 1 simpul ke data 4 : ");
				int data3_3002 = 4;
				int pos_3002 = 4;
				head_3002 = InsertPos(head_3002,pos_3002,data3_3002);
				//cetak update list
				printList_2511533002(head_3002);
			}
		}
		
	

