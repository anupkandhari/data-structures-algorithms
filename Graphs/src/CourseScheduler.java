import java.util.ArrayList;
import java.util.Stack;

public class CourseScheduler {

	public static void main(String[] args) {

	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		int[] inDegree = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < prerequisites.length; i++) {
			int s = prerequisites[i][1];
			int d = prerequisites[i][1];
			graph.get(s).add(d);
			inDegree[s]++;
		}

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] == 0)
				stack.push(i);
		}
		 
		int count = 0;
		while (!stack.empty()) {
			int curr = stack.pop();
			count++;
			for (int i = 0; i<graph.get(curr).size(); i++) {
				int next = graph.get(curr).get(i);
				inDegree[next]--;
				if (inDegree[next] == 0)
					stack.push(next);
				
			}
		}

		return count == numCourses;
	}

}
