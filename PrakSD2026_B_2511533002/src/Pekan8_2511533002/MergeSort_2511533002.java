package Pekan8_2511533002;

public class MergeSort_2511533002 {
	        void merge(int arr_3002[], int l_3002, int m_3002, int r_3002) {
	            // Find sizes of two subarrays to be merged
	            int n1_3002 = m_3002 - l_3002 + 1;
	            int n2_3002 = r_3002 - m_3002;

	            /* Create temp arrays */
	            int L_3002[] = new int[n1_3002];
	            int R_3002[] = new int[n2_3002];

	            /* Copy data to temp arrays */
	            for (int i_3002 = 0; i_3002 < n1_3002; ++i_3002)
	                L_3002[i_3002] = arr_3002[l_3002 + i_3002];
	            for (int j_3002 = 0; j_3002 < n2_3002; ++j_3002)
	                R_3002[j_3002] = arr_3002[m_3002 + 1 + j_3002];

	            int i_3002 = 0, j_3002 = 0;

	            // Initial index of merged subarray array
	            int k_3002 = l_3002;
	            while (i_3002 < n1_3002 && j_3002 < n2_3002) {
	                if (L_3002[i_3002] <= R_3002[j_3002]) {
	                    arr_3002[k_3002] = L_3002[i_3002];
	                    i_3002++;
	                }
	                else {
	                    arr_3002[k_3002] = R_3002[j_3002];
	                    j_3002++;
	                }
	                k_3002++;
	            }

	            /* Copy remaining elements of L[] if any */
	            while (i_3002 < n1_3002) {
	                arr_3002[k_3002] = L_3002[i_3002];
	                i_3002++;
	                k_3002++;
	            }

	            /* Copy remaining elements of R[] if any */
	            while (j_3002 < n2_3002) {
	                arr_3002[k_3002] = R_3002[j_3002];
	                j_3002++;
	                k_3002++;
	            }
	        }
	        void sort(int arr_3002[], int l_3002, int r_3002) {
	            if (l_3002 < r_3002) {
	                // Find the middle point
	                int m_3002 = (l_3002 + r_3002) / 2;
	                
	                // Sort first and second halves
	                sort(arr_3002, l_3002, m_3002);
	                sort(arr_3002, m_3002 + 1, r_3002);
	                
	                // Merge the sorted halves
	                merge(arr_3002, l_3002, m_3002, r_3002);
	            }
	        }

	        /* A utility function to print array of size n */
	        static void printArray(int arr_3002[]) {
	            int n_3002 = arr_3002.length;
	            for (int i_3002 = 0; i_3002 < n_3002; ++i_3002)
	                System.out.print(arr_3002[i_3002] + " ");
	            System.out.println();
	        }

	        public static void main(String args_3002[]) {
	            int arr_3002[] = { 12, 11, 13, 5, 6, 7 };
	            System.out.println("Sebelum terurut");
	            printArray(arr_3002);
	            MergeSort_2511533002 ob_3002 = new MergeSort_2511533002();
	            ob_3002.sort(arr_3002, 0, arr_3002.length - 1);
	            System.out.println("\nSesudah Terurut menggunakan merge Sort");
	            printArray(arr_3002);
	        }
}
