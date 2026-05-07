package Pekan4_2511533002;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533002 {
	public static void main(String[] args) {
		Queue<Integer> q_3002 = new LinkedList<Integer> ();
		q_3002.add(1);
		q_3002.add(2);
		q_3002.add(3);
		System.out.println("Sebelum reverse " + q_3002 );
		Stack<Integer> s_3002 = new Stack<Integer> () ;
		while (!q_3002.isEmpty()) {
			s_3002.push(q_3002.remove() );
		}
		while (!s_3002.isEmpty()) {
			q_3002.add(s_3002.pop());
		}
		
		
		System.out.println("data sesudah di reverse " + q_3002);
	}

}