package _2d_arrays;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numIslands(char[][] grid) {
		int count = 0;
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					count++;
					grid[i][j] = '0';
					BFS(grid, i, j);
				}
			}
		}
		return count;
	}

	private void BFS(char[][] grid, int row, int col) {
		int[][] directions = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] { row, col });
		while (!queue.isEmpty()) {
			int pos[] = queue.remove();
			row = pos[0];
			col = pos[1];
			for (int i = 0; i < directions.length; i++) {
				int nextRow = row + directions[i][0];
				int nextCol = col + directions[i][1];
				if (nextRow < 0 || nextRow > grid.length - 1 || nextCol < 0 || nextCol > grid[0].length - 1
						|| grid[nextRow][nextCol] != '1')
					continue;
				queue.add(new int[] { nextRow, nextCol });
				grid[nextRow][nextCol] = '0';
			}

		}
	}

}
