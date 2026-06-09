package Pekan9_2511533002;
public class BTree_2511533002 {
	private Node_2511533002 root_3002;
	private Node_2511533002 currentNode_3002;
	public BTree_2511533002 () {
		root_3002 = null;
	}
	
	public boolean search_3002 (int data_3002) {
		return search_3002 (root_3002, data_3002);
	}
	
	private boolean search_3002 (Node_2511533002 node_3002 , int data_3002) {
		if (node_3002.getData_3002() == data_3002)
			return true;
		if(node_3002.getLeft_3002() != null)
			if (search_3002(node_3002.getLeft_3002(),data_3002))
				return true;
		if(node_3002.getRight_3002() != null)
			if (search_3002(node_3002.getRight_3002(),data_3002))
				return true;
		return false;
	}
	
	public void printInorder_3002 () {
		root_3002.printInorder_3002(root_3002);
	}
	
	public void printPreorder_3002 () {
		root_3002.printPreorder_3002(root_3002);
	}
	
	public void printPostorder_3002 () {
		root_3002.printPostorder_3002(root_3002);
	}
	
	public Node_2511533002 getRoot_3002 () {
		return root_3002;
	}
	
	public boolean isEmpty_3002 () {
		return root_3002 == null;
	}
	
	public int countNodes_3002 () {
		return countNodes_3002 (root_3002);
	}
	
	private int countNodes_3002 (Node_2511533002 node_3002) {
		int count_3002 = 1;
		if (node_3002 == null){
			return 0;
		} else {
			count_3002 += countNodes_3002 (node_3002.getLeft_3002());
			count_3002 += countNodes_3002 (node_3002.getRight_3002());
			return count_3002;
		}
	}
	
	public void print_3002 () {
		root_3002.print_3002();
	}
	
	public Node_2511533002 getCurrent_3002 () {
		return currentNode_3002;
	}
	
	public Node_2511533002 setCurrent_3002 (Node_2511533002 node_3002) {
		return currentNode_3002 = node_3002;
	}
	
	public void setRoot_3002 (Node_2511533002 root_3002) {
		this.root_3002 = root_3002;
	}
}