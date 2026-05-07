package Pekan3_2511533002;
import java.util.ArrayList;
class Siswa_2511533002 {
	String nama;
	int nim;
	
	public Siswa_2511533002(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "NIM : " + nim + ", Nama : " + nama;
	}
}
public class SiswaStack_2511533002 {
	private ArrayList<Siswa_2511533002> stack;
	
	public SiswaStack_2511533002() {
		stack = new ArrayList<>();
	}
	public void push(Siswa_2511533002 mhs) {
		stack.add(mhs);
	}
	public Siswa_2511533002 pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size()-1);
		}
		return null;
	}
	
	public Siswa_2511533002 peek() {
		if (!isEmpty()) {
			return stack.get(stack.size()-1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2511533002() {
		for (int i = stack.size()-1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String[] Args) {
		SiswaStack_2511533002 studentStack = new SiswaStack_2511533002();
		
		Siswa_2511533002 mhs1 = new Siswa_2511533002("Ali", 1);
		Siswa_2511533002 mhs2 = new Siswa_2511533002("Boby", 2);
		Siswa_2511533002 mhs3 = new Siswa_2511533002("Charles", 3);
		
		studentStack.push(mhs1);
		studentStack.push(mhs2);
		studentStack.push(mhs3);
		
		System.out.println("Siswa di dalam stack : ");
		studentStack.tampilkanSiswa_2511533002();
		
		System.out.println("Siswa teratas " + studentStack.peek());
		System.out.println("Mengeluarkan siswa teratas dari stack : " + studentStack.pop());
		System.out.println("Daftar siswa setelah di pop : ");
		studentStack.tampilkanSiswa_2511533002();
	}
}
