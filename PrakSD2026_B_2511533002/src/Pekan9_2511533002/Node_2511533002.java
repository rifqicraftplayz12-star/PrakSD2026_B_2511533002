package Pekan9_2511533002;
public class Node_2511533002 {
	int data_3002;// bisa diganti dengan string 
	Node_2511533002 left_3002;
	Node_2511533002 right_3002;
	
	public Node_2511533002 (int data_3002) {
		this.data_3002= data_3002;
		left_3002 = null;
		right_3002 = null;
		}
	public void setLeft_3002 (Node_2511533002 node_3002) {
		if (left_3002 == null)
			left_3002 = node_3002;
	}
	public void setRight_3002 (Node_2511533002 node_3002) {
		if (right_3002 == null)
			right_3002 = node_3002;
	}
	public Node_2511533002 getLeft_3002 () {
		return left_3002;
	}
	public Node_2511533002 getRight_3002 () {
		return right_3002;
	}
	public int getData_3002 () { 
		return data_3002;
	}
	public void setData_3002 (int data_3002) {
		this.data_3002 = data_3002;
	}
	
	void printPreorder_3002 (Node_2511533002 node_3002) {
		if (node_3002 ==null)
		return ;
		System.out.print(node_3002.data_3002 + " ");
		printPreorder_3002 (node_3002.left_3002);
		printPreorder_3002 (node_3002.right_3002);
	}
	
	void printPostorder_3002 (Node_2511533002 node_3002) {
		if (node_3002 ==null)
		return ;
		printPostorder_3002 (node_3002.left_3002);
		printPostorder_3002 (node_3002.right_3002);
		System.out.print(node_3002.data_3002 + " ");
	}
	
	void printInorder_3002 (Node_2511533002 node_3002) {
		if (node_3002 ==null)
		return ;
		printInorder_3002 (node_3002.left_3002);
		System.out.print(node_3002.data_3002 + " ");
		printInorder_3002 (node_3002.right_3002);
	}
	
	public String print_3002() {
		return this.print_3002("",true,"");
	}
	
	public String print_3002(String prefix_3002, boolean isTail_3002, String sb_3002) {
		if (right_3002 !=null) {
			right_3002.print_3002(prefix_3002 + (isTail_3002 ? "|   " : "   "), false,sb_3002);
		}
		System.out.println(prefix_3002 + (isTail_3002 ? "\\--" : "/--") + data_3002);
		if (left_3002 !=null) {
			left_3002.print_3002(prefix_3002 + (isTail_3002 ? "   " : "|   "), true, sb_3002);
		}
		return sb_3002;
	}
}