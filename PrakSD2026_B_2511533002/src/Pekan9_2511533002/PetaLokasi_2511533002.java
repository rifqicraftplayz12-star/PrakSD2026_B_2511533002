package Pekan9_2511533002;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaLokasi_2511533002 extends JFrame {

    private static final long serialVersionUID = 1L;

    private Map<String, ArrayList<String>> graph_3002 = new LinkedHashMap<>();
    private JComboBox<String> comboAwal_3002;
    private JComboBox<String> comboTujuan_3002;
    private JTextArea areaGraph_3002;
    private JTextArea areaHasil_3002;

    public PetaLokasi_2511533002() {
        buatGraph_3002();
        buatGUI_3002();
        displayGraph();
    }

    private void buatGraph_3002() {
        tambahEdge_3002("Gerbang", "Parkiran");
        tambahEdge_3002("Gerbang", "Rektorat");
        tambahEdge_3002("Parkiran", "Kantin");
        tambahEdge_3002("Parkiran", "Perpus");
        tambahEdge_3002("Rektorat", "Perpus");
        tambahEdge_3002("Rektorat", "Aula");
        tambahEdge_3002("Perpus", "Lab Komputer");
        tambahEdge_3002("Perpus", "FTI");
        tambahEdge_3002("Kantin", "Asrama");
        tambahEdge_3002("Kantin", "Lab Komputer");
        tambahEdge_3002("Lab Komputer", "Klinik");
        tambahEdge_3002("Lab Komputer", "Masjid");
        tambahEdge_3002("FTI", "Masjid");
        tambahEdge_3002("Aula", "FTI");
        tambahEdge_3002("Asrama", "Klinik");
        tambahEdge_3002("Masjid", "Klinik");
    }

    private void tambahEdge_3002(String node1_3002, String node2_3002) {
        graph_3002.putIfAbsent(node1_3002, new ArrayList<>());
        graph_3002.putIfAbsent(node2_3002, new ArrayList<>());

        graph_3002.get(node1_3002).add(node2_3002);
        graph_3002.get(node2_3002).add(node1_3002);
    }

    private void buatGUI_3002() {
        setTitle("Pencarian Jalur BFS dan DFS - 2511533002");
        setSize(750, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel judul_3002 = new JLabel("PENCARIAN JALUR PETA KAMPUS", JLabel.CENTER);
        judul_3002.setFont(new Font("Arial", Font.BOLD, 18));
        judul_3002.setOpaque(true);
        judul_3002.setBackground(new Color(40, 80, 130));
        judul_3002.setForeground(Color.WHITE);
        judul_3002.setPreferredSize(new Dimension(750, 45));
        add(judul_3002, BorderLayout.NORTH);

        JPanel panelUtama_3002 = new JPanel(new BorderLayout(10, 10));
        panelUtama_3002.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panelUtama_3002, BorderLayout.CENTER);

        JPanel panelInput_3002 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        comboAwal_3002 = new JComboBox<>(graph_3002.keySet().toArray(new String[0]));
        comboTujuan_3002 = new JComboBox<>(graph_3002.keySet().toArray(new String[0]));
        comboTujuan_3002.setSelectedItem("Klinik");

        JButton tombolBFS_3002 = new JButton("[ BFS ]");
        JButton tombolDFS_3002 = new JButton("[ DFS ]");
        JButton tombolReset_3002 = new JButton("[ RESET ]");

        tombolBFS_3002.addActionListener(e -> BFS());
        tombolDFS_3002.addActionListener(e -> DFS());
        tombolReset_3002.addActionListener(e -> resetGraph());

        panelInput_3002.add(new JLabel("Lokasi Awal :"));
        panelInput_3002.add(comboAwal_3002);
        panelInput_3002.add(new JLabel("Lokasi Tujuan :"));
        panelInput_3002.add(comboTujuan_3002);
        panelInput_3002.add(tombolBFS_3002);
        panelInput_3002.add(tombolDFS_3002);
        panelInput_3002.add(tombolReset_3002);

        panelUtama_3002.add(panelInput_3002, BorderLayout.NORTH);

        areaGraph_3002 = new JTextArea();
        areaGraph_3002.setEditable(false);
        areaGraph_3002.setFont(new Font("Monospaced", Font.BOLD, 14));
        areaGraph_3002.setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH"));

        panelUtama_3002.add(areaGraph_3002, BorderLayout.CENTER);

        areaHasil_3002 = new JTextArea();
        areaHasil_3002.setEditable(false);
        areaHasil_3002.setFont(new Font("Monospaced", Font.BOLD, 13));
        areaHasil_3002.setBorder(BorderFactory.createTitledBorder("HASIL PENCARIAN"));
        areaHasil_3002.setPreferredSize(new Dimension(750, 150));

        panelUtama_3002.add(areaHasil_3002, BorderLayout.SOUTH);
    }

    public void displayGraph() {
        String visual_3002 =
                "Gerbang  -------- Parkiran -------- Kantin -------- Asrama\n" +
                "   |                 |                |              |\n" +
                "Rektorat --------- Perpus ------- Lab Komputer ---- Klinik\n" +
                "   |                 |                |              |\n" +
                " Aula ------------ FTI ----------- Masjid -----------+\n";

        areaGraph_3002.setText(visual_3002);

        areaHasil_3002.setText(
                "Graph berhasil ditampilkan.\n" +
                "Jumlah Node : " + graph_3002.size() + "\n" +
                "Jumlah Edge : 16\n"
        );
    }

    public void BFS() {
        String awal_3002 = comboAwal_3002.getSelectedItem().toString();
        String tujuan_3002 = comboTujuan_3002.getSelectedItem().toString();

        Queue<String> queue_3002 = new LinkedList<>();
        Set<String> visited_3002 = new LinkedHashSet<>();
        Map<String, String> parent_3002 = new HashMap<>();

        queue_3002.add(awal_3002);
        visited_3002.add(awal_3002);

        while (!queue_3002.isEmpty()) {
            String current_3002 = queue_3002.poll();

            if (current_3002.equals(tujuan_3002)) {
                break;
            }

            for (String tetangga_3002 : graph_3002.get(current_3002)) {
                if (!visited_3002.contains(tetangga_3002)) {
                    visited_3002.add(tetangga_3002);
                    parent_3002.put(tetangga_3002, current_3002);
                    queue_3002.add(tetangga_3002);
                }
            }
        }

        displayPath("BFS", awal_3002, tujuan_3002, visited_3002, parent_3002);
    }

    public void DFS() {
        String awal_3002 = comboAwal_3002.getSelectedItem().toString();
        String tujuan_3002 = comboTujuan_3002.getSelectedItem().toString();

        Set<String> visited_3002 = new LinkedHashSet<>();
        Map<String, String> parent_3002 = new HashMap<>();

        dfsHelper_3002(awal_3002, tujuan_3002, visited_3002, parent_3002);

        displayPath("DFS", awal_3002, tujuan_3002, visited_3002, parent_3002);
    }

    private boolean dfsHelper_3002(String current_3002, String tujuan_3002,
                                   Set<String> visited_3002,
                                   Map<String, String> parent_3002) {

        visited_3002.add(current_3002);

        if (current_3002.equals(tujuan_3002)) {
            return true;
        }

        for (String tetangga_3002 : graph_3002.get(current_3002)) {
            if (!visited_3002.contains(tetangga_3002)) {
                parent_3002.put(tetangga_3002, current_3002);

                if (dfsHelper_3002(tetangga_3002, tujuan_3002, visited_3002, parent_3002)) {
                    return true;
                }
            }
        }

        return false;
    }

    public void displayPath(String metode_3002, String awal_3002, String tujuan_3002,
                            Set<String> visited_3002,
                            Map<String, String> parent_3002) {

        ArrayList<String> jalur_3002 = new ArrayList<>();
        String current_3002 = tujuan_3002;

        while (current_3002 != null) {
            jalur_3002.add(current_3002);

            if (current_3002.equals(awal_3002)) {
                break;
            }

            current_3002 = parent_3002.get(current_3002);
        }

        Collections.reverse(jalur_3002);

        areaHasil_3002.setText(
                "Metode Pencarian       : " + metode_3002 + "\n" +
                "Lokasi Awal            : " + awal_3002 + "\n" +
                "Lokasi Tujuan          : " + tujuan_3002 + "\n" +
                "Jalur Ditemukan        : " + String.join(" -> ", jalur_3002) + "\n" +
                "Node Dikunjungi        : " + String.join(" -> ", visited_3002) + "\n" +
                "Jumlah Node Dikunjungi : " + visited_3002.size()
        );
    }

    public void displayPath() {
        areaHasil_3002.append("\nJalur sudah ditampilkan.");
    }

    public void resetGraph() {
        displayGraph();
        comboAwal_3002.setSelectedIndex(0);
        comboTujuan_3002.setSelectedItem("Klinik");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaLokasi_2511533002().setVisible(true);
        });
    }
}