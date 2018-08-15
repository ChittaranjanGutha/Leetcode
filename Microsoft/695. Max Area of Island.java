class Solution {
	int count = 0;

	public int maxAreaOfIsland(int[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					generate(grid, i, j);
					result = Math.max(result, count);
					count = 0;
				}
			}
		}
		return result;
	}

	public void generate(int[][] grid, int i, int j) {
		if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
			grid[i][j] = 0;
			count++;
			generate(grid, i + 1, j);
			generate(grid, i - 1, j);
			generate(grid, i, j + 1);
			generate(grid, i, j - 1);
		}
	}
}
