package Pekan6_2511533002;
public class PenelusuranDLL_2511533002 {
	// fungsi penelusuran maju
		static void forwardTraversal_2511533002(NodeDLL_2511533002 head_3002) {
			// memulai penelusuran dari head
			NodeDLL_2511533002 curr_3002 = head_3002;
			// lanjutkan sampai akhir
			while (curr_3002 != null) {
				// print data
				System.out.print(curr_3002.data_3002 + " <-> ");
				// pindah ke node berikutnya
				curr_3002 = curr_3002.next_3002;
			}
			//print spasi
			System.out.println();
		}
		//fungsi penelusuran mundur
		static void backwardTraversal_2511533002(NodeDLL_2511533002 tail_3002) {
			// memulai penelusuran dari head
			NodeDLL_2511533002 curr_3002 = tail_3002;
			// lanjutkan sampai akhir
			while (curr_3002 != null) {
				// print data
				System.out.print(curr_3002.data_3002 + " <-> ");
				// pindah ke node berikutnya
				curr_3002 = curr_3002.prev_3002;
			}
			//print spasi
			System.out.println();
		}

		public static void main(String[] args) {
			//cetak DLL
			NodeDLL_2511533002 head_3002 = new NodeDLL_2511533002(1);
			NodeDLL_2511533002 second_3002 = new NodeDLL_2511533002(2);
			NodeDLL_2511533002 third_3002 = new NodeDLL_2511533002(3);
			
			head_3002.next_3002 = second_3002;
			second_3002.prev_3002 = head_3002;
			second_3002.next_3002 = third_3002;
			third_3002.prev_3002 = second_3002;
			
			System.out.println("Penelusuran maju : ");
			forwardTraversal_2511533002(head_3002);
			
			System.out.println("Penelusuran mundur : ");
			backwardTraversal_2511533002(third_3002);
		}//
}
