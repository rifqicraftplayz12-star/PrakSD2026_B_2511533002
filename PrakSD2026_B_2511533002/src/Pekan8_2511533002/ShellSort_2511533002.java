package Pekan8_2511533002;

public class ShellSort_2511533002 {
	public static void shellSort_3002(int[] A) {
		int n_3002 = A.length;
		int gap_3002 = n_3002 / 2;
		while (gap_3002 > 0) {
			for (int i_3002 = gap_3002; i_3002 < n_3002; i_3002++) {
				int temp_3002 = A[i_3002];
				int j_3002 = i_3002;
				while (j_3002 >= gap_3002 && A[j_3002 - gap_3002] > temp_3002) {
					A[j_3002] = A[j_3002 - gap_3002];
					j_3002 = j_3002 - gap_3002;
				}
				A[j_3002] = temp_3002;
			}
			gap_3002 = gap_3002 / 2;
		}
	}
	
	public static void main(String[] args) {
		int[] data_3002 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_3002(data_3002);
		
		shellSort_3002(data_3002);
		System.out.print("Sesudah (Shell Sort): ");
		printArray_3002(data_3002);
	}
	
	public static void printArray_3002(int[] arr_3002) {
		for (int i : arr_3002) System.out.print(i + " ");
		System.out.println();
	}
}
