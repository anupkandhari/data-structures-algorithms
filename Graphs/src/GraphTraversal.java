import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void DFSTraversal(int[][] graph, int node, boolean[] visited, ArrayList<Integer> values) {
		visited[node] = true;
		values.add(node);
		for (int i = 0; i < graph[node].length; i++) {
			if (!visited[graph[node][i]])
				DFSTraversal(graph, graph[node][i], visited, values);
		}
	}

	public void BFSTraversal(int[][] graph, ArrayList<Integer> values) {
		boolean[] visited = new boolean[graph.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		int node = 0;
		queue.add(node);

		while (!queue.isEmpty()) {
			node = queue.remove();
			values.add(node);
			visited[node] = true;

			for (int i = 0; i < graph[node].length; i++) {
				if (!visited[graph[node][i]])
					queue.add(graph[node][i]);
			}
		}
	}

}
