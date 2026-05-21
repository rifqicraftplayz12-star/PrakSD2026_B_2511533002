package Pekan7_2511533002;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class MahasiswaSort_2511533002 {

    public static String getListNama_3002(ArrayList<Mahasiswa_2511533002> list_3002) {
        StringBuilder sb_3002 = new StringBuilder("[");
        for (int i_3002 = 0; i_3002 < list_3002.size(); i_3002++) {
            sb_3002.append(list_3002.get(i_3002).getNama_3002());
            if (i_3002 < list_3002.size() - 1) sb_3002.append(", ");
        }
        sb_3002.append("]");
        return sb_3002.toString();
    }

    public static void insertionSort_3002(ArrayList<Mahasiswa_2511533002> arr_3002, JTextArea areaProses_3002) {
        for (int i_3002 = 1; i_3002 < arr_3002.size(); i_3002++) {
            Mahasiswa_2511533002 key_3002 = arr_3002.get(i_3002);
            int j_3002 = i_3002 - 1;

            while (j_3002 >= 0 && arr_3002.get(j_3002).getNama_3002().compareToIgnoreCase(key_3002.getNama_3002()) > 0) {
                arr_3002.set(j_3002 + 1, arr_3002.get(j_3002));
                j_3002--;
            }
            arr_3002.set(j_3002 + 1, key_3002);
            areaProses_3002.append("Langkah " + i_3002 + ": " + getListNama_3002(arr_3002) + "\n");
        }
    }

    public static void selectionSort_3002(ArrayList<Mahasiswa_2511533002> arr_3002, JTextArea areaProses_3002) {
        for (int i_3002 = 0; i_3002 < arr_3002.size() - 1; i_3002++) {
            int minIdx_3002 = i_3002;
            for (int j_3002 = i_3002 + 1; j_3002 < arr_3002.size(); j_3002++) {
                if (arr_3002.get(j_3002).getNama_3002().compareToIgnoreCase(arr_3002.get(minIdx_3002).getNama_3002()) < 0) {
                    minIdx_3002 = j_3002;
                }
            }

            Mahasiswa_2511533002 temp_3002 = arr_3002.get(minIdx_3002);
            arr_3002.set(minIdx_3002, arr_3002.get(i_3002));
            arr_3002.set(i_3002, temp_3002);
            
            areaProses_3002.append("Pass " + (i_3002 + 1) + ": " + getListNama_3002(arr_3002) + "\n");
        }
    }

    public static void bubbleSort_3002(ArrayList<Mahasiswa_2511533002> arr_3002, JTextArea areaProses_3002) {
        for (int i_3002 = 0; i_3002 < arr_3002.size() - 1; i_3002++) {
            boolean swapped_3002 = false;
            for (int j_3002 = 0; j_3002 < arr_3002.size() - i_3002 - 1; j_3002++) {
                if (arr_3002.get(j_3002).getNama_3002().compareToIgnoreCase(arr_3002.get(j_3002 + 1).getNama_3002()) > 0) {
                    // Swap
                    Mahasiswa_2511533002 temp_3002 = arr_3002.get(j_3002);
                    arr_3002.set(j_3002, arr_3002.get(j_3002 + 1));
                    arr_3002.set(j_3002 + 1, temp_3002);
                    swapped_3002 = true;
                }
            }
            areaProses_3002.append("Pass " + (i_3002 + 1) + ": " + getListNama_3002(arr_3002) + "\n");
            if (!swapped_3002) break; 
        }
    }
}