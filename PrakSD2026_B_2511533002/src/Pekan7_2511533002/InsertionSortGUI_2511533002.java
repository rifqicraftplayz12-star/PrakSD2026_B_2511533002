package Pekan7_2511533002;

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

public class InsertionSortGUI_2511533002 extends JFrame {
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
	public InsertionSortGUI_2511533002() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//Panel Input
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField_3002 = new JTextField(30);
		setButton_3002 = new JButton ("Set Array");
		inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma) :"));
		inputPanel.add(inputField_3002);
		inputPanel.add(setButton_3002);
		
		//Panel Array Visual
		panelArray_3002 = new JPanel();
		panelArray_3002.setLayout(new FlowLayout());
		
		//Panel Kontrol
		JPanel controlPanel_3002 = new JPanel();
		stepButton_3002 = new JButton("Langkah Selanjutnya");
		resetButton_3002 = new JButton("Reset");
		stepButton_3002.setEnabled(false);
		controlPanel_3002.add(stepButton_3002);
		controlPanel_3002.add(resetButton_3002);
		
		//Area teks untuk log langkah langkah
		stepArea_3002 = new JTextArea(8, 60);
		stepArea_3002.setEditable(false);
		stepArea_3002.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3002 = new JScrollPane(stepArea_3002);
		
		// Tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_3002, BorderLayout.CENTER);
		add(controlPanel_3002, BorderLayout.SOUTH);
		add(scrollPane_3002, BorderLayout.EAST);
		
		//Event Set Array
		setButton_3002.addActionListener(e -> setArrayFromInput_3002());
		
		//Event Langkah Selanjutnya
		stepButton_3002.addActionListener(e -> performStep_3002());
		
		// Event Reset
		resetButton_3002.addActionListener(e -> reset());
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
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return; 
		}
		
		// --- PERBAIKAN DI SINI ---
		sorting_3002 = true; // Mengubah status agar bisa di-sorting
		// -------------------------
		
		i = 1;
		stepCount_3002 = 1;
		stepButton_3002.setEnabled(true);
		stepArea_3002.setText("");
		panelArray_3002.removeAll();
		labelArray_3002 = new JLabel[array_3002.length];
		for (int k = 0; k < array_3002.length; k++) {
			labelArray_3002[k] = new JLabel(String.valueOf(array_3002[k]));
			labelArray_3002[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_3002[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3002[k].setPreferredSize(new Dimension(50, 50));
			labelArray_3002[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3002.add(labelArray_3002[k]);
		}
		panelArray_3002.revalidate();
		panelArray_3002.repaint();
	}

	private void performStep_3002() {
		if(i < array_3002.length && sorting_3002) {
			int key_3002 = array_3002[i];
			j = i - 1;
			
			StringBuilder stepLog_3002 = new StringBuilder();
			stepLog_3002.append("Langkah ").append(stepCount_3002).append(" Memasukkan ").append(key_3002).append("\n\n");
			
			while (j >= 0 && array_3002[j] > key_3002) {
				array_3002[j + 1] = array_3002[j];
				j--;
			}
			array_3002[j + 1] = key_3002;
			
			updateLabels();
			stepLog_3002.append("Hasil: ").append(arrayToString(array_3002)).append("\n\n");
			stepArea_3002.append(stepLog_3002.toString());
			
			i++;
			stepCount_3002++;
			
			if (i == array_3002.length) {
				sorting_3002 = false;
				stepButton_3002.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}

	private void updateLabels() {
		for (int k = 0; k < array_3002.length; k++) {
			labelArray_3002[k].setText(String.valueOf(array_3002[k]));
		}
	}

	private void reset() {
		inputField_3002.setText("");
		panelArray_3002.removeAll();
		panelArray_3002.revalidate();
		panelArray_3002.repaint();
		stepArea_3002.setText("");
		stepButton_3002.setEnabled(false);
		sorting_3002 = false;
		i = 1;
		stepCount_3002 = 1;
	}

	private String arrayToString(int[] arr_3002) {
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < arr_3002.length; k++) {
			sb.append(arr_3002[k]);
			if (k < arr_3002.length - 1) sb.append(", ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			InsertionSortGUI_2511533002 gui = new InsertionSortGUI_2511533002();
			gui.setVisible(true);
		});
	}
}