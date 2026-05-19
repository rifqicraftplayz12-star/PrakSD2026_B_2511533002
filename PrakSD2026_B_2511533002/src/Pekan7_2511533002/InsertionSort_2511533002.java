package Pekan7_2511533002;

public class InsertionSort_2511533002 {
    
    public static void insertionSort_3002(int[] arr_3002) {
        int n_3002 = arr_3002.length; // 'length' adalah bawaan Java, jadi tidak diubah
        for (int i_3002 = 1; i_3002 < n_3002; i_3002++) {
            int key_3002 = arr_3002[i_3002];
            int j_3002 = i_3002 - 1;
            
            while (j_3002 >= 0 && arr_3002[j_3002] > key_3002) {
                arr_3002[j_3002 + 1] = arr_3002[j_3002];
                j_3002--;
            }
            arr_3002[j_3002 + 1] = key_3002;
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
        
        insertionSort_3002(arr_3002);
        
        System.out.printf("array yang terurut:\n");
        for (int i_3002 = 0; i_3002 < n_3002; i_3002++) {
            System.out.print(arr_3002[i_3002] + " ");
        }
        System.out.println("");
    }
}