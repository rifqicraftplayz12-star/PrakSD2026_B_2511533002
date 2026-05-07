package Pekan3_2511533002;
import java.util.Stack;

public class NilaiMaksimum_2511533002 {
	public static int max(Stack<Integer>s) {
		Stack<Integer> backup = new Stack<Integer>();
		int Maxvalue = s.pop();
		backup.push(Maxvalue);
		while (!s.isEmpty()) {
			int next = s.pop();
			backup.push(next);
			Maxvalue = Math.max(Maxvalue, next);
		}
		while (!backup.isEmpty()) {
			s.push(backup.pop());
		}
		return Maxvalue;
	}
	public static void main(String[] Args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("Isi stack "+s);
		System.out.println("Stack teratas "+s.peek());
		System.out.println("Nilai maksimum "+max(s));
	}
}
