import java.util.Scanner;

public class Pr_48_2 
{
	 public void rotate(int[][] a)
	    {
	     int len =a.length;
	        
	     //Swap the rows with columns
	     for(int i=0;i<len/2;i++)
	     {
	         for(int j=0;j<len;j++)
	         {
	             int temp=a[i][j];
	             a[i][j]=a[len-1-i][j];
	             a[len-i-1][j]=temp;
	         }
	     }
	        
	     for(int i=0;i<len;i++)
	     {
	         for(int j=0;j<len;j++)
	         {
	             System.out.print(a[i][j]+" ");
	         }
	         System.out.println("\n");
	     }   
	        
	     //Transpose the matrix;
	        for(int i=0;i<len;i++)
	        {
	            for(int j=0;j<i;j++)
	            {
	                int temp=a[i][j];
	                a[i][j]=a[j][i];
	                a[j][i]=temp;
	            }
	        }  
	    }
	 
	 public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[][] grid = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					grid[i][j] = sc.nextInt();
				}
			}
			Pr_48_2 obj = new Pr_48_2();
			obj.rotate(grid);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(grid[i][j] + " ");
				}
				System.out.println("\n");
			}
		}
}
