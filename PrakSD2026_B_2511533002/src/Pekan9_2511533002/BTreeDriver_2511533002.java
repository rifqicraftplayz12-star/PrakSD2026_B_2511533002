package Pekan9_2511533002;
public class BTreeDriver_2511533002 {
	public static void main (String [] args) {
		//membuat pohon
		BTree_2511533002 tree_3002 = new BTree_2511533002 ();
		System.out.print("Jumlah Simpul Awal Pohon : ");
		System.out.println(tree_3002.countNodes_3002());
		
		//menambahkan simpul data 1
		Node_2511533002 root_3002 = new Node_2511533002 (1);
		
		//menjadikan simpul 1 sebagao root
		tree_3002.setRoot_3002(root_3002);
		System.out.print("Jumlah simpul jika hanya ada root :");
		System.out.println(tree_3002.countNodes_3002());
		Node_2511533002 node2_3002 = new Node_2511533002 (2);
		Node_2511533002 node3_3002 = new Node_2511533002 (3);
		Node_2511533002 node4_3002 = new Node_2511533002 (4);
		Node_2511533002 node5_3002 = new Node_2511533002 (5);
		Node_2511533002 node6_3002 = new Node_2511533002 (6);
		Node_2511533002 node7_3002 = new Node_2511533002 (7);
		Node_2511533002 node8_3002 = new Node_2511533002 (8);
		Node_2511533002 node9_3002 = new Node_2511533002 (9);
		
		root_3002.setLeft_3002(node2_3002);
		node2_3002.setLeft_3002(node4_3002);
		node2_3002.setRight_3002(node5_3002);
		node4_3002.setRight_3002(node8_3002);
		root_3002.setRight_3002(node3_3002);
		node3_3002.setLeft_3002(node6_3002);
		node3_3002.setRight_3002(node7_3002);
		node6_3002.setLeft_3002(node9_3002);
		
		//Set root
		tree_3002.setCurrent_3002(tree_3002.getRoot_3002());
		System.out.println("menampilkan simpul terakhir: ");
		System.out.println(tree_3002.getCurrent_3002().getData_3002());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_3002.countNodes_3002());
		System.out.println("InOrder: ");
		tree_3002.printInorder_3002();
		System.out.println("\nPreOrder: ");
		tree_3002.printPreorder_3002();
		System.out.println("\nPostOrder: ");
		tree_3002.printPostorder_3002();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_3002.print_3002();
	}
}