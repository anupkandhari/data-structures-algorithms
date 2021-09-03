package _2d_arrays;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int orangesRotting(int[][] grid) {
		int minutes = 0;
		int freshCount = 0;
		Queue<int[]> queue = new LinkedList<int[]>();

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0)
					continue;
				if (grid[i][j] == 1) {
					freshCount++;
					continue;
				}
				queue.add(new int[] { i, j });
			}
		}
		if (freshCount == 0)
			return 0;

		int[][] directions = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
		int count = queue.size();
		while (!queue.isEmpty()) {
			if (count == 0) {
				minutes++;
				count = queue.size();
			}

			int row = queue.peek()[0];
			int col = queue.remove()[1];
			count--;
			for (int k = 0; k < directions.length; k++) {
				int nextRow = row + directions[k][0];
				int nextCol = col + directions[k][1];
				if (nextRow < 0 || nextRow > grid.length - 1 || nextCol < 0 || nextCol > grid[0].length - 1)
					continue;
				if (grid[nextRow][nextCol] == 1) {
					grid[nextRow][nextCol] = 2;
					freshCount--;
					queue.add(new int[] { nextRow, nextCol });
				}
			}
		}

		if (freshCount > 0)
			return -1;
		return minutes;
	}

}
