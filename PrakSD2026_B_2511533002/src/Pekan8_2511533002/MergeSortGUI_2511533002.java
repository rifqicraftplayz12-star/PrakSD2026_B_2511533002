package Pekan8_2511533002;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511533002 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3002;
    private JLabel[] labelArray_3002;
    private JButton stepButton_3002, resetButton_3002, setButton_3002;
    private JTextField inputField_3002;
    private JPanel panelArray_3002;
    private JTextArea stepArea_3002;
    
    // Mempertahankan i dan j tanpa akhiran sesuai permintaan sebelumnya
    private int i, j;
    
    // Variabel yang kurang ditambahkan di sini
    private boolean sorting_3002 = false;
    private int stepCount_3002 = 1;
    private Queue<int[]> mergeQueue_3002 = new LinkedList<>();
    private boolean isMerging_3002 = false;
    private boolean copying_3002 = false;
    private int left_3002, mid_3002, right_3002, k_3002;
    private int[] temp_3002;

    /**
     * Create the frame.
     */
    public MergeSortGUI_2511533002() {
        setTitle("Merge Sort Langkah per Langkah"); // Diubah agar sesuai
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputField_3002 = new JTextField(30);
        setButton_3002 = new JButton ("Set Array");
        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma) :"));
        inputPanel.add(inputField_3002);
        inputPanel.add(setButton_3002);

        panelArray_3002 = new JPanel();
        panelArray_3002.setLayout(new FlowLayout());
        JPanel controlPanel_3002 = new JPanel();
        stepButton_3002 = new JButton("Langkah Selanjutnya");
        resetButton_3002 = new JButton("Reset");
        stepButton_3002.setEnabled(false);
        controlPanel_3002.add(stepButton_3002);
        controlPanel_3002.add(resetButton_3002);
        stepArea_3002 = new JTextArea(8, 60);
        stepArea_3002.setEditable(false);
        stepArea_3002.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3002 = new JScrollPane(stepArea_3002);
        
        add(inputPanel, BorderLayout.NORTH);
        add(panelArray_3002, BorderLayout.CENTER);
        add(controlPanel_3002, BorderLayout.SOUTH);
        add(scrollPane_3002, BorderLayout.EAST);
        
        setButton_3002.addActionListener(e -> setArrayFromInput_3002());
        stepButton_3002.addActionListener(e -> performStep_3002());
        resetButton_3002.addActionListener(e -> reset_3002());
    }
    
    private void setArrayFromInput_3002() {
        String text_3002 = inputField_3002.getText().trim();
        if (text_3002.isEmpty()) return;
        String[] parts_3002 = text_3002.split(",");
        array_3002 = new int[parts_3002.length];
        try {
            for (int k = 0; k < parts_3002.length; k++) {
                array_3002[k] = Integer.parseInt(parts_3002[k].trim());
            }
        } catch (NumberFormatException e_3002) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        labelArray_3002 = new JLabel[array_3002.length];
        panelArray_3002.removeAll();
        for (int k = 0; k < array_3002.length; k++) {
            labelArray_3002[k] = new JLabel(String.valueOf(array_3002[k]));
            labelArray_3002[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3002[k].setOpaque(true);
            labelArray_3002[k].setBackground(Color.WHITE);
            labelArray_3002[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3002[k].setPreferredSize(new Dimension(50, 50));
            labelArray_3002[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3002.add(labelArray_3002[k]);
        }
        
        mergeQueue_3002.clear();
        generateMergeSteps_3002(0, array_3002.length - 1);
        stepButton_3002.setEnabled(true);
        stepArea_3002.setText("");
        stepCount_3002 = 1;
        isMerging_3002 = false;
        panelArray_3002.revalidate();
        panelArray_3002.repaint();
    }
    
    // Metode yang kurang ditambahkan untuk mencatat langkah-langkah merge sort ke antrean
    private void generateMergeSteps_3002(int l_3002, int r_3002) {
        if (l_3002 < r_3002) {
            int m_3002 = (l_3002 + r_3002) / 2;
            generateMergeSteps_3002(l_3002, m_3002);
            generateMergeSteps_3002(m_3002 + 1, r_3002);
            mergeQueue_3002.add(new int[]{l_3002, m_3002, r_3002});
        }
    }

    private void performStep_3002() {
        resetHighlights_3002();

        if (!isMerging_3002 && !mergeQueue_3002.isEmpty()) {
            int[] range_3002 = mergeQueue_3002.poll();
            left_3002 = range_3002[0];
            mid_3002 = range_3002[1];
            right_3002 = range_3002[2];
            temp_3002 = new int[right_3002 - left_3002 + 1];
            i = left_3002;
            j = mid_3002 + 1;
            k_3002 = 0;
            copying_3002 = false;
            isMerging_3002 = true;
            stepArea_3002.append("Langkah " + stepCount_3002++ + 
                    ": Mulai merge dari " + left_3002 + " ke " + right_3002 + "\n");
            return;
        }

        if (isMerging_3002 && !copying_3002) {
            if (i <= mid_3002 && j <= right_3002) {
                labelArray_3002[i].setBackground(Color.CYAN);
                labelArray_3002[j].setBackground(Color.CYAN);
                if (array_3002[i] <= array_3002[j]) {
                    temp_3002[k_3002++] = array_3002[i++];
                } else {
                    temp_3002[k_3002++] = array_3002[j++];
                }
                stepArea_3002.append("Langkah " + stepCount_3002++ + ": Bandingkan dan salin elemen\n");
                return;
            } else if (i <= mid_3002) {
                temp_3002[k_3002++] = array_3002[i++];
                stepArea_3002.append("Langkah " + stepCount_3002++ + ": Salin sisa kiri\n");
                return;
            } else if (j <= right_3002) {
                temp_3002[k_3002++] = array_3002[j++];
                stepArea_3002.append("Langkah " + stepCount_3002++ + ": Salin sisa kanan\n");
                return;
            } else {
                copying_3002 = true;
                k_3002 = 0;
                return;
            }
        }

        if (copying_3002 && k_3002 < temp_3002.length) {
            array_3002[left_3002 + k_3002] = temp_3002[k_3002];
            labelArray_3002[left_3002 + k_3002].setText(String.valueOf(temp_3002[k_3002]));
            labelArray_3002[left_3002 + k_3002].setBackground(Color.GREEN);
            k_3002++;
            stepArea_3002.append("Langkah " + stepCount_3002++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying_3002 && k_3002 == temp_3002.length) {
            isMerging_3002 = false;
            copying_3002 = false;
        }

        if (mergeQueue_3002.isEmpty() && !isMerging_3002) {
            stepArea_3002.append("Selesai.\n");
            stepButton_3002.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void updateLabels_3002() {
        for (int k_3002 = 0; k_3002 < array_3002.length; k_3002++) {
            labelArray_3002[k_3002].setText(String.valueOf(array_3002[k_3002]));
        }
    }

    private void resetHighlights_3002() {
        if (labelArray_3002 == null) return;
        for (JLabel label_3002 : labelArray_3002) {
            label_3002.setBackground(Color.WHITE);
        }
    }

    private void reset_3002() {
        inputField_3002.setText("");
        panelArray_3002.removeAll();
        panelArray_3002.revalidate();
        panelArray_3002.repaint();
        stepArea_3002.setText("");
        stepButton_3002.setEnabled(false);
        if (mergeQueue_3002 != null) {
            mergeQueue_3002.clear();
        }
        isMerging_3002 = false;
        stepCount_3002 = 1;
    }

    private String arrayToString_3002(int[] arr_3002) {
        StringBuilder sb_3002 = new StringBuilder();
        for (int k_3002 = 0; k_3002 < arr_3002.length; k_3002++) {
            sb_3002.append(arr_3002[k_3002]);
            if (k_3002 < arr_3002.length - 1) sb_3002.append(", ");
        }
        return sb_3002.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511533002 gui = new MergeSortGUI_2511533002();
            gui.setVisible(true);
        });
    }
}