import java.util.ArrayList;

public class InformEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n; i++) {
			int j = manager[i];
			if (j != -1)
				graph.get(j).add(i);
		}
		return DFSTraversal(graph, headID, informTime);
	}

	public int DFSTraversal(ArrayList<ArrayList<Integer>> graph, int node, int[] informTime) {
		int max = 0;
		for (int i = 0; i < graph.get(node).size(); i++) {
			max = Math.max(max, DFSTraversal(graph, graph.get(node).get(i), informTime));
		}

		return max + informTime[node];
	}

}
