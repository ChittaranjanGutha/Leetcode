import java.util.Scanner;

public class Pr_48 {
	 public void rotate(int[][] a)
	    {
	        int len=a.length;
	        for(int i=0;i<len;i++)
	        {
	            for(int j=i;j<len-i-1;j++)
	            {
	                int temp=a[i][j];
	                a[i][j]=a[len-j-1][i];
	                a[len-j-1][i]=a[len-i-1][len-j-1];
	                a[len-i-1][len-j-1]=a[j][len-i-1];
	                a[j][len-i-1]=temp;
	                
	            }
	        }
	    }
	 
	 public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int[][] grid = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					grid[i][j] = sc.nextInt();
				}
			}
			Pr_48 obj = new Pr_48();
			obj.rotate(grid);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(grid[i][j]+" ");
				}
				System.out.println("\n");
			}
		}

}
