package Pekan3_2511533002;

public class StackArrayDriver_2511533002 {
	public static void main(String[] Args) {
		StackArray_2511533002 s = new StackArray_2511533002();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " dikeluarkan dari stack");
		System.out.println("elemen teratas adalah : "+ s.peek());
		System.out.println("elemen pada stack : ");
		s.print();
	}
}
