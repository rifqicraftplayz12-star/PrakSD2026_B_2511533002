package Pekan9_2511533002;
import java.util.*;
public class GraphTraversal_2511533002 {
	private Map <String, List <String>> graph_3002 = new HashMap <> ();
	
	//Menambahkan edge (graf tak berarah)
	public void addEdge_3002 (String node1_3002, String node2_3002) {
		graph_3002.putIfAbsent(node1_3002, new ArrayList<>());
		graph_3002.putIfAbsent(node2_3002, new ArrayList<>());
		graph_3002.get(node1_3002).add(node2_3002);
		graph_3002.get(node2_3002).add(node1_3002);
	}
	
	//menampilkan graf awal
	public void printGraph_3002() {
		System.out.println("Graf Awal (Adjancency List) : ");
		for (String node_3002 : graph_3002.keySet()) {
			System.out.print(node_3002 + "-> ");
			List<String> neighbors_3002 = graph_3002.get(node_3002);
			System.out.println(String.join(",", neighbors_3002));
		}
		System.out.println();
	}
	
	//DFS rekursif 
	public void dfs_3002 (String start_3002) {
		Set <String> visited_3002 = new HashSet <>();
		System.out.println("Penelusuran DFS : ");
		dfsHelper_3002(start_3002,visited_3002);
		System.out.println();
	}
	
	private void dfsHelper_3002 (String current_3002, Set <String> visited_3002) {
		if (visited_3002.contains(current_3002)) return;
		visited_3002.add(current_3002);
		System.out.print(current_3002 + " ");
		for (String neighbor_3002 : graph_3002.getOrDefault(current_3002, new ArrayList<>())) {
			dfsHelper_3002(neighbor_3002, visited_3002);
		}
	}
	
	private void bfs_3002 (String start_3002) {
		Set<String> visited_3002 = new HashSet <>();
		Queue <String> queue_3002 = new LinkedList<>();
		queue_3002.add(start_3002);
		visited_3002.add(start_3002);
		System.out.println("Penelusuran BFS :");
		while (!queue_3002.isEmpty()) {
			String current_3002 = queue_3002.poll();
			System.out.print(current_3002 + " ");
			for (String neighbot_3002 : graph_3002.getOrDefault(current_3002, new ArrayList<>())) {
				if (!visited_3002.contains(neighbot_3002)) {
					queue_3002.add(neighbot_3002);
					visited_3002.add(neighbot_3002);
				}
			}
		}
		System.out.println();
	}
	//main
	public static void main (String [] Args) {
		GraphTraversal_2511533002 graph_3002 = new GraphTraversal_2511533002();
		
		//contoh graf = A-B, A-C, B-D, B-E
		graph_3002.addEdge_3002("A", "B");
		graph_3002.addEdge_3002("A", "C");
		graph_3002.addEdge_3002("B", "D");
		graph_3002.addEdge_3002("B", "E");
		
		//cetak graph awal
		System.out.println("Graf Awal adalah : ");
		graph_3002.printGraph_3002();
		
		//lakukan penelusuran
		graph_3002.dfs_3002("A");
		graph_3002.bfs_3002("A");
	}
}