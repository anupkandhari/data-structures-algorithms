import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NetworkDelayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Dijkstra's Algorithm
	public static int networkDelayTime(int[][] times, int n, int k) {
		ArrayList<ArrayList<int[]>> graph = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<int[]>());
		}
		for (int i = 0; i < times.length; i++) {
			int u = times[i][0];
			int v = times[i][1];
			int w = times[i][2];
			graph.get(u - 1).add(new int[] { v - 1, w });
		}

		int[] maxDelay = new int[n];

		for (int i = 0; i < n; i++) {
			maxDelay[i] = Integer.MAX_VALUE;
		}
		maxDelay[k - 1] = 0;
		Queue<Integer> queue = new PriorityQueue<>((a, b) -> maxDelay[a] < maxDelay[b] ? -1 : 1);
		queue.add(k - 1);

		while (!queue.isEmpty()) {
			int u = queue.remove();
			for (int i = 0; i < graph.get(u).size(); i++) {
				int v = graph.get(u).get(i)[0];
				int w = graph.get(u).get(i)[1];
				if (maxDelay[v] > (maxDelay[u] + w)) {
					maxDelay[v] = maxDelay[u] + w;
					queue.add(v);
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < maxDelay.length; i++) {
			if (max < maxDelay[i])
				max = maxDelay[i];
		}

		return max < Integer.MAX_VALUE ? max : -1;
	}

	// BellmanFord
	public static int networkDelayTime2(int[][] times, int n, int k) {

		int[] maxDelay = new int[n];

		for (int i = 0; i < n; i++) {
			maxDelay[i] = Integer.MAX_VALUE;
		}

		maxDelay[k - 1] = 0;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < times.length; j++) {
				int u = times[j][0];
				int v = times[j][1];
				int w = times[j][2];
				if (maxDelay[u - 1] < Integer.MAX_VALUE && maxDelay[v - 1] > maxDelay[u - 1] + w) {
					maxDelay[v - 1] = maxDelay[u - 1] + w;
				}
			}

		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < maxDelay.length; i++) {
			if (max < maxDelay[i])
				max = maxDelay[i];
		}

		return max < Integer.MAX_VALUE ? max : -1;
	}

}
