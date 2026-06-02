package Pekan8_2511533002;

public class QuickSort_2511533002 {
	    
	    static void swap(int[] arr_3002, int i_3002, int j_3002) {
	        int temp_3002 = arr_3002[i_3002];
	        arr_3002[i_3002] = arr_3002[j_3002];
	        arr_3002[j_3002] = temp_3002;
	    }

	    // Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	    static void medianOfThree(int[] arr_3002, int low_3002, int high_3002) {
	        int mid_3002 = low_3002 + (high_3002 - low_3002) / 2;

	        // Urutkan elemen low, mid, dan high
	        if (arr_3002[low_3002] > arr_3002[mid_3002]) {
	            swap(arr_3002, low_3002, mid_3002);
	        }
	        if (arr_3002[low_3002] > arr_3002[high_3002]) {
	            swap(arr_3002, low_3002, high_3002);
	        }
	        if (arr_3002[mid_3002] > arr_3002[high_3002]) {
	            swap(arr_3002, mid_3002, high_3002);
	        }
	        swap(arr_3002, mid_3002, high_3002);
	    }

	    static int partition(int[] arr_3002, int low_3002, int high_3002) {
	        // Panggil fungsi medianOfThree sebelum menentukan pivot
	        medianOfThree(arr_3002, low_3002, high_3002);

	        int pivot_3002 = arr_3002[high_3002]; // Sekarang arr[high] sudah berisi nilai median
	        int i_3002 = (low_3002 - 1);

	        for (int j_3002 = low_3002; j_3002 <= high_3002 - 1; j_3002++) {
	            // Jika elemen saat ini lebih kecil dari atau sama dengan pivot
	            if (arr_3002[j_3002] < pivot_3002) {
	                // Increment indeks elemen yang lebih kecil
	                i_3002++;
	                swap(arr_3002, i_3002, j_3002);
	            }
	        }
	        swap(arr_3002, i_3002 + 1, high_3002);
	        return (i_3002 + 1);
	    }
	    static void quickSort(int[] arr_3002, int low_3002, int high_3002)
	    {
	        if (low_3002 < high_3002) {
	            int pi_3002 = partition(arr_3002, low_3002, high_3002);
	            quickSort(arr_3002, low_3002, pi_3002 - 1);
	            quickSort(arr_3002, pi_3002 + 1, high_3002);
	        }
	    }

	    public static void printArr(int[] arr_3002)
	    {
	        for (int i_3002 = 0; i_3002 < arr_3002.length; i_3002++) {
	            System.out.print(arr_3002[i_3002] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args)
	    {
	        int[] arr_3002 = { 10, 7, 8, 9, 1, 5 };
	        int N_3002 = arr_3002.length;
	        System.out.print("Data sebelum diurutkan: ");
	        printArr(arr_3002);

	        quickSort(arr_3002, 0, N_3002 - 1);

	        System.out.print("Data Terurut quicksort: ");
	        printArr(arr_3002);
	    }
}
