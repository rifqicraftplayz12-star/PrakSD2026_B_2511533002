package Pekan2_2511533002;

import java.util.ArrayList;

public class ArrayList1_2511533002 {

	public static void main(String[] args) {
		//size of the arraylist
		int n = 5;
		//declaring the arraylist wint initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		//Appending new elements at the end  of the list
		for (int i = 1; i <= n; i++ )
		arrli.add(i);
		//printing element
		System.out.println(arrli);
		//remove element at index 3
		arrli.remove(3);
		//displaying at arraylist
		//after deletion
		System.out.println(arrli);
		//printing 9element one by one
		for (int i = 0; i < arrli.size(); i++)
		System.out.print(arrli.get(i) + " ");
	}

}
