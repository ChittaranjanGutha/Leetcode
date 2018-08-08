import java.util.Scanner;

public class Pr_64 {

	// Approach One
	// Add the first row and first column
	// Then calculate the result based on the previous values
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[][] dp = new int[row][col];
		dp[0][0] = grid[0][0];
		for (int i = 1; i < col; i++)
			dp[0][i] = grid[0][i] + dp[0][i - 1];
		for (int j = 1; j < row; j++)
			dp[j][0] = grid[j][0] + dp[j - 1][0];
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[row - 1][col - 1];
	}

	// Dp using only using 1D Array for storing the values
	// If i==0 || j==0 just update the dp array with grid value
	// Else calculate the min path and update
	//Top down Approach
	public int minPathSum1(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[] dp = new int[col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 && j == 0)
					dp[j] = grid[i][j];
				else if (i == 0)
					dp[j] = dp[j - 1] + grid[i][j];
				else if (j == 0)
					dp[j] = dp[j] + grid[i][j];
				else
					dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
			}
		}
		return dp[col - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] grid = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		Pr_64 obj = new Pr_64();
		System.out.println(obj.minPathSum(grid));
	}
}
