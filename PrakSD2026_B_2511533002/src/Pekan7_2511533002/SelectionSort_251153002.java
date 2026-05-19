package Pekan7_2511533002;

public class SelectionSort_251153002 {
    
    public static void selectionSort_3002(int[] arr_3002) {
        int n_3002 = arr_3002.length;
        for (int i_3002 = 0; i_3002 < n_3002; i_3002++) {
            int minIndex_3002 = i_3002;
            for (int j_3002 = i_3002 + 1; j_3002 < n_3002; j_3002++) {
                if (arr_3002[j_3002] < arr_3002[minIndex_3002]) {
                    minIndex_3002 = j_3002;
                }
            }
            int temp_3002 = arr_3002[i_3002];
            arr_3002[i_3002] = arr_3002[minIndex_3002];
            arr_3002[minIndex_3002] = temp_3002;
        }
    }

    public static void main(String[] args_3002) {
        int arr_3002[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3002 = arr_3002.length;
        
        System.out.printf("array yang belum terurut:\n");
        for (int i_3002 = 0; i_3002 < n_3002; i_3002++) {
            System.out.print(arr_3002[i_3002] + " ");
        }
        System.out.println("");
        
        selectionSort_3002(arr_3002);
        
        System.out.printf("array yang terurut:\n");
        for (int i_3002 = 0; i_3002 < n_3002; i_3002++) {
            System.out.print(arr_3002[i_3002] + " ");
        }
        System.out.println("");
    }
}
