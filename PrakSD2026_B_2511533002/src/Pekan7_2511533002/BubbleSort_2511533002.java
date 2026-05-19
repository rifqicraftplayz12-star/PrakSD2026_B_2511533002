package Pekan7_2511533002;

public class BubbleSort_2511533002 {
	    
	    public static void bubbleSort_3002(int[] arr_3002) {
	        int n_3002 = arr_3002.length;
	        for (int i_3002 = 0; i_3002 < n_3002; i_3002++) {
	            for (int j_3002 = 0; j_3002 < n_3002 - i_3002 - 1; j_3002++) {
	                if (arr_3002[j_3002] > arr_3002[j_3002 + 1]) {
	                    int temp_3002 = arr_3002[j_3002];
	                    arr_3002[j_3002] = arr_3002[j_3002 + 1];
	                    arr_3002[j_3002 + 1] = temp_3002;
	                    // System.out.println("data:"+arr_3002[j_3002]+" "+arr_3002[j_3002+1]);
	                }
	            }
	        }
	    }

	    public static void main(String[] args_3002) {
	        int arr_3002[] = { 23, 78, 45, 8, 32, 56, 1 };
	        int n_3002 = arr_3002.length;
	        
	        System.out.print("array yang belum terurut:");
	        for (int i_3002 = 0; i_3002 < n_3002; i_3002++) {
	            System.out.print(arr_3002[i_3002] + " ");
	        }
	        System.out.println("");
	        
	        bubbleSort_3002(arr_3002);
	        
	        System.out.print("array yang terurut menggunakan BubleSort:");
	        for (int i_3002 = 0; i_3002 < n_3002; i_3002++) {
	            System.out.print(arr_3002[i_3002] + " ");
	        }
	        System.out.println("");
	    }
	}
