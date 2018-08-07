import java.util.Scanner;

public class Pr_200 {
	static int row;
	static int col;

	public int numIslands(char[][] grid) {
		int islands = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] =='1') {
					islands++;
					loop_grid(grid, i, j);
				}
			}
		}
		return islands;

	}

	public void loop_grid(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != '1')
			return;
		grid[i][j] = 0;
		loop_grid(grid, i + 1, j);
		loop_grid(grid, i - 1, j);
		loop_grid(grid, i, j + 1);
		loop_grid(grid, i, j - 1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		char[][] grid = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = (char) sc.nextInt();
			}
		}
		Pr_200 obj = new Pr_200();
		System.out.println(obj.numIslands(grid));
	}

}
