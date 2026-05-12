package Pekan6_2511533002;
public class InsertDLL_2511533002 {
	// menambahkan node di awal DLL
	static NodeDLL_2511533002 InsertBegin_2511533002(NodeDLL_2511533002 head_3002, int data_3002) {
		// buat node baru
		NodeDLL_2511533002 new_node_3002 = new NodeDLL_2511533002(data_3002);
		// jadikan pointer nextnya head
		new_node_3002.next_3002 = head_3002;
		// jadikan pointer prev head ke new node
		if (head_3002 != null) {
			head_3002.prev_3002 = new_node_3002;
		}
		return new_node_3002;
	}
	// fungsi menambah node di akhir
public static NodeDLL_2511533002 InsertEnd_2511533002(NodeDLL_2511533002 head_3002, int newData_3002) {
	// buat node baru
	NodeDLL_2511533002 newNode_3002 = new NodeDLL_2511533002(newData_3002);
	// jika DLL null jadikan head
	if (head_3002 == null) {
		head_3002 = newNode_3002;
	}
	else {
		NodeDLL_2511533002 curr_3002 = head_3002;
		while (curr_3002.next_3002 != null) {
			curr_3002 = curr_3002.next_3002;
		}
		curr_3002.next_3002 = newNode_3002;
		newNode_3002.prev_3002 = curr_3002;
	}
	return head_3002;
}
// fungsi menambah node di posisi tertentu
public static NodeDLL_2511533002 InsertAtPosition_2511533002(NodeDLL_2511533002 head_3002, int pos_3002, int new_data_3002) {
	// buat node baru
	NodeDLL_2511533002 new_node_3002 = new NodeDLL_2511533002(new_data_3002);
	if (pos_3002 == 1) {
		new_node_3002.next_3002 = head_3002;
		if (head_3002 != null) {
			head_3002.prev_3002 = new_node_3002;
		}
		head_3002 = new_node_3002;
		return head_3002;
	}
	NodeDLL_2511533002 curr_3002 = head_3002;
	for (int i = 1; i < pos_3002 - 1 && curr_3002 != null; ++i);
		curr_3002 = curr_3002.next_3002;
		if (curr_3002 == null) {
			System.out.print("Posisi tidak ada");
			return head_3002;
		}
		new_node_3002.prev_3002 = curr_3002;
		new_node_3002.next_3002 = curr_3002.next_3002;
		curr_3002.next_3002 = new_node_3002;
		if (new_node_3002.next_3002 != null) {
			new_node_3002.next_3002.prev_3002 = new_node_3002;
		}
		return head_3002;
		}
public static void printList_2511533002(NodeDLL_2511533002 head_3002) {
	NodeDLL_2511533002 curr_3002 = head_3002;
	while (curr_3002 != null) {
		System.out.print(curr_3002.data_3002 + " <-> ");
		curr_3002 = curr_3002.next_3002;
	}
	System.out.println();
}
public static void main(String[] args) {
	// membuat DLL 2 <-> 3 <-> 5
	NodeDLL_2511533002 head_3002 = new NodeDLL_2511533002(2);
	head_3002.next_3002 = new NodeDLL_2511533002(3);
	head_3002.next_3002.prev_3002 = head_3002;
	head_3002.next_3002.next_3002 = new NodeDLL_2511533002(5);
	head_3002.next_3002.next_3002.prev_3002 = head_3002.next_3002;
	// cetal DLL awal
	System.out.print("DLL awal : ");
	printList_2511533002(head_3002);
	// tambah 1 di awal
	head_3002 = InsertBegin_2511533002(head_3002, 1);
	System.out.print("Simpul 1 di tambah di awal :");
	printList_2511533002(head_3002);
	// tambah 6 di akhir
	System.out.print("Simpul 6 di tambah di akhir");
	int data_3002 = 6;
	head_3002 = InsertEnd_2511533002(head_3002, data_3002);
	printList_2511533002(head_3002);
	//menambahkan node 4 di posisi 4
	System.out.print("Tambah node 4 di posisi 4 : ");
	int data2_3002 = 4;
	int pos_3002 = 4;
	head_3002 = InsertAtPosition_2511533002(head_3002, pos_3002, data2_3002);
	printList_2511533002(head_3002);
}
}//

