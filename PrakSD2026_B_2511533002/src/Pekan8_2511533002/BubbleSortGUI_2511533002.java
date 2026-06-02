package Pekan8_2511533002;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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

public class BubbleSortGUI_2511533002 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3002;
    private JLabel[] labelArray_3002;
    private JButton stepButton_3002, resetButton_3002, setButton_3002;
    private JTextField inputField_3002;
    private JPanel panelArray_3002;
    private JTextArea stepArea_3002;
    
    private int i = 1, j;
    private boolean sorting_3002 = false;
    private int stepCount_3002 = 1;

    /**
     * Create the frame.
     */
    public BubbleSortGUI_2511533002() {
        setTitle("Insertion Sort Langkah per Langkah");
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
            for (int k_3002 = 0; k_3002 < parts_3002.length; k_3002++) {
                array_3002[k_3002] = Integer.parseInt(parts_3002[k_3002].trim());
            }
        } catch (NumberFormatException e_3002) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
                    + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        i = 0;
        j = 0;
        stepCount_3002 = 1;
        sorting_3002 = true;
        stepButton_3002.setEnabled(true);
        stepArea_3002.setText("");
        panelArray_3002.removeAll();
        labelArray_3002 = new JLabel[array_3002.length];
        
        for (int k_3002 = 0; k_3002 < array_3002.length; k_3002++) {
            labelArray_3002[k_3002] = new JLabel(String.valueOf(array_3002[k_3002]));
            labelArray_3002[k_3002].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3002[k_3002].setOpaque(true);
            labelArray_3002[k_3002].setBackground(Color.WHITE);
            labelArray_3002[k_3002].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3002[k_3002].setPreferredSize(new Dimension(50, 50));
            labelArray_3002[k_3002].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3002.add(labelArray_3002[k_3002]);
        }
        
        panelArray_3002.revalidate();
        panelArray_3002.repaint();
    }

    private void performStep_3002() {
        if (!sorting_3002 || i >= array_3002.length - 1) {
            sorting_3002 = false;
            stepButton_3002.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }
        resetHighlights_3002();
        
        StringBuilder stepLog_3002 = new StringBuilder();
        labelArray_3002[j].setBackground(Color.CYAN);
        labelArray_3002[j + 1].setBackground(Color.CYAN);
        
        if (array_3002[j] > array_3002[j + 1]) {
            int temp_3002 = array_3002[j];
            array_3002[j] = array_3002[j + 1];
            array_3002[j + 1] = temp_3002;
            
            labelArray_3002[j].setBackground(Color.RED);
            labelArray_3002[j + 1].setBackground(Color.RED);
            
            stepLog_3002.append("Langkah ").append(stepCount_3002).append(": Menukar elemen ke-")
                   .append(j).append(" (").append(array_3002[j + 1]).append(") dengan ke-")
                   .append(j + 1).append(" (").append(array_3002[j]).append(")\n");
        } else {
            stepLog_3002.append("Langkah ").append(stepCount_3002).append(": Tidak ada pertukaran antara ke-")
                   .append(j).append(" dan ke-").append(j + 1).append("\n");
        }
        
        stepLog_3002.append("Hasil: ").append(arrayToString_3002(array_3002)).append("\n\n");
        stepArea_3002.append(stepLog_3002.toString());
        
        updateLabels_3002();
        j++;
        
        if (j >= array_3002.length - i - 1) {
            j = 0;
            i++;
        }
        
        stepCount_3002++;
        
        if (i >= array_3002.length - 1) {
            sorting_3002 = false;
            stepButton_3002.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_3002() {
        for (int k_3002 = 0; k_3002 < array_3002.length; k_3002++) {
            labelArray_3002[k_3002].setText(String.valueOf(array_3002[k_3002]));
        }
    }

    private void resetHighlights_3002() {
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
        sorting_3002 = false;
        i = 0;
        j = 0;
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
            BubbleSortGUI_2511533002 gui = new BubbleSortGUI_2511533002();
            gui.setVisible(true);
        });
    }
}