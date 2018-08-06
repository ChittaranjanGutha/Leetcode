
/**
 * TODO Put here a description of what this class does.
 *
 * @author akhil.
 *         Created Mar 23, 2018.
 */
public class Problem238 
{
	 public void productExceptSelf(int[] nums) 
	    {
		     int res[]=new int[nums.length];
		     int left =1;
		     res[0]=1;
		     for(int i=1;i<nums.length;i++)
			     {
			      left=nums[i-1]*left;
			      res[i]=left;
			     }
		    
		     //calculate the right part to prodcut
		     int right=1;
		     System.out.println();
		     for(int i=nums.length-2;i>=0;i--)
		     {
		    	 right=right*nums[i+1];
		    	 res[i]=res[i]*right;
		     }
		     for(int i=0;i<res.length;i++)
		     {
		    	 System.out.print(res[i]+" ");
		     }
	    }
	 
	 //main method
	 public static void main(String args[])
	 {
		 Problem238 p= new Problem238();
		 int arr[]= {2,3,4,5};
		 p.productExceptSelf(arr);
	 }
	
	
}


