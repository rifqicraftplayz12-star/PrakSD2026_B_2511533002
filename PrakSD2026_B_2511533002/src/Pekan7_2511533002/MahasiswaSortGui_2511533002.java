package Pekan7_2511533002;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MahasiswaSortGui_2511533002 extends JFrame {
    private static final long serialVersionUID = 1L;

    private ArrayList<Mahasiswa_2511533002> dataMahasiswa_3002;

    private JTextField txtNama_3002, txtNim_3002, txtProdi_3002;
    private JButton btnTambah_3002, btnHapus_3002, btnSort_3002;
    private JComboBox<String> comboAlgo_3002;
    private JTextArea areaData_3002, areaProses_3002;

    public MahasiswaSortGui_2511533002() {
        dataMahasiswa_3002 = new ArrayList<>();

        setTitle("Pengurutan Nama Mahasiswa");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel panelInput_3002 = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput_3002.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        panelInput_3002.add(new JLabel("Nama:"));
        txtNama_3002 = new JTextField();
        panelInput_3002.add(txtNama_3002);

        panelInput_3002.add(new JLabel("NIM:"));
        txtNim_3002 = new JTextField();
        panelInput_3002.add(txtNim_3002);

        panelInput_3002.add(new JLabel("Program Studi:"));
        txtProdi_3002 = new JTextField();
        panelInput_3002.add(txtProdi_3002);

        btnTambah_3002 = new JButton("Tambah Data");
        btnHapus_3002 = new JButton("Hapus Data Terakhir");
        panelInput_3002.add(btnTambah_3002);
        panelInput_3002.add(btnHapus_3002);

        JPanel panelKontrol_3002 = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        panelKontrol_3002.setBorder(BorderFactory.createTitledBorder("Pilih Algoritma"));
        
        panelKontrol_3002.add(new JLabel("Algoritma:"));
        String[] algos_3002 = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        comboAlgo_3002 = new JComboBox<>(algos_3002);
        panelKontrol_3002.add(comboAlgo_3002);
        
        btnSort_3002 = new JButton("Mulai Sorting");
        panelKontrol_3002.add(btnSort_3002);

        JPanel panelTampil_3002 = new JPanel(new GridLayout(1, 2, 10, 0));
        
        areaData_3002 = new JTextArea();
        areaData_3002.setEditable(false);
        JScrollPane scrollData_3002 = new JScrollPane(areaData_3002);
        scrollData_3002.setBorder(BorderFactory.createTitledBorder("Data Mahasiswa"));

        areaProses_3002 = new JTextArea();
        areaProses_3002.setEditable(false);
        areaProses_3002.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollProses_3002 = new JScrollPane(areaProses_3002);
        scrollProses_3002.setBorder(BorderFactory.createTitledBorder("Proses Sorting"));

        panelTampil_3002.add(scrollData_3002);
        panelTampil_3002.add(scrollProses_3002);

        add(panelInput_3002, BorderLayout.WEST);
        add(panelTampil_3002, BorderLayout.CENTER);
        add(panelKontrol_3002, BorderLayout.SOUTH);

        btnTambah_3002.addActionListener(e -> tambahData_3002());
        btnHapus_3002.addActionListener(e -> hapusData_3002());
        btnSort_3002.addActionListener(e -> eksekusiSorting_3002());
    }

    private void tambahData_3002() {
        String nama_3002 = txtNama_3002.getText().trim();
        String nim_3002 = txtNim_3002.getText().trim();
        String prodi_3002 = txtProdi_3002.getText().trim();

        if (nama_3002.isEmpty() || nim_3002.isEmpty() || prodi_3002.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        dataMahasiswa_3002.add(new Mahasiswa_2511533002(nama_3002, nim_3002, prodi_3002));
        updateTampilanData_3002();
        
        txtNama_3002.setText(""); txtNim_3002.setText(""); txtProdi_3002.setText("");
        txtNama_3002.requestFocus();
    }

    private void hapusData_3002() {
        if (!dataMahasiswa_3002.isEmpty()) {
            dataMahasiswa_3002.remove(dataMahasiswa_3002.size() - 1);
            updateTampilanData_3002();
        } else {
            JOptionPane.showMessageDialog(this, "Data masih kosong!");
        }
    }

    private void updateTampilanData_3002() {
        StringBuilder sb_3002 = new StringBuilder();
        for (int i_3002 = 0; i_3002 < dataMahasiswa_3002.size(); i_3002++) {
            sb_3002.append((i_3002 + 1)).append(". ").append(dataMahasiswa_3002.get(i_3002).toString()).append("\n");
        }
        areaData_3002.setText(sb_3002.toString());
    }

    private void eksekusiSorting_3002() {
        if (dataMahasiswa_3002.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada data untuk disorting!");
            return;
        }

        ArrayList<Mahasiswa_2511533002> dataCopy_3002 = new ArrayList<>(dataMahasiswa_3002);
        String pilihan_3002 = (String) comboAlgo_3002.getSelectedItem();
        
        areaProses_3002.setText("=== " + pilihan_3002.toUpperCase() + " ===\n");
        areaProses_3002.append("Awal: " + MahasiswaSort_2511533002.getListNama_3002(dataCopy_3002) + "\n\n");

        if (pilihan_3002.equals("Insertion Sort")) {
            MahasiswaSort_2511533002.insertionSort_3002(dataCopy_3002, areaProses_3002);
        } else if (pilihan_3002.equals("Selection Sort")) {
            MahasiswaSort_2511533002.selectionSort_3002(dataCopy_3002, areaProses_3002);
        } else if (pilihan_3002.equals("Bubble Sort")) {
            MahasiswaSort_2511533002.bubbleSort_3002(dataCopy_3002, areaProses_3002);
        }

        areaProses_3002.append("\n=== HASIL AKHIR ===\n");
        for (Mahasiswa_2511533002 m_3002 : dataCopy_3002) {
            areaProses_3002.append("- " + m_3002.toString() + "\n");
        }
    }

    public static void main(String[] args_3002) {
        SwingUtilities.invokeLater(() -> {
            new MahasiswaSortGui_2511533002().setVisible(true);
        });
    }
}